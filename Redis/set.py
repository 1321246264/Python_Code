# coding=utf-8
import sys

import redis


class CRedis:
    def __init__(self, redis_host, redis_port, redis_db):
        self.r = redis.Redis(host=redis_host, port=redis_port, db=redis_db)

    # 1. strings 类型及操作
    # 设置 key 对应的值为 string 类型的 value
    def set(self, key, value):
        return self.r.set(key, value)

    # 设置 key 对应的值为 string 类型的 value。如果 key 已经存在,返回 0,nx 是 not exist 的意思
    def setnx(self, key, value):
        return self.r.setnx(key, value)

    # 设置 key 对应的值为 string 类型的 value,并指定此键值对应的有效期
    def setex(self, key, time, value):
        return self.r.setex(key, time, value)

    # 设置指定 key 的 value 值的子字符串
    # setrange name 8 gmail.com
    # 其中的 8 是指从下标为 8(包含 8)的字符开始替换
    def setrange(self, key, num, value):
        return self.r.setrange(key, num, value)

    # 获取指定 key 的 value 值的子字符串
    def getrange(self, key, start, end):
        return self.r.getrange(key, start, end)

    # mget(list)
    def get(self, key):
        if isinstance(key, list):
            return self.r.mget(key)
        else:
            return self.r.get(key)

    def lget(self, key):
        if isinstance(key, list):
            return self.r.hget(key)
        else:
            return self.r.get(key)

    # 删除
    def remove(self, key):
        return self.r.delete(key)

    # 自增
    def incr(self, key, default=1):
        if (1 == default):
            return self.r.incr(key)
        else:
            return self.r.incr(key, default)

    # 自减
    def decr(self, key, default=1):
        if (1 == default):
            return self.r.decr(key)
        else:
            return self.r.decr(key, default)

    # 2. hashes 类型及操作
    # 根据txdate获取session信息
    def hget(self, key):
        return self.r.hget(key,'txdate')

    # 以txdate作为唯一标识，增加用户session
    def hset(self, key, content):
        return self.r.hset(key, 'txdate', content)

    # 获取session哈希表中的所有数据
    def hgetall(self):
        return self.r.hgetall('SYS:AUTO:WORKFLOW1:PARAMETER')




if __name__ == '__main__':
    # paralist = sys.argv
    # con = CRedis(paralist[1], int(paralist[2]), 0)
    con = CRedis('localhost', 6379, 0)

    # t = con.setex('SYS:AUTO:WORKFLOW1:PARAMETER', 10, 'txdate')
    a = con.hset('SYS:AUTO:WORKFLOW1:PARAMETER', '2020-02-02')
    # a = con.hset('MANUAL:1:WORKFLOW2:PARAMETER', '2020-02-02')
    b = con.hget('SYS:AUTO:WORKFLOW1:PARAMETER')
    c = con.hgetall()
    print(b)
    print(c)

