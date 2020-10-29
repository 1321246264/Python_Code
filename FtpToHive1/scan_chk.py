#!/usr/bin/env python
# -*- coding:utf-8 -*-

from __future__ import division
from ftplib import FTP
from ftplib import error_perm

import socket
import os
import time
import sys
import math
import re
import pymysql
import datetime
import errno

from constant import const, log

"""
ftp下载

1、遍历目录
2、下载完成标识文件
    --文件备份周期，备份库七天删除一次
3、接口表名映射
4、文件ftp未存储，取不到，告警
5、数据加载到表中
6、保存最近七天的数据
7、已下载文件管理
8、校验
"""


class FTP_OPS(object):
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
            log.info('[{}]login ftp {}'.format(self.ftp_user, ftp.getwelcome()))  # 打印欢迎信息
        except(socket.error, socket.gaierror):  # ftp 连接错误
            log.error("ERROR: cannot connect [{}:{}]".format(self.ftp_ip, self.ftp_port))
            return None
        except error_perm:  # 用户登录认证错误
            log.error("ERROR: user Authentication failed ")
            return None
        except Exception as e:
            log.error(str(e))
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
        sys.stdout.write('[%-50s] %s' %('=' * int(math.floor(cur * 50 / total)), percent))
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
        buffer_size = 10240         # 默认是8192
        log.info(ftp.getwelcome())  # 显示登录ftp信息

        # 将传输模式改为二进制模式 ,避免提示 ftplib.error_perm: 550 SIZE not allowed in ASCII
        ftp.voidcmd('TYPE I')
        remote_file_size = ftp.size(ftp_file_path)  # 文件总大小 , 远程告警

        cmpsize = 0  # 下载文件初始大小
        lsize = 0
        start = time.time()

        try:
            conn = ftp.transfercmd('RETR {0}'.format(ftp_file_path), lsize)
            # 创建文件
            with open(dst_file_path, "ab") as f:
                while True:
                    data = conn.recv(buffer_size)
                    if not data:
                        break
                    f.write(data)
                    cmpsize += len(data)
                    self.progressbar(cmpsize, remote_file_size)

            ftp.voidcmd('NOOP')
            log.info('keep alive cmd success')
            ftp.voidresp()
            log.info('No loop cmd')
            conn.close()
        except Exception as e:
            log.error(str(e))
        finally:
            end = time.time()
            log.info('download file: %s, consume time: %.2f s' % (ftp_file_path, end-start))
            file_size = os.stat(dst_file_path).st_size
            log.info('local file:[%s] filesize: %.2f MB' % (dst_file_path, file_size/1024/1024))


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
            log.error(str(e))
        else:
            # print("connect successfully")
            log.info("connect successfully")
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
            log.error(str(e))
            # 发生错误时回滚
            self.conn.rollback()
            log.error("fail to insert new data")
            # print("fail to insert new data")
        else:
            log.info("insert data success！")
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
            log.error(e + "select data fail")
            # print(e + "select data fail")
        else:
            log.info("select data success")
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
            log.error(str(e))
        else:
            log.info("update data success")
            # print("update data success")

    def close(self):
        """
        关闭数据库连接
        :param
        :return:
        """
        self.cur.close()
        self.conn.close()
        log.info("close database success")
        # print("close database success")


def read_file(dst_file_paths):
    """
    读取本地文件
    :param dst_file_paths:要读取的本地文件路径
    :return message:返回需要的字段集合
    """
    with open(dst_file_paths, "r", encoding='utf-8') as f:
        while True:
            # 逐行读取
            line = f.readlines()
            if line and len(line) > 5:
                # 按 \t 切分文件中的内容
                line = "".join(line)
                line = line.split("\t")

                message.append(line[0])   # 数据文件名
                message.append(line[1])   # 数据文件大小，字节
                message.append(line[2])   # 数据文件记录行数
                message.append(line[3])   # 数据文件的时间戳
            else:
                break

    return message


def pid_exists(pid):
    """
    判断pid是否存在相应进程
    :param pid:要判断的pid号
    :return select_pid_notexit_res:返回pid不存在时MySQL中相应的文件名集合
    """
    status_pid_int = os.system("ps %s" % pid)
    if not (status_pid_int == 0):
        select_pid_notexit_sql = "select FtpFileName from hive.etl_job_log where pid='%s'" % pid
        select_pid_notexit_res = mysql.show(select_pid_notexit_sql)
        return select_pid_notexit_res


