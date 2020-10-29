# -*- coding: utf-8 -*-
"""
    @Author  : Wangwenzhe
    @Time    : 2020/07/02
    @Comment : 将 ftp 中的 xml 文件解析并转换为 CSV 和 CHK 文件，并上传至 FTP 服务器
"""
from xml.dom.minidom import parse
import csv
from ftplib import FTP
from ftplib import error_perm

import socket
import os
import time
import sys
import math
import re
import datetime

from constant import const, log


class FtpOps(object):
    """
    ftp文件操作
    """

    def __init__(self, ftp_ip, ftp_port, ftp_user, ftp_pwd):
        self.ftp_ip = ftp_ip
        self.ftp_port = ftp_port
        self.ftp_user = ftp_user
        self.ftp_pwd = ftp_pwd

    def ftp_connect(self):
        """
        连接ftp
        :return:
        """
        socket.setdefaulttimeout(60)  # 超时FTP时间设置为60秒
        ftp = FTP()
        ftp.connect(host=self.ftp_ip, port=self.ftp_port)
        # ftp.set_debuglevel(2)  # 开启调试模式
        ftp.encoding = 'utf-8'

        try:
            ftp.login(self.ftp_user, self.ftp_pwd)
            log.info('[{}]login ftp {}'.format(self.ftp_user, ftp.getwelcome()))  # 打印欢迎信息
            # print('[{}]login ftp {}'.format(self.ftp_user, ftp.getwelcome()))  # 打印欢迎信息

        except(socket.error, socket.gaierror):  # ftp 连接错误
            log.error("ERROR: cannot connect [{}:{}]".format(self.ftp_ip, self.ftp_port))
            # print("ERROR: cannot connect [{}:{}]".format(self.ftp_ip, self.ftp_port))
            return None

        except error_perm:  # 用户登录认证错误
            log.error("ERROR: user Authentication failed ")
            # print("ERROR: user Authentication failed ")
            return None
        except Exception as e:
            log.error(str(e))
            return None
        return ftp

    def progressbar(self, cur, total):
        """
        进度条显示
        cur表示当前的数值，total表示总的数值。
        :param cur:
        :param total:
        :return:
        """
        percent = '{:.2%}'.format(cur / total)

        sys.stdout.write('\r')
        sys.stdout.write('[%-50s] %s' % ('=' * int(math.floor(cur * 50 / total)), percent))
        sys.stdout.flush()
        if cur == total:
            sys.stdout.write('\n')

    def download_file(self, ftp, ftp_file_path, dst_file_path):
        """
        从ftp下载文件到本地
        :param ftp: ftp连接
        :param ftp_file_path: ftp下载文件路径
        :param dst_file_path: 本地存放路径
        :return:
        """
        if os.path.exists(dst_file_path):
            os.remove(dst_file_path)

        buffer_size = 10240  # 默认是8192
        log.info(ftp.getwelcome())  # 显示登录ftp信息
        # print(ftp.getwelcome())  # 显示登录ftp信息

        # 将传输模式改为二进制模式 ,避免提示 ftplib.error_perm: 550 SIZE not allowed in ASCII
        ftp.voidcmd('TYPE I')
        remote_file_size = ftp.size(ftp_file_path)  # 文件总大小 , 远程告警

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
            log.info('keep alive cmd success')
            # print('keep alive cmd success')
            ftp.voidresp()
            log.info('No loop cmd')
            # print('No loop cmd')
            conn.close()
            # ftp.quit()
        except Exception as e:
            pass
            log.error(str(e))
        finally:
            f.close()
            end = time.time()
            log.info('consume time: %.2f s' % (end - start))
            # print('consume time: %.2f s' % (end - start))
            file_size = os.stat(dst_file_path).st_size
            log.info('local filesize: %.2f MB' % (file_size / 1024 / 1024))
            # print('local filesize: %.2f MB' % (file_size / 1024 / 1024))

    def upload_file(self, ftp, local_file, remote_file):
        """从本地上传文件到ftp

           参数:
             local_path: 本地文件

             remote_path: 远程文件
        """
        if not os.path.isfile(local_file):
            print('%s 不存在' % local_file)
            return

        # if self.is_same_size(local_file, remote_file):
        #     self.debug_print('跳过相等的文件: %s' % local_file)
        #     return

        buf_size = 1024
        file_handler = open(local_file, 'rb')
        ftp.storbinary('STOR %s' % remote_file, file_handler, buf_size)
        file_handler.close()
        print('上传: %s' % local_file + "成功!")

    def upload_file_tree(self, local_path, remote_path):
        """从本地上传目录下多个文件到ftp
           参数:

             local_path: 本地路径

             remote_path: 远程路径
        """
        if not os.path.isdir(local_path):
            print('本地目录 %s 不存在' % local_path)
            return
        # self.ftp.cwd(remote_path)
        print('切换至远程目录: %s' % ftp.pwd())

        local_name_list = os.listdir(local_path)
        print('本地目录list: %s' % local_name_list)
        # self.debug_print('判断是否有服务器目录: %s' % os.path.isdir())

        for local_name in local_name_list:
            src = os.path.join(local_path, local_name)
            print("src路径==========" + src)
            if os.path.isdir(src):
                try:
                    ftp.mkd(local_name)
                except Exception as err:
                    print("目录已存在 %s ,具体错误描述为：%s" % (local_name, err))
                print("upload_file_tree()---> 上传目录： %s" % local_name)
                print("upload_file_tree()---> 上传src目录： %s" % src)
                self.upload_file_tree(src, local_name)
            else:
                print("upload_file_tree()---> 上传文件： %s" % local_name)
                self.upload_file(src, local_name)
        ftp.cwd("..")


