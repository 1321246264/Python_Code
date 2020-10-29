#!/usr/bin/env python
# -*- coding:utf-8 -*-
# @Time    : 2020/7/16 5:29 下午
# @Author  : Ryh
# @Email   : 1327253700@qq.com
# @File    : ftp.py
# @Software: PyCharm

"""
功能介绍:ftp相关操作
"""
import math
import socket
import threading
from ftplib import FTP, error_perm

from conf.settings import const
from utils.log import *

# ftp连接信息
FTPIP = const.FTPIP
FTPPORT = const.FTPPORT
FTPUSERNAME = const.FTPUSERNAME
FTPPASSWORD = const.FTPPASSWORD


def loadFtp(ftp_ip, ftp_prot, ftp_user, ftp_pwd):
    """
    连接ftp
    :param ftp_ip: ftp服务器IP地址
    :param ftp_prot: ftp服务器端口号
    :param ftp_user: ftp服务器用户名
    :param ftp_pwd: ftp服务器用户对应的密码
    :return:
    """
    socket.setdefaulttimeout(60)  # 设置FTP连接超时时间为60秒
    ftp = FTP()
    ftp.connect(host=ftp_ip, port=ftp_prot)
    # ftp.set_debuglevel(2)   #开启调试模式
    ftp.encoding = 'utf-8'  # 设置编码格式

    try:
        ftp.login(ftp_user, ftp_pwd)
        log.info('[{}] login ftp {}'.format(ftp_user, ftp.getwelcome()))  # 打印 ftp 欢迎信息
    except(socket.error, socket.gaierror, socket.timeout):  # ftp 连接错误
        log.error('ERROR: cannot connect [{}:{}]'.format(ftp_ip, ftp_prot))  # 打印 ftp 连接失败信息
        return None
    except(error_perm):  # 用户登录认证错误
        log.error('ERROR: user Authentication failed ')  # 打印 ftp 用户认证错误信息
        return None
    except Exception as e:
        log.error(str(e))
        return None
    return ftp


# 赋值一个 ftp 常量,以此避免产生重复连接的操作(utils工具类调用,可能还是会存在产生重复连接的操作,需确认？)
ftp = loadFtp(FTPIP, FTPPORT, FTPUSERNAME, FTPPASSWORD)


def existsOrNor(ftp_file_path, dst_file_path):
    """
    判断 ftp 文件本地是否存在
    :param ftp_file_path: ftp 文件路径
    :param dst_file_path: 本地 ftp 文件路径
    :return:
    """
    remote_file_size = ftp.size(ftp_file_path)  # 文件总大小 , 远程告警
    log.info('remote filesize: %.2f MB' % (remote_file_size / 1024 / 1024))

    # check local file isn't exists and get the local file size
    if os.path.exists(dst_file_path):  # 文件标识
        log.info('the file already exists in local dir')
        lsize = os.stat(dst_file_path).st_size
        if lsize >= remote_file_size:
            log.info('local file is bigger or equal remote file')
        return -1


def progressbar(cur, total):
    """
    进度条显示
    :param cur:当前数值
    :param total:总值
    :return:
    """
    percent = '{:.2%}'.format(cur / total)
    sys.stdout.write('\r')
    sys.stdout.write('[%-50s] %s' % ('=' * int(math.floor(cur * 50 / total)), percent))
    sys.stdout.flush()  # 刷新输出
    if cur == total:
        sys.stdout.write('\n')


