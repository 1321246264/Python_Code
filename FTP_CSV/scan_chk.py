#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Time    : 2020/8/12 15:24
# @Author  : Wangwenzhe
# @Site    :
# @File    : scan_chk.py
# @Software: PyCharm

from __future__ import division

import sys
from ftplib import FTP
from ftplib import error_perm

import socket
import math
import re
import pymysql
import time
import os

from conf.settings import *
from utils.scan_log import *

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


class Mysql(object):
    """
    Mysql 操作
    """

    def __init__(self, mysql_host, mysql_user, mysql_passwd, mysql_db):
        self.mysql_host = mysql_host
        self.mysql_user = mysql_user
        self.mysql_passwd = mysql_passwd
        self.mysql_db = mysql_db
        try:
            # 打开数据库连接
            # 连接数据库所需的值，可以在__init__()中传入
            self.conn = pymysql.connect(
                host=self.mysql_host,
                port=3306,
                user=self.mysql_user,
                passwd=self.mysql_passwd,
                db=self.mysql_db,
                charset='utf8'
            )
        except Exception as e:
            scan_log.error(str(e))
        else:
            # print("connect successfully")
            scan_log.info("connect successfully")
            # 使用 cursor() 方法创建一个游标对象 cursor
            self.cur = self.conn.cursor()

    def insert(self, insert_sql):
        """
        数据库插入语句
        :param insert_sql:要执行的插入语句
        :return:
        """
        # 数据库插入语句
        try:
            self.cur.execute(insert_sql)
            # 提交到数据库执行
            self.conn.commit()
        except Exception as e:
            scan_log.error(str(e))
            # 发生错误时回滚
            self.conn.rollback()
            scan_log.error("fail to insert new data")
            # print("fail to insert new data")
        else:
            scan_log.info("insert data success！")
            # print("insert data success！")

    def show(self, select_sql):
        """
        Python查询Mysql使用
        fetchone()方法获取单条数据, 使用fetchall()方法获取多条数据。
        fetchone(): 该方法获取下一个查询结果集。结果集是一个对象
        fetchall(): 接收全部的返回结果行.
        rowcount: 这是一个只读属性，并返回执行execute()
        方法后影响的行数。
        :param select_sql:要执行的查询语句
        :return:接收全部的返回结果行
        """
        try:
            self.cur.execute(select_sql)
            # fetchall()返回的结果是list，list里面再嵌套list

        except Exception as e:
            scan_log.error(str(e) + "select data fail")
            # print(e + "select data fail")
        else:
            scan_log.info("select data success")
            # print("select data success")
            return self.cur.fetchall()

    def update(self, update_sql):
        """
        更新数据库
        :param update_sql:要执行的更新语句
        :return:
        """
        try:
            self.cur.execute(update_sql)
            self.conn.commit()
        except Exception as e:
            scan_log.error(str(e))
        else:
            scan_log.info("update data success")
            # print("update data success")

    def close(self):
        """
        关闭数据库连接
        :param
        :return:
        """
        self.cur.close()
        self.conn.close()
        scan_log.info("close database success")
        # print("close database success")


def read_file(dst_file_paths):
    """
    读取本地文件
    :param dst_file_paths:要读取的本地文件路径
    :return message:返回需要的字段集合
    """
    message = []
    with open(dst_file_paths, "r", encoding='utf-8') as f:
        while True:
            # 逐行读取
            line = f.readlines()
            if line:
                # 按 \t 切分文件中的内容
                line = "".join(line).replace(",", "\t")
                line = line.split("\t")

                if len(line) <= 3:

                    message.append(line[0])  # 数据文件名
                    message.append(line[1])  # 数据文件大小，字节
                    message.append(line[2])  # 数据文件记录行数
                    return message
                else:
                    message.append(line[0])  # 数据文件名
                    message.append(line[1])  # 数据文件大小，字节
                    message.append(line[2])  # 数据文件记录行数
                    # print(line[2])
                    message.append(line[3].split("\n")[0])  # 数据文件记录行数
                    return message
            else:
                break


