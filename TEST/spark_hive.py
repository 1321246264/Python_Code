#!/usr/bin/python
# -*- encoding: utf-8 -*-
import paramiko
import sys, os
import pandas as pd
import ConfigParser
from optparse import OptionParser
import requests
import json
import random
import string
import re
import commands
import time

spark_cfg = "/etc/danastudio/spark_config.cfg"
header_dict = {"Content-Type": "application/json; charset=utf8"}


def init_config(option):
    conf = ConfigParser.ConfigParser()
    conf.read(spark_cfg)
    result = conf.get('config', option)

    return result


def check_spark(server_port):
    spark_ip = init_config('spark_ip')
    # engine_port=init_config('engine_port')

    url = 'http://{ip}:{port}/controller/monitor'.format(ip=spark_ip, port=server_port)
    try:
        r = requests.post(url, "", headers=header_dict).text
        # dic=json.loads(r)
        # print dic
        print
        r
        return r
    except Exception as e:
        err = {'status': -2}
        print
        json.dumps(err)
        return json.dumps(err)


# return dic["status"]

# 执行单条 sql
def query_hive_json(sql, server_port):
    # status=check_spark()
    # if status!=0:
    sql = sql.replace('\"', '')
    sql = sql.replace('varchar', 'string', -1)
    sql = sql.replace('VARCHAR', 'string', -1)
    if sql.lstrip()[0:6].upper() == "SELECT" and (sql.upper().find("LIMIT")) == -1:
        sql = sql + " limit 100 "
    spark_ip = init_config('spark_ip')
    # engine_port=init_config('engine_port')
    url = 'http://{ip}:{port}/controller/query'.format(ip=spark_ip, port=server_port)
    # print sql
    sqlJson = {"sql": sql}
    str = json.dumps(sqlJson)
    # print str
    r = requests.post(url, data=str, headers=header_dict).text
    # print r
    dict1 = json.loads(r)
    # print r
    # if dict1['code'] != '0':
    # print r
    # exit(2)
    # else:
    # return r
    return r


# 启动
def start_spark(server_port):
    conf = ConfigParser.ConfigParser()

    conf.read(spark_cfg)
    spark_ip = conf.get('config', 'spark_ip')
    spark_name = conf.get('config', 'spark_name')
    spark_password = conf.get('config', 'spark_password')

    s_submit = conf.get('config', 'spark_submit')
    d_memory = conf.get('config', 'd_memory')
    d_core = conf.get('config', 'd_core')
    d_memory_overhead = conf.get('config', 'd_memory_overhead')
    e_memory = conf.get('config', 'e_memory')
    e_core = conf.get('config', 'e_core')
    e_memory_overhead = conf.get('config', 'e_memory_overhead')
    e_num = conf.get('config', 'e_num1')
    engine_port = conf.get('config', 'engine_port')
    query_port = conf.get('config', 'query_port')
    if server_port == engine_port:
        e_num = conf.get('config', 'e_num2')
    jar = conf.get('config', 'jar')
    principal = conf.get('config', 'spark_principal')
    keytab = conf.get('config', 'spark_keytab')
    keytab_conf = ""
    if len(principal) != 0:
        keytab_conf = '--principal {} --keytab {} '.format(principal, keytab)

    master_config = '--master yarn --deploy-mode client'
    driver_config = '--driver-cores {d_core}  --driver-memory {d_memory} --DS_Conf spark.yarn.driver.memoryOverhead={d_memory_overhead}'.format(
        d_core=d_core, d_memory=d_memory, d_memory_overhead=d_memory_overhead)
    executor_config = '--executor-cores {e_core} --executor-memory {e_memory} --num-executors {e_num} --DS_Conf spark.yarn.executor.memoryOverhead={e_memory_overhead}'.format(
        e_core=e_core, e_memory=e_memory, e_memory_overhead=e_memory_overhead, e_num=e_num)
    main_class_config = "--class Launcher"
    jar_config = " {jar}".format(jar=jar)

    udfpath = '/opt/danastudio/remote/spark/'
    suff = '-1.0-SNAPSHOT.jar'
    udfs = ['contain_regex',
            'custom_regex_new',
            'creditcard_regex',
            'null_regex',
            'date_compare',
            'datetime_compare',
            'email_regex',
            'getdate',
            'numeric_compare',
            'phone_regex_new',
            'point_regex',
            'zjhm_regex',
            'data_format',
            'numeric_compare_new',
            'numeric_compare_new_std',
            'is_available']
    udfjars = '--jars '
    for i in udfs:
        if i == 'is_available':
            udfjars = udfjars + udfpath + i + suff + ',' + udfpath + 'fastjson-1.2.47.jar '
        else:
            udfjars = udfjars + udfpath + i + suff + ','

    # spark-submit  --master  yarn --deploy-mode client --class  Launcher  --driver-cores 1  --driver-memory 2G  --executor-cores 2 --executor-memory 1G  --num-executors  3    /root/datatom.jar   8988

    cmd = '{} {} {} {} {} {} {} {} {}'.format(s_submit, master_config, driver_config, executor_config, udfjars,
                                              main_class_config, jar_config, server_port, keytab_conf)
    spark_logpath = '/var/log/spark_port_%s.log' % (server_port)
    cmd = ' nohup %s  >%s  2>&1  &' % (cmd, spark_logpath)
    print(cmd)
    ssh(spark_ip, spark_name, spark_password, cmd)
    i = 1
    while i < 16:
        if json.loads(check_spark(server_port))['status'] != 0:
            i = i + 1
            time.sleep(60)
        else:
            commands.getstatusoutput('python /etc/danastudio/udf_initialize.py')
            break


