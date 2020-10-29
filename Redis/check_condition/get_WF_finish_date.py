#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Time    : 2020/8/12 15:24
# @Author  : Wangwenzhe
# @Site    : 
# @File    : get_WF_finish_date.py
# @Software: PyCharm

import sys
import time

import redis
from collections import defaultdict

"""
    获取workflow状态为finish的账期

    name:WorkFlowName:Finish
    key:txdate
    value:'YYYY-MM-DD'
"""

# 定义工作量的依赖关系
WorkFlow_dict = defaultdict(list)
# T98 基础客流(含启动检查)
WorkFlow_dict["WF_LX_ACC_T98_PASGER_BASIC"].append('WF_LX_ACC_T70_OD:Finish')  # T70加工层_离线
WorkFlow_dict["WF_LX_ACC_T98_PASGER_BASIC"].append('WF_LX_ACC_T98_OD_ROUTE:Finish')  # T98 OD加工层_离线
# T98 满载率报表（含启动检查）
WorkFlow_dict["WF_LX_ACC_T98_SECT_FCRATE"].append('WF_LX_TCC_TRAIN_SCHEDULE:Finish')  # TCC_列车运行图源数据_离线
WorkFlow_dict["WF_LX_ACC_T98_SECT_FCRATE"].append('WF_LX_ACC_T98_PASGER_BASIC:Finish')  # T98 基础客流(含启动检查)
# T98 后续报表
WorkFlow_dict["WF_LX_ACC_T98_DELAY_RPT"].append('WF_LX_ACC_T98_PASGER:Finish')  # T98 客运量
WorkFlow_dict["WF_LX_ACC_T98_DELAY_RPT"].append('WF_LX_ACC_T98_OD_ENTRY:Finish')  # T98 OD进站报表
WorkFlow_dict["WF_LX_ACC_T98_DELAY_RPT"].append('WF_LX_ACC_T98_OD_EXIT:Finish')  # T98 OD出站报表
WorkFlow_dict["WF_LX_ACC_T98_DELAY_RPT"].append('WF_LX_ACC_T98_OD_NET:Finish')  # T98 OD路网级报表
WorkFlow_dict["WF_LX_ACC_T98_DELAY_RPT"].append('WF_LX_ACC_T98_OD_LINE:Finish')  # T98 OD线路级报表
WorkFlow_dict["WF_LX_ACC_T98_DELAY_RPT"].append('WF_LX_ACC_T98_OD_TRANSFER:Finish')  # T98 换乘类报表
WorkFlow_dict["WF_LX_ACC_T98_DELAY_RPT"].append('WF_LX_ACC_T98_IMBALANCE:Finish')  # T98 不均衡系报表

# print(WorkFlow_dict.keys())
# print(WorkFlow_dict)

# 传入参数，连接 Redis
paralist = sys.argv
RedisInstance = redis.Redis(host=paralist[1], port=6379, db=0, decode_responses=True)

# 程序开始时间
starttime = time.time()

praevia_list = []

if paralist[2] in WorkFlow_dict:
    workflow_list = WorkFlow_dict.get(paralist[2])
    for workflow in workflow_list:

        while True:
            praevia_list.append(RedisInstance.hget(workflow, 'txdate'))
            all_keys = RedisInstance.keys('*Finish')
            # print(praevia_list)
            # print(type(all_keys))
            if set(all_keys) >= set(praevia_list):
                print('All the advance tasks have been completed')
                RedisInstance.close()
                sys.exit(0)
            else:
                endtime = time.time()
                # if endtime-starttime >= 7200:
                if endtime - starttime >= 600:
                    print('The wait time has expired')
                    RedisInstance.close()
                    sys.exit(1)
                print('There are pending tasks')
                time.sleep(5)
else:
    print("The WorkFlow is not exits!")
    sys.exit(1)
