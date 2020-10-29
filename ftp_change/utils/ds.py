#!/usr/bin/env python
# -*- coding:utf-8 -*-
# @Time    : 2020/8/21 2:00 下午
# @Author  : Ryh
# @Email   : 1327253700@qq.com
# @File    : ds.py
# @Software: PyCharm

"""
功能介绍:Dana Studio调度平台相关功能API
"""
import hashlib
import json
import requests


def ds_get_longin_data(ds_url_login, ds_username, ds_password):
    """
    获取DS的userid和token
    :param ds_url_login: ds调度页面登陆网址
    :param ds_username: ds调度用户名
    :param ds_password: ds调度密码
    :return: ds_token(用户的身份认证token), ds_userid(ds用户ID)
    """
    encry = ds_password.encode('utf-8')
    md5 = hashlib.md5()  # 获取MD5对象
    md5.update(encry)  # encry为加密内容
    password_value = md5.hexdigest()  # md5.hexdigest()为加密结果
    payload = {
        "username": ds_username, "password": password_value
    }
    r = requests.post(ds_url_login, data=json.dumps(payload))
    return json.loads(r.text)['result']['token'], json.loads(r.text)['result']['userid']


def ds_get_workflowid(ds_url_workflow_list, ds_token, ds_userid, ds_workflow_name):
    """
    获取DS中对应工作流ID
    :param ds_url_workflow_list: ds调度页面工作流列表网址
    :param ds_token: ds调度用户对应token
    :param ds_userid: ds调度用户ID
    :param ds_workflow_name: ds调度工作流名称
    :return: ds_workflow_id(ds调度对应工作流ID)
    """
    payload = {
        "userid": ds_userid, "searchtext": ds_workflow_name
    }
    headers = {'Authorization': 'Bearer {}'.format(ds_token)}
    r = requests.post(ds_url_workflow_list, data=json.dumps(payload), headers=headers)
    if json.loads(r.text)['code'] == 200 and len(json.loads(r.text)['result']) > 0:
        ds_workflow_id = json.loads(r.text)['result'][0]['id']
        return ds_workflow_id
    else:
        # print("can't find ds_workflow_id: %s" % ds_workflow_name)
        return False


def ds_trigger_workflow(ds_url_trigger, ds_token, ds_workflow_id):
    """
    触发DS对应工作流
    :param ds_url_trigger: ds调度页面触发工作流网址
    :param ds_token: ds调度用户对应token
    :param ds_workflow_id: ds调度对应工作流ID
    :return: True/False(触发结果:成功/失败)
    """
    payload = {
        "id": ds_workflow_id
    }
    headers = {'Authorization': 'Bearer {}'.format(ds_token)}
    r = requests.post(ds_url_trigger, data=json.dumps(payload), headers=headers)
    if json.loads(r.text)['code'] == 200:
        # print('trigger %s success!' % ds_workflow_id)
        return True
    else:
        # print('trigger %s failed!' % ds_workflow_id)
        return False
