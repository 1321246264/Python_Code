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
const.HIVEDATABASE = 'bmnc_sdata_temp'

# hdfs 文件存放位置配置信息
const.HDFS_PATH = '/user/hive/warehouse/bmnc_sdata_temp.db'

# mysql 配置信息
const.MYSQLIP = '10.254.16.55'
const.MYSQLUSERNAME = 'datatom'
const.MYSQLPASSWORD = '123456'
const.MYSQLDATABASE = 'bmnc_devops'
# mysql etl表任务状态
const.ETL_LOG_NEW = 'new'
const.ETL_LOG_DOWNLOAD = 'download'
const.ETL_LOG_UPLOAD = 'upload'
const.ETL_LOG_ERROR = 'error'
const.ETL_LOG_SUCCESS = 'success'

# ftp 配置信息
const.FTPIP = '10.254.2.2'
const.FTPUSERNAME = 'dt_ftp_get'
const.FTPPASSWORD = 'Td123456#'
const.FTPPORT = 21
# const.FTP_DIR = '/home/etl_acc_ftp_put/dataflow'
const.FTP_DIR = '/'
const.FTP_BAK_DIR = '/datafinal/'
const.FTP_LOCAL_DIR = path
