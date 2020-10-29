#!/usr/bin/env python
# -*- coding:utf-8 -*-

from __future__ import division

import sys
from ftplib import FTP
from ftplib import error_perm

import socket

from constant import const

"""
ftp下载

1、遍历目录
2、下载完成标识文件
    --文件备份周期，备份库七天删除一次
3、接口表名映射
4、文件ftp未存储，取不到，告警
5、数据加载到表中
6、保存最近七天的数据
7、已下载文件管理
8、校验




tips:
1、权限
2、python函数需在调用之前声明
3、类方法默认有一个 self 参数
"""

ftp_dir = "/"
ftp_bak_dir = "/back/"


class FTP_OPS(object):
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
            print('[{}]login ftp {}'.format(self.ftp_user, ftp.getwelcome()))  # 打印欢迎信息

        except(socket.error, socket.gaierror):  # ftp 连接错误
            print("ERROR: cannot connect [{}:{}]".format(self.ftp_ip, self.ftp_port))
            return None

        except error_perm:  # 用户登录认证错误
            print("ERROR: user Authentication failed ")
            return None
        except Exception as e:
            print(e)
            return None
        return ftp


if __name__ == '__main__':
    # constant
    host = const.FTPIP
    ftpuname = const.FTPUSERNAME
    ftppwd = const.FTPPASSWORD
    port = const.FTPPORT

    # instance
    ftpinstance = FTP_OPS(host, port, ftpuname, ftppwd)

    #
    ftp = ftpinstance.ftp_connect()

    paralist = sys.argv

    csv_file = paralist[1]
    chk_file = paralist[2]

    ftp.rename(ftp_dir + csv_file, ftp_bak_dir + csv_file)
    ftp.rename(ftp_dir + chk_file, ftp_bak_dir + chk_file)
