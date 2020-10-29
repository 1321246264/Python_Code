#!/usr/bin/env python
# -*- coding: utf-8 -*-

import sys

from impala.dbapi import connect

'''
因不确定需要刷新的表名，故需在列表中提前输入要刷新的表名
例：'BMNC_PMART.T98_DEC_PASGR_PERIOD_ST','BMNC_PMART.T98_OD_ROUTE_DD'
'''

TableName_List = ['BMNC_PMART.T98_DEC_PASGR_PERIOD_ST', 'BMNC_PMART.T98_OD_ROUTE_DD',
                  'BMNC_PMART.T98_NET_RSCNT_PCNT_DISTR_ST', 'BMNC_PMART.T98_NET_RMNT_PCNT_DISTR_ST']


class impalaClient:
    def __init__(self, db_host, port, authMechanism, database, kbservice):
        self.conn = connect(host=db_host,
                            port=port, auth_mechanism=authMechanism, database=database, kerberos_service_name=kbservice)

    def query(self, sql):
        with self.conn.cursor() as cursor:
            cursor.execute(sql)
            # return cursor.fetchall()

    def close(self):
        self.conn.close()


if __name__ == '__main__':
    paralist = sys.argv
    impala_client = impalaClient(db_host=paralist[1], port=int(paralist[2]), authMechanism='GSSAPI', database='default',
                                 kbservice='impala')

    for TableName in TableName_List:
        try:
            impala_client.query("REFRESH %s" % TableName)
            print("REFRESH %s success" % TableName)
        except Exception as e:
            print(e)

    impala_client.close()

