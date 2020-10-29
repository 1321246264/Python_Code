#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Time    : 2020/8/12 15:24
# @Author  : Wangwenzhe
# @Site    :
# @File    : scan_chk.py
# @Software: PyCharm

from __future__ import division
from xml.dom.minidom import parse
from ftplib import FTP
from ftplib import error_perm
from conf.settings import *
from utils.scan_log import *

import datetime
import sys
import csv
import socket
import math
import re
import pymysql
import time
import os

"""
ftp 下载

1、遍历 ftp 文件夹下所有 chk 文件
2、若 chk 文件不存在于 mysql 已完成列表中，则下载此 chk 文件
3、将下载的 chk 文件名添加到 mysql 中并标记为 ‘new’ 状态
4、将 mysql 中已完成的任务文件名移至 ftp 的备份文件夹中
mysql检查

1、开启 new 和 error 状态的任务
2、将 pid 不存在的进程重新开启
"""


class FtpOps(object):
    """
    ftp文件操作
    """

    def __init__(self, ftp_ip, ftp_port, ftp_user, ftp_pwd):
        self.ftp_ip = ftp_ip
        self.ftp_port = ftp_port
        self.ftp_user = ftp_user
        self.ftp_pwd = ftp_pwd

    def ftp_connect(self):
        """
        连接ftp
        :return:
        """
        socket.setdefaulttimeout(60)  # 超时FTP时间设置为60秒
        ftp = FTP()
        ftp.connect(host=self.ftp_ip, port=self.ftp_port)
        # ftp.set_debuglevel(2)  # 开启调试模式
        ftp.encoding = 'utf-8'

        try:
            ftp.login(self.ftp_user, self.ftp_pwd)
            scan_log.info('[{}]login ftp {}'.format(self.ftp_user, ftp.getwelcome()))  # 打印欢迎信息
        except(socket.error, socket.gaierror):  # ftp 连接错误
            scan_log.error("ERROR: cannot connect [{}:{}]".format(self.ftp_ip, self.ftp_port))
            return None
        except error_perm:  # 用户登录认证错误
            scan_log.error("ERROR: user Authentication failed ")
            return None
        except Exception as e:
            scan_log.error(str(e))
            return None
        return ftp

    def progressbar(self, cur, total):
        """
        进度条显示
        cur表示当前的数值，total表示总的数值。
        :param cur:
        :param total:
        :return:
        """
        percent = '{:.2%}'.format(cur / total)

        sys.stdout.write('\r')
        sys.stdout.write('[%-50s] %s' % ('=' * int(math.floor(cur * 50 / total)), percent))
        sys.stdout.flush()
        if cur == total:
            sys.stdout.write('\n')

    def upload_file(self, ftp, local_file, remote_file):
        """从本地上传文件到ftp

           参数:
             local_path: 本地文件

             remote_path: 远程文件
        """
        if not os.path.isfile(local_file):
            scan_log.info('%s 不存在' % local_file)
            return

        # if self.is_same_size(local_file, remote_file):
        #     self.debug_print('跳过相等的文件: %s' % local_file)
        #     return

        buf_size = 1024
        file_handler = open(local_file, 'rb')
        ftp.storbinary('STOR %s' % remote_file, file_handler, buf_size)
        file_handler.close()
        scan_log.info('上传: %s' % local_file + "成功!")

    def download_file(self, ftp, ftp_file_path, dst_file_path):
        """
        从ftp下载文件到本地
        :param ftp: ftp连接
        :param ftp_file_path: ftp下载文件路径
        :param dst_file_path: 本地存放路径
        :return:
        """
        buffer_size = 10240  # 默认是8192
        scan_log.info(ftp.getwelcome())  # 显示登录ftp信息

        # 将传输模式改为二进制模式 ,避免提示 ftplib.error_perm: 550 SIZE not allowed in ASCII
        ftp.voidcmd('TYPE I')
        remote_file_size = ftp.size(ftp_file_path)  # 文件总大小 , 远程告警

        cmpsize = 0  # 下载文件初始大小
        lsize = 0
        start = time.time()

        try:
            conn = ftp.transfercmd('RETR {0}'.format(ftp_file_path), lsize)
            # 创建文件
            with open(dst_file_path, "wb+") as f:
                while True:
                    data = conn.recv(buffer_size)
                    if not data:
                        break
                    f.write(data)
                    cmpsize += len(data)
                    self.progressbar(cmpsize, remote_file_size)

            ftp.voidcmd('NOOP')
            scan_log.info('keep alive cmd success')
            ftp.voidresp()
            scan_log.info('No loop cmd')
            # conn.close()
        except Exception as e:
            scan_log.error(str(e))
        finally:
            end = time.time()
            scan_log.info('download file: %s, consume time: %.2f s' % (ftp_file_path, end - start))
            file_size = os.stat(dst_file_path).st_size
            scan_log.info('local file:[%s] filesize: %.2f MB' % (dst_file_path, file_size / 1024 / 1024))


