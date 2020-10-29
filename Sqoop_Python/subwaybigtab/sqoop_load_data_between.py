#!/usr/bin/env python
#! -*- coding:utf-8 -*-

'''
Step1. sqoop抽取teradata到HDFS
Step2. 创建external表链到HDFS数据文件
Step3. 创建orc表，创建分区
Step4. 将external表中数据导入orc表（如存在则覆盖）
'''

import os
import sys
import time
from utils import log
from utils import formatTable
from utils import getExcelData
from constant import const
reload(sys)
sys.setdefaultencoding('utf8')

# 字段类型映射map
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

# Hive information
hiveip = const.HIVEIP

# Teradata information
tdip = const.TDIP
tdusername = const.TDUSERNAME
tdpwd = const.TDPWD


def beeline_exec_sql(sql_list, eror_message):
    exec_command = '''beeline -u "jdbc:hive2://%s:10000/default;principal=hive/cdh03.irc.com@IRC.COM" -n hive -p hive ''' % hiveip
    for sql in sql_list:
        exec_command += '''-e '%s' ''' % sql

    log.info(exec_command)
    result = os.system(exec_command)
    if result != 0:
        log.error(eror_message)


def sqoop_import_exec(tdip, database, tdusername, tdpwd, query_sql, tempDir, splitkey):
    start_time = time.time()
    # 此处query_sql中如有where条件则需要在where的最后加上 'AND \$CONDITIONS'
    sqoop_command = '''
sqoop import \
--connect jdbc:teradata://%s/DATABASE=%s,TMODE=TERA,CHARSET=UTF8 \
--username "%s" --password "%s" \
--query "%s" \
--target-dir "%s" \
--fields-terminated-by '\\001' \
--null-string '\\\N' \
--null-non-string '\\\N' \
--split-by %s -m 1 \
--check-column "CAST(%s AS DATE FORMAT 'YYYY-MM-DD')" \
--incremental append ''' % (tdip, database, tdusername, tdpwd, query_sql, tempDir, splitkey, splitkey)

    log.info("执行 sqoop 命令 %s" % (sqoop_command))
    result = os.system(sqoop_command)
    if result != 0:
        log.error("Sqoop import failed! \n Query:[%s] " % query_sql)
    else:
        spend_time = time.time() - start_time
        log.info(
            "Successful finish sqoop task. Spend time: %.03f seconds." % spend_time)


