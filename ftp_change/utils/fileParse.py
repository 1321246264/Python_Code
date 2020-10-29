#!/usr/bin/env python
# -*- coding:utf-8 -*-
# @Time    : 2020/7/17 11:48 上午
# @Author  : Ryh
# @Email   : 1327253700@qq.com
# @File    : fileParse.py
# @Software: PyCharm

"""
功能介绍:文件解析
"""
import codecs
import os
import time

from conf.settings import const
from utils.log import log


def fileNameParse(paralist):
    """
    根据传入的list解析文件名,返回所需的对应信息
        执行此程序命令 python3 LocalCSVToHive.py / 20191222_110003_00_00_00_0_20191222234500_00.csv
        例:paralist = ['LocalCSVToHive.py', '/', '20191222_110003_00_00_00_0_20191222234500_00.csv']
    :param paralist:
    :return:csvFileName: csv文件名
            ,File_DtimeSeq: csv文件时间戳及序号,例:20191222234500_00
            ,TempTableSuffix: hive临时表后缀名、由于近线csv文件为几分钟传输一次故将hive临时表加上后缀名避免脏数据,例:20191222_110003_00_00_00_0_20191222234500_00
            ,ftp_file_path: ftp文件绝对路径,例:/20191222_110003_00_00_00_0_20191222234500_00.csv
            ,dst_file_path: 本地文件下载路径,例:/Users/renyuanhai/PycharmProjects/FTP_CSV/temp/20191222_110003_00_00_00_0_20191222234500_00.csv
    """
    # ftp文件路径
    FTP_DIR = paralist[1]
    # ftp文件名称
    csvFileName = paralist[2]
    # 获取 ftp 接口文件ID
    if csvFileName.split('.')[0].split('_')[0] == 'q' or csvFileName.split('.')[0].split('_')[0] == 'z':
        interfaceId = csvFileName.split('_')[2]
    elif csvFileName.split('.')[0].split('_')[0] == 'ACTL' or csvFileName.split('.')[0].split('_')[0] == 'PLAN' or \
            csvFileName.split('.')[0].split('_')[0] == 'REAL':
        interfaceId = csvFileName.split('_')[0]
    else:
        interfaceId = csvFileName.split('_')[1]
    # ftp文件下载至本地路径
    FTP_LOCAL_DIR = const.FTP_LOCAL_DIR
    # 近线文件名中排除后缀名.csv部分以下划线分隔倒数第二位至倒数第一位的内容(包括下划线_)长度为17以此区分是否近线加载
    File_DtimeSeq = csvFileName.split('.')[0].split('_')[-2] + '_' + csvFileName.split('.')[0].split('_')[
        -1]  # 近线文件名 20191222_110003_00_00_00_0_20191222234500_00.csv 正常文件名 20191222_019911_00_00_00_0.csv
    # 临时表表名后缀,以此防止近线1分钟传输一次导致表名重复数据覆盖,去除脏数据
    TempTableSuffix = csvFileName.split('.')[0]

    ftp_file_path = FTP_DIR + csvFileName  # ftp文件绝对路径,例:/20191222_110003_00_00_00_0_20191222234500_00.csv
    dst_file_path = FTP_LOCAL_DIR + '/temp/' + csvFileName  # 本地文件下载路径,例:/Users/renyuanhai/PycharmProjects/FTP_CSV/20191222_110003_00_00_00_0_20191222234500_00.csv
    return csvFileName, interfaceId, File_DtimeSeq, TempTableSuffix, ftp_file_path, dst_file_path


def handle_encoding(original_file):
    """
    文件编码格式转换为UTF8
    :param original_file: 文件路径 + 原始文件
    :return:
    """
    newfile = original_file + 'bak'
    f = open(original_file, 'rb+')
    content = f.read()  # 读取文件内容，content为bytes类型，而非string类型
    source_encoding = 'utf-8'
    # 确定encoding类型
    try:
        content.decode('utf-8').encode('utf-8')
        source_encoding = 'utf-8'
    except:
        try:
            content.decode('gbk').encode('utf-8')
            source_encoding = 'gbk'
        except:
            try:
                content.decode('gb2312').encode('utf-8')
                source_encoding = 'gb2312'
            except:
                try:
                    content.decode('gb18030').encode('utf-8')
                    source_encoding = 'gb18030'
                except:
                    try:
                        content.decode('big5').encode('utf-8')
                        source_encoding = 'gb18030'
                    except:
                        content.decode('cp936').encode('utf-8')
                        source_encoding = 'cp936'
    f.close()

    if os.path.exists(newfile):  # 文件标识
        log.info('the bak file already exists in local dir')
        # 本地文件存在则删除
        os.remove(newfile)
        log.info('本地bak文件已存在该文件进行删除')

    # 按照确定的encoding读取文件内容，并另存为utf-8编码：
    block_size = 4096
    with codecs.open(original_file, 'r', source_encoding) as f:
        with codecs.open(newfile, 'w', 'utf-8') as f2:
            while True:
                content = f.read(block_size)
                if not content:
                    break
                f2.write(content)

    os.rename(newfile, original_file)  # 将处理过后的文件覆盖原文件


