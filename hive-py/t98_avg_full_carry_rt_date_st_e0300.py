#!/usr/bin/env python
# -*- coding:utf-8 -*-

#######################################################################
# 测试人  ：王文哲
# 测试日期：DATE_SUB(${hiveconf:TXDATE} , 7)='2019-12-10'  
# 测试数据：灾备库

# ----------------------------------------------------------------------------
# 简要信息：追加数据
# 源    表: T40_STAT_STD_TRAIN_SCH
#   ,T99_STAT_STATION_CD
#   ,T99_STAT_LINE_RELA_CD
#   ,TCS_LINE_PTY_RELA_HIS,
#   --T99_STAT_LINE_CD
#   ,T99_TRAIN_PARAMETER_HIS
#   ,T98_PASGR_TURNOVER_DATE_ST,
#   T98_PASGR_QTTY_DATE_ST
#   ,T98_PASGR_DATE_ST
# 目 标 表: T98_AVG_FULL_CARRY_RT_DATE_ST   
# 业务说明：加工平均满载率日期统计表
# 版    本: 2020-02-09 桑英灿
# 执行频率: DAY
# Modify history list:Created by  liuchuanling  at 2013-05-10 v1.0
#  :Modified by  liuchuanling  at 2013-05-15 v1.1 删除T99_STAT_LINE_CD
#  :Modified by  liuchuanling  at 2013-05-16 v1.2 列车定员和=列车定员*列车编组
#  :Modified by  liuchuanling  at 2013-05-22 v1.3 列车定员表改造了，直接取列车定员字段就可以了。
#   1.线路列车定员从列车定员信息历史表T99_TRAIN_PARAMETER_HIS取Train_Fixed_Num，用离站日期与开始时间、结束时间做拉链
#  :Modified by  liuchuanling  at 2013-06-17 v1.3 增加TCC_REAL判断
#  :Modified by  liuchuanling  at 2013-06-18 v1.4 修正TCC_REAL判断 
#   需求：如果实时运行图没有给数据，则按照计划运行图取数据
#   实现：通过在脚本中判断实时运行图是否有过加载，来判断实时运行图有没有提供。     
#  :Modified by  liuchuanling  at 2013-06-19 v1.5 对应模型修正  
#  Modified by  lixuan at 2013-10-28 v1.6   统一调整口径限定实时运行图的#站时间和离站时间在计划运行图的最小进站时间和最大离站时间区间内 
#  Modified by  limingbao at 2013-11-15 v1.7  增加补传数据（终报）
#  
#  
#  
#  依赖关系只增加T40_STAT_STD_TRAIN_SCH_ACTL
#  如果TCC_REAL没有加载，则Record_Type_Flag=1；
#  如果TCC_REAL加载成功，则Record_Type_Flag=2；
#  如果TCC_REAL加载未成功，则报错，错误码12
#  如果T40_STAT_STD_TRAIN_SCH_REAL未执行成功，则报错，错误码12
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
                if REAL_STATUS != 'Done':
                    print('BMNC_SDATA.TCC_REAL%s账期任务状态非Done,退出程序' % yesterday)
                elif REAL_STATUS == 'Done':
                    print('REAL_STATUS 值为Done跳转至FLAG2逻辑部分')
                    FLAG2(yesterday)
        else:
            print('BMNC_SDATA.TCC_REAL%s账期暂无数据,跳转至FLAG1逻辑部分' % yesterday)
            FLAG1(yesterday)
        sqlContext.close()
        print('脚本执行完毕,退出程序')
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
                DOJOB(yesterday, Record_Type_Flag)
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
            DOJOB(yesterday, Record_Type_Flag)
        else:
            print('当日无数据，报错退出')
    except Exception as e:
        print('FLAG2 failed !!!')

