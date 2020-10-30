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
        else:
            scan_log.info("insert data success！")

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
        else:
            scan_log.info("select data success")
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

    def close(self):
        """
        关闭数据库连接
        :param
        :return:
        """
        self.cur.close()
        self.conn.close()
        scan_log.info("close database success")

    # 删除数据库中数据
    def delete(self, delete_self):
        try:
            self.cur.execute(delete_self)
            self.conn.commit()
        except Exception as e:
            scan_log.info(e)
        else:
            scan_log.info("delete data success")


def dispose_xml(xml_file):
    """
    处理 xml 文件
    将 xml 文件转化为 CHK、CSV 文件
    """
    scan_log.info("开始处理 xml 文件")
    scan_log.info(xml_file)

    xml_local_dir = os.path.dirname(os.path.abspath(__file__)) + '/data/xml/' + xml_file.split('.')[2].split('_')[
        0]+'/'

    txt_local_dir = os.path.dirname(os.path.abspath(__file__)) + '/data/txt/' + xml_file.split('.')[2].split('_')[
        0]+'/'
    # txt_local_dir_bak = os.path.dirname(os.path.abspath(__file__)) + '/data/txt_bak/' + xml_file.split('.')[2].split('_')[
    #     0]+'/'

    ftp_xmlfile_path = ftp_dir + xml_file
    dst_xmlfile_path = xml_local_dir + xml_file

    # 设置 CSV 和 CHK 文件名
    xml_filename = xml_file.replace('_', '.')
    txt_file = xml_filename.split('.')[2] + '_010016_00_00_00_0_' + time.strftime(
        '%Y%m%d%H%M%S',
        time.localtime(int(xml_filename.split('.')[3]) / 1000)) + '.txt'

    csv_file = xml_filename.split('.')[2] + '_010016_00_00_00_0' + '.csv'
    chk_file = re.sub("csv", "chk", csv_file)
    csv_file_list.add(csv_file)

    # 下载 xml 文件
    if os.path.exists(xml_local_dir + xml_file):
        ftp.rename(ftp_dir + xml_file, ftp_bak_dir + xml_file)
    else:
        ftpinstance.download_file(ftp, ftp_xmlfile_path, dst_xmlfile_path)
        # 将已处理过的 xml 文件移至备份文件夹内
        ftp.rename(ftp_dir + xml_file, ftp_bak_dir + xml_file)

        # 将 xml 文件解析并生成 CSV 和 CHK 文件
        scan_log.info("开始读取 xml 文件")
        readXML(dst_xmlfile_path, txt_local_dir + txt_file)
        scan_log.info("开始合并 xml 文件")
        txts_to_csv(txt_local_dir, local_dir + csv_file)
        scan_log.info("创建 chk 文件")
        create_chk(local_dir + chk_file, local_dir, csv_file)

    return csv_file_list


    # 移除本地生成的文件
    # os.remove(local_dir + txt_file)
    # os.remove(local_dir + csv_file)
    # os.remove(local_dir + chk_file)