if __name__ == '__main__':

    # constant
    host = const.FTPIP
    ftpuname = const.FTPUSERNAME
    ftppwd = const.FTPPASSWORD
    port = const.FTPPORT
    ftp_dir = const.FTP_DIR
    local_dir = const.local_dir

    # constant
    mysqlhost = const.MYSQLIP
    mysqluser = const.MYSQLUSERNAME
    mysqlpwd = const.MYSQLPASSWORD
    mysqldb = const.MYSQLDATABASE

    # instance
    ftpinstance = FTP_OPS(host, port, ftpuname, ftppwd)

    # 创建ftp连接
    ftp = ftpinstance.ftp_connect()

    while True:
        # 切换目录
        ftp.cwd(ftp_dir)
        # 获取文件目录
        fileLists = ftp.nlst()
        for file in fileLists:
            if re.search(r".chk", file):
                chk_ftp_file_path = ftp_dir + file
                dst_file_path = local_dir + file
                csv_ftp_filename = re.sub("chk", "csv", file)

                mysql = Mysql(mysqlhost, mysqluser, mysqlpwd, mysqldb)

                select_FileName_sql = "select ftpFileName from hive.etl_job_log where ctime between  date_add(now(), interval -3 day) and now() "
                select_FileName_sql_res = mysql.show(select_FileName_sql)

                fileName_list = list()
                for fileName_row in select_FileName_sql_res:
                    fileName = fileName_row[0]  # ftpFileName
                    fileName_list.append(fileName)

                # 获取mysql中没有记录的文件，即还没有下载的文件
                if csv_ftp_filename not in fileName_list:
                    ftpinstance.download_file(ftp, chk_ftp_file_path, dst_file_path)

                    # 声明变量
                    etl_begin_time = time.strftime('%Y-%m-%d %H:%M:%S', time.localtime())

                    message = []
                    read_file(dst_file_path)
                    FtpFilePushTime_list = list(message[3])

                    FtpFilePushTime_list.insert(4, '-')
                    FtpFilePushTime_list.insert(7, '-')
                    FtpFilePushTime_list.remove("\n")

                    FtpFilePushTime = ''.join(FtpFilePushTime_list)

                    # print(FtpFilePushTime)

                    insert_sql = "insert into hive.etl_job_log(FtpFilePath, FtpFileName, FtpFileSize, " \
                                 "FtpFileRecordNumber, FtpFilePushTime, etl_job_status, etl_begin_time) values('%s', " \
                                 "'%s', %s, %s, '%s', 'new', '%s')" % (ftp_dir, message[0], message[1],
                                                                       message[2], FtpFilePushTime,
                                                                       etl_begin_time)

                    mysql.insert(insert_sql)
                    os.remove(dst_file_path)

        mysql = Mysql(mysqlhost, mysqluser, mysqlpwd, mysqldb)
        # 开启 new 和 error 状态的任务
        # 查询状态
        select_status_sql = "select FtpFileName from hive.etl_job_log where etl_job_status = 'new' or etl_job_status = 'error'"
        select_status_sql_res = mysql.show(select_status_sql)
        for status_row in select_status_sql_res:
            status_row_FtpFileName = status_row[0]
            log.info("nohup python3 LocalCSVToHive.py %s %s &" %
                     (ftp_dir, status_row_FtpFileName))
            # print("nohup python3 LocalCSVToHive.py %s %s &" % (ftp_dir, status_row_FtpFileName))
            os.system("nohup python3 LocalCSVToHive.py %s %s &" %
                      (ftp_dir, status_row_FtpFileName))

        time.sleep(5)

        # 查询 PID
        select_pid_sql = "select pid from hive.etl_job_log where etl_job_status<>'success'"
        select_pid_sql_res = mysql.show(select_pid_sql)
        for success_row in select_pid_sql_res:
            success_row_pid = success_row[0]
            status_pid_int_res = pid_exists(success_row_pid)

            try:
                for FtpFileName_IdNotExit_row in status_pid_int_res:
                    FtpFileName_IdNotExit = FtpFileName_IdNotExit_row[0]
                    os.system("nohup python3 LocalCSVToHive.py %s %s &" %
                              (ftp_dir, FtpFileName_IdNotExit))
            except Exception as e:
                log.error(str(e))

        # 移动已完成的文件
        # 查询状态

        for file in fileLists:
            if re.search(r".csv", file):
                # 查询目录下的csv文件是否已经入库（状态为success）
                select_NeedMove_status_sql = "select pid from hive.etl_job_log where FtpFileName = '%s' and etl_job_status = 'success'" % file
                select_NeedMove_status_sql_res = mysql.show(select_NeedMove_status_sql)

                for pid_NeedMove_row in select_NeedMove_status_sql_res:
                    pid_NeedMove = pid_NeedMove_row[0]
                    pid_int_res = pid_exists(pid_NeedMove)

                    for FtpFileName_NeedMove_row in pid_int_res:
                        FtpFileName_NeedMove = FtpFileName_NeedMove_row[0]
                        chk_file = re.sub("csv", "chk", FtpFileName_NeedMove)
                        try:
                            os.system("nohup python3 move.py %s %s &" %
                                      (FtpFileName_NeedMove, chk_file))
                            # print("status_row_a:", FtpFileName_NeedMove)
                            movePid = os.getpid()
                            update_sql = '''
                                    UPDATE hive.etl_job_log
                                    SET pid='%s'
                                    WHERE FtpFileName = '%s'
                                    ''' % (movePid, FtpFileName_NeedMove)
                            mysql.update(update_sql)
                        except Exception as e:
                            log.error(str(e))

        # 关闭数据库连接
        mysql.close()

        time.sleep(10)
