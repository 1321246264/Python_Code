#!/usr/bin/env python
# -*- coding:utf-8 -*-

'''
工具类
'''

import logging
import os
import xlrd
from constant import const

# 日志
path = const.LOG_PATH
name = const.LOG_NAME

# excel的列名
columnInfo = const.COLUMNINFO
DatabaseName = const.DATABASENAME
TableName = const.TABLENAME

'''
日志格式
:param ：日志目录、日志名称
:return: 日志 Handler
'''


def log():
    logger = logging.getLogger()
    logger.setLevel(logging.INFO)
    if not os.path.exists(path):
        os.system("mkdir -p %s" % path)
    log_file = path + name
    fh = logging.FileHandler(log_file, mode='a')
    fh.setLevel(logging.DEBUG)
    formatter = logging.Formatter(
        "%(asctime)s - %(filename)s[line:%(lineno)d] - %(levelname)s: %(message)s")
    fh.setFormatter(formatter)
    logger.addHandler(fh)
    return logger


log = log()


def getExcelData(file):
    '''
    读取excel数据
    :param ：文件地址
    :return: list . [{k1:v1,k2:v2,k3:v3}]
    '''
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


def formatTable(file):
    '''
    读取excel数据
    :param ：文件地址
    :return: list [ map{col:info,col:info....} ]
    :        list [ map{DATABASE:db, TABLENAME:tb, COLUMNLIST:[col1name, col2name...] ,COMMENTLIST:[col1comment, col2comment...]}]
    '''
    tables = getExcelData(file)

    # 存储所有表结构信息,list [map {col:info,col:info....}]
    tbls = []

    # 遍历excel中所有表
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
            col = cols[j].strip('[').strip(']').split('|')  # 单个列的具体信息
            colname.append(col[0])
            colcomment.append(col[1])
            coltype.append(col[2])
            collen.append(col[3])
            coldecimal.append(col[4])
            collast.append(col[5])

        maptable["DATABASE"] = database   # 数据库名
        maptable["TABLENAME"] = tablename  # 表名
        maptable['COLUMNLIST'] = colname  # 字段名
        maptable['COMMENTLIST'] = colcomment  # 字段描述
        maptable['TYPELIST'] = coltype  # 字段类型
        maptable['LENTHLIST'] = collen  # 字段长度
        maptable['DECILIST'] = coldecimal  # decimal 类型, 有效位数
        maptable['COLLAST'] = collast  # decimal 类型, 小数位数
        # 存储成map方便使用
        tbls.append(maptable)
    return tbls
