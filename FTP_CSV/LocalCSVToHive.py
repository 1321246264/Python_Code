#!/usr/bin/env python
# -*- coding:utf-8 -*-
# @Time    : 2020/6/5 9:17 上午
# @Author  : Ryh
# @Email   : 1327253700@qq.com
# @File    : LocalCSVToHive.py
# @Software: PyCharm

import math
import socket
import threading
import traceback
from ftplib import FTP, error_perm

from pyhive import hive

from constant import const, log
from utils import formatTable, InsertUpdateLog
import os, sys, imp, csv, time

imp.reload(sys)

# 字段类型映射map
map = {}
map['BIGINT'] = 'BIGINT'
map['BYTEINT'] = 'TINYINT'
map['CHAR'] = 'STRING'
# map['DATE'] = 'STRING'
map['DATE'] = 'DATE'
map['DECIMAL'] = 'DECIMAL'
map['FLOAT'] = 'DOUBLE'
map['INTEGER'] = 'INT'
map['NUMBER'] = 'DOUBLE'
map['SMALLINT'] = 'INT'
map['TIME'] = 'STRING'
map['TIMESTAMP'] = 'TIMESTAMP'
map['VARCHAR'] = 'STRING'
map['CHARACTER'] = 'STRING'

'''
功能介绍:ftp下载

tips:
1、权限
2、python函数在调用之前需要声明
3、累方法默认有一个 self 参数
'''