def timestamp_format(original_timestamp):
    """
    修改 chk 文件中的时间格式
    :param original_timestamp:需要修改的时间戳字符串
    :return modified_timestamp:返回已修改的时间戳字符串
    """
    # 修改 chk 文件内容中的时间格式
    # print(original_timestamp)
    # print(len(original_timestamp))
    if len(original_timestamp) == 19:
        return original_timestamp
    elif len(original_timestamp) == 17:
        original_timestamp_list = list(original_timestamp)
        original_timestamp_list.insert(4, '-')
        original_timestamp_list.insert(7, '-')
        modified_timestamp = ''.join(original_timestamp_list)
        return modified_timestamp
    elif len(original_timestamp) == 14:
        original_timestamp_list = list(original_timestamp)
        original_timestamp_list.insert(4, '-')
        original_timestamp_list.insert(7, '-')
        original_timestamp_list.insert(10, ' ')
        original_timestamp_list.insert(13, ':')
        original_timestamp_list.insert(16, ':')
        modified_timestamp = ''.join(original_timestamp_list)
        return modified_timestamp
    elif len(original_timestamp) == 16:
        original_timestamp_list = list(original_timestamp)
        original_timestamp_list.insert(4, '-')
        original_timestamp_list.insert(7, '-')
        original_timestamp_list.insert(10, ' ')
        modified_timestamp = ''.join(original_timestamp_list)
        return modified_timestamp
    elif len(original_timestamp) == 18:
        original_timestamp_list = list(original_timestamp)
        original_timestamp_list.insert(4, '-')
        original_timestamp_list.insert(7, '-')
        original_timestamp_list.pop(-1)
        modified_timestamp = ''.join(original_timestamp_list)
        return modified_timestamp
    else:
        print("date is illegal")


