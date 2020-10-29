#!/usr/bin/env python
# -*- coding:utf-8 -*-

'''
功能：抽取TD小表到HIVE
'''

import os
import sys

from utils import log
from utils import formatTable
from utils import getExcelData
from constant import const

reload(sys)
sys.setdefaultencoding('utf8')

# 字段类型映射TD:HIVE
map = {}

map['BIGINT'] = 'BIGINT'
map['BYTEINT'] = 'TINYINT'
map['CHAR'] = 'STRING'
map['DATE'] = 'STRING'
map['DECIMAL'] = 'DECIMAL'
map['FLOAT'] = 'DOUBLE'
map['INTEGER'] = 'INT'
map['NUMBER'] = 'DOUBLE'
map['SMALLINT'] = 'INT'
map['TIME'] = 'STRING'
map['TIMESTAMP'] = 'TIMESTAMP'
map['VARCHAR'] = 'STRING'
map['CHARACTER'] = 'STRING'


# HIVE 节点
hiveip = const.HIVEIP

# TD 信息
tdip = const.TDIP
tdusername = const.TDUSERNAME
tdpwd = const.TDPWD


def sqoop_load_data_for_smalltab():

    # 判断参数个数
    paralist = sys.argv
    if 2 != len(paralist):
        print('参数个数不正确：%s' % (len(paralist)))
        return

    # 读取excel文件内容
    file = paralist[1]
    tableList = formatTable(file)
    i = 1

    # 遍历表
    for dbtab in tableList:
        log.info(
            "\n\n\n\n\n-----------------------------------------------------------------------------------")

        database = dbtab['DATABASE']
        tabname = dbtab['TABLENAME']
        cols = dbtab['COLUMNLIST']
        types = dbtab['TYPELIST']
        comments = dbtab['COMMENTLIST']
        rangea = dbtab['DECILIST']
        rangeb = dbtab['COLLAST']
        # 普通表的目录，sqoop抽取时使用
        tempDir = '/ods/%s_EXTERNAL/%s' % (database, tabname)

        log.info("开始同步表 ======> %s.%s " % (database, tabname))

        # 建临时库, 已经提前建好库了，不需要每次都执行，减少不必要的开销
        # tmpdb=database+'_EXTERNAL' #普通表库的标识
        # dbsql=''' beeline -u jdbc:hive2://%s:10000/default  -n hive -p hive -e 'create database if not exists %s' '''%(hiveip,tmpdb)
        # log.info("建临时库命令： %s" %(dbsql))
        # db=os.system(dbsql)
        # 建 正式库
        # orcdbsql=''' beeline -u jdbc:hive2://%s:10000/default  -n hive -p hive -e 'create database if not exists %s' '''%(hiveip,database)
        # log.info("建正式库命令： %s" %(orcdbsql))
        # orcdb=os.system(orcdbsql)

        # 第一步：生成sql
        tablist = " "
        # 字段拼接
        for col, type, a, b, comment in zip(cols, types, rangea, rangeb, comments):
            type = map[type]
            if type == 'DECIMAL':
                tablist = tablist+'`'+col+'` '+type + '('+a+','+b+')'+' comment "'+comment+'",'
            else:
                tablist = tablist+'`'+col+'` '+type+' comment "'+comment+'",'

        # 第二步：抽取命令，将数据抽到HDFS某个目录，

        # sqoop 同步，删除目标目录防止sqoop出错
        rmHdfsDir = '''hdfs dfs -rm -r -f %s ''' % tempDir
        log.info("删除hdfs目录 %s" % (rmHdfsDir))
        sqoop = os.system(rmHdfsDir)
        if sqoop != 0:
            log.error("删除hdfs目录数据出错，执行语句 %s" % (rmHdfsDir))
            continue

        # sqoop 同步，
        sqoopAlltab = '''
sqoop import											\
--connect jdbc:teradata://%s/DATABASE=%s,TMODE=TERA,CHARSET=UTF8	\
--username "%s"														\
--password "%s"														\
--fetch-size 10000												\
--table "%s"  													\
--target-dir "%s" -m 1 													\
--fields-terminated-by '\\001' 										\
--null-string '\\\N' 												\
--null-non-string '\\\N'  ''' % (tdip, database, tdusername, tdpwd, tabname, tempDir)
        log.info("sqoop 命令： %s" % (sqoopAlltab))
        sqoop = os.system(sqoopAlltab)
        if sqoop != 0:
            log.error("sqoop 同步数据出错，执行语句 %s" % (sqoopAlltab))
            continue

        # 第三步，建表指向普通表的文件地址，sqoop抽取数据到该位置
        tmptab = database+"_EXTERNAL."+tabname
        hivesql = ''' beeline -u "jdbc:hive2://%s:10000/default;principal=hive/cdh03.irc.com@IRC.COM"  -n hive -p hive -e 'create table if not exists %s ( %s ) ROW FORMAT DELIMITED FIELDS TERMINATED BY "\u0001" location "%s";' ''' % (
            hiveip, tmptab, tablist.strip(','), tempDir)
        log.info("建临时表命令： %s" % (hivesql))
        hsql = os.system(hivesql)
        if hsql != 0:
            log.error("新建同步表报错，执行语句 %s " % (hivesql))
            continue

        # 第四步，建 正式的 orc 表
        orcsql = ''' beeline -u "jdbc:hive2://%s:10000/default;principal=hive/cdh03.irc.com@IRC.COM"  -n hive -p hive -e  'create table if not exists %s.%s(%s)  stored as orc tblproperties ("orc.compress" = "SNAPPY") ;' ''' % (
            hiveip, database, tabname, tablist.strip(','))
        log.info("建ORC表命令： %s" % (orcsql))
        orc = os.system(orcsql)
        if orc != 0:
            log.error("新建同步表 orc 表报错，执行语句 %s " % (orcsql))
            continue

        # 第五步，将临时表的数据写到orc表，insert into orctable select * from sqooptab
        # 特殊字符替换
        sqlList = ""
        for col, type, comment in zip(cols, types, comments):
            if type == 'CHARACTER':
                sqlList = sqlList+'trim('+col+'),'
            else:
                sqlList = sqlList+col+','

        inselect = ''' beeline -u "jdbc:hive2://%s:10000/default;principal=hive/cdh03.irc.com@IRC.COM"  -n hive -p hive -e 'insert overwrite table %s.%s select %s from %s' ''' % (
            hiveip, database, tabname, sqlList.strip(','), tmptab)
        log.info("迁移临时表数据=》正式ORC表命令： %s" % (inselect))
        insert = os.system(inselect)
        if insert != 0:
            log.error("同步数据到 orc 表出错，执行语句 %s " % (inselect))

        # 第六步：删除目录下的临时文件，或者直接删表
        droptab = ''' beeline -u "jdbc:hive2://%s:10000/default;principal=hive/cdh03.irc.com@IRC.COM"  -n hive -p hive -e  'drop table %s' ''' % (hiveip, tmptab)
        log.info("删除表命令： %s" % (droptab))
        drop = os.system(droptab)
        rmrcmd = '''hdfs dfs -rm -r -f %s ''' % (tempDir)
        log.info("删除表HDFS数据目录命令： %s" % (tempDir))
        os.system(rmrcmd)

        log.info("数据表 %s.%s 同步完成进度 %s/%s \n\n\n\n\n" % (database, tabname, i, len(tableList)))

        i = i+1


if __name__ == '__main__':
    sqoop_load_data_for_smalltab()