def dispose_numfile(num_file):
    """
    处理接口为 75、79、82、88 格式文件
    将接口为 75、79、82、88 格式文件转化为 CHK、CSV 文件
    """
    scan_log.info("开始处理 75、79、82、88 文件")
    scan_log.info(num_file)

    date_dt_format = datetime.datetime.strptime('20' + num_file[5:11], '%Y%m%d').date() - datetime.timedelta(days=1)
    date_dt = str(date_dt_format)

    num_file_name = ''
    num_interfaceCode = ''
    if num_file[-2:] == '75':
        num_file_name = '_GPDD'
        num_interfaceCode = 'GPDD'
    elif num_file[-2:] == '79':
        num_file_name = '_XJCX'
        num_interfaceCode = 'XJCX'
    elif num_file[-2:] == '82':
        num_file_name = '_JCYG'
        num_interfaceCode = 'JCYG'
    elif num_file[-2:] == '88':
        num_file_name = '_LJJY'
        num_interfaceCode = 'LJJY'

    # 数据文件路径和备份路径
    num_local_dir = os.path.dirname(os.path.abspath(__file__)) + '/data/numcsv/' + date_dt.replace('-', '') + '/' + num_interfaceCode + '/'


    numfilename = date_dt.replace("-", "") + num_file_name + '_00000000.csv'
    # num_file_list.add(numfilename)

    # 获取 ftp 接口文件数据日期
    numtableDate = '20' + num_file[5:7] + '-' + num_file[7:9] + '-' + num_file[9:11]

    pushtime = tableDate + ' ' + num_file[11:13] + ':' + num_file[13:15] + ':' + num_file[15:17]

    # 下载 75、79、82、88 文件
    if os.path.exists(num_local_dir + num_file):
        ftp.rename(ftp_dir + num_file, ftp_bak_dir + num_file)
    else:
        ftpinstance.download_file(ftp, ftp_dir + num_file, num_local_dir + num_file)
        # 将已处理过的 75、79、82、88 文件移至备份文件夹内
        ftp.rename(ftp_dir + num_file, ftp_bak_dir + num_file)
        # 合并 csv 文件
        merge_csv(num_local_dir, local_dir + numfilename)
        # 将生成的 CSV 文件上传至 FTP 服务器中
        ftpinstance.upload_file(ftp, local_dir + numfilename, ftp_dir + numfilename)
        # 写入 MySQL 数据库中
        mysql.delete("DELETE FROM %s.%s where FtpFileName='%s'" % (mysqldb, mysqltable, numfilename))
        insert_sql = "insert into %s.%s(FtpFilePath, interfaceCode, FtpFileName,  " \
                     "FtpFilePushTime, etl_job_status, etl_begin_time, txDate) values(" \
                     "'%s','%s', " \
                     "'%s', '%s', '%s', '%s','%s')" % (
                         mysqldb, mysqltable, ftp_dir, num_interfaceCode, numfilename,
                         pushtime, new_status,
                         etl_begin_time, numtableDate)
        scan_log.info("处理 75、79、82、88 的语句：" + insert_sql)
        mysql.insert(insert_sql)