def pid_exists(pid):
    """
    判断pid是否存在相应进程
    :param pid:要判断的pid号
    :return select_pid_notexit_res:返回pid不存在时MySQL中相应的文件名集合
    """
    try:
        print("ps %s" % pid)
        status_pid_int = os.system("ps %s" % pid)
        if status_pid_int != 0:
            select_pid_notexit_sql = "select FtpFileName from %s.%s where pid='%s'" % (mysqldb, mysqltable, pid)
            select_pid_notexit_res = mysql.show(select_pid_notexit_sql)
            for FtpFileName_IdNotExit_row in select_pid_notexit_res:
                return FtpFileName_IdNotExit_row[0]
    except Exception as e:
        scan_log.error(str(e))


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
    # hive 数据加载分区
    tableDate = ''

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

        # print(fileLists)
        # print('-------------------------------')

        # 获取文件目录
        fileLists = ftp.nlst()
        # print(fileLists)
        for file in fileLists:
            if re.search(r'%s_' % paralist[1], file):
                try:
                    # print(file)
                    ftp.rename(ftp_dir + file, ftp_bak_dir + file)
                except Exception as e:
                    scan_log.error(e)
        ftp.close()
        sys.exit(0)

    # 参数个数为一个时
    elif 1 == len(paralist):
        # 无限循环
        while True:
            # 先将非结构化数据移至备份库
            # os.system("python3 scan_chk.py _080001")
            # os.system("python3 scan_chk.py _080002")
            # os.system("python3 scan_chk.py _080003")
            # os.system("python3 scan_chk.py _080004")
            # os.system("python3 scan_chk.py _080005")
            # os.system("python3 scan_chk.py _080006")
            # os.system("python3 scan_chk.py _080007")
            # os.system("python3 scan_chk.py _080008")
            # os.system("python3 scan_chk.py _070001")
            # os.system("python3 scan_chk.py _070003")
            # os.system("python3 scan_chk.py _070004")
            # os.system("python3 scan_chk.py _070008")
            # os.system("python3 scan_chk.py _070009")

            # 实例化
            ftpinstance = FtpOps(host, port, ftpuname, ftppwd)

            # 创建ftp连接
            ftp = ftpinstance.ftp_connect()

            # 切换目录
            ftp.cwd(ftp_dir)

            # 获取文件目录
            fileLists = ftp.nlst()
            # print(fileLists)

            # 数据文件路径
            local_dir = os.path.dirname(os.path.abspath(__file__)) + '/data/' + time.strftime('%Y%m%d', time.localtime(
                time.time())) + '/'
            # 若不存在本地数据备份目录，则创建该目录
            os.system('mkdir -p %s' % local_dir)

            # 连接 Mysql
            mysql = Mysql(mysqlhost, mysqluser, mysqlpwd, mysqldb)

            # 查询表中三天内的数据文件名
            select_FileName_sql = "select ftpFileName from %s.%s where ctime between  date_add(now(), interval -3 day) and now() " % (
                mysqldb, mysqltable)
            select_FileName_sql_res = mysql.show(select_FileName_sql)

            # 遍历当前目录下所有文件名
            for file in fileLists:

                if re.search(r".csv", file):
                    only_csv_fileName = re.sub("csv", "chk", file)

                    ftp_filename = file.split(".")[0]

                    # 获取接口代码数
                    InterfaceCode = ftp_filename.split("_")[1]
                    # 声明变量
                    etl_begin_time = time.strftime('%Y-%m-%d %H:%M:%S', time.localtime())

                    if only_csv_fileName not in fileLists:
                        if re.search(r"ACTL", file) or re.search(r"PLAN", file) or re.search(r"REAL", file):
                            print(file)
                        else:
                            print(file)
                            # insert_sql = "insert into %s.%s(FtpFilePath, interfaceCode, FtpFileName,  " \
                            #              "FtpFilePushTime, etl_job_status, etl_begin_time, txDate) values(" \
                            #              "'%s','%s', " \
                            #              "'%s', null, '%s', '%s','%s')" % (
                            #                  mysqldb, mysqltable, ftp_dir, InterfaceCode, file,
                            #                  new_status,
                            #                  etl_begin_time, tableDate)

                # 遍历所有chk文件
                # if re.search(r".chk", file):
                #     pass

            #         # chk 的 ftp 文件路径
            #         chk_ftp_file_path = ftp_dir + file
            #         # chk 的本地文件路径
            #         dst_file_path = local_dir + file
            #         # chk 对应的数据文件名
            #         ftp_filename = file.split(".")[0]
            #
            #         # 遍历表中文件名
            #         fileName_list = list()
            #         for fileName_row in select_FileName_sql_res:
            #             fileName = fileName_row[0].split(".")[0]  # ftpFileName
            #             fileName_list.append(fileName)
            #
            #         # 下载mysql中没有记录的文件，即还没有处理的文件
            #         if ftp_filename not in fileName_list:
            #             print(ftp_filename)
            #             # os.system("rm -f dst_file_path")
            #             ftpinstance.download_file(ftp, chk_ftp_file_path, dst_file_path)
            #
            #             # 声明变量
            #             etl_begin_time = time.strftime('%Y-%m-%d %H:%M:%S', time.localtime())
            #
            #             # 读取 chk 文件中的信息
            #             chk_file_message = read_file(dst_file_path)
            #             # print(chk_file_message)
            #
            #             FtpFilePushTime = ''
            #
            #             # 修改 chk 文件内容中的时间格式
            #             if len(chk_file_message) == 4:
            #                 FtpFilePushTime = timestamp_format(chk_file_message[3])
            #             elif len(chk_file_message) == 3:
            #                 # 如果时间戳字段有问题，则设置为null
            #                 FtpFilePushTime = "null"  # 数据文件的时间戳
            #
            #             # 获取接口代码数
            #             InterfaceCode = ftp_filename.split("_")[1]
            #
            #             # 获取 ftp 接口文件数据日期
            #             task_type = ftp_filename.split('.')[0].split('_')[0]
            #             if task_type == 'z' or task_type == 'q':
            #                 tableDate = ftp_filename.split('_')[1][0:4] + '-' + ftp_filename.split('_')[1][4:6] + '-' + \
            #                             ftp_filename.split('_')[1][6:8]
            #             else:
            #                 tableDate = ftp_filename.split('_')[0][0:4] + '-' + ftp_filename.split('_')[0][4:6] + '-' + \
            #                             ftp_filename.split('_')[0][6:8]
            #             # print(FtpFilePushTime)
            #             if FtpFilePushTime == 'null':
            #                 insert_sql = "insert into %s.%s(FtpFilePath, interfaceCode, FtpFileName, FtpFileSize, " \
            #                              "FtpFileRecordNumber, FtpFilePushTime, etl_job_status, etl_begin_time, txDate) values(" \
            #                              "'%s','%s', " \
            #                              "'%s', %s, %s, null, '%s', '%s','%s')" % (
            #                                  mysqldb, mysqltable, ftp_dir, InterfaceCode, chk_file_message[0],
            #                                  chk_file_message[1],
            #                                  chk_file_message[2], new_status,
            #                                  etl_begin_time, tableDate)
            #             else:
            #                 # 将下载好的 chk 文件信息记录到 Mysql 中
            #                 insert_sql = "insert into %s.%s(FtpFilePath, interfaceCode, FtpFileName, FtpFileSize, " \
            #                              "FtpFileRecordNumber, FtpFilePushTime, etl_job_status, etl_begin_time, txDate) values(" \
            #                              "'%s','%s', " \
            #                              "'%s', %s, %s, '%s', '%s', '%s','%s')" % (
            #                                  mysqldb, mysqltable, ftp_dir, InterfaceCode, chk_file_message[0],
            #                                  chk_file_message[1],
            #                                  chk_file_message[2], FtpFilePushTime, new_status,
            #                                  etl_begin_time, tableDate)
            #             # print(insert_sql)
            #             mysql.insert(insert_sql)
            #             # os.remove(dst_file_path)
            #
            # # # 连接 Mysql
            # # mysql = Mysql(mysqlhost, mysqluser, mysqlpwd, mysqldb)
            #
            # # # 开启 new 和 error 状态的任务
            # # # 查询状态
            # # print("Tasks that enable new and Error states")
            # # select_status_sql = "select FtpFileName from %s.%s where etl_job_status = '%s' or etl_job_status = '%s'" % (
            # #     mysqldb, mysqltable, new_status, error_status)
            # # select_status_sql_res = mysql.show(select_status_sql)
            # # # status_count = 0
            # # for status_row in select_status_sql_res:
            # #     for status_row_FtpFileName in status_row:
            # #         print(status_row_FtpFileName)
            # #
            # #         select_status_count_sql = "select count(*) from %s.%s where etl_job_status = '%s' or etl_job_status = '%s' or etl_job_status = '%s'" % (
            # #             mysqldb, mysqltable, assign_status, upload_status, download_status)
            # #
            # #         select_status_count_res = mysql.show(select_status_count_sql)
            # #         print(select_status_count_res[0][0])
            # #
            # #         if select_status_count_res[0][0] > 60:
            # #             time.sleep(5)
            # #         else:
            # #             # 调用任务开启程序
            # #             # scan_log.info("python3 LocalCSVToHive.py %s %s %s" %
            # #             #               (ftp_dir, status_row_FtpFileName, local_dir))
            # #             scan_log.info("nohup python3 LocalCSVToHive.py %s %s %s 1>/dev/null 2>&1 &" %
            # #                           (ftp_dir, status_row_FtpFileName, local_dir))
            # #             # os.system("python3 LocalCSVToHive.py %s %s %s" %
            # #             #           (ftp_dir, status_row_FtpFileName, local_dir))
            # #             print("nohup python3 LocalCSVToHive.py %s %s %s 1>/dev/null 2>&1 &" %
            # #                   (ftp_dir, status_row_FtpFileName, local_dir))
            # #             os.system("nohup python3 LocalCSVToHive.py %s %s %s 1>/dev/null 2>&1 &" %
            # #                       (ftp_dir, status_row_FtpFileName, local_dir))
            # #             time.sleep(1)
            #
            # # 开启 new 和 error 状态的任务
            # # 查询状态
            # print("Tasks that enable new and Error states")
            # select_status_sql = "select FtpFileName from %s.%s where etl_job_status = '%s' or etl_job_status = '%s'" % (
            #     mysqldb, mysqltable, new_status, error_status)
            # select_status_sql_res = mysql.show(select_status_sql)
            # status_count = 0
            # for status_row in select_status_sql_res:
            #     status_row_FtpFileName = status_row[0]
            #
            #     # select_status_count_sql = "select count(*) from %s.%s where etl_job_status = '%s' or etl_job_status = '%s' or etl_job_status = '%s'" % (
            #     # mysqldb, mysqltable, assign_status, upload_status, download_status)
            #     #
            #     # select_status_count_res = mysql.show(select_status_count_sql)
            #     # if select_status_count_res[0][0] < 60:
            #     #     print(select_status_count_sql)
            #     #     print(select_status_count_res)
            #     #     print(select_status_count_res[0])
            #     #     print(select_status_count_res[0][0])
            #     # else:
            #     #     time.sleep(5)
            #
            #     # 调用任务开启程序
            #     # scan_log.info("python3 LocalCSVToHive.py %s %s %s" %
            #     #               (ftp_dir, status_row_FtpFileName, local_dir))
            #     scan_log.info("nohup python3 LocalCSVToHive.py %s %s %s 1>/dev/null 2>&1 &" %
            #                   (ftp_dir, status_row_FtpFileName, local_dir))
            #     # os.system("python3 LocalCSVToHive.py %s %s %s" %
            #     #           (ftp_dir, status_row_FtpFileName, local_dir))
            #     print("nohup python3 LocalCSVToHive.py %s %s %s 1>/dev/null 2>&1 &" %
            #           (ftp_dir, status_row_FtpFileName, local_dir))
            #     os.system("nohup python3 LocalCSVToHive.py %s %s %s 1>/dev/null 2>&1 &" %
            #               (ftp_dir, status_row_FtpFileName, local_dir))
            #
            #     status_count += 1
            #     if status_count % 50 == 0:
            #         time.sleep(240)
            #
            # # 开启 PID 不存在的任务
            # time.sleep(10)
            # print("Enable tasks where PID does not exist")
            # select_pid_sql = "select pid from %s.%s where etl_job_status='%s' or etl_job_status='%s' or etl_job_status='%s'" % (
            # mysqldb, mysqltable, assign_status, download_status, upload_status)
            # select_pid_sql_res = mysql.show(select_pid_sql)
            # pid_count = 0
            # for pid_list in select_pid_sql_res:
            #     # 获取 pid 不存在的文件名
            #     FtpFileName_IdNotExist = pid_exists(pid_list[0])
            #     # os.system("python3 LocalCSVToHive.py %s %s %s" %
            #     #           (ftp_dir, FtpFileName_IdNotExit, local_dir))
            #     if FtpFileName_IdNotExist is not None:
            #         print("nohup python3 LocalCSVToHive.py %s %s %s 1>/dev/null 2>&1 &" %
            #               (ftp_dir, FtpFileName_IdNotExist, local_dir))
            #         os.system("nohup python3 LocalCSVToHive.py %s %s %s 1>/dev/null 2>&1 &" %
            #                   (ftp_dir, FtpFileName_IdNotExist, local_dir))
            #         pid_count += 1
            #         if pid_count % 50 == 0:
            #             time.sleep(240)
            #
            # # 移动数据文件不存在的文件
            # # time.sleep(10)
            # # print("Enable tasks where file does not exist")
            # #
            # # n = '%550 Could not get file size%'
            # #
            # # not_sql = "select ftpfilename from %s.%s where etl_job_status<>'success' and etl_job_error_log like '%s'" % (
            # # mysqldb, mysqltable, n)
            # # select_not_exit_filename_sql_res = mysql.show(not_sql)
            # # for not_exit_filename in select_not_exit_filename_sql_res:
            # #     for not_exit_filename1 in not_exit_filename:
            # #         print(not_exit_filename1)
            # #         mysql.update(
            # #             "UPDATE bmnc_devops.etl_job_log SET etl_job_status='success' where ftpfilename = '%s'" % not_exit_filename1)
            # #         try:
            # #             not_exit_filename2 = re.sub("csv", "chk", not_exit_filename1)
            # #             ftp.rename(not_exit_filename2, '/datafinal/%s') % not_exit_filename2
            # #         except Exception as e:
            # #             print(e)
            # #         try:
            # #             not_exit_filename3 = re.sub("dat", "chk", not_exit_filename1)
            # #             ftp.rename(not_exit_filename3, '/datafinal/%s') % not_exit_filename3
            # #         except Exception as e:
            # #             print(e)
            #
            # # 关闭数据库连接
            # mysql.close()

            ftp.close()
            break


    # 参数个数为两个或两个以上时
    else:
        print("Incorrect number of parameters.")
        sys.exit(0)
