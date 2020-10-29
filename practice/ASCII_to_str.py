#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Time    : 2020/9/21 10:29
# @Author  : Wangwenzhe
# @Site    : 
# @File    : ASCII_to_str.py
# @Software: PyCharm

# ord方法：将字符转为ASCII，chr方法：将ASCII转为字符，重点是两个数之和为155
a = input()
for i in a:
    if 'A' < 'Z':
        print(chr(155 - ord(i)), end='')
    else:
        print(i, end='')

# -------------------------------------------8
num = input()
for i in range(len(num)):
    if (num[i] >= 'A') and (num[i] <= 'Z'):
        print(chr(155 - ord(num[i])), end="")
    else:
        print(num[i], end="")
