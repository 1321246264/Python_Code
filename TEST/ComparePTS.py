#!/usr/bin/env python
#! -*- coding:utf-8 -*-
import pandas as pd 
from pandas.api.types import infer_dtype
from pandas.api.types import is_numeric_dtype
#from pyhive import hive
from impala.dbapi import connect
#from sqlalchemy import create_engine
import sqlalchemy
from datetime import datetime
import teradatasql
import os,sys,time
from utils import log
#from constant 
import imp
imp.reload(sys)
#sys.setdefaultencoding('utf8')

td_ip='10.254.101.198'
td_user ='hdtest'
td_password ='hdtest'
td_db='bmnc_sdata'
hive_ip='cdh04.irc.com'
hive_db='bmnc_sdata'
def compareRandom(td_ip,td_user,td_password,td_db,hive_ip,hive_db):
    #在TD数据中随机抽取n%,放入df_td
    log.info("程序开始时间:{0}".format(datetime.now()))
    conn_td= teradatasql.connect ('{"host":"%s","user":"%s","password":"%s","database":"%s"}' % (td_ip, td_user, td_password,td_db))
    #tablename="bmnc_pdata.t80_train_modify" 
    tablename=sys.argv[1]
    #dtdate="20200714"
    dtdate=sys.argv[2]
    try:
        coefficient=sys.argv[3]
    except:
        coefficient=0.001
    
    
    partitioncol="data_dt" 
    td_date=dtdate
    hive_date=datetime.strptime(dtdate, '%Y%m%d').strftime('%Y-%m-%d')
    #判断是否是源层表
    tablename_td=tablename+dtdate
    cursor_td=conn_td.cursor()
    log.info("连接TD成功")
    
    sqlstr="select count(*) as num from {0} ".format(tablename_td) 
      
    log.info(sqlstr)
    cursor_td.execute(sqlstr)
    totalnum_n=cursor_td.fetchall()
    totalnum=totalnum_n[0][0]
    print(totalnum)
    log.info("获取TD数据总量为:%s"%(totalnum))
    randomnum=int(totalnum*float(coefficient))
    log.info("获取TD 随机n数据量为:%s" % (randomnum))
    #整理TD字段顺序与Hive分区后一致
    sqlstr="help table {0}".format(tablename_td)
    cursor_td.execute(sqlstr)
    t=cursor_td.fetchall()
    tcols=[]
    std=0
    for j in t:
        if j[0].rstrip().lower()=='data_stat_std_cd' or j[0].rstrip().lower()=='data_dt':
            if j[0].rstrip().lower()=='data_stat_std_cd':
                std=1
            continue
        tcols.append(j[0].rstrip().lower())
    if std==1:
        tcols.append("data_stat_std_cd")
    f=','.join(tcols)
    
    sqlstr="select {0} from {1}  sample {2}".format(f,tablename_td,randomnum)
   
    cursor_td.execute(sqlstr)
    df_td=pd.DataFrame(cursor_td.fetchall(),columns=tcols)
    log.info("将TD n%输入计入df_td")
    #log.info(df_td.columns)
    #获取Hive的全量数据放入df_hive
    #conn_hive=connect(host=hive_ip, port=21050)
    conn =connect(host='cdh04.irc.com',port=21051,database='bmnc_sdata',auth_mechanism= 'GSSAPI',kerberos_service_name='impala')
    #engine=create_engine("impala://cdh04.irc.com:21051", connect_args={"auth_mechanism": "GSSAPI"})
    engine=sqlalchemy.create_engine("impala://", creator=conn)
    #conn_hive=hive.Connection( host=hive_ip,port=10000,username='hive',database='default',auth='NONE')
    #cursor_hive=conn_hive.cursor()
    log.info("连接Hive成功")
    #impala刷新表
    #hstr="refresh {0}".format(tablename)
    #    pd.read_sql_query(hstr,engine)
    #except:
    #    print('refresh')
    #hive数据量
    hstr="select count(*) as num from {0} where {1}='{2}' ".format(tablename,partitioncol,hive_date)
    
    log.info(hstr)
    n=pd.read_sql(hstr,engine)
    hivetotal=n.at[0,'num']
    #log.info(n)
    #hstr="desc {0}".format(tablename)
    hstr="describe {0}".format(tablename)
    #cursor_hive.execute(hstr)
    #d=cursor_hive.fetchall()
    log.info(hstr)
    d=pd.read_sql(hstr,engine)
    #log.info(d)
    cols=[]
    for i in d.iloc[:,0]:
        #if i[0]==partitioncol:
        if i=="":
            break
        cols.append(i)
    #log.info("数据字段:%s" %(cols))
    
    hstr="select * from {0} where {1}='{2}'".format(tablename,partitioncol,hive_date)
    
    #cursor_hive.execute(hstr)
    #df_hive=pd.DataFrame(cursor_hive.fetchall(),columns=cols)
    log.info(hstr)
    df_hive=pd.DataFrame()    
    #lst=[]
    for chunk in pd.read_sql(hstr,engine,chunksize=20000):
        #lst=lst.append(chunk)
        df_hive=df_hive.append(chunk)
        del chunk
    #df_hive=pd.concat(lst,ignore_index=True)
    log.info("将Hive值输入计入df_hive")
    #log.info(cols) 
    #log.info(df_hive)
    #log.info(df_hive.columns)
    df_hive = df_hive.rename(columns=dict(zip(list(df_hive.columns), list(cols))))  
    #df_hive=df_hive.drop(columns=['data_dt'])
    df_hive.drop('data_dt',axis=1,inplace=True)
    #df_td = df_td.rename(columns=dict(zip(list(df_td.columns), list(df_hive.columns))))
    log.info("字段同步到Hive中")
    #去除两个dataframe的空格
    df_td_cp = df_td.replace({r"\s": ""}, regex=True)
    df_hive_cp = df_hive.replace({r"\s": ""}, regex=True)
    log.info("去除数据空格")
    
    #同步两个dataframe的数据类型

    for ltype in tcols:
        if infer_dtype(df_hive_cp[ltype]) in ('decimal', 'integer', 'floating'):      
            df_td_cp[ltype]=df_td_cp[ltype].astype(float)
            df_hive_cp[ltype]=df_hive_cp[ltype].astype(float)
        
        else:
           df_td_cp[ltype]=df_td_cp[ltype].astype(str)
           df_hive_cp[ltype]=df_hive_cp[ltype].astype(str)
    #log.info(df_td_cp)
    #创建两个dataframe序列的索引
    df_td_cp['tmp']=df_td_cp[tcols].agg(lambda x: tuple(x), axis=1)
    df_hive_cp['tmp']=df_hive_cp[tcols].agg(lambda x: tuple(x), axis=1) # pd.Series(pd.Index(df_hive_cp))
    log.info("创建数据索引")
    #比对两个dataframe的差异
    log.info("执行数据比对")
    df_result=df_td_cp['tmp'].isin(df_hive_cp['tmp'])
    #在比对结果中检索FALSE项
    log.info(df_result)
    #log.info(df_td[cols[0]])
    pd.set_option('max_colwidth',1000)
    log.info(df_hive_cp['tmp'])
    countdiff=totalnum-hivetotal
    log.info("TD数据量为{0} and Hive数据量为{1},数据量差异{2}".format(totalnum,hivetotal,countdiff))
    print("数据量差异:%s" % (countdiff))
    result_list=df_result.values.tolist()
    if False in result_list:
        print("数据不完全匹配!")
        log.info("数据不完全匹配")
        log.info("不一致数据所在的首位置{0}".format(result_list.index(False)))
        log.info("首个不一致数据值:{0}".format(df_td_cp.at[result_list.index(False),'tmp']))
    else:
        print("{0}条数据完全匹配!".format(randomnum))
        log.info("{0}条数据完全匹配!".format(randomnum))
    cursor_td.close()
    #cursor_hive.close()
    conn_td.close()
    engine.dispose()
    #conn_hive.close()
    log.info("程序结束时间:{0}".format(datetime.now()))
if __name__ == '__main__':
    compareRandom(td_ip,td_user,td_password,td_db,hive_ip,hive_db)