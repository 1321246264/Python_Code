#!/usr/bin/python
# -*- coding: UTF-8 -*-
import MySQLdb
import os

import pymysql


class MysqlServer(object):
    def __init__(self, host, port, user, password, db, charset):
        self.__create_connection = None
        self.host = host
        self.port = port
        self.user = user
        self.password = password
        self.db = db
        self.charset = charset

    def __create_connection(self):
        # 和远端mysql建立连接
        conn = pymysql.connect(host=self.host, port=self.port, user=self.user, passwd=self.password, db=self.db,
                               charset=self.charset)
        cursor = conn.cursor()
        return cursor

    def commit(self, conn):
        conn.commit()
        conn.close()

    def close(self, cursor):
        # 关闭连接
        cursor.close()

    def read(self, cursor):
        f = open('D:\\ftpd\\20191222_110011_00_00_00_0_20191222170434_00.chk', "r", encoding='utf-8')
        while True:
            # 逐行读取
            line = f.readlines()
            if line:
                # 处理每行\n
                line = "".join(line)
                line = line.split("\t")
                content0 = line[0]
                content1 = line[1]
                content2 = line[2]
                content3 = line[3]
                content_s = content0.split("_")
                content4 = content_s[0]
                content5 = content_s[1]
                content6 = content_s[2]
                content7 = content_s[3]
                content8 = content_s[4]
                content9 = content_s[5]
                content10 = content_s[6]
                content_ss = content10.split(".")
                content11 = content_ss[0]
                cursor.execute(
                    "insert into wwz(a,b,c,d,e,f,g,h,i,j,k,l) values(%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s)",
                    [content0, content1, content2, content3, content4, content5, content6, content7, content8, content9,
                     content10, content11])
            else:
                break

        f.close()


def main():
    host = 'localhost',
    port = 3306,
    user = 'root',
    passwd = 'root',
    db = 'test',
    charset = 'utf8',

    mysql = MysqlServer(host, port, user, passwd, db, charset)
    
    mysqlc = mysql.__create_connection


if __name__ == "__main__":
    main()
