#!/usr/bin/env python
# -*- coding:utf-8 -*-
# @Time    : 2020/7/16 11:35 上午
# @Author  : Ryh
# @Email   : 1327253700@qq.com
# @File    : mysql.py
# @Software: PyCharm

"""
功能介绍:
"""
import socket
import time
from ftplib import error_perm
import pymysql as pymysql

from conf.settings import const
from utils.log import log

# mysql 配置信息
MysqlIp = const.MYSQLIP
MysqlUser = const.MYSQLUSERNAME
MysqlPassword = const.MYSQLPASSWORD
MysqlDatabase = const.MYSQLDATABASE
ETL_JOB = const.MYSQL_ETL_JOB
TABLE_INFORMATION = const.MYSQL_TABLE_INFORMATION
ETL_JOB_LOG = const.MYSQL_ETL_JOB_LOG

def mysql_connect():
    """
    创建mysql连接
    """
    try:
        mysql = pymysql.connect(MysqlIp, MysqlUser, MysqlPassword, MysqlDatabase, charset='utf8')
    except(socket.error, socket.gaierror):  # ftp 连接错误
        log.error('ERROR: cannot connect [%s]' % MysqlIp)
        return None
    except error_perm:  # 用户登录认证错误
        log.error('ERROR: user Authentication failed ')
        return None
    except Exception as e:
        log.error(str(e))
        return None
    return mysql


def searchInterfaceCodeData(InterfaceCode):
    """
    查询接口ID对应书籍
    :param InterfaceCode:
    :return:
    """
    searchData_sql = '''
    SELECT etl_system, etl_job, category, description, interfaceCode, tableName, IncludeChinese
    FROM %s.%s 
    WHERE TRIM(INTERFACECODE) = '%s'
    ''' % (MysqlDatabase, ETL_JOB, InterfaceCode)
    # 使用 cursor 方法创建一个游标
    log.info(searchData_sql)
    cursor = mysql_connect().cursor()
    cursor.execute(searchData_sql)
    result = cursor.fetchone()
    etl_system, etl_job, category, description, interfaceCode, tableName, IncludeChinese = result[0], result[1], result[2], result[3], \
                                                                           result[4], result[5], result[6]
    return etl_system, etl_job, category, description, interfaceCode, tableName, IncludeChinese


def searchTableInformationData(TableName):
    searchData_sql = '''
    SELECT DatabaseName,TableName,columnInfo
    FROM %s.%s
    WHERE TableName = '%s'
    AND Valid = 0
    ''' % (MysqlDatabase, TABLE_INFORMATION, TableName)
    log.info(searchData_sql)
    # 使用 cursor 方法创建一个游标
    cursor = mysql_connect().cursor()
    cursor.execute(searchData_sql)
    result = cursor.fetchone()
    # 存储表结构信息,{database.tablename:{col:info,col:info....}}
    map = {}
    maptable = {}
    # column list
    colname = []
    colcomment = []
    coltype = []
    collen = []
    coldecimal = []
    collast = []
    # 数据库名/表名/列名
    database = result[0]
    tablename = result[1]
    cols = result[2].split('],[')
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


def InsertUpdateLog(FtpFilePath, FtpFileName, FtpFileSize, FtpFileRecordNumber, FtpFilePushTime, HiveTableName,
                    HiveLoadPartition, HivePartitionRecordNumber, etl_job_status, etl_job_error_log, pid):
    """
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
    """
    smysql = mysql_connect()
    cursor = smysql.cursor()  # 使用 cursor() 方法创建一个游标对象
    etl_begin_time = time.strftime('%Y-%m-%d %H:%M:%S', time.localtime())
    update_sql = ''
    if etl_job_status == 'assign':  # mysql日志插入,任务分配
        update_sql = '''
        UPDATE %s.%s
        SET etl_job_status='%s', etl_job_error_log='%s', etl_begin_time='%s', pid='%s'
        WHERE FtpFileName = '%s'
        ''' % (
            MysqlDatabase, ETL_JOB_LOG, etl_job_status, etl_job_error_log, time.strftime('%Y-%m-%d %H:%M:%S', time.localtime()), pid,
            FtpFileName)
    elif etl_job_status == 'new':  # mysql日志插入,任务启动
        update_sql = '''
        INSERT INTO %s.%s
        (FtpFilePath, FtpFileName, FtpFileSize, FtpFileRecordNumber, FtpFilePushTime, etl_job_status, etl_begin_time)
        VALUES('%s', '%s', %d, %d, '%s', '%s', '%s')
        ''' % (
            MysqlDatabase, ETL_JOB_LOG, FtpFilePath, FtpFileName, FtpFileSize, FtpFileRecordNumber, FtpFilePushTime, etl_job_status,
            etl_begin_time)
    # mysql日志更新,csv文件下载至本地l
    elif etl_job_status == 'download':
        update_sql = '''
        UPDATE %s.%s
        SET etl_job_status='%s', etl_job_error_log='%s', downloadTime='%s', pid='%s'
        WHERE FtpFileName = '%s'
        ''' % (
            MysqlDatabase, ETL_JOB_LOG, etl_job_status, etl_job_error_log, time.strftime('%Y-%m-%d %H:%M:%S', time.localtime()), pid,
            FtpFileName)
    # mysql日志更新,csv文件加载至hive
    elif etl_job_status == 'upload':
        update_sql = '''
        UPDATE %s.%s
        SET HiveTableName='%s', HiveLoadPartition='%s', HivePartitionRecordNumber=%d, etl_job_status='%s', etl_job_error_log='%s', uploadHdfsTime='%s', pid='%s'
        WHERE FtpFileName = '%s'
        ''' % (
            MysqlDatabase, ETL_JOB_LOG, HiveTableName, HiveLoadPartition, HivePartitionRecordNumber, etl_job_status,
            etl_job_error_log,
            time.strftime('%Y-%m-%d %H:%M:%S', time.localtime()), pid, FtpFileName)
    # mysql日志更新,完成
    elif etl_job_status == 'success':
        update_sql = '''
        UPDATE %s.%s
        SET HiveTableName='%s', HiveLoadPartition='%s', HivePartitionRecordNumber=%d, etl_job_status='%s', etl_job_error_log='%s', hdfsToHiveTime='%s', etl_end_time='%s', pid='%s'
        WHERE FtpFileName = '%s'
        ''' % (
            MysqlDatabase, ETL_JOB_LOG, HiveTableName, HiveLoadPartition, HivePartitionRecordNumber, etl_job_status,
            etl_job_error_log,
            time.strftime('%Y-%m-%d %H:%M:%S', time.localtime()), time.strftime('%Y-%m-%d %H:%M:%S', time.localtime()), pid, FtpFileName)
        # mysql日志更新,失败
    elif etl_job_status == 'error':
        update_sql = '''
        UPDATE %s.%s
        SET HiveTableName='%s', HiveLoadPartition='%s', HivePartitionRecordNumber=%d, etl_job_status='%s', etl_job_error_log='%s', etl_end_time='%s', pid='%s'
        WHERE FtpFileName = '%s'
        ''' % (MysqlDatabase, ETL_JOB_LOG, HiveTableName, HiveLoadPartition, HivePartitionRecordNumber, etl_job_status,
               etl_job_error_log.replace('\'', '\'\''), time.strftime('%Y-%m-%d %H:%M:%S', time.localtime()), pid,
               FtpFileName)
    try:
        log.info(update_sql)
        cursor.execute(update_sql)  # 执行sql语句
        smysql.commit()  # 提交到数据库执行
    except:
        # 发生错误后回滚
        smysql.rollback()
    smysql.close()