def readXML(xmlfile, txtfile):
    """
    读取 XML 文件信息并写入 TXT 文件
    """
    if os.path.exists(txtfile):
        os.remove(txtfile)

    IDENTIFIER = ''
    CCH_SETTLEMENT_DATE = ''
    SOURCE_PART_ID = ''
    SOURCE_PART_NAME = ''
    TARGET_PART_ID = ''
    TARGET_PART_NAME = ''
    CCH_SETTLEMENT_DATE_TIMESTAMP = ''
    # 读取xml文件
    domTree = parse(xmlfile)
    # 文档根元素
    rootNode = domTree.documentElement
    # SUMMARY
    # print(rootNode.nodeName)

    # 读取 SUMM_RECS 信息
    SUMM_RECS_ITEM_List = rootNode.getElementsByTagName("SUMM_RECS_ITEM")

    mylog = open(txtfile, mode='w+', encoding='utf-8')

    ENTRY_List = rootNode.getElementsByTagName("ENTRY")
    # 读取 ENTRY 中公共字段信息
    for ENTRY in ENTRY_List:
        # IDENTIFIER 元素
        IDENTIFIER = ENTRY.getElementsByTagName("IDENTIFIER")[0]
        # print(IDENTIFIER.childNodes[0].data + ',', end='', file=mylog)

        # CCH_SETTLEMENT_DATE 元素
        CCH_SETTLEMENT_DATE = ENTRY.getElementsByTagName("CCH_SETTLEMENT_DATE")[0]
        CCH_SETTLEMENT_DATE_TIMESTAMP = datetime.datetime.strptime(CCH_SETTLEMENT_DATE.childNodes[0].data, '%Y-%m-%d').strftime('%Y%m%d%H:%M:%S')
        # print(CCH_SETTLEMENT_DATE.childNodes[0].data + ',', end='', file=mylog)

        # SOURCE_PART_ID 元素
        SOURCE_PART_ID = ENTRY.getElementsByTagName("SOURCE_PART_ID")[0]
        # print(SOURCE_PART_ID.childNodes[0].data + ',', end='', file=mylog)

        # SOURCE_PART_NAME 元素
        SOURCE_PART_NAME = ENTRY.getElementsByTagName("SOURCE_PART_NAME")[0]
        # print(SOURCE_PART_NAME.childNodes[0].data + ',', end='', file=mylog)

        # TARGET_PART_ID 元素
        TARGET_PART_ID = ENTRY.getElementsByTagName("TARGET_PART_ID")[0]
        # print(TARGET_PART_ID.childNodes[0].data + ',', end='', file=mylog)

        # TARGET_PART_NAME 元素
        TARGET_PART_NAME = ENTRY.getElementsByTagName("TARGET_PART_NAME")[0]
        # print(TARGET_PART_NAME.childNodes[0].data + ',', end='', file=mylog)

    # 读取 XML 字段信息
    for SUMM_RECS_ITEM in SUMM_RECS_ITEM_List:
        print(IDENTIFIER.childNodes[0].data + ',', end='', file=mylog)
        print(CCH_SETTLEMENT_DATE_TIMESTAMP + ',', end='', file=mylog)
        print(SOURCE_PART_ID.childNodes[0].data + ',', end='', file=mylog)
        print(SOURCE_PART_NAME.childNodes[0].data + ',', end='', file=mylog)
        print(TARGET_PART_ID.childNodes[0].data + ',', end='', file=mylog)
        print(TARGET_PART_NAME.childNodes[0].data + ',', end='', file=mylog)

        # SUMM_ID 元素
        SUMM_ID = SUMM_RECS_ITEM.getElementsByTagName("SUMM_ID")[0]
        print(SUMM_ID.childNodes[0].data + ',', end='', file=mylog)

        # DESTINATION_ID 元素
        DESTINATION_ID = SUMM_RECS_ITEM.getElementsByTagName("DESTINATION_ID")[0]
        print(DESTINATION_ID.childNodes[0].data + ',', end='', file=mylog)

        # SOURCE_ID 元素
        SOURCE_ID = SUMM_RECS_ITEM.getElementsByTagName("SOURCE_ID")[0]
        print(SOURCE_ID.childNodes[0].data + ',', end='', file=mylog)

        # SERVICE_ID 元素
        SERVICE_ID = SUMM_RECS_ITEM.getElementsByTagName("SERVICE_ID")[0]
        print(SERVICE_ID.childNodes[0].data + ',', end='', file=mylog)

        # ISSUER_ID 元素
        ISSUER_ID = SUMM_RECS_ITEM.getElementsByTagName("ISSUER_ID")[0]
        print(ISSUER_ID.childNodes[0].data + ',', end='', file=mylog)

        # PRODUCT_TYPE 元素
        PRODUCT_TYPE = SUMM_RECS_ITEM.getElementsByTagName("PRODUCT_TYPE")[0]
        print(PRODUCT_TYPE.childNodes[0].data + ',', end='', file=mylog)

        # DEVICE_ID 元素
        DEVICE_ID = SUMM_RECS_ITEM.getElementsByTagName("DEVICE_ID")[0]
        print(DEVICE_ID.childNodes[0].data + ',', end='', file=mylog)

        # HARDWARE_TYPE 元素
        HARDWARE_TYPE = SUMM_RECS_ITEM.getElementsByTagName("HARDWARE_TYPE")[0]
        print(HARDWARE_TYPE.childNodes[0].data + ',', end='', file=mylog)

        # TXN_TYPE 元素
        TXN_TYPE = SUMM_RECS_ITEM.getElementsByTagName("TXN_TYPE")[0]
        print(TXN_TYPE.childNodes[0].data + ',', end='', file=mylog)

        # TXN_SUB_TYPE 元素
        TXN_SUB_TYPE = SUMM_RECS_ITEM.getElementsByTagName("TXN_SUB_TYPE")[0]
        print(TXN_SUB_TYPE.childNodes[0].data + ',', end='', file=mylog)

        # PAYMENT_METHOD 元素
        PAYMENT_METHOD = SUMM_RECS_ITEM.getElementsByTagName("PAYMENT_METHOD")[0]
        print(PAYMENT_METHOD.childNodes[0].data + ',', end='', file=mylog)

        # FIN_TYPE 元素
        FIN_TYPE = SUMM_RECS_ITEM.getElementsByTagName("FIN_TYPE")[0]
        print(FIN_TYPE.childNodes[0].data + ',', end='', file=mylog)

        # GFS_VALUE 元素
        GFS_VALUE = SUMM_RECS_ITEM.getElementsByTagName("GFS_VALUE")[0]
        print(GFS_VALUE.childNodes[0].data + ',', end='', file=mylog)

        # GFS_VOLUME 元素
        GFS_VOLUME = SUMM_RECS_ITEM.getElementsByTagName("GFS_VOLUME")[0]
        print(GFS_VOLUME.childNodes[0].data + ',', end='', file=mylog)

        # NGFS_VALUE 元素
        NGFS_VALUE = SUMM_RECS_ITEM.getElementsByTagName("NGFS_VALUE")[0]
        print(NGFS_VALUE.childNodes[0].data + ',', end='', file=mylog)

        # NGFS_VOLUME 元素
        NGFS_VOLUME = SUMM_RECS_ITEM.getElementsByTagName("NGFS_VOLUME")[0]
        print(NGFS_VOLUME.childNodes[0].data + ',', end='', file=mylog)

        # RECON_DATE 元素
        RECON_DATE = SUMM_RECS_ITEM.getElementsByTagName("RECON_DATE")[0]
        RECON_DATE_TIMESTAMP = datetime.datetime.strptime(RECON_DATE.childNodes[0].data, '%Y-%m-%d').strftime('%Y%m%d%H:%M:%S')
        print(RECON_DATE_TIMESTAMP + ',', end='', file=mylog)

        # Message_Head 元素
        message_head_split = list(xmlfile.split('_')[0])
        message_head_split.append('.XML')

        message_head = ''.join(message_head_split)

        print(message_head + ',', end='', file=mylog)

        # data_dt 元素
        print(CCH_SETTLEMENT_DATE.childNodes[0].data, file=mylog)

    mylog.close()
    return mylog


