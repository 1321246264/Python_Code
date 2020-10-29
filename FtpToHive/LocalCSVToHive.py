#!/usr/bin/env python
# -*- coding:utf-8 -*-
# @Time    : 2020/6/5 9:17 上午
# @Author  : Ryh
# @Email   : 1327253700@qq.com
# @File    : LocalCSVToHive.py
# @Software: PyCharm

import traceback
from utils.hive import *
from utils.ftp import *
from utils.mysql import InsertUpdateLog, searchInterfaceCodeData
from utils import fileParse

'''
功能介绍:ftp下载

tips:
1、权限
2、python函数在调用之前需要声明
3、累方法默认有一个 self 参数
'''


def ftp_ops():
    """
    FTP CSV文件下载至本地部分逻辑
    """
    # 创建ftp连接
    # ftp = ftp_connect()
    # 切换ftp目录
    ftp.cwd(FTP_DIR)
    # 获取目录下的文件
    fileSize = ftp.size(ftp_file_path)

    if -1 == existsOrNor(ftp_file_path, dst_file_path):
        # 本地文件存在则删除
        os.remove(dst_file_path)
        log.info('本地已存在该文件进行删除')

    # 插入etl任务执行状态日志
    mysql.InsertUpdateLog(FTP_DIR, csvFileName, FtpFileSize, FtpFileRecordNumber, FtpFilePushTime, tableName, tableDate,
                          tableCount, const.ETL_LOG_DOWNLOAD, '', etlPid)
    if fileSize <= 300 * 1024 * 1024:
        log.info('小文件单线程 ftp 文件下载')
        # 暂定小于 300MB 的文件为小文件直接单线程 ftp 文件下载
        download_file(ftp_file_path, dst_file_path)  # 单线程 ftp 文件下载
    else:
        log.info('大文件多线程 ftp 文件下载')
        # 暂定大于 300MB 的文件为大文件多线程 ftp 文件下载
        setupThreads(ftp_file_path, dst_file_path, 20)  # 多线程下载,暂固定20个线程
        mergerFile(dst_file_path, 20)  # 将多线程生成的线程数文件合并为一个,并清除临时文件
    # 单线程 ftp chk文件下载
    download_file(FTP_DIR + chkFileName, dst_file_path)
    ftp.quit()
    if csvFileName.split('.')[1] == 'tar':
        tarCommand = 'tar -zxvf %s' % (csvFileName)
        os.system(tarCommand)


def localToHive():
    """
    本地CSV文件put及load至hive正式表对应账期
    """
    tableCount = 0  # hive数据加载分区记录数
    if task_type == 'z' or task_type == 'q':
        tableDate = csvFileName.split('_')[1][0:4] + '-' + csvFileName.split('_')[1][4:6] + '-' + \
                    csvFileName.split('_')[1][6:]  # 获取 ftp 接口文件数据日期
    else:
        tableDate = csvFileName.split('_')[0][0:4] + '-' + csvFileName.split('_')[0][4:6] + '-' + \
                    csvFileName.split('_')[0][6:]  # 获取 ftp 接口文件数据日期
    # csv文件加载
    # 插入etl任务执行状态日志
    InsertUpdateLog(FTP_DIR, csvFileName, FtpFileSize, FtpFileRecordNumber, FtpFilePushTime, tableName,
                    tableDate, tableCount, const.ETL_LOG_UPLOAD, '', etlPid)
    tempToFormalDataTable(dst_file_path, hive_database, csvFileName, tableName, tableDate, TempTableSuffix,
                          File_DtimeSeq, hdfs_path, category, interfaceId)
    # csv文件加载至hive正式表分区数据记录条数
    tableCount = HivePartitionRecordNumber(tableName, tableDate, File_DtimeSeq, category)
    # 数据加载完毕清除临时表
    HiveDropTempTable(hive_database, tableName, TempTableSuffix, category)
    # hive 数据加载部分结束,断开hive连接
    hiveConnect.close()
    # 插入hive etl日志
    HiveInsertEtlLog(etl_system, tableName, tableDate, description, csvFileName, processTime, File_DtimeSeq, category)
    # etl任务执行完毕插入mysql etl日志
    InsertUpdateLog(FTP_DIR, csvFileName, FtpFileSize, FtpFileRecordNumber, FtpFilePushTime, tableName, tableDate,
                    tableCount, const.ETL_LOG_SUCCESS, '', etlPid)

def mv_local_file():
    # etl过程结束备份本地ftp文件
    # 将 csv 文件迁移至备份目录
    if csvFileName.split('.')[1] == 'tar':
        createFolder = 'mkdir -p %s' % (paralist[3])
        moveFile = 'mv %s %s' % (csvFileName.split('.')[0] + '.tar.gz', paralist[3])
        clearFile = 'rm -r %s' % (csvFileName.split('.')[0] + '.*')
    elif task_type == 'z' or task_type == 'q':
        createFolder = 'mkdir -p %s' % (paralist[3])
        moveFile = 'mv %s %s' % (csvFileName, paralist[3])
    else:
        createFolder = 'mkdir -p %s' % (paralist[3])
        moveFile = 'mv %s %s' % (csvFileName, paralist[3])
    log.info(createFolder)
    log.info(moveFile)
    os.system(createFolder)
    os.system(moveFile)
    # 移动 chk 文件
    movechkFile = 'mv %s %s' % (chkFileName, paralist[3])
    log.info(movechkFile)
    os.system(movechkFile)

    fromname = str(paralist[1] + paralist[2])
    toname = str(const.FTP_BAK_DIR + paralist[2])
    chkfromname = str(paralist[1] + chkFileName)
    chktoname = str(const.FTP_BAK_DIR + chkFileName)
    log.info('移动 ftp 数据文件' + fromname + toname)
    ftp.rename(fromname, toname)

    log.info('移动 ftp chk文件' + chkfromname + chktoname)
    ftp.rename(chkfromname, chktoname)

    if csvFileName.split('.')[1] == 'tar':
        log.info(clearFile)
        os.system(clearFile)

