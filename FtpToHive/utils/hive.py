#!/usr/bin/env python
# -*- coding:utf-8 -*-
# @Time    : 2020/7/16 6:09 下午
# @Author  : Ryh
# @Email   : 1327253700@qq.com
# @File    : hive.py
# @Software: PyCharm

"""
功能介绍:hive相关操作
"""

import os
import time

from pyhive import hive
from conf.settings import const
from utils import mysql
from utils.log import log

# hive连接信息
hive_ip = const.HIVEIP
hive_port = const.HIVEPORT
hive_user = const.HIVEUSERNAME
hive_database = const.HIVEDATABASE

# 字段类型映射map
map = {}
map['BIGINT'] = 'BIGINT'
map['BYTEINT'] = 'TINYINT'
map['CHAR'] = 'STRING'
# map['DATE'] = 'STRING'
map['DATE'] = 'DATE'
map['DECIMAL'] = 'DECIMAL'
map['FLOAT'] = 'DOUBLE'
map['INTEGER'] = 'INT'
map['NUMBER'] = 'DOUBLE'
map['SMALLINT'] = 'INT'
map['TIME'] = 'STRING'
map['TIMESTAMP'] = 'TIMESTAMP'
map['VARCHAR'] = 'STRING'
map['CHARACTER'] = 'STRING'


def CreateConnectHive():
    """
    创建hive客户端连接
    :return:
    """
    # conn = hive.Connection(host=hive_ip, port=hive_port, username=hive_user, database=hive_database)  # 集群未安装 Kerberos 认证连接方式
    conn = hive.Connection(host=hive_ip, port=hive_port, username=hive_user, database=hive_database, auth='KERBEROS',
                           kerberos_service_name='hive')
    cursor = conn.cursor()
    log.info(cursor)
    return cursor


# 将创建的hive客户端连接赋值给一个常量
hiveConnect = CreateConnectHive()


def beeline_sql(sql, error_message):
    """
    使用 beeline 连接执行 hive 命令
    :param sql: beeline 执行的 SQL 语句
    :param error_message: 报错信息
    :return:
    """
    command = '''beeline -u jdbc:hive2://%s:%s -n hive -p hive -e %s''' % (hive_ip, hive_port, sql)
    log.info(command)
    result = os.system(command)
    if result != 0:
        log.error(error_message)


