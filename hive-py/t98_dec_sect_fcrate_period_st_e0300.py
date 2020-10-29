#!/usr/bin/env python
# -*- coding:utf-8 -*-

#######################################################################
## 测试人  ：王文哲
## 测试日期：${hiveconf:TXDATE}='2020-04-13'  
## 测试数据：灾备库
## --------------------------------------------------------------------------
## 简要信息：追加
## 源    表: T98_SECT_FCRATE_PERIOD_ST
## 目 标 表: T98_DEC_SECT_FCRATE_PERIOD_ST
## 业务说明：非整点断面满载率时段统计
## 版    本: 2020-02-24 桑英灿
## 执行频率: DAY
## Modify history list:Created by  yuxx  at 2014-04-16 v1.0
## Modified by  chenshangbo at 2014-08-12
## 1)增加望京东特殊处理
## Modified by chenshangbo at 2014-12-18
## 1)增加大屯路东特殊处理
## --------------------------------------------------------------------------
#######################################################################

import datetime
import importlib
import sys

from pyhive import hive

importlib.reload(sys)


def CreateConnectHive():
    try:
        conn = hive.Connection(host='10.254.52.68', port=10000, username='hive', database='default')
        cursor = conn.cursor()
        print('hive connect successful')
        return cursor
    except Exception as e:
        print('hive connect failed!')


def Choice(yesterday):
    sql_01 = '''
  SELECT txdate PLAN_TXDATE,last_job_status PLAN_STATUS,last_start_time
  FROM BMNC_DEVOPS.ETL_JOB_LATEST_V 
  WHERE TRIM(etl_job) = 'TCC_PLAN' 
  AND TRIM(last_job_status) = 'Done'
  AND TRIM(txdate) = '${hiveconf:TXDATE}' 
  ORDER BY last_start_time DESC
  LIMIT 1
  '''

    sql_02 = '''
  SELECT txdate REAL_TXDATE,last_job_status REAL_STATUS,last_start_time
  FROM BMNC_DEVOPS.ETL_JOB_LATEST_V 
  WHERE TRIM(etl_job) = 'TCC_REAL' 
  AND TRIM(last_job_status) IN ('Done','Failed','Pending')
  AND txdate = '${hiveconf:TXDATE}'
  ORDER BY last_start_time DESC
  LIMIT 1
  '''

    sql_01 = sql_01.replace('${hiveconf:TXDATE}', yesterday)
    sql_02 = sql_02.replace('${hiveconf:TXDATE}', yesterday)

    # 获取hive客户端并连接
    try:
        sqlContext = CreateConnectHive()
        print('connect to hive successful !!!')
        print('sql_02')
        # sqlContext.execute(sql_02)
        # cursor.fetchall()是list类型
        # 在python中False,0,'',[],{},()都可以视为假
        sqlContext.execute(sql_02)
        job_list = sqlContext.fetchall()
        if len(job_list):
            for result in job_list:
                print(result[0])
                print(result[1])
                REAL_STATUS = result[1]
                if (REAL_STATUS != 'Done'):
                    print('BMNC_SDATA.TCC_REAL%s账期任务状态非Done,退出程序' % yesterday)
                elif REAL_STATUS == 'Done':
                    print('REAL_STATUS 值为Done跳转至FLAG2逻辑部分')
                    FLAG2(yesterday)
        else:
            print('BMNC_SDATA.TCC_REAL%s账期暂无数据,跳转至FLAG1逻辑部分' % yesterday)
            FLAG1(yesterday)
        sqlContext.close()
        print
        '脚本执行完毕,退出程序'
    except Exception as e:
        print('Choice failed !!!')


