#!/usr/bin/env python
# -*- coding:utf-8 -*-
# @Time    : 2020/7/15 4:56 下午
# @Author  : Ryh
# @Email   : 1327253700@qq.com
# @File    : log.py
# @Software: PyCharm

"""
功能介绍:日志工具类
"""

import logging
import sys
import time
import os.path

paralist = sys.argv
csvFileName = paralist[2]


def log():
    """
    指定保存日志的文件路径、日志级别、以及调用文件
        将日志存入到指定的文件中,log文件目录结构:项目名/log/日期/文件名去掉.文件类型 + .log
    """
    # 创建一个logger
    logger = logging.getLogger()
    logger.setLevel(logging.DEBUG)  # 设置日志等级为DEBUG

    # 创建日志名称
    rq = time.strftime('%Y%m%d', time.localtime(time.time()))

    # os.getcwd()获取当前文件的路径,os.path.dirname()获取指定文件路径的上级路径
    path_dir = os.path.dirname(__file__)
    log_path = os.path.abspath(os.path.dirname(path_dir)) + '/log/' + rq
    log_name = os.path.join(log_path, csvFileName.split('.')[0] + '.log')

    if not os.path.exists(log_path):
        os.system("mkdir -p %s" % log_path)

    # 创建一个handler,用于写入日志文件
    fh = logging.FileHandler(log_name, mode='a')  # 将日志输出到磁盘文件上
    fh.setLevel(logging.INFO)  # 设置日志等级为INFO

    # 再创建一个handler,用于输出到控制台
    ch = logging.StreamHandler()
    ch.setLevel(logging.INFO)

    # 定义handler的输出格式
    formatter = logging.Formatter('%(asctime)s - %(name)s - %(levelname)s - %(message)s')
    fh.setFormatter(formatter)
    ch.setFormatter(formatter)

    # 给logger添加handler
    logger.addHandler(fh)
    logger.addHandler(ch)

    return logger


log = log()
