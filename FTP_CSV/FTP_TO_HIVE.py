#!/usr/bin/env python
# -*- coding:utf-8 -*-
# @Time    : 2020/6/2 9:40 上午
# @Author  : Ryh
# @File    : constant.py
# @Software: PyCharm
import math
import socket
from ftplib import FTP, error_perm

from pyhive import hive

from constant import const, log
from utils import getExcelData, formatTable
import os, sys, imp, csv, time

imp.reload(sys)

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

'''
功能介绍:ftp下载

tips:
1、权限
2、python函数在调用之前需要声明
3、累方法默认有一个 self 参数
'''


class FTP_OPS(object):
    '''
    ftp文件操作
    '''

    def __init__(self, ftp_ip, ftp_prot, ftp_user, ftp_pwd):
        self.ftp_ip = ftp_ip
        self.ftp_prot = ftp_prot
        self.ftp_user = ftp_user
        self.ftp_pwd = ftp_pwd

    def ftp_connect(self):
        '''
        连接ftp
        :return:
        '''
        socket.setdefaulttimeout(2)  # 设置FTP连接超时时间为60秒
        ftp = FTP()
        ftp.connect(host=self.ftp_ip, port=self.ftp_prot)
        # ftp.set_debuglevel(2)   #开启调试模式
        ftp.encoding = 'utf-8'  # 设置编码格式

        try:
            ftp.login(self.ftp_user, self.ftp_pwd)
            print('[{}] login ftp {}'.format(self.ftp_user, ftp.getwelcome()))  # 打印 ftp 欢迎信息
        except(socket.error, socket.gaierror):  # ftp 连接错误
            print('ERROR: cannot connect [{}:{}]'.format(self.ftp_ip, self.ftp_prot))
            return None
        except(error_perm):  # 用户登录认证错误
            print('ERROR: user Authentication failed ')
            return None
        except Exception as e:
            print(e)
            return None
        return ftp

    def progressbar(self, cur, total):
        '''
        进度条显示
        :param cur:当前数值
        :param total:总值
        :return:
        '''
        percent = '{:.2%}'.format(cur / total)
        sys.stdout.write('\r')
        sys.stdout.write('[%-50s] %s' % ('=' * int(math.floor(cur * 50 / total)), percent))
        sys.stdout.flush()  # 刷新输出
        if cur == total:
            sys.stdout.write('\n')

    def recurfile(self, ftp_dir, ftp):
        '''
        递归显示文件
        :param ftp_dir:当前目录地址
        :param ftp:
        :return:
        '''
        # ftp.cwd(ftp_dir.encode('utf-8').decode('latin1'))   #   encode 返回编码后的字符串, decode 返回解码后的字符串(中文路径需用此方法解决)
        ftp.cwd(ftp_dir)  # 设置FTP当前操作的目录
        files = ftp.nlst()  # 获取目录下的文件

        listFiles = []
        for file in files:  # 遍历文件夹
            fullpath = ftp_dir + '/' + file
            if os.path.isdir(fullpath):  # 判断是否是文件夹,不是文件夹则打开(入参为绝对路径)
                self.recurfile(fullpath, ftp)
            else:
                print(fullpath)  # 打开文件
                listFiles.append(fullpath)
        return listFiles

    def existsOrNor(self, ftp_file_path, dst_file_path):
        # ftp = self.ftp_connect()
        print(ftp.nlst())
        remote_file_size = ftp.size(ftp_file_path)  # 文件总大小 , 远程告警
        print('remote filesize: %.2f MB' % (remote_file_size / 1024 / 1024))

        lsize = 0
        # check local file isn't exists and get the local file size
        if os.path.exists(dst_file_path):  # 文件标识
            print('the file already exists in local dir')
            lsize = os.stat(dst_file_path).st_size
            if lsize >= remote_file_size:
                print('local file is bigger or equal remote file')
            return -1

    def download_file(self, ftp_file_path, dst_file_path):
        '''
        ftp文件下载至本地
        :param ftp_file_path:ftp下载文件
        :param dst_file_path: 本地文件存放路径
        :return:
        '''
        buffer_size = 10240  # 默认8192
        ftp = self.ftp_connect()

        # 将传输模式改为二进制模式 ,避免提示 ftplib.error_perm: 550 SIZE not allowed in ASCII
        ftp.voidcmd('TYPE I')
        # print('返回当前所在位置:' ,ftp.pwd())
        # print('显示目录下文件信息' ,ftp.dir())
        # print('获取目录下的文件:', ftp.nlst())
        # print('ftp下载文件:', ftp_file_path)
        remote_file_size = ftp.size(ftp_file_path)  # 文件总大小 , 远程告警
        print('remote filesize: %.2f MB' % (remote_file_size / 1024 / 1024))

        cmpsize = 0  # 下载文件初始大小
        lsize = 0
        start = time.time()

        try:
            conn = ftp.transfercmd('RETR {0}'.format(ftp_file_path), lsize)
            f = open(dst_file_path, "ab")
            while True:
                data = conn.recv(buffer_size)
                if not data:
                    break
                f.write(data)
                cmpsize += len(data)
                self.progressbar(cmpsize, remote_file_size)

            ftp.voidcmd('NOOP')
            print('keep alive cmd success')
            ftp.voidresp()
            print('No loop cmd')
            conn.close()
            ftp.quit()
        except Exception as e:
            pass
            print(e)
        finally:
            f.close()
            end = time.time()
            print('consume time: %.2f s' % (end - start))
            file_size = os.stat(dst_file_path).st_size
            print('local filesize: %.2f MB' % (file_size / 1024 / 1024))