def FLAG1(yesterday):
    sql_01 = '''
  SELECT * FROM BMNC_SDATA.TCC_REAL
  WHERE Data_Dt = '${hiveconf:TXDATE}'
  LIMIT 10
  '''

    sql_02 = '''
  SELECT * FROM BMNC_SDATA.TCC_PLAN
  WHERE Data_Dt = '${hiveconf:TXDATE}'
  LIMIT 10
  '''

    sql_01 = sql_01.replace('${hiveconf:TXDATE}', yesterday)
    sql_02 = sql_02.replace('${hiveconf:TXDATE}', yesterday)

    # 获取hive客户端并连接
    try:
        sqlContext = CreateConnectHive()
        print('connect to hive successful !!!')
        print(sql_01)
        # sqlContext.execute(sql_01)
        # cursor.fetchall()是list类型
        # 在python中False,0,'',[],{},()都可以视为假
        sqlContext.execute(sql_01)
        REALNAME = sqlContext.fetchall()
        if len(REALNAME):
            FLAG2(yesterday)
        else:
            print(sql_02)
            sqlContext.execute(sql_02)
            PLAN_STATUS = sqlContext.fetchall()
            if len(PLAN_STATUS):
                Record_Type_Flag = 1
                work(yesterday)
            else:
                print('当日无数据，报错退出')
        sqlContext.close()
        print('脚本执行完毕,退出程序')
    except Exception as e:
        print('FLAG1 failed !!!')


def FLAG2(yesterday):
    sql_01 = '''
  SELECT txdate STAT_TXDATE,last_job_status STAT_STATUS,last_start_time
  FROM BMNC_DEVOPS.ETL_JOB_LATEST_V 
  WHERE TRIM(etl_job) = 'T40_STAT_STD_TRAIN_SCH_REAL' 
  AND TRIM(last_job_status) = 'Done'
  AND txdate = '${hiveconf:TXDATE}'
  ORDER BY last_start_time DESC
  LIMIT 1
  '''

    sql_01 = sql_01.replace('${hiveconf:TXDATE}', yesterday)

    # 获取hive客户端并连接
    try:
        sqlContext = CreateConnectHive()
        print('connect to hive successful !!!')
        print(sql_01)
        # sqlContext.execute(sql_01)
        # cursor.fetchall()是list类型
        # 在python中False,0,'',[],{},()都可以视为假
        sqlContext.execute(sql_01)
        STAT_TXDATE = sqlContext.fetchall()
        if len(STAT_TXDATE):
            Record_Type_Flag = 2
            work(yesterday)
        else:
            print('当日无数据，报错退出')
    except Exception as e:
        print('FLAG2 failed !!!')


