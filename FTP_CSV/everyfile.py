# -*- coding: UTF-8 -*-

from ftplib import FTP

import os

import re

ftp = FTP()

ftp.connect('10.254.61.15',21)

ftp.login('ftpuser', 'ftpuser')

Server_path = "/"

Client_path="D:\\ftpd"

sum1 = 0

sum2 = 0

value = 0

FTP_Dir_l = []

Ftp_file_l = []

#遍历获取FTP 上面的目录

def search_dir(start_dir):

    ftp.cwd(start_dir)

    FTP_Dir_l.append(ftp.pwd())

    dir_res = []

    ftp.dir('.', dir_res.append)  #对当前目录进行dir()，将结果放入列表


    for i in dir_res:

        if i.startswith("d"):

            global sum1

            sum1 += 1

            search_dir(ftp.pwd()+"/"+i.split(" ")[-1])

            ftp.cwd('..')

        else:

            global sum2, value

            sum2 += 1

            val = i.split(" ")[-1]

            value += ftp.size(val)

#遍历获取FTP 上面的文件

def search_file(Dir_path):

    search_dir(Dir_path)

    for Server_f_l in FTP_Dir_l:

        file_list = ftp.nlst(Server_f_l)

    for Server_file in file_list:

            if Server_file not in FTP_Dir_l:

                Ftp_file_l.append(Server_file) #将文件添加到列表

    print(len(Ftp_file_l))
    for s in Ftp_file_l:
        if re.search(r".chk", s):
            print(s)


#遍历获取FTP 上面的文件

search_file(Server_path)

print(search_file)


#检测本地目录是否存在

os.chdir(Client_path)

for local_dir in FTP_Dir_l:

    if os.path.isdir(local_dir.split(Server_path,1)[-1]):

        print(local_dir)

    else:

        print(local_dir)