def txts_to_csv(txtfile_path, csvfilename):
    """
    将 TXT 文件转化为 CSV 文件
    """
    # if os.path.exists(csvfilename):
    #     os.remove(csvfilename)

    with open(csvfilename, 'w+', newline='') as csvfile:
        spamwriter = csv.writer(csvfile, dialect='excel')
        for root, dirs, files in os.walk(txtfile_path):

            # root 表示当前正在访问的文件夹路径
            # dirs 表示该文件夹下的子目录名list
            # files 表示该文件夹下的文件list

            # 遍历文件
            for txtfile in files:

                # 读要转换的txt文件，文件每行各词间以字符分隔
                with open(txtfile_path + txtfile, 'r', encoding='utf-8') as filein:
                    for line in filein:
                        line_list = line.strip('\n').split(',')  # 这里的数据之间是以','间隔的
                        spamwriter.writerow(line_list)

if __name__ == '__main__':

    # ftp 配置信息
    host = const.FTPIP
    ftpuname = const.FTPUSERNAME
    ftppwd = const.FTPPASSWORD
    port = const.FTPPORT
    ftp_dir = const.FTP_DIR
    ftp_bak_dir = const.FTP_BAK_DIR

    # mysql 配置信息
    mysqlhost = const.MYSQLIP
    mysqluser = const.MYSQLUSERNAME
    mysqlpwd = const.MYSQLPASSWORD
    mysqldb = const.MYSQLDATABASE
    mysqltable = const.MYSQL_ETL_JOB_LOG
    new_status = const.ETL_LOG_NEW
    error_status = const.ETL_LOG_ERROR
    success_status = const.ETL_LOG_SUCCESS
    assign_status = const.ETL_LOG_ASSIGN
    upload_status = const.ETL_LOG_UPLOAD
    download_status = const.ETL_LOG_DOWNLOAD
    # 声明变量
    etl_begin_time = time.strftime('%Y-%m-%d %H:%M:%S', time.localtime())
    # hive 数据加载分区
    tableDate = ''

    not_running_list = (
        '080001', '080002', '080003', '080004', '080005', '080006', '080007', '080008', '070001',
        '070003', '070004', '070008', '070009')

    # 检查脚本参数
    """
        不带参数时，则执行 FTP 遍历 chk 文件并执行任务的程序
        含有一个参数时，则执行移动某账期数据文件的程序
        含有两个或两个以上参数时，则提示参数数目不正确并退出
        :param: 带参时，可带时间参数：20200606
    """
    paralist = sys.argv

    # 参数个数为两个时
    if 2 == len(paralist):
        # 实例化
        ftpinstance = FtpOps(host, port, ftpuname, ftppwd)

        # 创建ftp连接
        ftp = ftpinstance.ftp_connect()

        # 切换目录
        ftp.cwd(ftp_dir)

        # 获取文件目录
        fileLists = ftp.nlst()
        for file in fileLists:
            if re.search(r'%s' % paralist[1], file):
                try:
                    ftp.rename(ftp_dir + file, ftp_bak_dir + file)
                except Exception as e:
                    scan_log.error(e)
        ftp.close()
        sys.exit(0)

    # 参数个数为一个时
    elif 1 == len(paralist):
        # 实例化
        ftpinstance = FtpOps(host, port, ftpuname, ftppwd)

        # 创建ftp连接
        ftp = ftpinstance.ftp_connect()

        for root, dirs, files in os.walk('/data/10/ftpDataBack/data/numcsv/'):

            # root 表示当前正在访问的文件夹路径
            # dirs 表示该文件夹下的子目录名list
            # files 表示该文件夹下的文件list

            # 遍历文件
            for txtfile in files:
                if txtfile.split(".")[-1] == 'csv':
                    ftpinstance.upload_file(ftp, '/data/10/ftpDataBack/data/numcsv/' + txtfile, ftp_dir + txtfile)

