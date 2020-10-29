#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Time    : 2020/10/16 16:20
# @Author  : Wangwenzhe
# @Site    :
# @File    : Statistics_WF&Script.py
# @Software: PyCharm

"""
功能介绍:
"""
import datetime
import hashlib
import json
import csv

import requests
from DS_Conf.settings import const

wfdist = {}
d = {}

# Dana Studio调度页面配置信息
DS_USERNAME = const.DS_USERNAME
DS_PASSWORD = const.DS_PASSWORD
DS_URL_LOGIN = const.DS_URL_LOGIN
DS_URL_WORKFLOW_LIST = const.DS_URL_WORKFLOW_LIST
DS_URL_WORKFLOW = const.DS_URL_WORKFLOW


def ds_get_longin_data(ds_url_login, ds_username, ds_password):
    """
    获取DS的userid和token
    :param ds_url_login: ds调度页面登陆网址
    :param ds_username: ds调度用户名
    :param ds_password: ds调度密码
    :return: ds_token(用户的身份认证token)
    """
    encry = ds_password.encode('utf-8')
    md5 = hashlib.md5()  # 获取MD5对象
    md5.update(encry)  # encry为加密内容
    password_value = md5.hexdigest()  # md5.hexdigest()为加密结果
    payload = {
        "username": ds_username, "password": password_value
    }
    r = requests.post(ds_url_login, data=json.dumps(payload))
    return json.loads(r.text)['result']['token']


def ds_get_workflowid(ds_url_workflow_list, ds_token):
    """
    获取DS中对应工作流ID
    :param ds_url_workflow_list: ds调度页面工作流列表网址
    :param ds_token: ds调度用户对应token
    :return: wfdist(ds调度对应工作流ID及名称)
    """
    payload = {
        "perpage": 1000
    }
    headers = {'Authorization': 'Bearer {}'.format(ds_token)}
    r = requests.post(ds_url_workflow_list, data=json.dumps(payload), headers=headers)
    ds_workflow_id = json.loads(r.text)['result']
    for i in ds_workflow_id:
        wfdist[i['id']] = i['name']

    return wfdist


def ds_get_workflow(ds_url_workflow_list, ds_token, workflowid):
    """
    获取DS中对应工作流ID
    :param ds_url_workflow_list: ds调度页面工作流列表网址
    :param ds_token: ds调度用户对应token
    :param workflowid: ds调度工作流ID
    :return: "开始时间", "结束时间", "执行时长"，dict{}(子任务及对应的开始、结束时间及执行时长)
    """
    payload = {
        "perpage": 10000, "id": workflowid
    }
    headers = {'Authorization': 'Bearer {}'.format(ds_token)}
    r = requests.post(ds_url_workflow_list, data=json.dumps(payload), headers=headers)

    # 未执行过的工作流
    if json.loads(r.text)['result'] is None:
        return None, None, '工作流尚未执行', {'暂无': {"start": "", "end": "", "run": ""}}
    # 有执行记录的工作流
    else:
        ds_workflow_id = json.loads(r.text)['result'][0]
        # print(ds_workflow_id)
        # 工作流正在执行
        aa = ds_workflow_id['subrecord']
        if 'starttime' in ds_workflow_id.keys() and 'endtime' not in ds_workflow_id.keys():

            for ii in range(len(aa)):
                # 已开始执行但未结束的子任务
                if 'starttime' in aa[ii].keys() and 'endtime' not in aa[ii].keys():
                    subtask_starttime = datetime.datetime.strptime(aa[ii]['starttime'], '%Y-%m-%d %H:%M:%S')
                    d[aa[ii]['name'].replace("\n", "")] = {"start": str(subtask_starttime), "end": "", "run": ""}
                # 还未开始执行的子任务
                elif 'starttime' not in aa[ii].keys() and 'endtime' not in aa[ii].keys():
                    d[aa[ii]['name'].replace("\n", "")] = {"start": "", "end": "", "run": ""}
                # 已执行结束的子任务
                elif 'starttime' in aa[ii].keys() and 'endtime' in aa[ii].keys():
                    subtask_starttime = datetime.datetime.strptime(aa[ii]['starttime'], '%Y-%m-%d %H:%M:%S')
                    subtask_endtime = datetime.datetime.strptime(aa[ii]['endtime'], '%Y-%m-%d %H:%M:%S')
                    subtask_time_str = str(subtask_endtime - subtask_starttime)

                    d[aa[ii]['name'].replace("\n", "")] = {"start": str(subtask_starttime), "end": str(subtask_endtime), "run": subtask_time_str}

            return ds_workflow_id['starttime'], None, '工作流正在执行', d
        else:
            starttime = ds_workflow_id['starttime']
            endtime = ds_workflow_id['endtime']

            start_time = datetime.datetime.strptime(starttime, '%Y-%m-%d %H:%M:%S')
            end_time = datetime.datetime.strptime(endtime, '%Y-%m-%d %H:%M:%S')

            expend_time = end_time - start_time

            for ii in range(len(aa)):
                if 'starttime' in aa[ii].keys() and 'endtime' in aa[ii].keys():
                    subtask_endtime = datetime.datetime.strptime(aa[ii]['endtime'], '%Y-%m-%d %H:%M:%S')
                    subtask_starttime = datetime.datetime.strptime(aa[ii]['starttime'], '%Y-%m-%d %H:%M:%S')
                    subtask_time_str = str(subtask_endtime - subtask_starttime)
                    d[aa[ii]['name'].replace("\n", "")] = {"start": str(subtask_starttime), "end": str(subtask_endtime), "run": subtask_time_str}
                else:
                    d[aa[ii]['name'].replace("\n", "")] = {"start": "", "end": "",
                                                           "run": ""}

                    # d[aa[ii]['name'].replace("\n", "")] = '程序报错，子任务未执行'
                    # return expend_time, '程序报错，子任务未执行'
            return ds_workflow_id['starttime'], ds_workflow_id['endtime'], expend_time, d


if __name__ == '__main__':

    # 创建文件对象
    f = open('统计工作流及任务执行时间.csv', 'w', encoding='utf-8', newline="")

    # 基于文件对象构建 csv写入对象
    csv_writer = csv.writer(f)

    ds_token = ds_get_longin_data(DS_URL_LOGIN, DS_USERNAME, DS_PASSWORD)
    a_name = ds_get_workflowid(DS_URL_WORKFLOW_LIST, ds_token)
    # 构建列表头
    csv_writer.writerow(["工作流名称", "子任务名称", "开始时间", "结束时间", "执行时长"])
    for every_id in a_name:
        wf_starttime, wf_endtime, wf_expend_time, task_namelist = ds_get_workflow(DS_URL_WORKFLOW, ds_token, every_id)
        csv_writer.writerow([a_name[every_id], "", wf_starttime, wf_endtime, wf_expend_time])
        # 写入csv文件内容
        for kv in task_namelist.items():
            csv_writer.writerow([a_name[every_id], kv[0], kv[1]["start"], kv[1]["end"],  kv[1]["run"]])
        task_namelist.clear()

    # 关闭文件
    f.close()