def tempToFormalDataTable(dst_file_path, hive_database, csvFileName, tableName, tableDate, TempTableSuffix,
                          File_DtimeSeq, hdfs_path, category , interfaceId):
    # 获取table字典
    tabledict = mysql.searchTableInformationData(tableName)
    tabledict = tabledict['BMNC_SDATA.' + tableName]

    # log.info("\n\n\n\n\n")
    log.info("Starting Sync table [%s]." % tableName)
    cols = tabledict['COLUMNLIST']
    types = tabledict['TYPELIST']
    comments = tabledict['COMMENTLIST']
    # 用于记录decimal(rangea,rangeb)取值范围
    rangea = tabledict['DECILIST']
    rangeb = tabledict['COLLAST']

    # 通过拼接字段生成建表sql
    tablist = " "
    for col, type, a, b, comment in zip(cols, types, rangea, rangeb, comments):
        if col.upper() == 'REC_SEQ':
            continue

        type = map[type]
        # 遇到decimal类型则需加上特定范围
        if type.upper() == 'DECIMAL':
            tablist = tablist + '`' + col + '` ' + type + '(' + a + ',' + b + ')' + ' comment "' + comment + '",'
        else:
            tablist = tablist + '`' + col + '` ' + type + ' comment "' + comment + '",'
    # 通过拼接字段生成临时表数据插入正式表sql
    insert_sql_list = " "
    for col, type, a, b in zip(cols, types, rangea, rangeb):
        type = map[type]
        # 遇到decimal类型则需加上特定范围
        if type.upper() == 'DECIMAL':
            insert_sql_list = insert_sql_list + 'CAST(' + '`' + col + '` ' + 'AS ' + type + '(' + a + ',' + b + ')' + '), '
        elif type.upper() == 'TIMESTAMP':
            insert_sql_list = insert_sql_list + '''CAST(CONCAT(SUBSTR(''' + col + ''',0,4),'-',SUBSTR(''' + col + ''',5,2),'-',SUBSTR(''' + col + ''',7,2),' ',SUBSTR(''' + col + ''',9)) AS ''' + type + '), '
        elif col.upper() == 'REC_SEQ':
            # insert_sql_list = insert_sql_list + 'ROW_NUMBER() OVER() AS `REC_SEQ`' + ', '
            insert_sql_list = insert_sql_list + 'default.row_sequence() AS `REC_SEQ`'  # 由于自动分区会产生 group by等 shuffle 操作会导致执行速度变慢    row_sequence()不会产生shuffle操作,避免 ROW_NUMBER() OVER() 导致的数据倾斜
        else:
            insert_sql_list = insert_sql_list + 'CAST(' + '`' + col + '` ' + 'AS ' + type + '), '

    # tablist = tablist.upper().replace(',`REC_SEQ` INT comment "记录序号",', '')
    # 实例化hive连接
    # hiveConnect = self.CreateConnectHive()
    # 创建临时库
    create_temp_database = '''CREATE DATABASE IF NOT EXISTS %s''' % (hive_database)
    hiveConnect.execute(create_temp_database)
    # 创建临时表
    create_temp_table_sql = '''CREATE TABLE IF NOT EXISTS %s.%s (%s) ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde' with SERDEPROPERTIES ("separatorChar"=",","quotechar"="\\"") STORED AS TEXTFILE''' % (
        hive_database, tableName, tablist.strip(','))
    create_temp_near_line_table_sql = '''CREATE TABLE IF NOT EXISTS %s.%s (%s) ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde' with SERDEPROPERTIES ("separatorChar"=",","quotechar"="\\"") STORED AS TEXTFILE''' % (
        hive_database, tableName + TempTableSuffix, tablist.strip(','))

    # if category == 'JX':  # 任务类型为 JX 则为近线数据
    #     hiveConnect.execute(create_temp_near_line_table_sql)
    #     # 本地文件 load 至 支持 csv 格式加载的临时表中
    # elif category == 'LX':  # 任务类型为 LX 则为离线数据
    #     hiveConnect.execute(create_temp_table_sql)
    #     # 本地文件 load 至 支持 csv 格式加载的临时表中
    # # 原Data_Dt字段作为分区字段,如存在则需在insert语句中提出Data_Dt至末尾
    # orc_table_cols = ','.join(
    #     filter(lambda x: x != ' CAST(`DATA_DT` AS DATE)', insert_sql_list.strip(',').upper().split(',')))
    # insert_orc_sql = '''INSERT OVERWRITE TABLE BMNC_SDATA.%s PARTITION(DATA_DT = '%s') SELECT %s FROM %s.%s''' % (
    #     tableName, tableDate, orc_table_cols, hive_database, tableName)
    # insert_near_line_orc_sql = '''INSERT OVERWRITE TABLE BMNC_SDATA.%s PARTITION(DATA_DT = '%s',File_DtimeSeq = '%s') SELECT %s FROM %s.%s''' % (
    #     tableName, tableDate, File_DtimeSeq, orc_table_cols, hive_database, tableName + TempTableSuffix)
    # upload_hive(dst_file_path, tableName, hdfs_path, csvFileName, interfaceId)
    # task_type = csvFileName.split('.')[0].split('_')[0]  # 用来判断execl的文件名,如果是z_开头则是增量,需要用外部表,不断累加hdfs路径下文件来使加载至正式表时的REC_SEQ正确
    # if task_type == 'z':    # z开头的文件已增量形式追加到1个账期分区中
    #     insert_orc_sql = '''INSERT INTO TABLE BMNC_SDATA.%s PARTITION(DATA_DT = '%s') SELECT %s FROM %s.%s''' % (
    #     tableName, tableDate, orc_table_cols, hive_database, tableName)
    #     recalculation_rec_seq = """INSERT OVERWRITE TABLE BMNC_SDATA.%s PARTITION(DATA_DT = '%s') SELECT %s FROM BMNC_SDATA.%s WHERE DATA_DT = '%s'""" % (
    #     tableName, tableDate, orc_table_cols, tableName, tableDate)
    #     hiveConnect.execute(insert_orc_sql)
    #     hiveConnect.execute(recalculation_rec_seq)
    # elif category == 'JX':  # 任务类型为 JX 则为近线数据
    #     hiveConnect.execute(insert_near_line_orc_sql)
    # elif category == 'LX':  # 任务类型为 LX 则为离线数据
    #     hiveConnect.execute(insert_orc_sql)


    z_create_temp_table_sql = '''CREATE EXTERNAL TABLE IF NOT EXISTS %s.%s (%s) ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde' with SERDEPROPERTIES ("separatorChar"=",","quotechar"="\\"") STORED AS TEXTFILE''' % (hive_database, tableName, tablist.strip(','))
    task_type = csvFileName.split('.')[0].split('_')[0]  # 用来判断execl的文件名,如果是z_开头则是增量,需要用外部表,不断累加hdfs路径下文件来使加载至正式表时的REC_SEQ正确
    if task_type == 'z' and interfaceId == '120036':  # 任务类型为 LX 则为离线数据 且为增量数据 接口ID为 120036
        hiveConnect.execute(z_create_temp_table_sql)
    elif category == 'LX':  # 任务类型为 LX 则为离线数据
        hiveConnect.execute(create_temp_table_sql)
    elif category == 'JX':  # 任务类型为 JX 则为近线数据
        hiveConnect.execute(create_temp_near_line_table_sql)
    # 原Data_Dt字段作为分区字段,如存在则需在insert语句中提出Data_Dt至末尾
    orc_table_cols = ','.join(
        filter(lambda x: x != ' CAST(`DATA_DT` AS DATE)', insert_sql_list.strip(',').upper().split(',')))
    insert_orc_sql = '''INSERT OVERWRITE TABLE BMNC_SDATA.%s PARTITION(DATA_DT = '%s') SELECT %s FROM %s.%s''' % (
        tableName, tableDate, orc_table_cols, hive_database, tableName)
    insert_near_line_orc_sql = '''INSERT OVERWRITE TABLE BMNC_SDATA.%s PARTITION(DATA_DT = '%s',File_DtimeSeq = '%s') SELECT %s FROM %s.%s''' % (
        tableName, tableDate, File_DtimeSeq, orc_table_cols, hive_database, tableName + TempTableSuffix)
    upload_hive(dst_file_path, tableName, hdfs_path, csvFileName, interfaceId)
    if task_type == 'z' and interfaceId == '120036':  # 任务类型为 LX 则为离线数据 且为增量数据 接口ID为 120036
        orc_table_cols = orc_table_cols.replace('DEFAULT.ROW_SEQUENCE()', 'ROW_NUMBER() OVER(ORDER BY REC_ID)')
        insert_orc_sql = '''INSERT OVERWRITE TABLE BMNC_SDATA.%s PARTITION(DATA_DT = '%s') SELECT %s FROM %s.%s''' % (
        tableName, tableDate, orc_table_cols, hive_database, tableName)
        hiveConnect.execute(insert_orc_sql)
    elif category == 'JX':  # 任务类型为 JX 则为近线数据
        hiveConnect.execute(insert_near_line_orc_sql)
    elif category == 'LX':  # 任务类型为 LX 则为离线数据
        hiveConnect.execute(insert_orc_sql)