class HIVE_OPS(object):
    '''
    本地文件上传至 hive
    '''

    def __init__(self, hive_ip, hive_port, hive_user, hive_database):
        self.hive_ip = hive_ip
        self.hive_port = hive_port
        self.hive_user = hive_user
        self.hive_database = hive_database

    def parse_mapping(self, file, interface):  # 解析映射
        tableDate = file.split('_')[0]  # 获取 ftp 接口文件数据日期
        interfaceId = file.split('_')[1]  # 获取 ftp 接口文件ID
        tableName = interface[interfaceId]  # 获取 ftp 接口文件ID对应加载表名
        return tableName, tableDate

    def beeline_sql(self, sql, error_message):  # 使用 beeline 连接执行 hive 命令
        command = '''beeline -u jdbc:hive2://%s:%s -n hive -p hive -e %s''' % (self.hive_ip, self.hive_port, sql)
        log.info(command)
        # print(command)
        result = os.system(command)
        # print(result)
        if result != 0:
            log.error(error_message)

    def upload_hive(self, localFile, tableName, hdfs_path):
        '''
        直接使用 beeline 将本地文件load至临时表会报找不到文件的错误,这是因为文件不是在HiveServer2 服务器上，需要先把文件放到hdfs，然后再load到临时表里
        故此处拆成两步
        ps:hdfs文件load到表完成之后文件自动删除,故不需要再删除hdfs临时文件
        :param localFile:本地文件路径
        :param tableName:正式表名
        :param hdfs_path:hdfs临时文件存放路径
        :return:
        '''
        put_path = hdfs_path + '/' + file
        # put_file = 'hdfs dfs -put %s %s' % (localFile, hdfs_path)
        # print(put_file)
        # os.system(put_file)   #上传至主机时取消此注释
        # load_hive = '''"load data inpath '%s' overwrite into table %s.%s"''' % (put_path, self.hive_database, tableName)
        # print(load_hive)
        # self.beeline_sql(load_hive, 'load data local inpath !')   #上传至主机时取消此注释

        # 使用hive连接 put 文件及 load 文件
        put_file = 'hdfs dfs -put %s %s' % (localFile, hdfs_path)
        print(put_file)
        # os.system(put_file)   #上传至主机时取消此注释
        load_hive = '''load data inpath '%s' overwrite into table %s.%s''' % (put_path, self.hive_database, tableName)
        hiveConnect = self.CreateConnectHive()
        print(load_hive)
        hiveConnect.execute(load_hive)
        hiveConnect.close()

    def create_temp_table(self, configure_path, hive_database, tableName, tableDate):
        # 读取execl
        file = configure_path
        # 获取table字典
        tabledict = formatTable(file)
        # print(tableName)
        # print(tabledict[tableName])
        tabledict = tabledict['BMNC_SDATA.' + tableName]
        # print(tabledict)

        log.info("\n\n\n\n\n")
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
            type = map[type]
            # 遇到decimal类型则需加上特定范围
            if type == 'DECIMAL':
                tablist = tablist + '`' + col + '` ' + type + '(' + a + ',' + b + ')' + ' comment "' + comment + '",'
            else:
                tablist = tablist + '`' + col + '` ' + type + ' comment "' + comment + '",'

        insert_sql_list = " "
        for col, type, a, b in zip(cols, types, rangea, rangeb):
            type = map[type]
            # 遇到decimal类型则需加上特定范围
            if type == 'DECIMAL':
                insert_sql_list = insert_sql_list + 'CAST(' + '`' + col + '` ' + 'AS ' + type + '(' + a + ',' + b + ')' + '), '
            elif type == 'TIMESTAMP':
                insert_sql_list = insert_sql_list + '''CAST(CONCAT(SUBSTR(''' + col + ''',0,4),'-',SUBSTR(''' + col + ''',5,2),'-',SUBSTR(''' + col + ''',7,2),' ',SUBSTR(''' + col + ''',9)) AS ''' + type + '), '
            elif col == 'REC_SEQ':
                insert_sql_list = insert_sql_list + 'ROW_NUMBER() OVER() AS `REC_SEQ`' + ', '
            else:
                insert_sql_list = insert_sql_list + 'CAST(' + '`' + col + '` ' + 'AS ' + type + '), '

        tablist = tablist.replace(',`REC_SEQ` INT comment "记录序号",', '')
        # print(tablist)
        # 创建临时库
        create_temp_database = '''CREATE DATABASE IF NOT EXISTS %s''' % (hive_database)
        # 创建临时表
        create_temp_table_sql = '''CREATE TABLE IF NOT EXISTS %s.%s (%s) ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde' with SERDEPROPERTIES ("separatorChar"=",","quotechar"="\\"") STORED AS TEXTFILE''' % (
        hive_database, tableName, tablist)
        # print(create_temp_table_sql)
        hiveConnect = self.CreateConnectHive()
        hiveConnect.execute(create_temp_database)
        hiveConnect.execute(create_temp_table_sql)
        # 将本地文件上传至临时表中
        # self.upload_hive(localFile, tableName, hdfs_path)
        # 原Data_Dt字段作为分区字段,如存在则需在insert语句中提出Data_Dt至末尾
        # print(insert_sql_list)
        orc_table_cols = ','.join(
            filter(lambda x: x != ' CAST(`Data_Dt` AS DATE)', insert_sql_list.strip(',').split(',')))
        print(orc_table_cols)
        insert_orc_sql = '''INSERT OVERWRITE TABLE BMNC_SDATA.%s PARTITION(DATA_DT) SELECT %s CAST ('%s' AS DATE) AS `DATA_DT` FROM %s.%s''' % (
        tableName, orc_table_cols, tableDate, hive_database, tableName)
        print(insert_orc_sql)
        # 开启hive动态分区
        hiveConnect.execute('set hive.exec.dynamic.partition=true')
        hiveConnect.execute('set hive.exec.dynamic.partition.mode=nostrick')
        hiveConnect.execute(insert_orc_sql)
        hiveConnect.close()

    def CreateConnectHive(self):
        conn = hive.Connection(host=self.hive_ip, port=self.hive_port, username=self.hive_user,
                               database=self.hive_database)
        cursor = conn.cursor()
        log.info(cursor)
        return cursor


