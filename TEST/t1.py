import os
import time
c = 0
b = 0
for root, dirs, files in os.walk('C:\\Users\\EDZ\\Desktop\\newjiekou\\82\\09'):

    # root 表示当前正在访问的文件夹路径
    # dirs 表示该文件夹下的子目录名list
    # files 表示该文件夹下的文件list

    # 遍历文件
    for txtfile in files:
        print(txtfile)
        print('C:\\Users\\EDZ\\Desktop\\newjiekou\\82\\09\\'+txtfile)
        c = c+1

        # 读要转换的txt文件，文件每行各词间以字符分隔
        # csv 文件内数据行数
        with open('C:\\Users\\EDZ\\Desktop\\newjiekou\\82\\09\\'+txtfile, 'r') as f:
            aa = len(f.readlines())-1
            print('you'+str(aa))
            b = b + aa
    print('zonggong' + str(b))
    print(c)



not_running_list = (
    '080001', '080002', '080003', '080004', '080005', '080006', '080007', '080008', '070001',
    '070003', '070004', '070008', '070009')
# a = '20200828_090003_00_00_00_0.chk'
#
#
#
# print(a.split(".")[-1])
#
# if a.split("-")[-1] == 'chk':
#     print('1')
# else:
#     print('2')

for not_running in not_running_list:
    print("python3 scan_chk.py _%s_" % not_running)

b = '12345678'

print(b[-2:])

file = '8008820090900100000779'
print(len(file))
if file[-2:] == '79':
    print(file)
    ftp_filename = file.split(".")[0]

    # 获取接口代码数
    InterfaceCode = ftp_filename.split("_")[1]
    # 声明变量
    etl_begin_time = time.strftime('%Y-%m-%d %H:%M:%S', time.localtime())
    # 获取 ftp 接口文件数据日期
    task_type = ftp_filename.split('.')[0].split('_')[0]
    if task_type == 'z' or task_type == 'q':
        tableDate = ftp_filename.split('_')[1][0:4] + '-' + ftp_filename.split('_')[1][4:6] + '-' + \
                    ftp_filename.split('_')[1][6:8]
    else:
        tableDate = ftp_filename.split('_')[0][0:4] + '-' + ftp_filename.split('_')[0][4:6] + '-' + \
                    ftp_filename.split('_')[0][6:8]

    if only_csv_fileName not in fileLists:
        if re.search(r"ACTL", file) or re.search(r"PLAN", file) or re.search(r"REAL", file):
            scan_log.info(file)
        else:
            insert_sql = "insert into %s.%s(FtpFilePath, interfaceCode, FtpFileName,  " \
                         "FtpFilePushTime, etl_job_status, etl_begin_time, txDate) values(" \
                         "'%s','%s', " \
                         "'%s', null, '%s', '%s','%s')" % (
                             mysqldb, mysqltable, ftp_dir, InterfaceCode, file,
                             new_status,
                             etl_begin_time, tableDate)
            scan_log.info("接口为 75、79、82 的语句：" + insert_sql)
            mysql.insert(insert_sql)
else:
    print('1')