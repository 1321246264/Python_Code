#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Time    : 2020/9/15 14:59
# @Author  : Wangwenzhe
# @Site    : 
# @File    : t3.py
# @Software: PyCharm
import csv
import os


def merge_csv(txtfile_path, csvfilename):
    """
    合并多个 CSV 文件
    此方法适用于舍弃每个 CSV 文件的首行（字段名）
    """
    # if os.path.exists(csvfilename):
    #     os.remove(csvfilename)

    with open(csvfilename, 'w+', newline='') as csvfile:
        spamwriter = csv.writer(csvfile, dialect='excel')
        for root, dirs, files in os.walk(txtfile_path):

            # root 表示当前正在访问的文件夹路径
            # dirs 表示该文件夹下的子目录名list
            # files 表示该文件夹下的文件list

            # 遍历文件
            for txtfile in files:

                # 读要转换的txt文件，文件每行各词间以字符分隔
                with open(txtfile_path + txtfile, 'r', encoding='utf-8') as filein:
                    next(filein)
                    for line in filein:
                        line_list = line.strip('\n').split(',')  # 这里的数据之间是以','间隔的
                        spamwriter.writerow(line_list)


if __name__ == '__main__':
    for i in range(20200904,20200915):
        # print(i)
        merge_csv('/home/operator/datatom/FtpToHive/data/numcsv/'+str(i)+'/XJCX/', '/home/operator/datatom/FtpToHive/data/numcsv/' + str(i)+'_XJCX_00000000.csv')
        # merge_csv('/home/operator/datatom/FtpToHive/data/numcsv/%s/GPDD/', '/home/operator/datatom/FtpToHive/data/numcsv/' + '%s_GPDD_00000000.csv') % (i, i)