class FTP_OPS(object):
    '''
    ftp文件操作
    '''

    def __init__(self, ftp_ip, ftp_prot, ftp_user, ftp_pwd):
        self.ftp_ip = ftp_ip
        self.ftp_prot = ftp_prot
        self.ftp_user = ftp_user
        self.ftp_pwd = ftp_pwd
        self.mergerFlag = 0

    def ftp_connect(self):
        '''
        连接ftp
        :return:
        '''
        socket.setdefaulttimeout(60)  # 设置FTP连接超时时间为60秒
        ftp = FTP()
        ftp.connect(host=self.ftp_ip, port=self.ftp_prot)
        # ftp.set_debuglevel(2)   #开启调试模式
        ftp.encoding = 'utf-8'  # 设置编码格式

        try:
            ftp.login(self.ftp_user, self.ftp_pwd)
            print('[{}] login ftp {}'.format(self.ftp_user, ftp.getwelcome()))  # 打印 ftp 欢迎信息
        except(socket.error, socket.gaierror, socket.timeout):  # ftp 连接错误
            print('ERROR: cannot connect [{}:{}]'.format(self.ftp_ip, self.ftp_prot))
            return None
        except(error_perm):  # 用户登录认证错误
            print('ERROR: user Authentication failed ')
            return None
        except Exception as e:
            print(e)
            return None
        return ftp

    def existsOrNor(self, ftp_file_path, dst_file_path):
        remote_file_size = ftp.size(ftp_file_path)  # 文件总大小 , 远程告警
        print('remote filesize: %.2f MB' % (remote_file_size / 1024 / 1024))

        # check local file isn't exists and get the local file size
        if os.path.exists(dst_file_path):  # 文件标识
            print('the file already exists in local dir')
            lsize = os.stat(dst_file_path).st_size
            if lsize >= remote_file_size:
                print('local file is bigger or equal remote file')
            return -1

    def progressbar(self, cur, total):
        '''
        进度条显示
        :param cur:当前数值
        :param total:总值
        :return:
        '''
        percent = '{:.2%}'.format(cur / total)
        sys.stdout.write('\r')
        sys.stdout.write('[%-50s] %s' % ('=' * int(math.floor(cur * 50 / total)), percent))
        sys.stdout.flush()  # 刷新输出
        if cur == total:
            sys.stdout.write('\n')

    def download_file(self, ftp_file_path, dst_file_path):
        '''
        ftp文件下载至本地
        :param ftp_file_path:ftp下载文件
        :param dst_file_path: 本地文件存放路径
        :return:
        '''
        buffer_size = 10240  # 默认8192
        # ftp = self.ftp_connect()

        # 将传输模式改为二进制模式 ,避免提示 ftplib.error_perm: 550 SIZE not allowed in ASCII
        ftp.voidcmd('TYPE I')
        # print('返回当前所在位置:' ,ftp.pwd())
        # print('显示目录下文件信息' ,ftp.dir())
        # print('获取目录下的文件:', ftp.nlst())
        # print('ftp下载文件:', ftp_file_path)
        remote_file_size = ftp.size(ftp_file_path)  # 文件总大小 , 远程告警
        print('remote filesize: %.2f MB' % (remote_file_size / 1024 / 1024))

        cmpsize = 0  # 下载文件初始大小
        lsize = 0
        start = time.time()

        try:
            conn = ftp.transfercmd('RETR {0}'.format(ftp_file_path), lsize)
            print('RETR {0}'.format(ftp_file_path), lsize)
            f = open(dst_file_path, "ab")
            while True:
                data = conn.recv(buffer_size)
                if not data:
                    break
                f.write(data)
                cmpsize += len(data)
                self.progressbar(cmpsize, remote_file_size)

            ftp.voidcmd('NOOP')
            print('keep alive cmd success')
            ftp.voidresp()
            print('No loop cmd')
            conn.close()
            # ftp.quit()
        except Exception as e:
            pass
            print(e)
        finally:
            f.close()
            end = time.time()
            print('consume time: %.2f s' % (end - start))
            file_size = os.stat(dst_file_path).st_size
            print('local filesize: %.2f MB' % (file_size / 1024 / 1024))

    # ftp多进程文件下载
    def setupThreads(self, ftp_file_path, dst_file_path, threadNumber):
        '''
        ftp多进程文件下载
        :param ftp_file_path: ftp文件路径
        :param dst_file_path: ftp本地下载路径
        :param threadNumber: 线程数
        :return:
        set up the threads which will be used to download file
        list of threads will be returned if success, else
        None will be returned
        '''
        try:
            # ftp = self.ftp_connect()
            remote_file_size = ftp.size(ftp_file_path)  # 文件总大小 , 远程告警
            print('文件总大小 ', remote_file_size)
            blockSize = remote_file_size / threadNumber  # 每个线程处理的文件大小
            blockSize = int(blockSize)
            print('每个线程处理的文件大小 ', blockSize)
            threads = []
            for i in range(0, threadNumber - 1):
                begin_point = blockSize * i
                # print('处理起始位置 ',begin_point)
                # 创建线程
                subThread = threading.Thread(
                    target=self.downloadFileMultiThreads(i, ftp_file_path, dst_file_path, begin_point, blockSize))
                threads.append(subThread)
            assigned = blockSize * threadNumber  # 分配大小
            unassigned = remote_file_size - assigned  # 未分配大小
            print('未分配大小 ', unassigned)
            lastBlockSize = blockSize + unassigned  # 最后文件大小
            print('最后文件大小 ', lastBlockSize)
            begin_point = blockSize * (threadNumber - 1)
            print('最后文件处理起始位置 ', begin_point)
            # 创建线程
            subThread = threading.Thread(
                target=self.downloadFileMultiThreads(threadNumber - 1, ftp_file_path, dst_file_path, begin_point,
                                                     lastBlockSize))
            threads.append(subThread)
            return threads
        except Exception as e:
            print(e)
            log.error(str(e), 'error')
            return None

    # ftp多线程文件下载子线程
    def downloadFileMultiThreads(self, threadIndex, remoteFilePath, dst_file_path, beginPoint, blockSize):
        '''
        A sub thread used to download file
        :param threadIndex:线程号
        :param remoteFilePath:ftp文件路径
        :param localFilePath:本地文件路径
        :param beginPoint:处理起始位置
        :param blockSize:处理文件大小
        :param rest:
        :return:
        '''
        try:
            # threadName = threading.currentThread().getName()    # 获取当前线程的方法
            # ftp = self.ftp_connect()
            # 临时本地文件
            fp = open(dst_file_path + '.part.' + str(threadIndex), 'wb')
            callback = fp.write

            # 另一个到ftp服务器的连接，更改为路径，并设置二进制模式
            ftp.cwd(os.path.dirname(remoteFilePath))  # os.path.dirname返回文件路径
            # 将传输模式改为二进制模式 ,避免提示 ftplib.error_perm: 550 SIZE not allowed in ASCII
            ftp.voidcmd('TYPE I')
            finishedSize = 0

            print('remote filesize: %.2f MB' % (blockSize / 1024 / 1024))

            # 开始下载
            beginToDownload = 'RETR ' + os.path.basename(remoteFilePath)  # os.path.basename返回文件名
            connection = ftp.transfercmd(beginToDownload, beginPoint)  # 从何处开始下载,断点传输,起始文件位置   beginPoint
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
                # self.progressbar(finishedSize, readSize)  # 打印文件下载进度条
                # 确保完成的数据不超过blockSize
                if finishedSize == blockSize:
                    callback(data)
                    break
                callback(data)
            connection.close()
            fp.close()  # 关闭文件
            # ftp.quit()  # 关闭ftp连接,此处注释将退出ftp连接移置main函数ftp功能部分结束统一退出,防止 550 The specified network name is no longer available. 错误
            return True
        except Exception as e:
            print(e)
            return False

    # 合并临时文件
    def mergerFile(self, dst_file_path, threadNumber):
        '''
        将文件的所有子部分合并为一个文件
        将调用另一个线程来执行此操作
        :param dst_file_path:
        :param threadNumber:
        :return:
        '''
        try:
            while 1:
                subThread = threading.Thread(target=self.mergerFileExecutor(dst_file_path, threadNumber))
                subThread.start()
                subThread.join()
                print('mergerFlag', self.mergerFlag)
                if 1 == self.mergerFlag:
                    self.mergerFlag = 0
                    return False
                # 检查零件文件总大小是否等于整个文件大小
                localFileSize = os.path.getsize(dst_file_path)
                totalSize = 0
                for i in range(0, threadNumber):
                    totalSize += os.path.getsize(dst_file_path + '.part.' + str(i))
                if localFileSize == totalSize:
                    print('localFileSize ', localFileSize)
                    print('totalSize ', totalSize)
                    break
            # 合并临时文件完毕清除临时文件
            self.clearTempFiles(dst_file_path, threadNumber)
            return True
        except Exception as e:
            log.error(e, 'error')
            return False

    # 合并临时文件子线程
    def mergerFileExecutor(self, dst_file_path, threadNumber):
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
                self.mergerFlag = 1
        except Exception as e:
            self.mergerFlag = 1
            log.error(e, 'error')

    # 删除临时文件
    def clearTempFiles(self, dst_file_path, threadNumber):
        try:
            for i in range(0, threadNumber):
                fname = dst_file_path + '.part.' + str(i)
                os.remove(fname)
        except Exception as e:
            log.error(e, 'error')