def txt_to_csv(txtfile, csvfilename):
    """
    将 TXT 文件转化为 CSV 文件
    """
    if os.path.exists(csvfilename):
        os.remove(csvfilename)

    with open(csvfilename, 'w+', newline='') as csvfile:
        spamwriter = csv.writer(csvfile, dialect='excel')
        # 读要转换的txt文件，文件每行各词间以字符分隔
        with open(txtfile, 'r', encoding='utf-8') as filein:
            for line in filein:
                line_list = line.strip('\n').split(',')  # 这里的数据之间是以','间隔的
                spamwriter.writerow(line_list)


def create_chk(chk_file, csv_file):
    """
    创建 csv 对应的 chk 文件
    """
    if os.path.exists(chk_file):
        os.remove(chk_file)

    chkfile = open(chk_file, mode='w+', encoding='utf-8')

    # csv 的文件名
    print(csv_file + '\t', end='', file=chkfile)

    # csv 文件大小
    csv_file_size = os.path.getsize(csv_file)
    print(str(csv_file_size) + '\t', end='', file=chkfile)

    # csv 文件内数据行数
    with open(csv_file, 'r') as f:
        print(str(len(f.readlines())) + '\t', end='', file=chkfile)

    # csv 文件创建时间
    FtpFilePushTimeStamp = list(csv_file.split('_')[1].split('.')[0])
    FtpFilePushTime = ''.join(FtpFilePushTimeStamp)
    timeStamp = float(int(FtpFilePushTime) / 1000)
    timeArray = time.localtime(timeStamp)
    otherStyleTime = time.strftime("%Y%m%d %H:%M:%S", timeArray)
    print(otherStyleTime, end='', file=chkfile)

    # FtpFilePushTime = os.path.getmtime(csv_file)
    #
    # timeArray = time.localtime(FtpFilePushTime)
    # otherStyleTime = time.strftime("%Y%m%d %H:%M:%S", timeArray)
    # print(otherStyleTime + '\t', end='', file=chkfile)

    chkfile.close()
    return chkfile