def file_handle():
    '''
    当传入的是一个不需要处理的文件时,直接移动文件并退出程序
    :return:
    '''
    if paralist[2].split('.')[0].split('_')[2] == '120037':
        ftp.cwd(FTP_DIR)
        # 获取目录下的文件
        fileSize = ftp.size(ftp_file_path)

        if -1 == existsOrNor(ftp_file_path, dst_file_path):
            # 本地文件存在则删除
            os.remove(dst_file_path)
            log.info('本地已存在该文件进行删除')
        if fileSize <= 300 * 1024 * 1024:
            log.info('小文件单线程 ftp 文件下载')
            # 暂定小于 300MB 的文件为小文件直接单线程 ftp 文件下载
            download_file(ftp_file_path, dst_file_path)  # 单线程 ftp 文件下载
        else:
            log.info('大文件多线程 ftp 文件下载')
            # 暂定大于 300MB 的文件为大文件多线程 ftp 文件下载
            setupThreads(ftp_file_path, dst_file_path, 20)  # 多线程下载,暂固定20个线程
            mergerFile(dst_file_path, 20)  # 将多线程生成的线程数文件合并为一个,并清除临时文件
        download_file(FTP_DIR + chkFileName, dst_file_path)  # 单线程 ftp 文件下载
        ftp.quit()
        mv_local_file() # 移动本地文件
        sys.exit()


if __name__ == "__main__":

    TaskStartTime = time.time()  # 接口程序开始执行时间

    # 声明变量
    FTP_DIR = ''  # ftp文件路径
    csvFileName = ''  # ftp文件名
    FtpFilePushTime = time.strftime('%Y-%m-%d %H:%M:%S', time.localtime())  # ftp文件上传时间
    FtpFileSize = 0  # ftp文件大小
    FtpFileRecordNumber = 0  # ftp文件记录条数
    tableName = ''  # hive表名
    tableDate = ''  # hive数据加载分区
    tableCount = 0  # hive数据加载分区记录数
    # 获取当前进程的 pid
    etlPid = os.getpid()
    processTime = time.strftime('%Y-%m-%d %H:%M:%S', time.localtime())  # 接口程序开始处理的时间

    try:
        # 根据执行脚本传入的list信息,解析得到 csv文件名、csv文件时间戳及序号、hive临时表后缀名、ftp文件绝对路径、dst_file_path
        csvFileName, interfaceId, File_DtimeSeq, TempTableSuffix, ftp_file_path, dst_file_path = fileParse.fileNameParse(paralist)
        task_type = csvFileName.split('.')[0].split('_')[0]  # 用来判断execl的文件名,如果是z_开头则是增量,需要用外部表,不断累加hdfs路径下文件来使加载至正式表时的REC_SEQ正确
        if csvFileName.split('.')[-1] == 'dat':
            chkFileName = csvFileName.split('.')[0] + '.chk'
        elif csvFileName.split('.')[-1] == 'csv':
            chkFileName = csvFileName.split('.')[0] + '.chk'
        elif csvFileName.split('.')[-1] == 'gz':
            chkFileName = csvFileName + '.chk'
        file_handle()   # 判断文件是否需要处理
        ftp_ops()
        if csvFileName.split('.')[1] == 'tar':
            csvFileName = csvFileName.split('.')[0] + '.csv'
            dst_file_path = os.getcwd() + '/' + csvFileName
        # hive连接信息
        hive_database = const.HIVEDATABASE
        # hdfs 文件存放位置配置信息
        hdfs_path = const.HDFS_PATH
        # 根据csv文件接口ID解析得到 etl系统、etl任务、任务类型、描述、接口ID、表名
        etl_system, etl_job, category, description, interfaceCode, tableName = searchInterfaceCodeData(interfaceId)
        localToHive()
        # 移动本地文件
        mv_local_file()
    except Exception as e:
        # 获取报错信息
        etl_job_error_log = 'Error: ' + traceback.format_exc()
        # etl任务执行失败插入mysql etl日志
        mysql.InsertUpdateLog(FTP_DIR, csvFileName, FtpFileSize, FtpFileRecordNumber, FtpFilePushTime, tableName,
                              tableDate, tableCount, const.ETL_LOG_ERROR, etl_job_error_log, etlPid)
        log.error(etl_job_error_log)

    TaskEndTime = time.time()  # 接口程序开始处理的时间
    log.info('Time consuming task: %.2f s' % (TaskEndTime - TaskStartTime))
    log.info('程序本次运行结束' + '\n\n\n\n\n\n')