class HIVE_OPS(object):
    '''
    本地文件上传至 hive
    '''

    def __init__(self, hive_ip, hive_port, hive_user, hive_database):
        self.hive_ip = hive_ip
        self.hive_port = hive_port
        self.hive_user = hive_user
        self.hive_database = hive_database

    def parse_mapping(self, csvFileName, interface):  # 解析映射
        tableDate = csvFileName.split('_')[0]  # 获取 ftp 接口文件数据日期
        interfaceId = csvFileName.split('_')[1]  # 获取 ftp 接口文件ID
        tableName = interface[interfaceId]  # 获取 ftp 接口文件ID对应加载表名
        return tableName, tableDate

    def beeline_sql(self, sql, error_message):  # 使用 beeline 连接执行 hive 命令
        command = '''beeline -u jdbc:hive2://%s:%s -n hive -p hive -e %s''' % (self.hive_ip, self.hive_port, sql)
        log.info(command)
        # print(command)
        result = os.system(command)
        # print(result)
        if result != 0:
            log.error(error_message)

    def upload_hive(self, dst_file_path, tableName, hdfs_path):
        '''
        直接使用 beeline 将本地文件load至临时表会报找不到文件的错误,这是因为文件不是在HiveServer2 服务器上，需要先把文件放到hdfs，然后再load到临时表里
        故此处拆成两步
        ps:hdfs文件load到表完成之后文件自动删除,故不需要再删除hdfs临时文件
        :param dst_file_path:本地文件路径
        :param tableName:正式表名
        :param hdfs_path:hdfs临时文件存放路径
        :return:
        '''
        put_path = hdfs_path + '/' + csvFileName
        # put_file = 'hdfs dfs -put %s %s' % (dst_file_path, hdfs_path)
        # print(put_file)
        # os.system(put_file)   #上传至主机时取消此注释
        # load_hive = '''"load data inpath '%s' overwrite into table %s.%s"''' % (put_path, self.hive_database, tableName)
        # print(load_hive)
        # self.beeline_sql(load_hive, 'load data local inpath !')   #上传至主机时取消此注释

        # 使用hive连接 put 文件及 load 文件
        put_file = 'hdfs dfs -put %s %s' % (dst_file_path, hdfs_path)
        print(put_file)
        # os.system(put_file)   #上传至主机时取消此注释
        load_hive = '''load data inpath '%s' overwrite into table %s.%s''' % (put_path, self.hive_database, tableName)
        # hiveConnect = self.CreateConnectHive()
        print(load_hive)
        hiveConnect.execute(load_hive)
        # hiveConnect.close()

    def create_temp_table(self, dst_file_path, configure_path, hive_database, tableName, tableDate):
        # 读取execl
        configureFile = configure_path
        # 获取table字典
        tabledict = formatTable(configureFile)
        tabledict = tabledict['BMNC_SDATA.' + tableName]

        log.info("\n\n\n\n\n")
        log.info("Starting Sync table [%s]." % tableName)
        cols = tabledict['COLUMNLIST']
        types = tabledict['TYPELIST']
        comments = tabledict['COMMENTLIST']
        # 用于记录decimal(rangea,rangeb)取值范围
        rangea = tabledict['DECILIST']
        rangeb = tabledict['COLLAST']

        # 通过拼接字段生成建表sql
        tablist = " "
        for col, type, a, b, comment in zip(cols, types, rangea, rangeb, comments):
            type = map[type]
            # 遇到decimal类型则需加上特定范围
            if type == 'DECIMAL':
                tablist = tablist + '`' + col + '` ' + type + '(' + a + ',' + b + ')' + ' comment "' + comment + '",'
            else:
                tablist = tablist + '`' + col + '` ' + type + ' comment "' + comment + '",'
        # 通过拼接字段生成临时表数据插入正式表sql
        insert_sql_list = " "
        for col, type, a, b in zip(cols, types, rangea, rangeb):
            type = map[type]
            # 遇到decimal类型则需加上特定范围
            if type == 'DECIMAL':
                insert_sql_list = insert_sql_list + 'CAST(' + '`' + col + '` ' + 'AS ' + type + '(' + a + ',' + b + ')' + '), '
            elif type == 'TIMESTAMP':
                insert_sql_list = insert_sql_list + '''CAST(CONCAT(SUBSTR(''' + col + ''',0,4),'-',SUBSTR(''' + col + ''',5,2),'-',SUBSTR(''' + col + ''',7,2),' ',SUBSTR(''' + col + ''',9)) AS ''' + type + '), '
            elif col == 'REC_SEQ':
                insert_sql_list = insert_sql_list + 'ROW_NUMBER() OVER() AS `REC_SEQ`' + ', '
            else:
                insert_sql_list = insert_sql_list + 'CAST(' + '`' + col + '` ' + 'AS ' + type + '), '

        tablist = tablist.replace(',`REC_SEQ` INT comment "记录序号",', '')
        # 实例化hive连接
        # hiveConnect = self.CreateConnectHive()
        # 创建临时库
        create_temp_database = '''CREATE DATABASE IF NOT EXISTS %s''' % (hive_database)
        hiveConnect.execute(create_temp_database)
        # 创建临时表
        create_temp_table_sql = '''CREATE TABLE IF NOT EXISTS %s.%s (%s) ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde' with SERDEPROPERTIES ("separatorChar"=",","quotechar"="\\"") STORED AS TEXTFILE''' % (
            hive_database, tableName, tablist)
        create_temp_near_line_table_sql = '''CREATE TABLE IF NOT EXISTS %s.%s (%s) ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde' with SERDEPROPERTIES ("separatorChar"=",","quotechar"="\\"") STORED AS TEXTFILE''' % (
            hive_database, tableName + TempTableSuffix, tablist)
        if len(File_DtimeSeq) == 14:  # 长度为14则为近线数据
            print(create_temp_near_line_table_sql)
            hiveConnect.execute(create_temp_near_line_table_sql)
            # 本地文件 load 至 支持 csv 格式加载的临时表中
            self.upload_hive(dst_file_path, tableName + TempTableSuffix, hdfs_path)
        else:  # 非近线数据正常加载
            print(create_temp_table_sql)
            hiveConnect.execute(create_temp_table_sql)
            # 本地文件 load 至 支持 csv 格式加载的临时表中
            self.upload_hive(dst_file_path, tableName, hdfs_path)
        # 原Data_Dt字段作为分区字段,如存在则需在insert语句中提出Data_Dt至末尾
        orc_table_cols = ','.join(
            filter(lambda x: x != ' CAST(`Data_Dt` AS DATE)', insert_sql_list.strip(',').split(',')))
        insert_orc_sql = '''INSERT OVERWRITE TABLE BMNC_SDATA.%s PARTITION(DATA_DT) SELECT %s CAST ('%s' AS DATE) AS `DATA_DT` FROM %s.%s''' % (
            tableName, orc_table_cols, tableDate, hive_database, tableName)
        insert_near_line_orc_sql = '''INSERT OVERWRITE TABLE BMNC_SDATA.%s PARTITION(DATA_DT,File_DtimeSeq) SELECT %s CAST ('%s' AS DATE) AS `DATA_DT`, '%s' AS File_DtimeSeq FROM %s.%s''' % (
            tableName, orc_table_cols, tableDate, File_DtimeSeq, hive_database, tableName + TempTableSuffix)
        # 开启hive动态分区
        hiveConnect.execute('set hive.exec.dynamic.partition=true')
        hiveConnect.execute('set hive.exec.dynamic.partition.mode=nostrick')
        if len(File_DtimeSeq) == 14:  # 长度为14则为近线数据
            print(insert_near_line_orc_sql)
            hiveConnect.execute(insert_near_line_orc_sql)
        else:  # 非近线数据正常加载
            print(insert_orc_sql)
            hiveConnect.execute(insert_orc_sql)
        # hiveConnect.close()

    def HivePartitionRecordNumber(self):
        # hiveConnect = self.CreateConnectHive()
        countSql = '''SELECT COUNT(*) FROM BMNC_SDATA.%s WHERE DATA_DT = '%s' ''' % (tableName, tableDate)
        nearLineCountSql = '''SELECT COUNT(*) FROM BMNC_SDATA.%s WHERE DATA_DT = '%s' AND File_DtimeSeq = '%s' ''' % (
            tableName, tableDate, File_DtimeSeq)
        if len(File_DtimeSeq) == 14:  # 长度为14则为近线数据
            print(nearLineCountSql)
            hiveConnect.execute(nearLineCountSql)
        else:  # 非近线数据正常加载
            print(countSql)
            hiveConnect.execute(countSql)
        countlist = hiveConnect.fetchone()
        # hiveConnect.close()
        return countlist[0]  # 返回记录条数

    def HiveDropTempTable(self):  # 清除临时表
        # hiveConnect = self.CreateConnectHive()
        dropTempTable = '''DROP TABLE %s.%s''' % (hive_database, tableName)
        dropNearLineTempTable = '''DROP TABLE %s.%s''' % (hive_database, tableName + TempTableSuffix)
        if len(File_DtimeSeq) == 14:  # 长度为14则为近线数据
            print(dropNearLineTempTable)
            hiveConnect.execute(dropNearLineTempTable)
        else:  # 非近线数据正常加载
            print(dropTempTable)
            hiveConnect.execute(dropTempTable)
        # hiveConnect.close()

    def CreateConnectHive(self):
        conn = hive.Connection(host=self.hive_ip, port=self.hive_port, username=self.hive_user,
                               database=self.hive_database)
        cursor = conn.cursor()
        log.info(cursor)
        return cursor