def DOJOB(yesterday, Record_Type_Flag):
    sql_01 = '''
  --创建临时表用于存放线路平均满载率
DROP TABLE IF EXISTS BMNC_TEMP.VT_AVG_FULL_CARRY_RT_DATE_ST0
  '''
      
    sql_02 = '''
  CREATE   TABLE   BMNC_TEMP.VT_AVG_FULL_CARRY_RT_DATE_ST0 as 
select * from  BMNC_PMART.T98_AVG_FULL_CARRY_RT_DATE_ST
where 1 <> 1
  '''
      
    sql_03 = '''
  --创建临时表用于存放路网平均满载率
  DROP TABLE IF EXISTS BMNC_TEMP.VT_AVG_FULL_CARRY_RT_DATE_ST1
  '''
        
    sql_04 = '''
  CREATE TABLE BMNC_TEMP.VT_AVG_FULL_CARRY_RT_DATE_ST1 as 
  select * from BMNC_PMART.T98_AVG_FULL_CARRY_RT_DATE_ST
  where 1 <> 1
  '''
        
    sql_05 = '''
  --创建临时表用于存放平均满载率
DROP TABLE IF EXISTS BMNC_TEMP.VT_AVG_FULL_CARRY_RT_DATE_ST
  '''
        
    sql_06 = '''
  CREATE   TABLE BMNC_TEMP.VT_AVG_FULL_CARRY_RT_DATE_ST as 
select * from BMNC_PMART.T98_AVG_FULL_CARRY_RT_DATE_ST
where 1 <> 1
  '''
        
    sql_07 = '''
  --创建临时表用于存放车次距离
DROP TABLE IF EXISTS BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP0
  '''
      
    sql_08 = '''
  CREATE  TABLE BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP0
(
     Trip_Dt               STRING      --行车日期
    ,Stat_Line_ID          STRING      --统计线路编号
    ,Trip_Drct_Cd          STRING      --行车方向代码
    ,Train_Num             STRING      --车次号
    ,Data_Stat_Std_Cd      STRING      --数据统计口径代码
    ,Data_Dt               STRING      --数据日期
    ,NStation_Distance     DECIMAL(18,4)  --车次的运营长度
)
  '''
              
    sql_09 = '''
  INSERT INTO BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP0
--终报
SELECT 
     Trip_Dt                                
       ,Stat_Line_ID                              
       ,Trip_Drct_Cd                                              
       ,Train_Num                                                 
       ,Data_Stat_Std_Cd                          
       ,Data_Dt  
       ,SUM(NStation_Distance)
       FROM (
SELECT
    A.Trip_Dt                         --统计日期
        ,A.Stat_Line_ID                            --统计线路编号   
        ,A.Trip_Drct_Cd                                           --行车方向代码  
        ,A.Train_Num                                              --车次号 
        ,'02'  Data_Stat_Std_Cd                          --数据统计口径代码
        ,Data_Dt                                      --数据日期  
        ,CASE WHEN TRIM(A.Trip_Drct_Cd) = '01' 
             THEN COALESCE(B.NStation_Upstream_Distance,0) 
             ELSE COALESCE(B.NStation_Downstream_Distance,0)
             END NStation_Distance                                                --车站距离 DECIMAL(18,4)
FROM 
 BMNC_PDATAVW.T40_STAT_STD_TRAIN_SCH A                     --统计口径行车记录
LEFT JOIN BMNC_PCODE.T99_STAT_STATION_CD_HIS B                  --统计口径车站代码
 ON A.Stat_Station_ID = B.Stat_Station_ID                  --统计车站编号
    AND TRIM(B.Stat_Std_Cd) = '10'                                  --统计口径代码=10
-- update by lixuan at 2013-10-28
INNER JOIN 
 (
 SELECT 
  Stat_Line_ID,Trip_Drct_Cd,MIN(Arrive_Tm) MIN_Arrive_Tm ,MAX(Deptr_Tm) MAX_Deptr_Tm
 FROM 
  BMNC_PDATAVW.T40_STAT_STD_TRAIN_SCH 
 WHERE 
  Record_Type_Ind = 1 
  AND Data_Dt = DATE_SUB('${hiveconf:TXDATE}' , 7)
 GROUP BY 
  Stat_Line_ID,Trip_Drct_Cd
 ) B1
ON 
 A.Stat_Line_ID=B1.Stat_Line_ID
 AND A.Trip_Drct_Cd=B1.Trip_Drct_Cd
WHERE                                                    
      A.Record_Type_Ind = '${Record_Type_Flag}'                         
      AND A.Stat_Station_ID <> Stat_Term_Station_ID               --统计车站编号 <> 统计终点站编号       
      AND TRIM(A.Stat_Std_Cd) = '10'                             --统计口径代码=10      
      AND A.Data_Dt= DATE_SUB('${hiveconf:TXDATE}' , 7)    
      AND A.Arrive_Tm>=B1.MIN_Arrive_Tm
 AND A.Deptr_Tm<=B1.MAX_Deptr_Tm    ) AA
GROUP BY 
     Trip_Dt                                
       ,Stat_Line_ID                              
       ,Trip_Drct_Cd                                              
       ,Train_Num                                                 
       ,Data_Stat_Std_Cd                          
       ,Data_Dt     
  '''
              
    sql_10 = '''
  --创建临时表用于存放车次距离(过滤重复统计距离)
DROP TABLE IF EXISTS BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP1
  '''
              
    sql_11 = '''
  CREATE TABLE BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP1
(
     Trip_Dt               STRING     --行车日期
    ,Stat_Line_ID          STRING     --统计线路编号
    ,Trip_Drct_Cd          STRING     --行车方向代码
    ,Train_Num             STRING     --车次号
    ,Data_Stat_Std_Cd      STRING     --数据统计口径代码
    ,Data_Dt               STRING     --数据日期
    ,NStation_Distance     DECIMAL(18,4)  --车次的运营长度
)
  '''
              
    sql_12 = '''
  DROP TABLE IF EXISTS BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP1_TEMP
  '''
              
    sql_13 = '''
  CREATE TABLE BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP1_TEMP AS 
 SELECT
       Trip_Dt                         --行车日期                 
            ,Stat_Line_ID                            --统计线路编号             
            ,Train_Num              --车次号
            ,Data_Stat_Std_Cd           --数据统计口径代码                 
            ,MAX(NStation_Distance)  AS NStation_Distance
            FROM ( 
            SELECT
            Trip_Dt                         --行车日期                 
              ,Stat_Line_ID                            --统计线路编号             
              ,Train_Num                                              --车次号
              ,Data_Stat_Std_Cd                    --数据统计口径代码                 
              ,NStation_Distance
            FROM BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP0 ) B
GROUP BY 
   Trip_Dt
   ,Stat_Line_ID
   ,Train_Num
   ,Data_Stat_Std_Cd 
  '''
              
    sql_14 = '''
  INSERT INTO BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP1
SELECT
    A.Trip_Dt                         --行车日期
        ,A.Stat_Line_ID                            --统计线路编号   
        ,A.Trip_Drct_Cd                                           --行车方向代码  
        ,A.Train_Num                                              --车次号
     ,A.Data_Stat_Std_Cd                           --数据统计口径代码
        ,A.Data_Dt                                      --数据日期  
        ,A.NStation_Distance                                     --车次的运营长度 DECIMAL(18,4)
FROM BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP0 A
LEFT JOIN BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP1_TEMP C
WHERE  
    A.Trip_Dt =      C.Trip_Dt                   --行车日期
   and A.Stat_Line_ID =  C.Stat_Line_ID                        --统计线路编号   
   and A.Train_Num =     C.Train_Num                                         --车次号 
   and A.Data_Stat_Std_Cd =    C.Data_Stat_Std_Cd                --数据统计口径代码
   and A.NStation_Distance =  C.NStation_Distance           --车次的运营长度 DECIMAL(18,4)   
  '''
              
    sql_15 = '''
  --创建临时表用于存放过滤车次号=载客列车、求∑每一趟车次的运营长度
DROP TABLE IF EXISTS BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP2
  '''
              
    sql_16 = '''
  CREATE TABLE BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP2
(
     Trip_Dt               STRING       --行车日期
    ,Stat_Line_ID          STRING       --统计线路编号
    ,Trip_Drct_Cd          STRING       --行车方向代码
    ,Data_Stat_Std_Cd      STRING       --数据统计口径代码
    ,Data_Dt               STRING       --数据日期
    ,NStation_Distance     DECIMAL(18,4)   --线路的运营长度
)
  '''
              
    sql_17 = '''
  INSERT INTO BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP2
SELECT
    A.Trip_Dt                         --行车日期
        ,A.Stat_Line_ID                            --统计线路编号   
        ,A.Trip_Drct_Cd                                           --行车方向代码  
        ,Data_Stat_Std_Cd                           --数据统计口径代码
        ,Data_Dt                                      --数据日期  
        ,SUM(COALESCE(A.NStation_Distance, 0))  NStation_Distance                   --车次的运营长度 DECIMAL(18,4)
FROM BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP1 A
INNER JOIN 
 (         
 SELECT DISTINCT
    O.Stat_Line_ID                                  --统计线路编号
   ,P.Start_Tm                                     --开始时间
   ,P.End_Tm                                       --结束时间
 FROM 
  bmnc_pcodevw.T99_STAT_LINE_RELA_CD O               --统计口径线路映射表（T99_STAT_LINE_RELA_CD）
 LEFT JOIN 
  BMNC_PDATAVW.TCS_LINE_PTY_RELA_HIS P               --线路当事人关系历史
  ON O.Std_Line_ID = P.Line_ID                        --线路编号
  AND TRIM(O.Stat_Std_Cd) = '10'                             --统计口径代码=10    
  AND TRIM(P.Line_Pty_Rela_Cd) = '10'                        --线路当事人关系类型代码='10'     
  --AND SUBSTR(P.Pty_ID ,16,2) IN  ('10','20')                                  --当事人编号='10' 
 WHERE P.Start_Tm IS NOT NULL   
 )B
ON A.Stat_Line_ID = B.Stat_Line_ID                       --统计线路编号
WHERE A.Trip_Dt >= B.Start_Tm                               --行车日期>=开始时间
AND A.Trip_Dt < B.End_Tm                                  --行车日期<结束时间       
--WHERE SUBSTR(A.Train_Num, 2, 1) IN ('0','1','2','3','4','5')     --载客列车 除4号线、大兴线、4-大兴线（地铁运营公司车次号）第二位为0-5
GROUP BY 
 A.Trip_Dt                         --行车日期
 ,A.Stat_Line_ID                            --统计线路编号   
 ,A.Trip_Drct_Cd                                           --行车方向代码  
 ,Data_Stat_Std_Cd                           --数据统计口径代码
 ,Data_Dt   
  '''
              
    sql_18 = '''
  --创建临时表用于存放(∑每一趟车次的运营长度）*线路列车定员
DROP TABLE IF EXISTS BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP3
  '''
              
    sql_19 = '''
  CREATE TABLE BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP3
(
     Trip_Dt               STRING       --行车日期
    ,Stat_Line_ID          STRING       --统计线路编号
    ,Trip_Drct_Cd          STRING       --行车方向代码
    ,Data_Stat_Std_Cd      STRING       --数据统计口径代码
    ,Data_Dt               STRING       --数据日期
    ,NStation_Distance_Man DECIMAL(18,4)    --(∑每一趟车次的运营长度）*线路列车定员
)
  '''
              
    sql_20 = '''
  DROP TABLE IF EXISTS BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP3_TEMP
  '''
              
    sql_21 = '''
  CREATE TABLE BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP3_TEMP 
  as select * from 
     BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP2 B
    LEFT JOIN 
     BMNC_PCODEVW.T99_TRAIN_PARAMETER_HIS C                    --列车定员信息历史               
     ON B.Stat_Line_ID = C.Line_ID                              --B.统计线路编号= C.线路编号    
    WHERE
     B.Trip_Dt >= C.Start_Dt                                 --行车日期>=开始日期
     AND B.Trip_Dt < C.End_Dt
     union all 
     select * from 
     BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP2 B
    LEFT JOIN 
     BMNC_PCODEVW.T99_TRAIN_PARAMETER_HIS C                    --列车定员信息历史               
     ON B.Stat_Line_ID = C.Line_ID                              --B.统计线路编号= C.线路编号    
    WHERE
      C.Line_ID is null
  '''
              
    sql_22 = '''
  INSERT INTO BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP3     
SELECT
  AA.Trip_Dt                                                 --行车日期
 ,AA.Stat_Line_ID                            --统计线路编号   
 ,AA.Trip_Drct_Cd                                           --行车方向代码
 ,AA.Data_Stat_Std_Cd                     --数据统计口径代码
 ,AA.Data_Dt                 
 ,CASE WHEN TRIM(AA.Stat_Line_ID) = '9304'
 THEN COALESCE(AA.NStation_Distance, 0) * (COALESCE(D.Train_Fixed_Num, 0))  --(∑每一趟车次的运营长度）
 ELSE COALESCE(AA.NStation_Distance, 0) * (COALESCE(AA.Train_Fixed_Num, 0))  --(∑每一趟车次的运营长度）
 END  NStation_Distance_Man
 FROM BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP3_TEMP AA                                   --行车日期<结束日期 
 LEFT JOIN 
 BMNC_PCODEVW.T99_TRAIN_PARAMETER_HIS D                    --列车定员信息历史               
 ON TRIM(AA.Stat_Line_ID) = '9304'                                 --B.统计线路编号= '9304'   
 AND D.Line_ID = '93'
WHERE
  AA.Trip_Dt >= D.Start_Dt                                 --行车日期>=开始日期
 AND AA.Trip_Dt < D.End_Dt                                    --行车日期<结束日期 
 union all
 SELECT
  AA.Trip_Dt                                                 --行车日期
 ,AA.Stat_Line_ID                            --统计线路编号   
 ,AA.Trip_Drct_Cd                                           --行车方向代码
 ,AA.Data_Stat_Std_Cd                     --数据统计口径代码
 ,AA.Data_Dt                 
 ,CASE WHEN TRIM(AA.Stat_Line_ID) = '9304'
 THEN COALESCE(AA.NStation_Distance, 0) * (COALESCE(D.Train_Fixed_Num, 0))  --(∑每一趟车次的运营长度）
 ELSE COALESCE(AA.NStation_Distance, 0) * (COALESCE(AA.Train_Fixed_Num, 0))  --(∑每一趟车次的运营长度）
 END  NStation_Distance_Man
 FROM BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP3_TEMP AA                                   --行车日期<结束日期 
 LEFT JOIN 
 BMNC_PCODEVW.T99_TRAIN_PARAMETER_HIS D                    --列车定员信息历史               
 ON TRIM(AA.Stat_Line_ID) = '9304'                                 --B.统计线路编号= '9304'   
 AND D.Line_ID = '93'
WHERE
  D.Line_ID is null
  '''
                   
    sql_23 = '''
  --创建临时表用于存放线路客运周转量
DROP TABLE IF EXISTS BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP4
  '''
                  
    sql_24 = '''
  CREATE TABLE BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP4
(
     Stat_Dt               STRING       --统计日期
    ,Line_ID               STRING       --线路编号
    ,Trip_Drct_Cd          STRING       --行车方向代码
    ,Data_Stat_Std_Cd      STRING       --数据统计口径代码
    ,Data_Dt               STRING       --数据日期
    ,Pasgr_Turnover        DECIMAL(18,0)  --客运周转量
)
  '''
                  
    sql_25 = '''
  INSERT INTO BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP4
--终报
SELECT
 Stat_Dt                                    --统计日期    
 ,Line_ID                                    --线路编号    
 ,Trip_Drct_Cd                                             --行车方向代码
 ,Data_Stat_Std_Cd                           --数据统计口径代码
 ,Data_Dt                          --数据日期
 ,SUM(COALESCE(Pasgr_Turnover, 0))  Pasgr_Turnover                       --客运周转量
FROM 
 BMNC_PMARTVW.T98_PASGR_TURNOVER_DATE_ST                  --客运周转量日期统计
WHERE 
 TRIM(Stat_Period_Cd) = '01'                                      --统计周期代码='01'日
 AND TRIM(Data_Stat_Std_Cd) ='02'
 AND Data_Dt=DATE_SUB('${hiveconf:TXDATE}' , 7)
GROUP BY 
 Stat_Dt                                    --统计日期    
 ,Line_ID                                    --线路编号    
 ,Trip_Drct_Cd                                             --行车方向代码
 ,Data_Stat_Std_Cd                           --数据统计口径代码
 ,Data_Dt  
  '''
                  
    sql_26 = '''
  --创建临时表用于存放线路平均满载率（线路）
INSERT INTO BMNC_TEMP.VT_AVG_FULL_CARRY_RT_DATE_ST0
SELECT  
 Stat_Dt                                                  --统计日期
 ,Stat_Period_Cd                                          --统计周期代码
 ,Line_ID                                                 --线路编号
 ,Trip_Drct_Cd                                            --行车方向代码
 ,SUM(Pasgr_Turnover)  Pasgr_Turnover                                   --客运周转量                  
 ,SUM(Pasgr_Quatity)   Pasgr_Quatity                                       --客运量   
 ,SUM(Entry_Quatity)   Entry_Quatity                                        --进站量  
 ,SUM(Opr_Length_Fix_Num_Mul)   Opr_Length_Fix_Num_Mul                          --运营长度定员乘积 
 ,Data_Dt                                                 --数据日期
 ,Data_Stat_Std_Cd                                        --数据统计口径代码
FROM (            
SELECT
 Trip_Dt    AS Stat_Dt                           --行车日期
 ,'01' AS  Stat_Period_Cd                                 --统计周期代码    
 ,Stat_Line_ID   AS Line_ID                 --统计线路编号    
 ,COALESCE(trim(Trip_Drct_Cd),'00') AS   Trip_Drct_Cd           --行车方向代码
 ,CAST(0 AS DECIMAL(38,2)) AS Pasgr_Turnover              --客运周转量  
 ,CAST(0 AS DECIMAL(18,0)) AS Pasgr_Quatity               --客运量      
 ,CAST(0 AS DECIMAL(18,0)) AS Entry_Quatity               --进站量       
 ,CAST(NStation_Distance_Man  AS DECIMAL(38,4))   AS  Opr_Length_Fix_Num_Mul      --运营长度定员乘积     
 ,Data_Dt AS Data_Dt                     --数据日期
 ,Data_Stat_Std_Cd        AS Data_Stat_Std_Cd             --数据统计口径代码 
FROM 
 BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP3 B  
UNION
SELECT
 Stat_Dt                                    --行车日期
 ,'01'     AS  Stat_Period_Cd                                               --统计周期代码    
 ,Line_ID                                  --统计线路编号    
 ,COALESCE(trim(Trip_Drct_Cd),'00')     AS   Trip_Drct_Cd                         --行车方向代码
 ,Pasgr_Turnover                                          --客运周转量  
 ,0                                                       --客运量      
 ,0                                                       --进站量      
 ,0                                                      --运营长度定员乘积       
 ,Data_Dt                                --数据日期
 ,Data_Stat_Std_Cd                                        --数据统计口径代码
FROM 
 BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP4 C   
)A
GROUP BY 
 A.Stat_Dt                                                 
 ,A.Stat_Period_Cd                                         
 ,A.Line_ID                                                
 ,A.Trip_Drct_Cd                                            
 ,A.Data_Dt                                        
 ,A.Data_Stat_Std_Cd  
  '''
                  
    sql_27 = '''
  --创建临时表用于存放∑((∑每一趟车次的运营长度）*线路列车定员) 路网用
DROP TABLE IF EXISTS BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP33
  '''
                  
    sql_28 = '''
  CREATE TABLE BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP33
(
     Trip_Dt               STRING       --行车日期
    ,Data_Stat_Std_Cd      STRING       --数据统计口径代码
    ,Data_Dt               STRING       --数据日期
    ,NStation_Distance_Man DECIMAL(18,4)        --∑((∑每一趟车次的运营长度）*线路列车定员)
)
  '''
                  
    sql_29 = '''
  INSERT INTO BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP33
SELECT
 Trip_Dt                           --行车日期
 ,Data_Stat_Std_Cd                           --数据统计口径代码
 ,Data_Dt                                    --数据日期 
 ,SUM(NStation_Distance_Man)  NStation_Distance_Man                             --(∑每一趟车次的运营长度）*线路列车定员
FROM 
 BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP3
WHERE 
 TRIM(Stat_Line_ID) <> '9304'
GROUP BY
 Trip_Dt                           --行车日期
 ,Data_Stat_Std_Cd                           --数据统计口径代码
 ,Data_Dt 
  '''
                  
    sql_30 = '''
  --创建临时表用于存放路网客运量从客运量日期统计汇总
DROP TABLE IF EXISTS BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP44
  '''
                  
    sql_31 = '''
  CREATE TABLE BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP44
(
     Stat_Dt               STRING        --统计日期
    ,Data_Stat_Std_Cd      STRING        --数据统计口径代码
    ,Data_Dt               STRING        --数据日期
    ,Pasgr_Quatity         DECIMAL(18,0)   --路网客运量
)
  '''
                  
    sql_32 = '''
  INSERT INTO BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP44
--终报
SELECT
 Stat_Dt                                    --统计日期 
 ,Data_Stat_Std_Cd                            --数据统计口径代码
 ,Data_Dt                                      --数据日期      
 ,SUM(COALESCE(Pasgr_Quatity, 0)) Pasgr_Quatity                         --客运量
FROM 
 BMNC_PMARTVW.T98_PASGR_QTTY_DATE_ST                      --客运量日期统计
WHERE 
 TRIM(Stat_Period_Cd) = '01'                                      --统计周期代码='01'日
 AND Data_Dt= DATE_SUB('${hiveconf:TXDATE}' , 7) 
 AND TRIM(Data_Stat_Std_Cd) ='02' 
 AND Line_ID <> '9304'
GROUP BY
 Stat_Dt                                    --统计日期 
 ,Data_Stat_Std_Cd                            --数据统计口径代码
 ,Data_Dt     
  '''
                       
    sql_33 = '''
  --创建临时表用于存放路网客运周转量从客运周转量日期统计汇总
DROP TABLE IF EXISTS BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP55
  '''
                       
    sql_34 = '''
  CREATE TABLE BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP55
(
     Stat_Dt               STRING       --统计日期
    ,Data_Stat_Std_Cd      STRING       --数据统计口径代码
    ,Data_Dt               STRING       --数据日期
    ,Pasgr_Turnover        DECIMAL(18,0) --客运周转量
)
  '''
                       
    sql_35 = '''
  INSERT INTO BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP55
--终报
SELECT
 Stat_Dt                                    --统计日期  
 ,Data_Stat_Std_Cd                            --数据统计口径代码
 ,Data_Dt                                      --数据日期    
 ,SUM(CAST(COALESCE(Pasgr_Turnover, 0) AS DEC(18,0))) Pasgr_Turnover                        --客运周转量
FROM 
 BMNC_PMARTVW.T98_PASGR_TURNOVER_DATE_ST                  --客运周转量日期统计
WHERE 
 TRIM(Stat_Period_Cd) = '01'                                      --统计周期代码='01'日
    AND TRIM(Data_Stat_Std_Cd)='02'
    AND Data_Dt= DATE_SUB('${hiveconf:TXDATE}' , 7)  
    AND Line_ID <> '9304'
GROUP BY 
 Stat_Dt                                    --统计日期  
 ,Data_Stat_Std_Cd                            --数据统计口径代码
 ,Data_Dt   
  '''
                       
    sql_36 = '''
  --创建临时表用于存放路网进站量从客流量日期统计汇总
DROP TABLE IF EXISTS BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP66
  '''
                       
    sql_37 = '''
  CREATE TABLE BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP66
(
     Stat_Dt               STRING         --统计日期
    ,Data_Stat_Std_Cd      STRING         --数据统计口径代码
    ,Data_Dt               STRING         --数据日期
    ,Entry_Quatity         DECIMAL(18,0)  --进站量
)
  '''

    sql_38 = '''
  INSERT INTO BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP66
--终报
SELECT
 Stat_Dt                                    --统计日期
 ,Data_Stat_Std_Cd                            --数据统计口径代码
 ,Data_Dt                                      --数据日期     
 ,SUM(COALESCE(Entry_Quatity, 0))  Entry_Quatity                        --进站量
FROM 
 BMNC_PMARTVW.T98_PASGR_DATE_ST                           --客流日期统计
WHERE 
 TRIM(Stat_Period_Cd) = '01'                                      --统计周期代码='01'日
 AND TRIM(Data_Stat_Std_Cd)='02'
    AND Data_Dt= DATE_SUB('${hiveconf:TXDATE}' , 7)  
    AND Line_ID <> '9304'
GROUP BY 
 Stat_Dt                                    --统计日期
 ,Data_Stat_Std_Cd                            --数据统计口径代码
 ,Data_Dt 
  '''

    sql_39 = '''
  --创建临时表用于存放路网列车平均满载率
--路网列车平均满载率=（路网客运量*路网平均乘距/（∑（(∑每一趟车次的运营长度）*线路列车定员)））*100%
--路网客运量*路网客运周转量/路网进站量
INSERT INTO BMNC_TEMP.VT_AVG_FULL_CARRY_RT_DATE_ST1
SELECT 
 Stat_Dt                                                  --统计日期
 ,Stat_Period_Cd                                          --统计周期代码
 ,Line_ID                                                 --线路编号
 ,Trip_Drct_Cd                                            --行车方向代码
 ,SUM(Pasgr_Turnover)  Pasgr_Turnover                                   --客运周转量                  
 ,SUM(Pasgr_Quatity)   Pasgr_Quatity                                   --客运量   
 ,SUM(Entry_Quatity)   Entry_Quatity                                   --进站量  
 ,SUM(Opr_Length_Fix_Num_Mul) Opr_Length_Fix_Num_Mul                            --运营长度定员乘积 
 ,Data_Dt                                                 --数据日期
 ,Data_Stat_Std_Cd                                        --数据统计口径代码
FROM (            
            SELECT
                    Trip_Dt    AS Stat_Dt                            --行车日期
                    ,'01'    AS Stat_Period_Cd                             --统计周期代码    
                    ,'9999'    AS Line_ID                                    --统计线路编号                           
                    ,''        AS Trip_Drct_Cd                               --行车方向代码
                    ,CAST(0 AS DECIMAL(38,2)) AS Pasgr_Turnover              --客运周转量  
                    ,CAST(0 AS DECIMAL(18,0)) AS Pasgr_Quatity               --客运量      
                    ,CAST(0 AS DECIMAL(18,0)) AS Entry_Quatity               --进站量   
                    ,CAST(NStation_Distance_Man  AS DECIMAL(38,4))   AS  Opr_Length_Fix_Num_Mul      --运营长度定员乘积     
                    ,Data_Dt AS Data_Dt                     --数据日期
                    ,Data_Stat_Std_Cd   AS Data_Stat_Std_Cd                  --数据统计口径代码
            FROM 
    BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP33   
    
            UNION ALL
   
            SELECT
                    Stat_Dt                                    --行车日期
                    ,'01'                                                    --统计周期代码    
                    ,'9999'                                                  --统计线路编号    
                    ,''                                                      --行车方向代码    
                    ,0                                                       --客运周转量  
                    ,Pasgr_Quatity                                           --客运量      
                    ,0                                                       --进站量      
                    ,0                                                       --运营长度定员乘积   
                    ,Data_Dt                                --数据日期    
                    ,Data_Stat_Std_Cd                                        --数据统计口径代码
            FROM  
    BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP44    
    
            UNION ALL
   
            SELECT
                    Stat_Dt                                    --行车日期
                    ,'01'                                                    --统计周期代码    
                    ,'9999'                                                  --统计线路编号    
                    ,''                                                      --行车方向代码    
                    ,Pasgr_Turnover                                          --客运周转量  
                    ,0                                                       --客运量      
                    ,0                                                       --进站量      
                    ,0                                                       --运营长度定员乘积       
                    ,Data_Dt                                --数据日期
                    ,Data_Stat_Std_Cd                                        --数据统计口径代码
            FROM 
    BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP55    
    
            UNION ALL
   
            SELECT
                    Stat_Dt                                    --行车日期
                    ,'01'                                                    --统计周期代码    
                    ,'9999'                                                  --统计线路编号    
                    ,''                                                      --行车方向代码    
                    ,0                                                       --客运周转量  
                    ,0                                                       --客运量      
                    ,Entry_Quatity                                           --进站量      
                    ,0                                                       --运营长度定员乘积    
                    ,Data_Dt                                --数据日期   
                    ,Data_Stat_Std_Cd                                        --数据统计口径代码
            FROM 
    BMNC_TEMP.FULL_CARRY_RT_DATE_ST_TEMP66    
       )A
GROUP BY 
  Stat_Dt                                                  --统计日期
 ,Stat_Period_Cd                                          --统计周期代码
 ,Line_ID                                                 --线路编号
 ,Trip_Drct_Cd                                            --行车方向代码
 ,Data_Dt                                                 --数据日期
 ,Data_Stat_Std_Cd                                        --数据统计口径代码
  '''
 
                      
    sql_40 = '''
  INSERT OVERWRITE TABLE BMNC_PMART.T98_AVG_FULL_CARRY_RT_DATE_ST PARTITION (Data_Dt,Data_Stat_Std_Cd)
SELECT * FROM BMNC_PMART.T98_AVG_FULL_CARRY_RT_DATE_ST
WHERE 
 Data_Dt = DATE_SUB('${hiveconf:TXDATE}' , 7)
 AND Line_ID <> '9999'
 AND TRIM(Data_Stat_Std_Cd) <> '02'
UNION ALL 
SELECT * FROM BMNC_PMART.T98_AVG_FULL_CARRY_RT_DATE_ST
WHERE 
 Data_Dt = DATE_SUB('${hiveconf:TXDATE}' , 7)
 AND Line_ID = '9999'
 AND TRIM(Data_Stat_Std_Cd) <> '02'
UNION ALL 
SELECT * FROM BMNC_PMART.T98_AVG_FULL_CARRY_RT_DATE_ST
WHERE 
 Data_Dt = DATE_SUB('${hiveconf:TXDATE}' , 7)
 AND Line_ID = '9999'
 AND TRIM(Data_Stat_Std_Cd) = '02'
UNION ALL 
SELECT * FROM BMNC_PMART.T98_AVG_FULL_CARRY_RT_DATE_ST
WHERE 
 Data_Dt <> DATE_SUB('${hiveconf:TXDATE}' , 7)
UNION ALL 
--按日统计数据进入目标表 --线路
SELECT 
    stat_dt           
    ,stat_period_cd       
    ,line_id          
    ,trip_drct_cd       
    ,pasgr_turnover       
    ,pasgr_quatity      
    ,entry_quatity      
    ,opr_length_fix_num_mul   
    ,data_dt          
    ,data_stat_std_cd 
FROM BMNC_TEMP.VT_AVG_FULL_CARRY_RT_DATE_ST0
  '''
                                
    sql_41 = '''
  INSERT OVERWRITE TABLE BMNC_PMART.T98_AVG_FULL_CARRY_RT_DATE_ST PARTITION (Data_Dt,Data_Stat_Std_Cd)
SELECT * FROM BMNC_PMART.T98_AVG_FULL_CARRY_RT_DATE_ST
WHERE 
 Data_Dt = DATE_SUB('${hiveconf:TXDATE}' , 7)
 AND Line_ID <> '9999'
 AND TRIM(Data_Stat_Std_Cd) <> '02'
UNION ALL 
SELECT * FROM BMNC_PMART.T98_AVG_FULL_CARRY_RT_DATE_ST
WHERE 
 Data_Dt = DATE_SUB('${hiveconf:TXDATE}' , 7)
 AND Line_ID <> '9999'
 AND TRIM(Data_Stat_Std_Cd) = '02'
UNION ALL 
SELECT * FROM BMNC_PMART.T98_AVG_FULL_CARRY_RT_DATE_ST
WHERE 
 Data_Dt = DATE_SUB('${hiveconf:TXDATE}' , 7)
 AND Line_ID = '9999'
 AND TRIM(Data_Stat_Std_Cd) <> '02'
UNION ALL 
SELECT * FROM BMNC_PMART.T98_AVG_FULL_CARRY_RT_DATE_ST
WHERE 
 Data_Dt <> DATE_SUB('${hiveconf:TXDATE}' , 7)
UNION ALL 
--按日统计数据进入目标表 --路网
SELECT 
    stat_dt           
    ,stat_period_cd       
    ,line_id          
    ,trip_drct_cd       
    ,pasgr_turnover       
    ,pasgr_quatity      
    ,entry_quatity      
    ,opr_length_fix_num_mul   
    ,data_dt          
    ,data_stat_std_cd 
FROM BMNC_TEMP.VT_AVG_FULL_CARRY_RT_DATE_ST1
  '''
           
        
    sql_25 = sql_25.replace('${hiveconf:TXDATE}', yesterday)
    sql_32 = sql_32.replace('${hiveconf:TXDATE}', yesterday)
    sql_35 = sql_35.replace('${hiveconf:TXDATE}', yesterday)
    sql_38 = sql_38.replace('${hiveconf:TXDATE}', yesterday)
    sql_40 = sql_40.replace('${hiveconf:TXDATE}', yesterday)
    sql_41 = sql_41.replace('${hiveconf:TXDATE}', yesterday)
       
    # 获取hive客户端并连接
    try:
      sqlContext = CreateConnectHive()
      sqlContext.execute('set hive.exec.dynamic.partition=true')
      sqlContext.execute('set hive.exec.dynamic.partition.mode=nostrick')
      print ('开始加工逻辑')
      print (sql_01)
      sqlContext.execute(sql_01)
      print (sql_02)
      sqlContext.execute(sql_02)
      print (sql_03)
      sqlContext.execute(sql_03)
      print (sql_04)
      sqlContext.execute(sql_04)
      print (sql_05)
      sqlContext.execute(sql_05)
      print (sql_06)
      sqlContext.execute(sql_06)
      print (sql_07)
      sqlContext.execute(sql_07)
      print (sql_08)
      sqlContext.execute(sql_08)
      sql_09 = sql_09.replace('${hiveconf:TXDATE}', yesterday).replace('${Record_Type_Flag}', str(Record_Type_Flag))
      print (sql_09)
      sqlContext.execute(sql_09)
      print (sql_10)
      sqlContext.execute(sql_10)
      print (sql_11)
      sqlContext.execute(sql_11)
      print (sql_12)
      sqlContext.execute(sql_12)
      print (sql_13)
      sqlContext.execute(sql_13)
      print (sql_14)
      sqlContext.execute(sql_14)
      print (sql_15)
      sqlContext.execute(sql_15)
      print (sql_16)
      sqlContext.execute(sql_16)
      print (sql_17)
      sqlContext.execute(sql_17)
      print (sql_18)
      sqlContext.execute(sql_18)
      print (sql_19)
      sqlContext.execute(sql_19)
      print (sql_20)
      sqlContext.execute(sql_20)
      print (sql_21)
      sqlContext.execute(sql_21)
      print (sql_22)
      sqlContext.execute(sql_22)
      print (sql_23)
      sqlContext.execute(sql_23)
      print (sql_24)
      sqlContext.execute(sql_24)
      print (sql_25)
      sqlContext.execute(sql_25)
      print (sql_26)
      sqlContext.execute(sql_26)
      print (sql_27)
      sqlContext.execute(sql_27)
      print (sql_28)
      sqlContext.execute(sql_28)
      print (sql_29)
      sqlContext.execute(sql_29)
      print (sql_30)
      sqlContext.execute(sql_30)
      print (sql_31)
      sqlContext.execute(sql_31)
      print (sql_32)
      sqlContext.execute(sql_32)
      print (sql_33)
      sqlContext.execute(sql_33)
      print (sql_34)
      sqlContext.execute(sql_34)
      print (sql_35)
      sqlContext.execute(sql_35)
      print (sql_36)
      sqlContext.execute(sql_36)
      print (sql_37)
      sqlContext.execute(sql_37)
      print (sql_38)
      sqlContext.execute(sql_38)
      print (sql_39)
      sqlContext.execute(sql_39)
      print (sql_40)
      sqlContext.execute(sql_40)
      print (sql_41)
      sqlContext.execute(sql_41)
      print (sql_01)
      sqlContext.execute(sql_01)
      print (sql_03)
      sqlContext.execute(sql_03)
      print (sql_05)
      sqlContext.execute(sql_05)
      print (sql_07)
      sqlContext.execute(sql_07)
      print (sql_10)
      sqlContext.execute(sql_10)
      print (sql_12)
      sqlContext.execute(sql_12)
      print (sql_15)
      sqlContext.execute(sql_15)
      print (sql_18)
      sqlContext.execute(sql_18)
      print (sql_20)
      sqlContext.execute(sql_20)
      print (sql_23)
      sqlContext.execute(sql_23)
      print (sql_27)
      sqlContext.execute(sql_27)
      print (sql_30)
      sqlContext.execute(sql_30)
      print (sql_33)
      sqlContext.execute(sql_33)
      print (sql_36)
      sqlContext.execute(sql_36)
      
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