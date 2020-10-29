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
from conf.settings import const
from utils.log import csvFileName

interfaceId = csvFileName.split('_')[1]  # 获取 ftp 接口文件ID


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
            ,dst_file_path: 本地文件下载路径,例:/Users/renyuanhai/PycharmProjects/FTP_CSV/20191222_110003_00_00_00_0_20191222234500_00.csv
    """
    # ftp文件路径
    FTP_DIR = paralist[1]
    # ftp文件名称
    csvFileName = paralist[2]
    # ftp文件下载至本地路径
    FTP_LOCAL_DIR = const.FTP_LOCAL_DIR
    # 近线文件名中排除后缀名.csv部分以下划线分隔倒数第二位至倒数第一位的内容(包括下划线_)长度为17以此区分是否近线加载
    File_DtimeSeq = csvFileName.split('.')[0].split('_')[-2] + '_' + csvFileName.split('.')[0].split('_')[
        -1]  # 近线文件名 20191222_110003_00_00_00_0_20191222234500_00.csv 正常文件名 20191222_019911_00_00_00_0.csv
    # 临时表表名后缀,以此防止近线1分钟传输一次导致表名重复数据覆盖,去除脏数据
    TempTableSuffix = csvFileName.split('.')[0]

    ftp_file_path = FTP_DIR + csvFileName  # ftp文件绝对路径,例:/20191222_110003_00_00_00_0_20191222234500_00.csv
    dst_file_path = FTP_LOCAL_DIR + '/' + csvFileName  # 本地文件下载路径,例:/Users/renyuanhai/PycharmProjects/FTP_CSV/20191222_110003_00_00_00_0_20191222234500_00.csv
    return csvFileName, File_DtimeSeq, TempTableSuffix, ftp_file_path, dst_file_path