def query_sqls(sqlFile, server_port):
    if not os.path.isfile(sqlFile):
        exit("文件不存在")
    fHandle = open(sqlFile)
    pattern = re.compile(r'(--.*)|(((/\*)+?[\w\W]+?(\*/)+))')
    cont = re.sub(pattern, '', fHandle.read())
    cont = cont.strip(";\n\r\t")
    sqls = cont.split(";")
    num = 0
    c = list()
    ran = ''.join(random.sample(string.ascii_letters + string.digits, 8))
    # -----------------------------------------------------------------------
    # 记录分区时间
    pattern = re.compile("CURRENT_TIMESTAMP")
    regresult = pattern.findall(cont)
    if len(regresult) != 0:
        for i in range(len(regresult)):
            sql = "SELECT date_format(CURRENT_TIMESTAMP(),'yyyy-MM-dd HH:mm:00') as result"
            result = query_hive_json(sql, server_port)
            dict1 = json.loads(result)
            if dict1['code'] == '0':
                res = ran + ".json"
            re2 = str(dict1['values'])
            re3 = re2.split("'")[3]

            # 保存查询的路径
            regsave = sqlFile + "_LOCALTIMESTAMP_" + str(i)
            with open(regsave, "w+") as fd:
                fd.write(re3)
                fd.close()
    # -----------------------------------------------------------------------

    for sql in sqls:
        if '--' not in sql:
            if len(sql.replace(' ', '')) != 0:
                sql = sql.replace('%', '%%')

                result = query_hive_json(sql, server_port)
                dict1 = json.loads(result)
                if dict1['code'] != '0':
                    print
                    result
                    exit(2)
                res = ran + ".json"
                a = {}
                a[num] = result
                num = num + 1
                c.append(result)
            else:
                continue
        else:
            continue
    result1 = dict()
    for key, value in enumerate(c):
        result1[key] = value

    text = json.dumps(result1, ensure_ascii=False)
    return text


def ssh(sys_ip, username, password, cmds):
    try:
        client = paramiko.SSHClient()
        client.set_missing_host_key_policy(paramiko.AutoAddPolicy())
        client.connect(sys_ip, 22, username=username, password=password, timeout=20)
        stdin, stdout, stderr = client.exec_command(cmds)

    except Exception, e:
        print
        e
    finally:
        client.close()


def usage():
    print
    '''
       Action:
           [check] Check status of query session on specified port
           [init]  Initialize query session on specified port
           [exec]  Run sql on specified port
       
       Parameter:
           -p query session port
           -t use sql string
           -f use sql file,split with semicolon ; between each sql
   
       Example:
           ./spark_hive.py init -p 8990
           ./spark_hive.py check -p 8990
           ./spark_hive.py exec -p 8990 -t 'show databases'
           ./spark_hive.py exec -p 8990 -f demo.sql
       '''
    exit()


if __name__ == '__main__':

    if len(sys.argv) < 2:
        usage()
        exit()

    conf = ConfigParser.ConfigParser()
    conf.read(spark_cfg)
    default_port = conf.get('config', 'query_port')

    parser = OptionParser()
    parser.add_option("-p", "--port", dest='port', default=default_port)
    parser.add_option("-t", "--text", dest='sqltxt', default="")
    parser.add_option("-f", "--file", dest='sqlfile', default="")
    (options, args) = parser.parse_args()

    port = options.port
    sqltxt = options.sqltxt
    sqlfile = options.sqlfile

    if port == 0:
        print
        "error : missing port"
        usage()

    if sqltxt != "" and sqlfile != "":
        print
        "error : parameter conflict"
        usage()

    action = sys.argv[1]
    '''
    action list:
    1.init
    2.check
    3.exec
    '''
    if action == "init":
        start_spark(port)
    elif action == "check":
        check_spark(port)
    elif action == "exec":
        if sqltxt != "":
            r = query_hive_json(sqltxt, port)
            print
            r
        elif sqlfile != "":
            r = query_sqls(sqlfile, port)
            print
            r
        else:
            print
            "error : parameter lost,please use -t for sqltext,or -f for sqlfile"
            usage()
    else:
        usage()

# query_hive_json(sql)
# query_sqls(sqlFile)