if __name__ == "__main__":

    FTPIP = const.FTPIP
    FTPUSERNAME = const.FTPUSERNAME
    FTPPASSWORD = const.FTPPASSWORD
    FTPPORT = const.FTPPORT

    FTP_DIR = const.FTP_DIR
    FTP_LOCAL_DIR = const.FTP_LOCAL_DIR

    # 实例化
    ftpinstance = FTP_OPS(FTPIP, FTPPORT, FTPUSERNAME, FTPPASSWORD)
    # 创建ftp连接
    ftp = ftpinstance.ftp_connect()
    # 切换ftp目录
    ftp.cwd(FTP_DIR)
    # 获取目录下的文件
    fileLists = ftp.nlst()
    # print(fileLists)
    for file in fileLists:
        ftp_file_path = FTP_DIR + file  # ftp文件绝对路径,例:/20191222_110003_00_00_00_0_20191222234500_00.csv
        dst_file_path = FTP_LOCAL_DIR + '/' + file  # 本地文件下载路径,例:/Users/renyuanhai/PycharmProjects/FTP_CSV/20191222_110003_00_00_00_0_20191222234500_00.csv
        print('ftp_file_path:', ftp_file_path)
        print('dst_file_path:', dst_file_path)
        # 判断文件是否存在
        if -1 != ftpinstance.existsOrNor(ftp_file_path, dst_file_path):
            # 文件存在则开始下载
            ftpinstance.download_file(ftp_file_path, dst_file_path)
        # ftpinstance.download_file(FTP_DIR, FTP_LOCAL_DIR)

    hive_ip = const.HIVEIP
    hive_port = const.HIVEPORT
    hive_user = const.HIVEUSERNAME
    hive_database = const.HIVEDATABASE
    interface = const.INTERFACE

    hive_ops = HIVE_OPS(hive_ip, hive_port, hive_user, hive_database)
    file = '20191222_010003_00_00_00_0.csv'
    # file = '20191222_E01001_00_00_00_0.csv'
    # 解析本地文件
    tableName, tableDate = hive_ops.parse_mapping(file, interface)
    localFile = '/Users/renyuanhai/PycharmProjects/FTP_CSV/20191222_010003_00_00_00_0.csv'

    tableDate = tableDate[0:4] + '-' + tableDate[4:6] + '-' + tableDate[6:]
    print(tableName, tableDate)

    hdfs_path = const.HDFS_PATH
    # 本地文件 load 至 支持 csv 格式加载的临时表中
    # hive.upload_hive(localFile, tableName, hdfs_path)

    configure_path = const.CONFIGURE_PATH
    print('configure_path:', configure_path)
    hive_ops.create_temp_table(configure_path, hive_database, tableName, tableDate)
