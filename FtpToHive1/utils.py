#!/usr/bin/env python
# -*- coding:utf-8 -*-
# @Time    : 2020/6/3 5:16 下午
# @Author  : Ryh
# @File    : utils.py
# @Software: PyCharm

'''
功能介绍:工具类
'''
import socket
import time
from ftplib import error_perm

import pymysql as pymysql
import xlrd
from constant import const

# excel的列名
DatabaseName = const.DATABASENAME
TableName = const.TABLENAME
columnInfo = const.COLUMNINFO

# mysql 配置信息
MysqlIp = const.MYSQLIP
MysqlUser = const.MYSQLUSERNAME
MysqlPassword = const.MYSQLPASSWORD
MysqlDatabase = const.MYSQLDATABASE

'''
读取 execl 数据
:param ：文件地址
:return: list . [{k1:v1,k2:v2,k3:v3}]
'''


def getExcelData(file):
    data = xlrd.open_workbook(file)
    table = data.sheet_by_index(0)
    nrows = table.nrows  # 行数
    colnames = table.row_values(0)  # 某一行数据
    list = []
    for rownum in range(1, nrows):
        row = table.row_values(rownum)
        if row[0] != '':
            app = {}
            for i in range(len(colnames)):
                app[colnames[i]] = row[i]
            list.append(app)
    return list


'''
读取excel数据
:param ：文件地址
:return: map.{database.tablename:{col:info,col:info....}}
'''


def formatTable(file):
    tables = getExcelData(file)

    # 存储所有表结构信息,{database.tablename:{col:info,col:info....}}
    map = {}

    # 遍历execl中所有表
    for i in range(len(tables)):
        maptable = {}
        # column list
        colname = []
        colcomment = []
        coltype = []
        collen = []
        coldecimal = []
        collast = []

        # 列名/数据库/表名
        cols = tables[i][columnInfo].split('],[')
        # print('cols: %s' % cols)
        database = tables[i][DatabaseName]
        tablename = tables[i][TableName]
        # 遍历列信息
        for j in range(len(cols)):
            col = cols[j].strip('[').strip(']').split('|')  # 单个列的具体信息(移除字符串开头和结尾指定字符)
            colname.append(col[0])
            colcomment.append(col[1])
            coltype.append(col[2])
            collen.append(col[3])
            coldecimal.append(col[4])
            collast.append(col[5])
        # 将遍历后的表信息放入map
        maptable['COLUMNLIST'] = colname
        maptable['COMMENTLIST'] = colcomment
        maptable['TYPELIST'] = coltype
        maptable['LENTHLIST'] = collen
        maptable['DECILIST'] = coldecimal
        maptable['COLLAST'] = collast
        # 存储成map方便使用
        # map[database+'.'+tablename] = maptable
        map[database.upper() + '.' + tablename.upper()] = maptable
    return map


'''
创建mysql连接
'''


def mysql_connect():
    try:
        mysql = pymysql.connect(MysqlIp, MysqlUser, MysqlPassword, MysqlDatabase)
    except(socket.error, socket.gaierror):  # ftp 连接错误
        print('ERROR: cannot connect [%s]' % (MysqlIp))
        return None
    except(error_perm):  # 用户登录认证错误
        print('ERROR: user Authentication failed ')
        return None
    except Exception as e:
        print(e)
        return None
    return mysql


