#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Time    : 2020/8/12 11:29
# @Author  : Wangwenzhe
# @Site    :
# @File    : set_WF_finish_date.py
# @Software: PyCharm

import sys
import redis

"""
    workflow执行成功后，
    将workflow状态设置为finish，写入Redis中，
    并写入workflow执行的账期
    
    name:WorkFlowName:Finish
    key:txdate
    value:'YYYY-MM-DD'
"""

# 传入参数，连接 Redis
paralist = sys.argv
RedisInstance = redis.Redis(host=paralist[1], port=6379, db=0, decode_responses=True)
# RedisInstance = redis.Redis(host='localhost', port=6379, db=0, decode_responses=True)

# 获取此工作流所依赖的账期参数
txdate = RedisInstance.hget('SYS:AUTO:WORKFLOW1:PARAMETER', 'txdate')

RedisInstance.hset('WF_LX_ACC_T70_OD:Finish', 'txdate', txdate)
RedisInstance.hset('WF_LX_ACC_T98_OD_ROUTE:Finish', 'txdate', txdate)

# 工作流完成后，向 Redis 写入执行成功信息并传递账期参数
# set_finish_date = RedisInstance.hset('WF_LX_ACC_T70_OD:Finish', 'txdate', txdate)
# set_finish_date = RedisInstance.hset('WF_LX_ACC_T98_OD_ROUTE:Finish', 'txdate', txdate)
# set_finish_date = RedisInstance.hset('WF_LX_TCC_TRAIN_SCHEDULE:Finish', 'txdate', txdate)
# set_finish_date = RedisInstance.hset('WF_LX_ACC_T98_PASGER_BASIC:Finish', 'txdate', txdate)
# set_finish_date = RedisInstance.hset('WF_LX_ACC_T98_PASGER:Finish', 'txdate', txdate)
# set_finish_date = RedisInstance.hset('WF_LX_ACC_T98_OD_ENTRY:Finish', 'txdate', txdate)
# set_finish_date = RedisInstance.hset('WF_LX_ACC_T98_OD_EXIT:Finish', 'txdate', txdate)
# set_finish_date = RedisInstance.hset('WF_LX_ACC_T98_OD_NET:Finish', 'txdate', txdate)
# set_finish_date = RedisInstance.hset('WF_LX_ACC_T98_OD_LINE:Finish', 'txdate', txdate)
# set_finish_date = RedisInstance.hset('WF_LX_ACC_T98_OD_TRANSFER:Finish', 'txdate', txdate)
# set_finish_date = RedisInstance.hset('WF_LX_ACC_T98_IMBALANCE:Finish', 'txdate', txdate)

# 设置此 K-V 对的过期时间
RedisInstance.expire('WF_LX_ACC_T70_OD:Finish', 240)
RedisInstance.expire('WF_LX_ACC_T98_OD_ROUTE:Finish', 240)
# RedisInstance.expire('WF_LX_TCC_TRAIN_SCHEDULE:Finish', 3600)
# RedisInstance.expire('WF_LX_ACC_T98_PASGER_BASIC:Finish', 3600)
# RedisInstance.expire('WF_LX_ACC_T98_PASGER:Finish', 3600)
# RedisInstance.expire('WF_LX_ACC_T98_OD_ENTRY:Finish', 3600)
# RedisInstance.expire('WF_LX_ACC_T98_OD_EXIT:Finish', 3600)
# RedisInstance.expire('WF_LX_ACC_T98_OD_NET:Finish', 3600)
# RedisInstance.expire('WF_LX_ACC_T98_OD_LINE:Finish', 3600)
# RedisInstance.expire('WF_LX_ACC_T98_OD_TRANSFER:Finish', 3600)
# RedisInstance.expire('WF_LX_ACC_T98_IMBALANCE:Finish', 3600)

all_key = RedisInstance.keys('*')
print(all_key)

# 关闭 Redis 连接
RedisInstance.close()
