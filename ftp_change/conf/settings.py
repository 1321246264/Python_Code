#!/usr/bin/env python
# -*- coding:utf-8 -*-
# @Time    : 2020/7/16 2:18 下午
# @Author  : Ryh
# @Email   : 1327253700@qq.com
# @File    : settings.py
# @Software: PyCharm

"""
功能介绍:脚本修改的唯一入口,脚本中的参数,只需在此文件中配置即可
"""

import os

"""
常量池区
"""


class _const:
    class ConstError(TypeError):
        pass

    class ConstCaseError(ConstError):
        pass

    def __setattr__(self, name, value):
        if name in self.__dict__:  # 判断键是否存在与字典中
            raise self.ConstError("Can't change const.%s" % name)
        if not name.isupper():  # 检测字符串中所有的字母是否都为大写
            raise self.ConstCaseError('Const name "%s" is not all uppercase' % name)
        self.__dict__[name] = value


const = _const()

path = os.getcwd()  # 获取脚本运行时所在目录,而非脚本所在目录

# hive 配置信息
# const.HIVEIP = '10.254.52.4'  # 配置成固定IP,如果集群有Kerberos认证则会报kerberos GSS初始化失败,需配置成映射主机名
const.HIVEIP = 'cdh04.irc.com'
const.HIVEPORT = '10000'
const.HIVEUSERNAME = 'hive'
const.HIVE_DATABASE = 'bmnc_sdata'  # hive源层所在库
const.HIVE_DATABASE_TEMP = 'bmnc_sdata_temp'    # hive处理csv文件临时表所在库
const.HIVE_ETL_TASK_LIST = 'etl_task_list'  # hive etl任务日志表
const.HIVE_BMNC_DEVOPS = 'bmnc_devops'  # hive etl任务日志表所在库

# hdfs 文件存放位置配置信息
const.HDFS_PATH = '/user/hive/warehouse/bmnc_sdata_temp.db'

# mysql 配置信息
# const.MYSQLIP = '10.254.52.68'
# const.MYSQLUSERNAME = 'hive'
# const.MYSQLPASSWORD = 'hive'
# const.MYSQLDATABASE = 'hive'

const.MYSQLIP = '192.168.31.175'
const.MYSQLUSERNAME = 'root'
const.MYSQLPASSWORD = 'root'
const.MYSQLDATABASE = 'ww'

const.MYSQL_ETL_JOB_LOG = 'etl_job_log'    # etl任务日志表
const.MYSQL_ETL_JOB = 'etl_job' # csv接口配置表
const.MYSQL_TABLE_INFORMATION = 'table_information' # 源层hive表结构配置信息表
const.MYSQL_TRIGGER_RELY_CONF = 'trigger_rely_conf'    # etl流程触发依赖表
const.MYSQL_JOBS_TO_BE_TRIGGER_LIST = 'jobs_to_be_trigger_list'    # 待触发的作业列表
const.MYSQL_TRIGGER_COMPLETE_LIST = 'trigger_complete_list'    # 触发完成的作业列表
# mysql etl表任务状态
const.ETL_LOG_NEW = 'new'
const.ETL_LOG_ASSIGN = 'assign'
const.ETL_LOG_DOWNLOAD = 'download'
const.ETL_LOG_UPLOAD = 'upload'
const.ETL_LOG_ERROR = 'error'
const.ETL_LOG_SUCCESS = 'success'

# ftp 配置信息
const.FTPIP = '192.168.31.1752'
const.FTPUSERNAME = 'ww'
const.FTPPASSWORD = 'ww'
const.FTPPORT = 21
# const.FTP_DIR = '/home/etl_acc_ftp_put/dataflow'
const.FTP_DIR = '/'
const.FTP_BAK_DIR = '/d/'
const.FTP_LOCAL_DIR = path

# ds 配置信息
const.DS_USERNAME = 'irc'
const.DS_PASSWORD = 'irc'
const.DS_URL_LOGIN = 'http://10.254.16.56/danastudio/login'
const.DS_URL_WORKFLOW_LIST = 'http://10.254.16.56/danastudio/dodox/job/list'
const.DS_URL_TRIGGER = 'http://10.254.16.56/danastudio/dodox/job/runnow'