def upload_hive(dst_file_path, tableName, hdfs_path, csvFileName, interfaceId):
    """
    直接使用 beeline 将本地文件load至临时表会报找不到文件的错误,这是因为文件不是在HiveServer2 服务器上，需要先把文件放到hdfs，然后再load到临时表里
    故此处拆成两步
    ps:hdfs文件load到表完成之后文件自动删除,故不需要再删除hdfs临时文件
    :param dst_file_path:本地文件路径
    :param tableName:正式表名
    :param hdfs_path:hdfs临时文件存放路径
    :return:
    """

    # put_path = hdfs_path + '/' + csvFileName
    # # 使用hive连接 put 文件及 load 文件
    # put_file = 'hdfs dfs -put %s %s' % (dst_file_path, hdfs_path)
    # log.info(put_file)
    # os.system(put_file)  # 上传至主机时取消此注释
    # load_hive = '''load data inpath '%s' overwrite into table %s.%s''' % (put_path, hive_database, tableName)
    # hiveConnect.execute(load_hive)

    # z开头文件增量数据序号问题
    task_type = csvFileName.split('.')[0].split('_')[0]  # 用来判断execl的文件名,如果是z_开头则是增量,需要用外部表,不断累加hdfs路径下文件来使加载至正式表时的REC_SEQ正确
    put_path = hdfs_path + '/' + csvFileName
    # 使用hive连接 put 文件及 load 文件
    put_file = 'hdfs dfs -put -f %s %s' % (dst_file_path, hdfs_path)
    hdfs_file_path = hdfs_path + '/' + tableName.lower() + '/' + csvFileName
    file_whether_exist = 'hdfs dfs -ls %s' % (hdfs_file_path)
    log.info(file_whether_exist)
    if 0 != os.system(file_whether_exist):
        log.info(put_file)
        os.system(put_file)  # 上传至主机时取消此注释
        if task_type == 'z' and interfaceId == '120036':   # 任务类型为 LX 则为离线数据 且为增量数据 接口ID为 120036 # hdfs对应目录上文件已存在则不上传
            load_hive = '''load data inpath '%s' into table %s.%s''' % (put_path, hive_database, tableName)
        else:
            load_hive = '''load data inpath '%s' overwrite into table %s.%s''' % (put_path, hive_database, tableName)
        hiveConnect.execute(load_hive)


