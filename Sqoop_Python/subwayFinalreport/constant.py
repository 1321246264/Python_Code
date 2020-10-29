#!/usr/bin/env python
# -*- coding:utf-8 -*-

'''
功能介绍：脚本修改的唯一入口，脚本中的参数，只需在此文件中配置即可
'''

import os,sys
cwd = os.getcwd()

'''
常量池区
'''
class _const:
    class ConstError(TypeError) : 
    	pass
    class ConstCaseError(ConstError) : 
    	pass
    
    def __setattr__(self, name, value):
        if self.__dict__.has_key(name):
            raise self.ConstError, "Can't change const.%s" % name
        if not name.isupper():
            raise self.ConstCaseError, 'Const name "%s" is not all uppercase' % name
        self.__dict__[name] = value

const = _const()

#Log
const.LOG_DIR = os.path.join(cwd,'log')
const.LOG_NAME = '%s.log'%(os.path.basename(sys.argv[1]))

#Hive 
const.HIVEIP = '10.254.16.3'

# Teradata正式库
#const.TDIP = '10.254.4.2'
# Teradata灾备库
const.TDIP = '10.254.101.198'
# Teradata测试库
# const.TDIP = '10.254.4.14'
const.TDUSERNAME = 'hdtest'
const.TDPWD = 'hdtest'

#excel第一列的列名信息，用于作为字典的key存储列数据
const.DATABASENAME = 'DatabaseName'
const.TABLENAME = 'TableName'
const.COLUMNINFO = 'ColumnInfo'
const.SPLITKEY = 'SplitKey'
const.DATARANGE = 'DataRange'