def InsertUpdateLog(FtpFilePath, FtpFileName, FtpFileSize, FtpFileRecordNumber, FtpFilePushTime, HiveTableName,
                    HiveLoadPartition, HivePartitionRecordNumber, etl_job_status, etl_job_error_log, pid):
    '''
    插入更新 mysql 日志
    :param FtpFilePath: ftp文件路径
    :param FtpFileName: ftp文件名
    :param FtpFileSize: ftp文件大小
    :param FtpFileRecordNumber: ftp文件记录条数
    :param FtpFilePushTime: ftp文件上传时间
    :param HiveTableName: hive表名
    :param HiveLoadPartition: hive数据加载分区
    :param HivePartitionRecordNumber: hive数据加载分区记录数
    :param etl_job_status: etl任务状态
    :param etl_job_error_log: etl任务错误日志
    :param pid: etl任务进程号
    :return:
    '''
    smysql = mysql_connect()
    cursor = smysql.cursor()  # 使用 cursor() 方法创建一个游标对象
    etl_begin_time = time.strftime('%Y-%m-%d %H:%M:%S', time.localtime())
    if etl_job_status == 'assign':  # mysql日志插入,任务分配
        update_sql = '''
        INSERT INTO hive.etl_job_log
        (FtpFilePath, FtpFileName, FtpFileSize, FtpFileRecordNumber, FtpFilePushTime, etl_job_status, etl_begin_time)
        VALUES('%s', '%s', %d, %d, '%s', '%s', '%s')
        ''' % (
            FtpFilePath, FtpFileName, FtpFileSize, FtpFileRecordNumber, FtpFilePushTime, etl_job_status, etl_begin_time)
    elif etl_job_status == 'new':  # mysql日志插入,任务启动
        update_sql = '''
        INSERT INTO hive.etl_job_log
        (FtpFilePath, FtpFileName, FtpFileSize, FtpFileRecordNumber, FtpFilePushTime, etl_job_status, etl_begin_time)
        VALUES('%s', '%s', %d, %d, '%s', '%s', '%s')
        ''' % (
            FtpFilePath, FtpFileName, FtpFileSize, FtpFileRecordNumber, FtpFilePushTime, etl_job_status, etl_begin_time)
    # mysql日志更新,csv文件下载至本地l
    elif etl_job_status == 'downoad':
        update_sql = '''
        UPDATE hive.etl_job_log
        SET etl_job_status='%s', etl_job_error_log='%s', etl_end_time='%s', pid='%s'
        WHERE FtpFileName = '%s'
        ''' % (
            etl_job_status, etl_job_error_log, time.strftime('%Y-%m-%d %H:%M:%S', time.localtime()), pid, FtpFileName)
    # mysql日志更新,csv文件加载至hive
    elif etl_job_status == 'upload':
        update_sql = '''
        UPDATE hive.etl_job_log
        SET HiveTableName='%s', HiveLoadPartition='%s', HivePartitionRecordNumber=%d, etl_job_status='%s', etl_job_error_log='%s', etl_end_time='%s', pid='%s'
        WHERE FtpFileName = '%s'
        ''' % (HiveTableName, HiveLoadPartition, HivePartitionRecordNumber, etl_job_status, etl_job_error_log,
               time.strftime('%Y-%m-%d %H:%M:%S', time.localtime()), pid, FtpFileName)
    # mysql日志更新,完成
    elif etl_job_status == 'success':
        update_sql = '''
        UPDATE hive.etl_job_log
        SET HiveTableName='%s', HiveLoadPartition='%s', HivePartitionRecordNumber=%d, etl_job_status='%s', etl_job_error_log='%s', etl_end_time='%s', pid='%s'
        WHERE FtpFileName = '%s'
        ''' % (HiveTableName, HiveLoadPartition, HivePartitionRecordNumber, etl_job_status, etl_job_error_log,
               time.strftime('%Y-%m-%d %H:%M:%S', time.localtime()), pid, FtpFileName)
        # mysql日志更新,失败
    else:
        update_sql = '''
        UPDATE hive.etl_job_log
        SET HiveTableName='%s', HiveLoadPartition='%s', HivePartitionRecordNumber=%d, etl_job_status='%s', etl_job_error_log='%s', etl_end_time='%s', pid='%s'
        WHERE FtpFileName = '%s'
        ''' % (HiveTableName, HiveLoadPartition, HivePartitionRecordNumber, etl_job_status,
               etl_job_error_log.replace('\'', '\'\''), time.strftime('%Y-%m-%d %H:%M:%S', time.localtime()), pid,
               FtpFileName)
    try:
        print(update_sql)
        cursor.execute(update_sql)  # 执行sql语句
        smysql.commit()  # 提交到数据库执行
    except:
        # 发生错误后回滚
        smysql.rollback()
    smysql.close()