def download_file(ftp_file_path, dst_file_path):
    """
    ftp文件单线程下载至本地
    :param ftp_file_path: ftp下载文件
    :param dst_file_path: 本地文件存放路径
    :return:
    """
    buffer_size = 10240  # 默认8192

    # 将传输模式改为二进制模式 ,避免提示 ftplib.error_perm: 550 SIZE not allowed in ASCII
    ftp.voidcmd('TYPE I')
    remote_file_size = ftp.size(ftp_file_path)  # 文件总大小 , 远程告警

    cmpsize = 0  # 下载文件初始大小
    lsize = 0
    start = time.time()

    try:
        conn = ftp.transfercmd('RETR {0}'.format(ftp_file_path), lsize)
        log.info('RETR {0}'.format(ftp_file_path) + str(lsize))
        f = open(dst_file_path, "ab")
        while True:
            data = conn.recv(buffer_size)
            if not data:
                break
            f.write(data)
            cmpsize += len(data)
            progressbar(cmpsize, remote_file_size)

        ftp.voidcmd('NOOP')
        log.info('keep alive cmd success')
        ftp.voidresp()
        log.info('No loop cmd')
        conn.close()
        # ftp.quit()
    except Exception as e:
        pass
        log.error(e)
    finally:
        f.close()
        end = time.time()
        log.info('consume time: %.2f s' % (end - start))
        file_size = os.stat(dst_file_path).st_size
        log.info('local filesize: %.2f MB' % (file_size / 1024 / 1024))


def setupThreads(ftp_file_path, dst_file_path, threadNumber):
    """
    ftp多进程文件下载
    :param ftp_file_path: ftp文件路径
    :param dst_file_path: ftp本地下载路径
    :param threadNumber: 线程数
        参数后面为什么加逗号？因为当遇到字典、列表、元组时，其与方法、函数在调用时操作类似，故容易因为区分错误而报错，后面加逗号，可以说明这是一个序列，以此作为区分。
        注: REST 0 (从文件最开始出下载) 0这一位代表文件从那个位置开始下载,此参数必须为整型,float则会报错 501 Reply marker is invalid. !!!!!!
    :return:
    set up the threads which will be used to download file
    list of threads will be returned if success, else
    None will be returned
    """
    try:
        # ftp = loadFtp(FTPIP, FTPPORT, FTPUSERNAME, FTPPASSWORD)
        remote_file_size = ftp.size(ftp_file_path)  # 文件总大小 , 远程告警
        log.info('文件总大小 ' + str(remote_file_size))
        blockSize = int(
            remote_file_size / threadNumber)  # 每个线程处理的文件大小(每个块大小必须为整数,为小数的话则会报错 501 Reply marker is invalid.)
        # blockSize = int(blockSize)
        rest = None
        log.info('每个线程处理的文件大小 ' + str(blockSize))
        threads = []
        for i in range(0, threadNumber - 1):
            begin_point = blockSize * i
            # 创建线程
            subThread = threading.Thread(target=downloadFileMultiThreads,
                                         args=(i, ftp_file_path, dst_file_path, begin_point, blockSize, rest,))
            threads.append(subThread)
        assigned = blockSize * (threadNumber - 1)  # 已分配大小
        unassigned = remote_file_size - assigned  # 未分配大小
        log.info('未分配大小 ' + str(unassigned))
        lastBlockSize = unassigned  # 最后文件大小
        log.info('最后文件大小 ' + str(lastBlockSize))
        begin_point = blockSize * (threadNumber - 1)
        log.info('最后文件处理起始位置 ' + str(begin_point))
        # 创建线程
        subThread = threading.Thread(target=downloadFileMultiThreads, args=(
        threadNumber - 1, ftp_file_path, dst_file_path, begin_point, lastBlockSize, rest,))
        threads.append(subThread)
        # return threads
        for i in threads:
            i.start()
            i.join()
    except Exception as e:
        log.error(str(e))
        # return None