if __name__ == "__main__":
    # 声明变量
    FTP_DIR = ''  # ftp文件路径
    csvFileName = ''  # ftp文件名
    FtpFilePushTime = time.strftime('%Y-%m-%d %H:%M:%S', time.localtime())  # ftp文件上传时间
    FtpFileSize = 0  # ftp文件大小
    FtpFileRecordNumber = 0  # ftp文件记录条数
    tableName = ''  # hive表名
    tableDate = ''  # hive数据加载分区
    tableCount = 0  # hive数据加载分区记录数
    # 获取当前进程的 pid
    etlPid = os.getpid()

    try:
        # 获取脚本传入参数
        paralist = sys.argv

        # 执行此任务命令 python3 LocalCSVToHive.py / 20191222_110003_00_00_00_0_20191222234500_00.csv
        # 测试先写死,正式使用时删除此部分
        # paralist = ['LocalCSVToHive.py', '/', '20191222_110003_00_00_00_0_20191222234500_00.csv']
        # paralist = ['LocalCSVToHive.py', '/', '20191222_010003_00_00_00_0.csv']

        # ftp文件路径
        FTP_DIR = paralist[1]
        # ftp文件名称
        csvFileName = paralist[2]
        # ftp文件下载至本地路径
        FTP_LOCAL_DIR = const.FTP_LOCAL_DIR
        # 近线文件名中排除后缀名.csv部分以下划线分隔倒数第二位长度为14以此区分是否近线加载
        File_DtimeSeq = csvFileName.split('.')[0].split('_')[
            -2]  # 近线文件名 20191222_110003_00_00_00_0_20191222234500_00.csv 正常文件名 20191222_019911_00_00_00_0.csv
        # 临时表表名后缀,以此防止近线1分钟传输一次导致表名重复数据覆盖,去除脏数据
        TempTableSuffix = csvFileName.split('.')[0]

        # ftp连接信息
        FTPIP = const.FTPIP
        FTPUSERNAME = const.FTPUSERNAME
        FTPPASSWORD = const.FTPPASSWORD
        FTPPORT = const.FTPPORT

        '''
        FTP CSV文件下载至本地
        '''
        # 实例化
        ftpinstance = FTP_OPS(FTPIP, FTPPORT, FTPUSERNAME, FTPPASSWORD)
        # 创建ftp连接
        ftp = ftpinstance.ftp_connect()
        # 切换ftp目录
        ftp.cwd(FTP_DIR)
        # 获取目录下的文件
        ftp_file_path = FTP_DIR + csvFileName  # ftp文件绝对路径,例:/20191222_110003_00_00_00_0_20191222234500_00.csv
        dst_file_path = FTP_LOCAL_DIR + '/' + csvFileName  # 本地文件下载路径,例:/Users/renyuanhai/PycharmProjects/FTP_CSV/20191222_110003_00_00_00_0_20191222234500_00.csv
        fileSize = ftp.size(ftp_file_path)

        if -1 != ftpinstance.existsOrNor(ftp_file_path, dst_file_path):
            # 文件存在则开始下载
            # 插入etl任务执行状态日志
            InsertUpdateLog(FTP_DIR, csvFileName, FtpFileSize, FtpFileRecordNumber, FtpFilePushTime, tableName,
                            tableDate,
                            tableCount, 'downoad', '', etlPid)
            if fileSize <= 300 * 1024 * 1024:
                # 暂定小于 300MB 的文件为小文件直接单线程 ftp 文件下载
                ftpinstance.download_file(ftp_file_path, dst_file_path)  # 单线程 ftp 文件下载
            else:
                # 暂定大于 300MB 的文件为大文件多线程 ftp 文件下载
                ftpinstance.setupThreads(ftp_file_path, dst_file_path, 20)  # 多线程下载,暂固定20个线程
                ftpinstance.mergerFile(dst_file_path, 20)  # 将多线程生成的线程数文件合并为一个,并清除临时文件
        ftp.quit()

        '''
        本地CSV文件put及load至hive
        '''
        # hive连接信息
        hive_ip = const.HIVEIP
        hive_port = const.HIVEPORT
        hive_user = const.HIVEUSERNAME
        hive_database = const.HIVEDATABASE
        interface = const.INTERFACE
        # 实例化
        hive_ops = HIVE_OPS(hive_ip, hive_port, hive_user, hive_database)
        # 解析本地文件
        tableName, tableDate = hive_ops.parse_mapping(csvFileName, interface)
        tableDate = tableDate[0:4] + '-' + tableDate[4:6] + '-' + tableDate[6:]
        # hdfs 文件存放位置配置信息
        hdfs_path = const.HDFS_PATH
        # 接口Id对应hive表名信息配置文件存放绝对路径
        configure_path = const.CONFIGURE_PATH
        # csv文件加载
        # 插入etl任务执行状态日志
        InsertUpdateLog(FTP_DIR, csvFileName, FtpFileSize, FtpFileRecordNumber, FtpFilePushTime, tableName,
                        tableDate,
                        tableCount, 'upload', '', etlPid)
        # 实例化hive连接
        hiveConnect = hive_ops.CreateConnectHive()
        hive_ops.create_temp_table(dst_file_path, configure_path, hive_database, tableName, tableDate)
        # csv文件加载至hive正式表分区数据记录条数
        tableCount = hive_ops.HivePartitionRecordNumber()
        # 数据加载完毕清除临时表
        hive_ops.HiveDropTempTable()
        # hive 数据加载部分结束,断开hive连接
        hiveConnect.close()
        # etl过程结束清除本地ftp文件
        os.remove(dst_file_path)
        # etl任务执行完毕插入mysql etl日志
        InsertUpdateLog(FTP_DIR, csvFileName, FtpFileSize, FtpFileRecordNumber, FtpFilePushTime, tableName, tableDate,
                        tableCount, 'success', '', etlPid)
    except Exception as e:
        # 获取报错信息
        etl_job_error_log = 'Error: ' + traceback.format_exc()
        # etl任务执行失败插入mysql etl日志
        InsertUpdateLog(FTP_DIR, csvFileName, FtpFileSize, FtpFileRecordNumber, FtpFilePushTime, tableName, tableDate,
                        tableCount, 'error', etl_job_error_log, etlPid)
        # print(etl_job_error_log)