if __name__ == '__main__':
    txt_to_csv('./8008820090600100201879','1.csv')

    # # FTP 配置
    # host = const.FTPIP
    # ftpuname = const.FTPUSERNAME
    # ftppwd = const.FTPPASSWORD
    # port = const.FTPPORT
    # ftp_dir = const.FTP_DIR
    # local_dir = const.LOCAL_DIR
    #
    # # 创建ftp连接
    # ftpinstance = FtpOps(host, port, ftpuname, ftppwd)
    # ftp = ftpinstance.ftp_connect()
    #
    # while True:
    #     try:
    #         # 切换目录
    #         ftp.cwd(ftp_dir)
    #         # 获取文件目录
    #         fileLists = ftp.nlst()
    #         # 列出所有 xml 格式文件
    #         for xml_file in fileLists:
    #             if re.search(r".xml", xml_file):
    #                 ftp_xmlfile_path = ftp_dir + xml_file
    #                 dst_xmlfile_path = local_dir + '/' + xml_file
    #
    #                 # 下载 xml 文件至当前路径
    #                 ftpinstance.download_file(ftp, ftp_xmlfile_path, dst_xmlfile_path)
    #
    #                 # 设置 CSV 和 CHK 文件名
    #
    #                 xml_file_name_replace = xml_file.replace('_', '.')
    #                 xml_file_name = xml_file_name_replace.split('.')[2]+'_010016_00_00_00_0_'+time.strftime('%Y%m%d%H%M%S',time.localtime(int(xml_file_name_replace.split('.')[3])/1000))+'.xml'
    #                 print(xml_file_name)
    #
    #                 csv_file = re.sub("xml", "csv", xml_file_name)
    #                 txt_file = re.sub("xml", "txt", xml_file_name)
    #                 chk_file = re.sub("xml", "chk", xml_file_name)
    #
    #                 print(csv_file)
    #                 print(txt_file)
    #                 print(chk_file)
    #
    #                 # xml_file = 'RECON.41.20200617_1592438434410.xml'
    #                 # 20200823_110001_00_00_00_0_20200823214501_67.chk
    #                 # txt_file = 'RECON.41.20200617_1592438434410.txt'
    #                 # csv_file = 'RECON.41.20200617_1592438434410.csv'
    #                 # chk_file = 'RECON.41.20200617_1592438434410.chk'
    #
    #                 # # 将 xml 文件解析并生成 CSV 和 CHK 文件
    #                 readXML(xml_file, txt_file)
    #                 txt_to_csv(txt_file, csv_file)
    #                 create_chk(chk_file, csv_file)
    #
    #                 # 将生成的 CSV 和 CHK 文件上传至 FTP 服务器中
    #                 ftpinstance.upload_file(ftp, csv_file, ftp_dir + csv_file)
    #                 ftpinstance.upload_file(ftp, chk_file, ftp_dir + chk_file)
    #
    #                 # 将已处理过的 xml 文件移至备份文件夹内
    #                 ftp.rename(ftp_dir + xml_file, ftp_dir + 'd/' + xml_file)
    #
    #                 # 移除本地生成的文件
    #                 os.remove(local_dir + '/' + txt_file)
    #                 os.remove(local_dir + '/' + xml_file)
    #                 os.remove(local_dir + '/' + csv_file)
    #                 os.remove(local_dir + '/' + chk_file)
    #
    #     except Exception as e:
    #         log.error(str(e))
    #
    #     time.sleep(5)