def work(yesterday):
    sql_01 = '''
  --汇总结果存放，用于计算满载率
DROP TABLE IF EXISTS BMNC_TEMP.VT_DSECT_FCRATE_PERIOD_ST_SQ_E
  '''

    sql_02 = '''
  CREATE TABLE BMNC_TEMP.VT_DSECT_FCRATE_PERIOD_ST_SQ_E 
as select * from  BMNC_PMART.T98_DEC_SECT_FCRATE_PERIOD_ST
WHERE 1 <> 1
  '''

    sql_03 = '''
  ----赵冬杰 2014/2/26 10:17:55
--终报汇总结果存放
--终报运力用7天前的速报运力
INSERT INTO BMNC_TEMP.VT_DSECT_FCRATE_PERIOD_ST_SQ_E
SELECT 
	Stat_Dt														--统计日期
	,Dectime_Stat_Index_Cd                                      --统计索引代码
	,Stat_Index_Type_Cd                                         --统计索引类型代码
	,Section_Id                                                 --断面编号
	,Trip_Drct_Cd                                               --行车方向代码
	,Section_Trans_Capacity                                     --断面运力
	,CAST( 0  AS DECIMAL(18,2) )  Sect_Quatity                  --断面客流量
	,Data_Dt                                                    --数据日期
	,'02'		Data_Stat_Std_Cd                                --数据统计口径代码
FROM  
	BMNC_PMARTVW.T98_DEC_SECT_FCRATE_PERIOD_ST
WHERE 
	data_dt = date_sub(${hiveconf:TXDATE},7)
	AND stat_dt = date_sub(${hiveconf:TXDATE},7)
	AND TRIM(Data_Stat_Std_Cd)='01'
  '''

    sql_04 = '''
  --断面运力，从整点断面运力取数
INSERT INTO BMNC_TEMP.VT_DSECT_FCRATE_PERIOD_ST_SQ_E  
SELECT  
	A.Stat_Dt                       
	,COALESCE(B.Dectime_Stat_Index_Cd,'')  Dectime_Stat_Index_Cd
	,COALESCE(B.Stat_Index_Type_Cd,'')     Stat_Index_Type_Cd
	,A.Section_Id                    
	,A.Trip_Drct_Cd                   
	,0									Section_Trans_Capacity
	,SUM(A.Sect_Quatity)					Sect_Quatity      
	,A.Data_Dt                       
	,A.Data_Stat_Std_Cd       
FROM   
	BMNC_PMARTVW.T98_SECT_FCRATE_PERIOD_ST A
LEFT JOIN 
(
	SELECT  
		a1.Dectime_Stat_Index_Cd AS Dectime_Stat_Index_Cd
		,a1.Stat_Index_Type_Cd AS Stat_Index_Type_Cd
		,b1.Stat_Index_Cd AS Stat_Index_Cd
	FROM    
		BMNC_PCODE.T99_DECTM_CALC_STAT_INDEX_CD a1
	LEFT JOIN 
		BMNC_PCODE.T99_STAT_INDEX_CD b1
	ON
		1=1
	WHERE   
		TRIM(b1.Stat_Index_Type_Cd) = '0005'
		AND     TRIM(a1.Move_Time_Type_Cd)  = '05'
		AND     TRIM(a1.Stat_Index_Type_Cd) in ('0015','0010','0030','0060')
		AND 	a1.Start_Tm <= b1.Start_Tm 
		AND		a1.End_Tm >= b1.End_Tm 
) B
ON     TRIM(A.Stat_Index_Cd) = TRIM(B.Stat_Index_Cd)
WHERE  
	A.Data_Dt = date_sub(${hiveconf:TXDATE},7)
	AND		TRIM(A.Data_Stat_Std_Cd) = '02'
	AND     TRIM(B.Stat_Index_Type_Cd) in ('0010','0015','0030','0060')
GROUP BY 
	A.Stat_Dt                       
	,COALESCE(B.Dectime_Stat_Index_Cd,'') 
	,COALESCE(B.Stat_Index_Type_Cd,'')   
	,A.Section_Id                    
	,A.Trip_Drct_Cd                    
	,A.Data_Dt                       
	,A.Data_Stat_Std_Cd 
  '''

    sql_05 = '''
  -- 数据插入目标表
INSERT OVERWRITE TABLE BMNC_PMART.T98_DEC_SECT_FCRATE_PERIOD_ST PARTITION(Data_Dt = date_sub(${hiveconf:TXDATE},7),Data_Stat_Std_Cd = '02')
SELECT 
	Stat_Dt
	,Dectime_Stat_Index_Cd
	,Stat_Index_Type_Cd
	,Section_Id
	,Trip_Drct_Cd
	,COALESCE(SUM(Section_Trans_Capacity),0)
	,COALESCE(SUM(Sect_Quatity),0)
FROM   
	BMNC_TEMP.VT_DSECT_FCRATE_PERIOD_ST_SQ_E
GROUP BY 
	Stat_Dt
	,Dectime_Stat_Index_Cd
	,Stat_Index_Type_Cd
	,Section_Id
	,Trip_Drct_Cd
  '''

    sql_03 = sql_03.replace('${hiveconf:TXDATE}', yesterday)
    sql_04 = sql_04.replace('${hiveconf:TXDATE}', yesterday)
    sql_05 = sql_05.replace('${hiveconf:TXDATE}', yesterday)

    # 获取hive客户端并连接
    try:
        sqlContext = CreateConnectHive()
        sqlContext.execute('set hive.exec.dynamic.partition=true')
        sqlContext.execute('set hive.exec.dynamic.partition.mode=nostrick')
        print('开始加工逻辑')
        print(sql_01)
        sqlContext.execute(sql_01)
        print(sql_02)
        sqlContext.execute(sql_02)
        print(sql_03)
        sqlContext.execute(sql_03)
        print(sql_04)
        sqlContext.execute(sql_04)
        print(sql_05)
        sqlContext.execute(sql_05)
        print(sql_01)
        sqlContext.execute(sql_01)

        sqlContext.close()
    except Exception as e:
        print('DOJOB failed !!!')


if __name__ == "__main__":
    # 获取今日日期,例2019-12-20
    today = datetime.date.today()
    # 获取昨日日期,例2019-12-19
    yesterday = today - datetime.timedelta(days=1)  # 用今天日期减掉时间差,参数为1天,获得昨日日期
    Choice(str(yesterday))  # 执行当日账期任务,例'2020-05-20'
    # Choice(str('2020-05-20'))#执行指定账期任务