def sqoop_load_data_for_bigtab():
    # 检查脚本参数
    paralist = sys.argv
    if 2 != len(paralist):
        print(
            "Incorrect number of parameters. Example: python sqoop_load_data.py test.xlsx ")
        sys.exit(0)

    # 读取excel
    file = paralist[1]
    # 获取table字典
    tableList = formatTable(file)

    count = 0

    for dbtab in tableList:
        log.info(
            "\n\n\n\n\n-----------------------------------------------------------------------------------")

        database = dbtab["DATABASE"]
        tabname = dbtab["TABLENAME"]
        cols = dbtab['COLUMNLIST']
        types = dbtab['TYPELIST']
        comments = dbtab['COMMENTLIST']
        splitkey = dbtab['SQOOP_SPLITKEY']
        datarange = dbtab['SQOOP_DATARANGE']
        # 用于记录decimal(rangea,rangeb)取值范围
        rangea = dbtab['DECILIST']
        rangeb = dbtab['COLLAST']

        log.info("Starting Sync table [%s.%s]." % (database, tabname))

        # 创建临时库， 请提前创建好
        # tmpdb = database + '_EXTERNAL' #临时表库的标识
        # create_ex_db_sql = '''CREATE DATABASE IF NOT EXISTS %s''' % tmpdb
        # beeline_exec_sql([create_ex_db_sql],'Create external database [%s] failed!' % tmpdb)
        # 创建正式库， 请提前创建好
        # create_db_sql = '''CREATE DATABASE IF NOT EXISTS %s''' % database
        # beeline_exec_sql([create_db_sql],'Create database [%s] failed!' % database)

        # 通过拼接字段生成建表sql
        tablist = " "
        for col, type, a, b, comment in zip(cols, types, rangea, rangeb, comments):
            type = map[type]
            # 遇到decimal类型则需加上特定范围
            if type == 'DECIMAL':
                tablist = tablist + '`' + col + '` ' + type + \
                    '(' + a + ',' + b + ')' + ' comment "' + comment + '",'
            else:
                tablist = tablist + '`' + col + '` ' + type + ' comment "' + comment + '",'

        #将取到的表字段统一转换为小写,下面取字段对比时统一按小写字段进行比较,避免出现匹配不上的问题
        tablist = tablist.lower()

        # 同步task开始
        dayrange = datarange.split(';')
        for date in dayrange:
            # 抽取数据日期范围
            startDate = date.strip('[').strip(']').split(',')[0]
            endDate = date.strip('[').strip(']').split(',')[1]

            # 使用 表名+日期 的形式的新表名，作为临时表，以使于支持可以同时启动多个进程
            tempTableName = tabname+startDate.replace('-', '')

            # sqoop抽取teradata数据到HDFS的目录
            tempDir = '/ods/%s_EXTERNAL/%s' % (database, tempTableName)
            # 创建数据存储目录
            exist = os.popen('''hdfs dfs -ls %s | wc -l''' % (tempDir)).read().strip()
            if int(exist) != 1:
                dir = os.popen('''hdfs dfs -mkdir -p %s''' % (tempDir)).read().strip()

            # 创建外部表, 由于是多次数据导入同一个表，所以需要先清空临时表
            tmptab = database + "_EXTERNAL." + tempTableName
            drop_ex_table_sql = '''DROP TABLE IF EXISTS %s''' % tmptab
            create_ex_table_sql = '''CREATE TABLE IF NOT EXISTS %s (%s) ROW FORMAT DELIMITED FIELDS TERMINATED BY "\u0001" LOCATION "%s" ''' % (
                tmptab, tablist.strip(','), tempDir)
            beeline_exec_sql([drop_ex_table_sql, create_ex_table_sql], "Create external table [%s] failed!" % tmptab)

            # 原Data_Dt字段作为分区字段需在建表sql中提出Data_Dt字段
            orc_table_cols = ','.join(filter(lambda x: x.strip().split(' ')[0] != '`data_dt`', tablist.strip(',').split(',')))
            create_orc_sql = '''CREATE TABLE IF NOT EXISTS %s.%s(%s) PARTITIONED BY (Data_Dt string) STORED AS ORC tblproperties ("orc.compress" = "SNAPPY") ''' % (
                database, tabname, orc_table_cols)
            beeline_exec_sql([create_orc_sql], 'Create table [%s.%s] failed!' % (database, tabname))

            # Sqoop抽取teradata数据到HDFS数据目录
            import_condition = '''SELECT * FROM %s.%s WHERE CAST('%s' AS DATE FORMAT 'YYYY-MM-DD') <= %s AND %s < CAST('%s' AS DATE FORMAT 'YYYY-MM-DD') AND \$CONDITIONS ''' % (
                database, tabname, startDate, splitkey, splitkey, endDate)
            log.info("Starting sqoop synchronous extraction task.[%s.%s]" % (database, tabname))
            sqoop_import_exec(tdip, database, tdusername, tdpwd, import_condition, tempDir, splitkey)

            # print(import_condition)
            # orc表添加分区
            # add_part_sql = '''ALTER TABLE %s.%s ADD PARTITION(Data_Dt="%s")''' % (database, tabname, startDate)
            # beeline_exec_sql([add_part_sql], 'Table [%s.%s] already has partition [%s]!' % (database, tabname, startDate))
            # 写数据到orc表，insert into orctable select * from sqooptab
            # 特殊字符处理
            sqlList = ""
            for col, type, comment in zip(cols, types, comments):
                if col.lower() == 'data_dt':
                    continue

                if type == 'CHARACTER':
                    sqlList = sqlList + 'trim(' + col + '),'
                else:
                    sqlList = sqlList + col + ','

            tmp_to_orc = '''set hive.exec.dynamic.partition.mode=nonstrict;
            INSERT OVERWRITE TABLE %s.%s PARTITION(Data_Dt) SELECT %s ,Data_Dt FROM %s WHERE to_date("%s") <= to_date(%s) AND to_date(%s) < to_date("%s")''' % (
                database, tabname, sqlList.strip(','), tmptab, startDate, splitkey, splitkey, endDate)
            # log.info(tmp_to_orc)
            beeline_exec_sql([tmp_to_orc], 'Faild sync TMP to ORC table [%s.%s]!' % (database, tabname))

            # 第四步：删除目录下的临时文件，或者直接删表
            rmrcmd = '''hdfs dfs -rm -r %s ''' % (tempDir)
            # os.system(rmrcmd)
            drop_tmp_sql = '''DROP TABLE %s''' % tmptab
            beeline_exec_sql([drop_tmp_sql], 'Failed to drop tmp table [%s]' % tmptab)
            count += 1
            log.info("======Complete progress %s/%s======\n\n\n\n" % (count, len(tableList)))


if __name__ == '__main__':
    sqoop_load_data_for_bigtab()
