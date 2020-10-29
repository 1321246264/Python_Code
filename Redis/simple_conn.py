import time

import redis

r = redis.Redis(host='localhost', port=6379, db=0, decode_responses=True)

# list = (1, 2, 3, 4)

# r.hset('aa','txdate',list)

class ss(object):
    def aa(self) :
        print('1')


# r.flushall()

txdate = '2020-02-02'

# 获取此工作流所依赖的账期参数
# txdate = RedisInstance.hget('SYS:AUTO:WORKFLOW1:PARAMETER', 'txdate')


# r.setex('WF_LX_ACC_T70_OD:txdate:%s' % txdate, 1200, 'Finish')
# r.setex('WF_LX_ACC_T98_OD_ROUTE:txdate:%s' % txdate, 1200, 'Finish')

# print(r.get('WF_LX_ACC_T70_OD:txdate:2020-02-02'))

c = r.keys('*')
print(c)


# r.flushall()

# r.hset('SYS:AUTO:WORKFLOW1:PARAMETER','txdate','2020-03-22')
# r.hset('SYS:AUTO:WORKFLOW2:PARAMETER','txdate','2020-03-22')
# r.hset('SYS:AUTO:WORKFLOW3:PARAMETER','txdate','2020-03-22')
# r.hset('SYS:AUTO:WORKFLOW4:PARAMETER','txdate','2020-03-22')
# r.hset('SYS:AUTO:WORKFLOW5:PARAMETER','txdate','2020-03-22')
# r.hset('SYS:AUTO:WORKFLOW6:PARAMETER','txdate','2020-03-22')
# r.hset('SYS:AUTO:WORKFLOW7:PARAMETER','txdate','2020-03-22')
# r.hset('SYS:AUTO:WORKFLOW8:PARAMETER','txdate','2020-03-22')


# r.hset('WORKFLOW1:Finish','txdate','2020-03-22')
# r.hset('WORKFLOW2:Finish','txdate','2020-03-22')
# r.hset('WORKFLOW3:Finish','txdate','2020-03-22')
# r.hset('WORKFLOW4:Finish','txdate','2020-03-22')
# r.hset('WORKFLOW5:Finish','txdate','2020-03-22')
# r.hset('WORKFLOW6:Finish','txdate','2020-03-22')
# r.hset('WORKFLOW7:Finish','txdate','2020-03-22')
# r.hset('WORKFLOW8:Finish','txdate','2020-03-22')
# r.hset('WORKFLOW9:Finish','txdate','2020-03-22')
# r.hset('WORKFLOW10:Finish','txdate','2020-03-22')


# r.hset('22','txdate','2020-04-22')
# r.hset('222','txdate','2020-05-22')
# r.hset('2222','txdate','2020-06-22')

# set_finish_date = r.hset('SYS:AUTO:WORKFLOW1:PARAMETER', 'txdate', '2020-08-13')

# set_finish_date1 = RedisInstance.hset('WORKFLOW10:Finish', 'txdate', txdate)


# RedisInstance.expire('WORKFLOW10:Finish', 10)
# RedisInstance.expire('WORKFLOW1:Finish', 10)
# print(r.ttl('WORKFLOW10:Finish'))
# print(r.ttl('WORKFLOW1:Finish'))
# print(r.ttl('WORKFLOW2:Finish'))
# print(r.hget('WORKFLOW10:Finish', 'txdate'))
# print(r.hget('WORKFLOW1:Finish', 'txdate'))
# print(r.hget('WORKFLOW2:Finish', 'txdate'))


# 获取所有 key
# t = r.setex('SYS:AUTO:WORKFLOW1:PARAMETER1', 10, 'txdate')
# c=r.keys('*')
# print(c)
# mapping = {'tx':'v1', 'tx1': 'v2'}
# g=r.hset('SYS:AUTO:WORKFLOW1:PARAMETER','txdate','2020-08-12')
# # gg=r.hset('SYS:AUTO:WORKFLOW1:PARAMETER1','tx','2',mapping)
# d=r.hget('SYS:AUTO:WORKFLOW1:PARAMETER1','tx')
#
# qq=r.hset('SYS:AUTO:WORKFLOW1:PARAMETER2','tx',d)
# # g=r.hmset('SYS:AUTO:WORKFLOW1:PARAMETER1',mapping)
# ww=r.hget('SYS:AUTO:WORKFLOW1:PARAMETER2','tx')
# # e=r.hget('info','name')
# # f=r.type('SYS:AUTO:WORKFLOW1:PARAMETER1')
# print(d)
# # print(e)
# # print(f)
# print(g)
# print(qq)
# print(ww)

# print(r.close())
# r.close()


# 获取指定 key 的 value
# r.hset(name='info',key='name',value='gwb')
# r.hset("123456", "attr_1", 100)
# b=r.hgetall('SYS:AUTO:WORKFLOW1:PARAMETER')
# d=r.hgetall('123456')
# e=r.hgetall('session')
#

# time.sleep(9)
#
# tt=r.keys('*')
# print(tt)

#
# print(b)
# print(d)
# print(e)

# 删除 key，返回删除的个数
# res = r.delete('1')
