#!/usr/bin/env python
# -*- coding: utf-8 -*-
# hive util with hive server2
from impala.dbapi import connect
import time

class impalaClient:
    def __init__(self, db_host, port, authMechanism, database, kbservice):
        self.conn = connect(host=db_host,
                            port=port,auth_mechanism=authMechanism,database=database,kerberos_service_name=kbservice)

    def query(self, sql):
        with self.conn.cursor() as cursor:
            cursor.execute(sql)
            # return cursor.fetchall()

    def close(self):
        self.conn.close()

if __name__ == '__main__':
    conn_starttime = time.time()
    impala_client = impalaClient(db_host='cdh04.irc.com', port=21051, authMechanism='GSSAPI', database='default', kbservice='impala')
    conn_endtime = time.time()
    conn_dtime = conn_endtime - conn_starttime
    print("连接impala运行时间：%.8s s" % conn_dtime)

    # INVALIDATE METADATA;                   //重新加载所有库中的所有表
    # INVALIDATE METADATA [table]            //重新加载指定的某个表
    # REFRESH [table]                             //刷新某个表
    # REFRESH [table] PARTITION [partition]       //刷新某个表的某个分区

    sql1_starttime = time.time()
    sql1 = "INVALIDATE METADATA"
    result1 = impala_client.query(sql1)
    sql1_endtime = time.time()
    sql1_dtime = sql1_endtime - sql1_starttime
    print("INVALIDATE METADATA运行时间：%.8s s" % sql1_dtime)

    sql2_starttime = time.time()
    sql2 = "INVALIDATE METADATA bmnc_pmart.T98_DEC_PASGR_PERIOD_ST"
    result2 = impala_client.query(sql2)
    sql2_endtime = time.time()
    sql2_dtime = sql2_endtime - sql2_starttime
    print("INVALIDATE METADATA bmnc_pmart.T98_DEC_PASGR_PERIOD_ST运行时间：%.8s s" % sql2_dtime)

    sql3_starttime = time.time()
    sql3 = "REFRESH bmnc_pmart.T98_DEC_PASGR_PERIOD_ST"
    result3 = impala_client.query(sql3)
    sql3_endtime = time.time()
    sql3_dtime = sql3_endtime - sql3_starttime
    print("REFRESH bmnc_pmart.T98_DEC_PASGR_PERIOD_ST运行时间：%.8s s" % sql3_dtime)

    sql4_starttime = time.time()
    sql4 = "REFRESH bmnc_pmart.T98_DEC_PASGR_PERIOD_ST PARTITION (data_dt='2020-05-31',data_stat_std_cd='1')"
    result4 = impala_client.query(sql4)
    sql4_endtime = time.time()
    sql4_dtime = sql4_endtime - sql4_starttime
    print("REFRESH bmnc_pmart.T98_DEC_PASGR_PERIOD_ST PARTITION (data_dt='2020-05-31',data_stat_std_cd='1')运行时间：%.8s s" % sql4_dtime)

    close_starttime = time.time()
    impala_client.close()
    close_endtime = time.time()
    close_dtime = close_endtime - close_starttime
    print("关闭impala运行时间：%.8s s" % close_dtime)