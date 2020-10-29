import csv
import os

# os.remove("./11.csv")
#
# csvFile = open("./11.csv",'w',newline='',encoding='utf-8')
# writer = csv.writer(csvFile)
# csvRow = []
#
# f = open("1.txt",'r',encoding='utf-8')
# for line in f:
#     writer.writerow(csvRow)
#
# f.close()
# csvFile.close()


'''

把txt文件转化为csv文件
'''
# -*-coding:utf-8 -*-

import csv
try:
    os.remove("./22.csv")
except Exception as e:
    print(e)

with open('22.csv', 'w+', newline='') as csvfile:
    spamwriter = csv.writer(csvfile, dialect='excel')
    # 读要转换的txt文件，文件每行各词间以字符分隔
    with open('11.txt', 'r', encoding='utf-8') as filein:
        for line in filein:
            line_list = line.strip('\n').split(',')   #我这里的数据之间是以 ; 间隔的
            spamwriter.writerow(line_list)