def downloadFileMultiThreads(threadIndex, remoteFilePath, dst_file_path, beginPoint, blockSize, rest=None):
    """
    ftp多线程文件下载子线程
    A sub thread used to download file
    :param threadIndex:线程号
    :param remoteFilePath:ftp文件路径
    :param localFilePath:本地文件路径
    :param beginPoint:处理起始位置
    :param blockSize:处理文件大小
    :param rest:
    :return:
    """
    try:
        # threadName = threading.currentThread().getName()    # 获取当前线程的名
        # 临时本地文件
        fp = open(dst_file_path + '.part.' + str(threadIndex), 'wb')
        callback = fp.write

        # 另一个到ftp服务器的连接，更改为路径，并设置二进制模式
        ftp = loadFtp(FTPIP, FTPPORT, FTPUSERNAME, FTPPASSWORD)
        ftp.cwd(os.path.dirname(remoteFilePath))  # os.path.dirname返回文件路径
        # 将传输模式改为二进制模式 ,避免提示 ftplib.error_perm: 550 SIZE not allowed in ASCII
        ftp.voidcmd('TYPE I')

        # 开始下载
        # connection = ftp.transfercmd('RETR {0}'.format(remoteFilePath), beginPoint)  # 从何处开始下载,断点传输,起始文件位置   beginPoint

        finishedSize = 0
        # where to begin downloading
        setBeginPoint = 'REST ' + str(beginPoint)
        ftp.sendcmd(setBeginPoint)
        # begin to download
        beginToDownload = 'RETR ' + os.path.basename(remoteFilePath)
        connection = ftp.transfercmd(beginToDownload, rest)

        log.info('threadIndex: ' + str(threadIndex))

        readSize = blockSize
        while 1:
            if blockSize > 0:
                remainedSize = blockSize - finishedSize
                if remainedSize > blockSize:
                    readSize = blockSize
                else:
                    readSize = remainedSize
            data = connection.recv(readSize)  # 接收文件大小信息
            if not data:
                break
            finishedSize = finishedSize + len(data)
            # 确保完成的数据不超过blockSize
            if finishedSize == blockSize:
                callback(data)
                break
            callback(data)
        connection.close()
        fp.close()  # 关闭文件
        ftp.quit()  # 关闭ftp连接,此处注释将退出ftp连接移置main函数ftp功能部分结束统一退出,防止 550 The specified network name is no longer available. 错误
        # 再次测试发现如不每个线程生成一个连接,除第一个线程外其他均无数据,故改回每个线程连接一次(550 The specified network name is no longer available.错误不影响程序运行和数据质量)
        return True
    except Exception as e:
        log.error(e)
        return False


mergerFlag = 0


def mergerFile(dst_file_path, threadNumber):
    """
    合并临时文件
    将文件的所有子部分合并为一个文件
    将调用另一个线程来执行此操作
    :param dst_file_path:本地文件路径
    :param threadNumber:线程数
    :return:
    """
    try:
        while 1:
            subThread = threading.Thread(target=mergerFileExecutor, args=(dst_file_path, threadNumber,))
            subThread.start()
            subThread.join()
            # mergerFlag = 0
            log.info('mergerFlag ' + str(mergerFlag))
            if 1 == mergerFlag:
                return False
            # 检查零件文件总大小是否等于整个文件大小
            localFileSize = os.path.getsize(dst_file_path)
            totalSize = 0
            for i in range(0, threadNumber):
                totalSize += os.path.getsize(dst_file_path + '.part.' + str(i))
            if localFileSize == totalSize:
                log.info('localFileSize ' + str(localFileSize))
                log.info('totalSize ' + str(totalSize))
                break
        # 合并临时文件完毕清除临时文件
        clearTempFiles(dst_file_path, threadNumber)
        return True
    except Exception as e:
        log.error(e)
        return False


def mergerFileExecutor(dst_file_path, threadNumber):
    """
    合并临时文件子线程
    :param dst_file_path: 本地文件路径
    :param threadNumber: 线程数
    :return:
    """
    try:
        errorFlag = 0
        fw = open(dst_file_path, 'wb')
        for i in range(0, threadNumber):
            fname = dst_file_path + '.part.' + str(i)
            if not os.path.exists(fname):
                errorFlag = 1
                break
            fr = open(fname, 'rb')
            data = fr.read()
            # time.sleep(2)
            fr.close()
            fw.write(data)
            fw.flush()
            # time.sleep(1)
        fw.close()
        if 1 == errorFlag:
            # 某些零件文件不可用
            # mergerFlag = 1
            return False
    except Exception as e:
        # mergerFlag = 1
        log.error(e)
        return False


def clearTempFiles(dst_file_path, threadNumber):
    """
    删除临时文件
    :param dst_file_path: 本地文件路径
    :param threadNumber: 线程数
    :return:
    """
    try:
        for i in range(0, threadNumber):
            fname = dst_file_path + '.part.' + str(i)
            os.remove(fname)
    except Exception as e:
        log.error(e)