def readXML(xmlfile, txtfile):
    """
    读取 XML 文件信息并写入 TXT 文件
    """
    if os.path.exists(txtfile):
        os.remove(txtfile)

    IDENTIFIER = ''
    CCH_SETTLEMENT_DATE = ''
    SOURCE_PART_ID = ''
    SOURCE_PART_NAME = ''
    TARGET_PART_ID = ''
    TARGET_PART_NAME = ''
    CCH_SETTLEMENT_DATE_TIMESTAMP = ''
    # 读取xml文件
    domTree = parse(xmlfile)
    # 文档根元素
    rootNode = domTree.documentElement
    # SUMMARY
    # print(rootNode.nodeName)

    # 读取 SUMM_RECS 信息
    SUMM_RECS_ITEM_List = rootNode.getElementsByTagName("SUMM_RECS_ITEM")

    mylog = open(txtfile, mode='a+', encoding='utf-8')

    ENTRY_List = rootNode.getElementsByTagName("ENTRY")
    # 读取 ENTRY 中公共字段信息
    for ENTRY in ENTRY_List:
        # IDENTIFIER 元素
        IDENTIFIER = ENTRY.getElementsByTagName("IDENTIFIER")[0]
        # print(IDENTIFIER.childNodes[0].data + ',', end='', file=mylog)

        # CCH_SETTLEMENT_DATE 元素
        CCH_SETTLEMENT_DATE = ENTRY.getElementsByTagName("CCH_SETTLEMENT_DATE")[0]
        CCH_SETTLEMENT_DATE_TIMESTAMP = datetime.datetime.strptime(CCH_SETTLEMENT_DATE.childNodes[0].data,
                                                                   '%Y-%m-%d').strftime('%Y%m%d%H:%M:%S')
        # print(CCH_SETTLEMENT_DATE.childNodes[0].data + ',', end='', file=mylog)

        # SOURCE_PART_ID 元素
        SOURCE_PART_ID = ENTRY.getElementsByTagName("SOURCE_PART_ID")[0]
        # print(SOURCE_PART_ID.childNodes[0].data + ',', end='', file=mylog)

        # SOURCE_PART_NAME 元素
        SOURCE_PART_NAME = ENTRY.getElementsByTagName("SOURCE_PART_NAME")[0]
        # print(SOURCE_PART_NAME.childNodes[0].data + ',', end='', file=mylog)

        # TARGET_PART_ID 元素
        TARGET_PART_ID = ENTRY.getElementsByTagName("TARGET_PART_ID")[0]
        # print(TARGET_PART_ID.childNodes[0].data + ',', end='', file=mylog)

        # TARGET_PART_NAME 元素
        TARGET_PART_NAME = ENTRY.getElementsByTagName("TARGET_PART_NAME")[0]
        # print(TARGET_PART_NAME.childNodes[0].data + ',', end='', file=mylog)

    # 读取 XML 字段信息
    for SUMM_RECS_ITEM in SUMM_RECS_ITEM_List:
        print(IDENTIFIER.childNodes[0].data + ',', end='', file=mylog)
        print(CCH_SETTLEMENT_DATE_TIMESTAMP + ',', end='', file=mylog)
        print(SOURCE_PART_ID.childNodes[0].data + ',', end='', file=mylog)
        print(SOURCE_PART_NAME.childNodes[0].data + ',', end='', file=mylog)
        print(TARGET_PART_ID.childNodes[0].data + ',', end='', file=mylog)
        print(TARGET_PART_NAME.childNodes[0].data + ',', end='', file=mylog)

        # SUMM_ID 元素
        SUMM_ID = SUMM_RECS_ITEM.getElementsByTagName("SUMM_ID")[0]
        print(SUMM_ID.childNodes[0].data + ',', end='', file=mylog)

        # DESTINATION_ID 元素
        DESTINATION_ID = SUMM_RECS_ITEM.getElementsByTagName("DESTINATION_ID")[0]
        print(DESTINATION_ID.childNodes[0].data + ',', end='', file=mylog)

        # SOURCE_ID 元素
        SOURCE_ID = SUMM_RECS_ITEM.getElementsByTagName("SOURCE_ID")[0]
        print(SOURCE_ID.childNodes[0].data + ',', end='', file=mylog)

        # SERVICE_ID 元素
        SERVICE_ID = SUMM_RECS_ITEM.getElementsByTagName("SERVICE_ID")[0]
        print(SERVICE_ID.childNodes[0].data + ',', end='', file=mylog)

        # ISSUER_ID 元素
        ISSUER_ID = SUMM_RECS_ITEM.getElementsByTagName("ISSUER_ID")[0]
        print(ISSUER_ID.childNodes[0].data + ',', end='', file=mylog)

        # PRODUCT_TYPE 元素
        PRODUCT_TYPE = SUMM_RECS_ITEM.getElementsByTagName("PRODUCT_TYPE")[0]
        print(PRODUCT_TYPE.childNodes[0].data + ',', end='', file=mylog)

        # DEVICE_ID 元素
        DEVICE_ID = SUMM_RECS_ITEM.getElementsByTagName("DEVICE_ID")[0]
        print(DEVICE_ID.childNodes[0].data + ',', end='', file=mylog)

        # HARDWARE_TYPE 元素
        HARDWARE_TYPE = SUMM_RECS_ITEM.getElementsByTagName("HARDWARE_TYPE")[0]
        print(HARDWARE_TYPE.childNodes[0].data + ',', end='', file=mylog)

        # TXN_TYPE 元素
        TXN_TYPE = SUMM_RECS_ITEM.getElementsByTagName("TXN_TYPE")[0]
        print(TXN_TYPE.childNodes[0].data + ',', end='', file=mylog)

        # TXN_SUB_TYPE 元素
        TXN_SUB_TYPE = SUMM_RECS_ITEM.getElementsByTagName("TXN_SUB_TYPE")[0]
        print(TXN_SUB_TYPE.childNodes[0].data + ',', end='', file=mylog)

        # PAYMENT_METHOD 元素
        PAYMENT_METHOD = SUMM_RECS_ITEM.getElementsByTagName("PAYMENT_METHOD")[0]
        print(PAYMENT_METHOD.childNodes[0].data + ',', end='', file=mylog)

        # FIN_TYPE 元素
        FIN_TYPE = SUMM_RECS_ITEM.getElementsByTagName("FIN_TYPE")[0]
        print(FIN_TYPE.childNodes[0].data + ',', end='', file=mylog)

        # GFS_VALUE 元素
        GFS_VALUE = SUMM_RECS_ITEM.getElementsByTagName("GFS_VALUE")[0]
        print(GFS_VALUE.childNodes[0].data + ',', end='', file=mylog)

        # GFS_VOLUME 元素
        GFS_VOLUME = SUMM_RECS_ITEM.getElementsByTagName("GFS_VOLUME")[0]
        print(GFS_VOLUME.childNodes[0].data + ',', end='', file=mylog)

        # NGFS_VALUE 元素
        NGFS_VALUE = SUMM_RECS_ITEM.getElementsByTagName("NGFS_VALUE")[0]
        print(NGFS_VALUE.childNodes[0].data + ',', end='', file=mylog)

        # NGFS_VOLUME 元素
        NGFS_VOLUME = SUMM_RECS_ITEM.getElementsByTagName("NGFS_VOLUME")[0]
        print(NGFS_VOLUME.childNodes[0].data + ',', end='', file=mylog)

        # RECON_DATE 元素
        RECON_DATE = SUMM_RECS_ITEM.getElementsByTagName("RECON_DATE")[0]
        RECON_DATE_TIMESTAMP = datetime.datetime.strptime(RECON_DATE.childNodes[0].data, '%Y-%m-%d').strftime(
            '%Y%m%d%H:%M:%S')
        print(RECON_DATE_TIMESTAMP, file=mylog)
        # print(RECON_DATE_TIMESTAMP + ',', end='', file=mylog)

        # # Message_Head 元素
        # message_head_split = list(xmlfile.split('_')[0])
        # message_head_split.append('.XML')
        #
        # message_head = ''.join(message_head_split)
        #
        # print(message_head + ',', end='', file=mylog)

        # data_dt 元素
        # print(CCH_SETTLEMENT_DATE.childNodes[0].data, file=mylog)

    mylog.close()
    return mylog