def special_document_processing(original_file):
    """
    特殊文件处理(接口ID:B01006  表名:TRAVEL_LINK)
    :param original_file: 文件路径
    :return:
    """
    newfile = original_file + 'bak'
    f = open(original_file, 'rb+')
    content = f.read()  # 读取文件内容，content为bytes类型，而非string类型
    source_encoding = 'utf-8'
    # 确定encoding类型
    try:
        content.decode('utf-8').encode('utf-8')
        source_encoding = 'utf-8'
    except:
        try:
            content.decode('gbk').encode('utf-8')
            source_encoding = 'gbk'
        except:
            try:
                content.decode('gb2312').encode('utf-8')
                source_encoding = 'gb2312'
            except:
                try:
                    content.decode('gb18030').encode('utf-8')
                    source_encoding = 'gb18030'
                except:
                    try:
                        content.decode('big5').encode('utf-8')
                        source_encoding = 'gb18030'
                    except:
                        content.decode('cp936').encode('utf-8')
                        source_encoding = 'cp936'
    f.close()
    if os.path.exists(newfile):
        log.info('the bak file already exists in local dir')
        # 本地文件存在则删除
        os.remove(newfile)
        log.info('本地bak文件已存在该文件进行删除')
    with codecs.open(original_file, 'r', source_encoding) as f:
        with codecs.open(newfile, 'w', 'utf-8') as f2:
            while True:
                line = f.readline()
                if line:
                    special_str = '&'
                    if special_str in line:
                        # 对行数据进行拆分合并处理
                        if len(line.split(special_str)) > 1:
                            CARD_ISSUER_ID = line.split(special_str)[0].split(',')[0]
                            line_list = []  # 行数据拆分后集合
                            even_digit = []  # 偶数位集合
                            odd_digit = []  # 奇数位集合
                            for i in line.split(special_str)[::2]:
                                even_digit.append(i.strip(','))
                            for j in line.split(special_str)[1::2]:
                                odd_digit.append(j.strip(','))
                            linkId = CARD_ISSUER_ID + line.split(special_str)[0].split(',')[6]
                            for i in range(len(even_digit)):
                                if i == 0:
                                    appendStr = linkId + ',' + CARD_ISSUER_ID + ',' + str(i + 1) + ',' + \
                                                ','.join(even_digit[i].split(',')[1:]) + \
                                                ',' + ','.join(odd_digit[i].split(',')[1:])
                                    line_list.append(appendStr)
                                else:
                                    appendStr = linkId + ',' + CARD_ISSUER_ID + ',' + str(i + 1) + ',' + \
                                                ','.join(even_digit[i].split(',')) + \
                                                ',' + ','.join(odd_digit[i].split(',')[1:])
                                    line_list.append(appendStr)
                            f2.write('\n'.join(line_list))
                else:
                    break
    os.rename(newfile, original_file)  # 将处理过后的文件覆盖原文件


def add_rec_seq_to_file(original_file):
    """
    在csv格式的数据文件中每行末尾添加自增主键序号(对应REC_SEQ字段)
    :param original_file:
    :return:
    """
    begin_time = time.time()
    newfile = original_file + 'bak'
    f = open(original_file, 'rb+')
    content = f.read()  # 读取文件内容，content为bytes类型，而非string类型
    source_encoding = 'utf-8'
    # 确定encoding类型
    try:
        content.decode('utf-8').encode('utf-8')
        source_encoding = 'utf-8'
    except:
        try:
            content.decode('gbk').encode('utf-8')
            source_encoding = 'gbk'
        except:
            try:
                content.decode('gb2312').encode('utf-8')
                source_encoding = 'gb2312'
            except:
                try:
                    content.decode('gb18030').encode('utf-8')
                    source_encoding = 'gb18030'
                except:
                    try:
                        content.decode('big5').encode('utf-8')
                        source_encoding = 'gb18030'
                    except:
                        content.decode('cp936').encode('utf-8')
                        source_encoding = 'cp936'
    f.close()
    if os.path.exists(newfile):
        log.info('bak文件存在进行删除:' + newfile)
        os.remove(newfile)
    with codecs.open(original_file, 'r', source_encoding) as f:
        with codecs.open(newfile, 'w', 'utf-8') as f2:
            add_num = 1
            while True:
                line = f.readline()
                if line:
                    new_line = line.replace('\r\n', '\n').replace('\n', '') + ',' + str(add_num) + '\n'
                    # new_line = line.replace('\n','') + ',' + str(add_num) + '\n'
                    f2.write(new_line)
                    add_num += 1
                else:
                    break
    consuming_time = time.time() - begin_time
    log.info("Add REC_SEQ consumed: %.03f seconds." % consuming_time)
    os.rename(newfile, original_file)  # 将处理过后的文件覆盖原文件
