#!/usr/bin/env python
# -*- coding:utf-8 -*-
# @Time    : 2020/6/5 9:17 上午
# @Author  : Ryh
# @Email   : 1327253700@qq.com
# @File    : LocalCSVToHive.py
# @Software: PyCharm

import os

a = os.system('hdfs dfs -ls /user/hive/warehouse/bmnc_sdata_temp.db/trn_actual_sch/z_20200805_120036_00_01_00_0_20200805070000_04.dat')
b = os.system('hdfs dfs -ls /user/hive/warehouse/bmnc_sdata_temp.db/trn_actual_sch/z_20200805_120036_00_01_00_0_20200805070000_04_copy_1.dat')
print(type(a))
print(a)
print(a==0)
print(type(b))
print(b)
print(b==0)