def HivePartitionRecordNumber(tableName, tableDate, File_DtimeSeq, category):
    """
    返回hive表指定Data_Dt分区数据量、或指定Data_Dt、File_DtimeSeq分区数据量
    :param tableName: hive表名
    :param tableDate: Data_Dt账期
    :param File_DtimeSeq: csv文件时间戳及序号,例:20191222234500_00
    :param category: 任务类型
    :return:
    """
    # hiveConnect = self.CreateConnectHive()
    countSql = '''SELECT COUNT(*) FROM BMNC_SDATA.%s WHERE DATA_DT = '%s' ''' % (tableName, tableDate)
    nearLineCountSql = '''SELECT COUNT(*) FROM BMNC_SDATA.%s WHERE DATA_DT = '%s' AND File_DtimeSeq = '%s' ''' % (
        tableName, tableDate, File_DtimeSeq)
    if category == 'JX':  # 任务类型为 JX 则为近线数据
        hiveConnect.execute(nearLineCountSql)
    elif category == 'LX':  # 任务类型为 LX 则为离线数据
        hiveConnect.execute(countSql)
    countlist = hiveConnect.fetchone()
    return countlist[0]  # 返回记录条数


def HiveDropTempTable(hive_database, tableName, TempTableSuffix, category):  # 清除临时表
    """
    删除csv文件加载至hive正式表过程中产生的临时表
    :param hive_database: hive临时表所在库名
    :param tableName: hive临时表表名
    :param TempTableSuffix: hive临时表后缀名、由于近线csv文件为几分钟传输一次故将hive临时表加上后缀名避免脏数据,例:20191222_110003_00_00_00_0_20191222234500_00
    :param category: 任务类型
    :return:
    """
    # hiveConnect = self.CreateConnectHive()
    dropTempTable = '''DROP TABLE %s.%s''' % (hive_database, tableName)
    dropNearLineTempTable = '''DROP TABLE %s.%s''' % (hive_database, tableName + TempTableSuffix)
    if category == 'JX':  # 任务类型为 JX 则为近线数据
        hiveConnect.execute(dropNearLineTempTable)
    elif category == 'LX':  # 任务类型为 LX 则为离线数据
        hiveConnect.execute(dropTempTable)


def HiveInsertEtlLog(tableSystem, tableName, tableDate, tableDesc, csvFileName, processTime, File_DtimeSeq, category):
    """
    插入hive etl日志
    :param tableSystem: 表所属系统
    :param tableName: 表名
    :param tableDesc: 表描述
    :param csvFileName: csv文件名
    :param processTime: 接口程序开始处理的时间
    :param File_DtimeSeq: 近线csv文件时间戳及序号,例:20191222234500_00
    :param category: 任务类型
    :return:
    """
    insertHiveEtlLogSql = ''
    if category == 'JX':  # 任务类型为 JX 则为近线数据
        insertHiveEtlLogSql = '''
        INSERT INTO BMNC_DEVOPS.ETL_TASK_LIST PARTITION(DATA_DT = '%s')
        SELECT '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', from_unixtime(unix_timestamp(),"yyyy-MM-dd HH:mm:ss"), '%s'
        ''' % (
            tableDate, tableSystem, tableName, tableDesc, csvFileName.split('_')[1], 'JX', csvFileName,
            File_DtimeSeq, processTime,
            time.strftime('%Y-%m-%d %H:%M:%S', time.localtime()), os.path.basename(__file__))
    elif category == 'LX':  # 任务类型为 LX 则为离线数据
        insertHiveEtlLogSql = '''
        INSERT INTO BMNC_DEVOPS.ETL_TASK_LIST PARTITION(DATA_DT = '%s')
        SELECT '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', from_unixtime(unix_timestamp(),"yyyy-MM-dd HH:mm:ss"), '%s'
        ''' % (
            tableDate, tableSystem, tableName, tableDesc, csvFileName.split('_')[1], 'LX', '', csvFileName,
            processTime,
            time.strftime('%Y-%m-%d %H:%M:%S', time.localtime()), os.path.basename(__file__))
    hiveConnect.execute(insertHiveEtlLogSql)