def merge_csv(txtfile_path, csvfilename):
    """
    合并多个 CSV 文件
    此方法适用于舍弃每个 CSV 文件的首行（字段名）
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
                    next(filein)
                    for line in filein:
                        line_list = line.strip('\n').split(',')  # 这里的数据之间是以','间隔的
                        spamwriter.writerow(line_list)


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


def create_chk(chk_file, path, csv_file):
    """
    创建 csv 对应的 chk 文件
    """
    if os.path.exists(chk_file):
        os.remove(chk_file)

    chkfile = open(chk_file, mode='w+', encoding='utf-8')

    # csv 的文件名
    print(csv_file + '\t', end='', file=chkfile)

    # csv 文件大小
    csv_file_size = os.path.getsize(path + csv_file)
    print(str(csv_file_size) + '\t', end='', file=chkfile)

    # csv 文件内数据行数
    with open(path + csv_file, 'r') as f:
        print(str(len(f.readlines()) - 1) + '\t', end='', file=chkfile)

    # csv 文件创建时间
    FtpFilePushTimeStamp = list(csv_file.split('_')[1].split('.')[0])
    FtpFilePushTime = ''.join(FtpFilePushTimeStamp)
    timeStamp = float(int(FtpFilePushTime) / 1000)
    timeArray = time.localtime(timeStamp)
    otherStyleTime = time.strftime("%Y%m%d %H:%M:%S", timeArray)
    print(otherStyleTime, end='', file=chkfile)

    # FtpFilePushTime = os.path.getmtime(csv_file)
    #
    # timeArray = time.localtime(FtpFilePushTime)
    # otherStyleTime = time.strftime("%Y%m%d %H:%M:%S", timeArray)
    # print(otherStyleTime + '\t', end='', file=chkfile)

    chkfile.close()
    return chkfile


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
        scan_log.info("date is illegal")


def start_new_and_error():
    """
    开启 new 和 error 状态的文件
    """
    select_status_sql = "select FtpFileName from %s.%s where (etl_job_status = '%s' or etl_job_status = '%s') and ctime < (select date_add(now(), interval -10 minute)) " % (
        mysqldb, mysqltable, new_status, error_status)
    select_status_sql_res = mysql.show(select_status_sql)
    status_count = 0
    for status_row in select_status_sql_res:
        # status_count = os.popen("ps -ef | grep LocalCSVToHive.py |grep -v grep|wc -l").read()
        status_row_FtpFileName = status_row[0]

        scan_log.info("nohup python3 LocalCSVToHive.py %s %s %s 1>/dev/null 2>&1 &" %
                      (ftp_dir, status_row_FtpFileName, local_dir))
        mysql.update("UPDATE %s.%s SET etl_job_status='%s' WHERE FtpFileName = '%s'" % (
            mysqldb, mysqltable, assign_status, status_row_FtpFileName))

        status_count += 1
        if status_count % 50 == 0:
            time.sleep(240)


def pid_exists(pid):
    """
    判断pid是否存在相应进程
    :param pid:要判断的pid号
    :return select_pid_notexit_res:返回pid不存在时MySQL中相应的文件名集合
    """
    try:
        scan_log.info("ps %s" % pid)
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
    # 声明变量
    etl_begin_time = time.strftime('%Y-%m-%d %H:%M:%S', time.localtime())
    # hive 数据加载分区
    tableDate = ''

    not_running_list = (
        '080001', '080002', '080003', '080004', '080005', '080006', '080007', '080008', '070001',
        '070003', '070004', '070008', '070009', 'A02001')

    # 检查脚本参数
    """
        不带参数时，则执行 FTP 遍历 chk 文件并执行任务的程序
        含有一个参数时，则执行移动某账期数据文件的程序
        含有两个或两个以上参数时，则提示参数数目不正确并退出
        :param: 带参时，可带时间参数：20200606
    """
    paralist = sys.argv

    # 参数个数为一个时
    if 1 == len(paralist):
        csv_file_list = set()
        # 实例化
        ftpinstance = FtpOps(host, port, ftpuname, ftppwd)

        # 创建ftp连接
        ftp = ftpinstance.ftp_connect()

        # 切换目录
        ftp.cwd(ftp_dir)
        # fff = ftp.dir()
        # print(fff)
        # print('111')



        # 数据文件路径
        local_dir = os.path.dirname(os.path.abspath(__file__)) + '/data/20201010/'
        # 连接 Mysql
        mysql = Mysql(mysqlhost, mysqluser, mysqlpwd, mysqldb)
        # print(ftp.retrlines('MLSD'))
        # print(ftp.size("d"))
        # aa = ftp.retrlines('list')

        # print(aa)
        # print(type(aa))
        # print("aa",ftp.retrlines('list'))

        # for r in ftp.dir():
        #     if r.upper().startswith('D'):
        #         print()

        # 获取文件目录
        fileLists = ftp.nlst()
        for file in fileLists:

            # try:
            #
            #     if ftp.size(file) == 0:
            #         print("size = 0:")
            #         print(file)
            #         print("----------")
            #         # ftp.rename(ftp_dir + file, ftp_bak_dir + file)
            # except Exception as e:
            #     print(e)

            # 处理已经成功处理的文件
            try:
                if file != 'd' and file.split(".")[1] != 'GPDD' and file.split(".")[1] != 'XJCX' and file.split(".")[1] != 'JCYG' and \
                        file.split(".")[1] != 'LJJY' and file.split(".")[1] != '010016':
                    etl_job_status_list = mysql.show(
                        "select etl_job_status from %s.%s where ftpfilename='%s'" % (mysqldb, mysqltable, file))
                    print(etl_job_status_list)
                    print(type(etl_job_status_list))

            except Exception as e:
                print(e)


        ftp.close()

        # time.sleep(10)







        # # 无限循环
        # while True:
        #     # 先将非结构化数据移至备份库
        #     # for not_running in not_running_list:
        #     #     os.system("python3 scan_chk.py _%s_" % not_running)
        #
        #     # 实例化
        #     ftpinstance = FtpOps(host, port, ftpuname, ftppwd)
        #
        #     # 创建ftp连接
        #     ftp = ftpinstance.ftp_connect()
        #
        #     # 切换目录
        #     ftp.cwd(ftp_dir)
        #
        #     # 获取文件目录
        #     fileLists = ftp.nlst()
        #
        #     # 数据文件路径
        #     local_dir = os.path.dirname(os.path.abspath(__file__)) + '/data/20201010/'
        #
        #     # 连接 Mysql
        #     mysql = Mysql(mysqlhost, mysqluser, mysqlpwd, mysqldb)
        #
        #     # 查询表中三天内的数据文件名
        #     select_FileName_sql = "select ftpFileName from %s.%s where ctime between date_add(now(), interval -10 day) and now() " % (
        #         mysqldb, mysqltable)
        #     select_FileName_sql_res = mysql.show(select_FileName_sql)
        #
        #     # 遍历表中文件名
        #     fileName_list = list()
        #     for fileName_row in select_FileName_sql_res:
        #         fileName = fileName_row[0].split(".")[0]  # ftpFileName
        #         fileName_list.append(fileName)
        #
        #
        #
        #
        #
        #     # 遍历当前目录下所有文件名
        #     csv_file_list = set()
        #     for file in fileLists:
        #         # 处理 REAL、ACTL、PLAN 格式文件
        #         if file.split("_")[0] == 'REAL' or file.split("_")[0] == 'ACTL' or file.split("_")[0] == 'PLAN':
        #             # if re.search(r"REAL", file) or re.search(r"ACTL", file) or re.search(r"PLAN", file):
        #             ftp_filename = file.split(".")[0]
        #
        #             # 如果mysql中没有记录的文件，即还没有处理的文件
        #             if ftp_filename not in fileName_list:
        #                 scan_log.info(ftp_filename)
        #
        #                 # 获取接口代码数
        #                 InterfaceCode = file.split("_")[0]
        #
        #                 scan_log.info(InterfaceCode)
        #                 # 声明变量
        #                 etl_begin_time = time.strftime('%Y-%m-%d %H:%M:%S', time.localtime())
        #
        #                 scan_log.info(etl_begin_time)
        #
        #                 # 获取 ftp 接口文件数据日期
        #                 try:
        #                     tableDate = file.split('_')[1][0:4] + '-' + file.split('_')[1][4:6] + '-' + file.split('_')[1][
        #                                                                                                 6:8]
        #
        #                     file_list = mysql.show(
        #                         "select FtpFileName from %s.%s where FtpFileName='%s' and etl_job_status = '%s'" % (mysqldb, mysqltable, file, new_status))
        #                     mysql.delete("DELETE FROM %s.%s where FtpFileName='%s'" % (mysqldb, mysqltable, file))
        #                     insert_sql = "insert into %s.%s(FtpFilePath, interfaceCode, FtpFileName,  " \
        #                                  "FtpFilePushTime, etl_job_status, etl_begin_time, txDate) values(" \
        #                                  "'%s','%s', " \
        #                                  "'%s', null, '%s', '%s','%s')" % (
        #                                      mysqldb, mysqltable, ftp_dir, InterfaceCode, file,
        #                                      new_status,
        #                                      etl_begin_time, tableDate)
        #                     scan_log.info("处理 REAL、ACTL、PLAN 的语句：" + insert_sql)
        #                     mysql.insert(insert_sql)
        #                 except Exception as e:
        #                     scan_log.error(e)
        #
        #             # scan_log.info("nohup python3 LocalCSVToHive.py %s %s %s 1>/dev/null 2>&1 &" %
        #             #               (ftp_dir, file, local_dir))
        #             # os.system("nohup python3 LocalCSVToHive.py %s %s %s 1>/dev/null 2>&1 &" %
        #             #           (ftp_dir, file, local_dir))
        #             # mysql.update("UPDATE %s.%s SET etl_job_status='%s' WHERE FtpFileName = '%s'" % (
        #             #     mysqldb, mysqltable, assign_status, file))
        #
        #         # 处理 xml 格式文件
        #         try:
        #             if file.split(".")[-1] == 'xml':
        #                 dispose_xml(file)
        #         except Exception as e:
        #             scan_log.error(e)
        #
        #         # 处理接口为 75、79、82、88 格式文件
        #         # num_file_list = set()
        #         try:
        #             if file[-2:] == '75' or file[-2:] == '79' or file[-2:] == '82' or file[-2:] == '88':
        #             # if file[-2:] == '79':
        #                 if len(file) == 22:
        #                     dispose_numfile(file)
        #         except Exception as e:
        #             scan_log.error(e)
        #
        #         # 遍历所有chk文件
        #         try:
        #             if file.split(".")[-1] == 'chk' and file.split(".")[0].split("_")[1] not in not_running_list:
        #                 # chk 对应的数据文件名
        #                 ftp_filename = file.split(".")[0]
        #
        #                 # 下载mysql中没有记录的文件，即还没有处理的文件
        #                 if ftp_filename not in fileName_list:
        #                     # chk 的 ftp 文件路径
        #                     chk_ftp_file_path = ftp_dir + file
        #                     # chk 的本地文件路径
        #                     dst_file_path = local_dir + file
        #                     scan_log.info("需要添加的文件名" + file)
        #                     # os.system("rm -f dst_file_path")
        #                     ftpinstance.download_file(ftp, chk_ftp_file_path, dst_file_path)
        #                     ftp.rename(ftp_dir + file, ftp_bak_dir + file)
        #
        #                     # 读取 chk 文件中的信息
        #                     chk_file_message = read_file(dst_file_path)
        #
        #                     FtpFilePushTime = ''
        #
        #                     # 修改 chk 文件内容中的时间格式
        #                     if len(chk_file_message) == 4:
        #                         FtpFilePushTime = timestamp_format(chk_file_message[3])
        #                     elif len(chk_file_message) == 3:
        #                         # 如果时间戳字段有问题，则设置为null
        #                         FtpFilePushTime = "null"  # 数据文件的时间戳
        #
        #                     # 获取接口代码数
        #                     InterfaceCode = ftp_filename.split("_")[1]
        #
        #                     # 获取 ftp 接口文件数据日期
        #                     task_type = ftp_filename.split('.')[0].split('_')[0]
        #                     if task_type == 'z' or task_type == 'q':
        #                         tableDate = ftp_filename.split('_')[1][0:4] + '-' + ftp_filename.split('_')[1][4:6] + '-' + \
        #                                     ftp_filename.split('_')[1][6:8]
        #                         InterfaceCode = ftp_filename.split("_")[2]
        #                     else:
        #                         tableDate = ftp_filename.split('_')[0][0:4] + '-' + ftp_filename.split('_')[0][4:6] + '-' + \
        #                                     ftp_filename.split('_')[0][6:8]
        #
        #                     exists_file_list = mysql.show(
        #                         "select FtpFileName from %s.%s where FtpFileName='%s' and etl_job_status = '%s'" % (mysqldb, mysqltable, chk_file_message[0], new_status))
        #
        #                     mysql.delete("DELETE FROM %s.%s where FtpFileName='%s'" % (mysqldb, mysqltable, chk_file_message[0]))
        #                     if FtpFilePushTime == 'null':
        #                         insert_sql = "insert into %s.%s(FtpFilePath, interfaceCode, FtpFileName, FtpFileSize, " \
        #                                      "FtpFileRecordNumber, FtpFilePushTime, etl_job_status, etl_begin_time, txDate) values(" \
        #                                      "'%s','%s', " \
        #                                      "'%s', %s, %s, null, '%s', '%s','%s')" % (
        #                                          mysqldb, mysqltable, ftp_dir, InterfaceCode, chk_file_message[0],
        #                                          chk_file_message[1],
        #                                          chk_file_message[2], new_status,
        #                                          etl_begin_time, tableDate)
        #                     else:
        #                         # 将下载好的 chk 文件信息记录到 Mysql 中
        #                         insert_sql = "insert into %s.%s(FtpFilePath, interfaceCode, FtpFileName, FtpFileSize, " \
        #                                      "FtpFileRecordNumber, FtpFilePushTime, etl_job_status, etl_begin_time, txDate) values(" \
        #                                      "'%s','%s', " \
        #                                      "'%s', %s, %s, '%s', '%s', '%s','%s')" % (
        #                                          mysqldb, mysqltable, ftp_dir, InterfaceCode, chk_file_message[0],
        #                                          chk_file_message[1], chk_file_message[2], FtpFilePushTime, new_status,
        #                                          etl_begin_time, tableDate)
        #                     scan_log.info("正常插入语句：" + insert_sql)
        #                     mysql.insert(insert_sql)
        #         except Exception as e:
        #             scan_log.error(str(e))
        #
        #     if csv_file_list:
        #         for csv_filename in csv_file_list:
        #             # 将生成的 CSV 和 CHK 文件上传至 FTP 服务器中
        #             ftpinstance.upload_file(ftp, local_dir + csv_filename, ftp_dir + csv_filename)
        #             ftpinstance.upload_file(ftp, local_dir + re.sub("csv", "chk", csv_filename),
        #                                     ftp_dir + re.sub("csv", "chk", csv_filename))
        #
        #     scan_log.info('添加新文件名已完成')
        #
        #     # 删除数据文件不存在的任务
        #     time.sleep(10)
        #     scan_log.info("Enable tasks where file does not exist")
        #
        #     n = '%550 Could not get file size%'
        #
        #     delete_sql = "DELETE FROM bmnc_devops.etl_job_log where etl_job_error_log like '%s' and ctime < (select date_add(now(), interval -480 minute))" % n
        #     scan_log.info(delete_sql)
        #     mysql.delete(delete_sql)
        #
        #     time.sleep(10)
        #     # 开启 new 和 error 状态的任务
        #     # 查询状态
        #     scan_log.info("Tasks that enable new and Error states")
        #     start_new_and_error()
        #
        #     # 开启 PID 不存在的任务
        #     time.sleep(20)
        #     scan_log.info("Enable tasks where PID does not exist")
        #     select_pid_sql = "select pid from %s.%s where pid is not null and (etl_job_status='%s' or etl_job_status='%s' or etl_job_status='%s')" % (
        #         mysqldb, mysqltable, assign_status, download_status, upload_status)
        #     select_pid_sql_res = mysql.show(select_pid_sql)
        #     pid_count = 0
        #     for pid_list in select_pid_sql_res:
        #         # 获取 pid 不存在的文件名
        #         FtpFileName_IdNotExist = pid_exists(pid_list[0])
        #         if FtpFileName_IdNotExist is not None:
        #             scan_log.info("nohup python3 LocalCSVToHive.py %s %s %s 1>/dev/null 2>&1 &" %
        #                           (ftp_dir, FtpFileName_IdNotExist, local_dir))
        #             # os.system("nohup python3 LocalCSVToHive.py %s %s %s 1>/dev/null 2>&1 &" % (
        #             #     ftp_dir, FtpFileName_IdNotExist, local_dir))
        #             mysql.update("UPDATE %s.%s SET etl_job_status='%s' WHERE FtpFileName = '%s'" % (
        #                 mysqldb, mysqltable, assign_status, FtpFileName_IdNotExist))
        #
        #             # pid_count = os.popen("ps -ef | grep LocalCSVToHive.py |grep -v grep|wc -l").read()
        #             pid_count += 1
        #             if pid_count % 50 == 0:
        #                 time.sleep(240)
        #
        #     # for file in fileLists:
        #     #
        #     #     if re.search(r".csv", file):
        #     #         only_csv_fileName = re.sub("csv", "chk", file)
        #     #
        #     #         ftp_filename = file.split(".")[0]
        #     #
        #     #         # 获取接口代码数
        #     #         InterfaceCode = ftp_filename.split("_")[1]
        #     #         # 声明变量
        #     #         etl_begin_time = time.strftime('%Y-%m-%d %H:%M:%S', time.localtime())
        #     #         # 获取 ftp 接口文件数据日期
        #     #         task_type = ftp_filename.split('.')[0].split('_')[0]
        #     #         if task_type == 'z' or task_type == 'q':
        #     #             tableDate = ftp_filename.split('_')[1][0:4] + '-' + ftp_filename.split('_')[1][4:6] + '-' + \
        #     #                         ftp_filename.split('_')[1][6:8]
        #     #         else:
        #     #             tableDate = ftp_filename.split('_')[0][0:4] + '-' + ftp_filename.split('_')[0][4:6] + '-' + \
        #     #                         ftp_filename.split('_')[0][6:8]
        #     #
        #     #         if only_csv_fileName not in fileLists:
        #     #             if re.search(r"ACTL", file) or re.search(r"PLAN", file) or re.search(r"REAL", file):
        #     #                 scan_log.info(file)
        #     #             else:
        #     #                 insert_sql = "insert into %s.%s(FtpFilePath, interfaceCode, FtpFileName,  " \
        #     #                              "FtpFilePushTime, etl_job_status, etl_begin_time, txDate) values(" \
        #     #                              "'%s','%s', " \
        #     #                              "'%s', null, '%s', '%s','%s')" % (
        #     #                                  mysqldb, mysqltable, ftp_dir, InterfaceCode, file,
        #     #                                  new_status,
        #     #                                  etl_begin_time, tableDate)
        #     #                 scan_log.info("只有csv的语句：" + insert_sql)
        #     #                 mysql.insert(insert_sql)

            # 关闭数据库连接
            # mysql.close()

            # ftp.close()
            #
            # time.sleep(10)

    # # 参数个数为两个或两个以上时
    # else:
    #     scan_log.info("Incorrect number of parameters.")
    #     sys.exit(1)
