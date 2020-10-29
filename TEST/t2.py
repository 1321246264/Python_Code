#!/usr/bin/env python
# -*- coding:utf-8 -*-
# @Time    : 2020/8/18 11:39 上午
# @Author  : Ryh
# @Email   : 1327253700@qq.com
# @File    : trigger_2.py
# @Software: PyCharm
# Modified By   : Wangwenzhe
# Modified Date   : 2020-09-21
# Modified Content: 修改脚本使程序可指定工作流执行
# Description     : 判断账期日期是否为月末或者是否为正常昨日账期，从而调用相应的工作流
import calendar
import datetime
import hashlib
import json
import globalvar

import requests

DS_USERNAME = 'irc'
DS_PASSWORD = 'irc'
DS_WORKFLOW_NAME = 'WF_LX_ACC_CMS'
DS_URL_LOGIN = 'http://10.254.16.56/danastudio/login'
DS_URL_WORKFLOW_LIST = 'http://10.254.16.56/danastudio/dodox/job/list'
DS_URL_TRIGGER = 'http://10.254.16.56/danastudio/dodox/job/runnow'


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
      "searchtext": ds_workflow_name
    }
    print(payload)
    headers = {'Authorization': 'Bearer {}'.format(ds_token)}
    r = requests.post(ds_url_workflow_list, data=json.dumps(payload), headers=headers)
    print(ds_workflow_name)
    print(json.loads(r.text))
    if json.loads(r.text)['code'] == 200 and len(json.loads(r.text)['result']) > 0:
        # ds_workflow_id = json.loads(r.text)['result'][0]['id']
        for i in json.loads(r.text)['result']:
          if i['name'] == ds_workflow_name:
            print(i['id'])
            ds_workflow_id = i['id']
        return ds_workflow_id
    else:
        # print("can't find ds_workflow_id: %s" % ds_workflow_name)
        return False


def ds_trigger_workflow(ds_url_trigger, ds_token, ds_workflow_id, customtimevars_vales):
    """
    触发DS对应工作流
    :param ds_url_trigger: ds调度页面触发工作流网址
    :param ds_token: ds调度用户对应token
    :param ds_workflow_id: ds调度对应工作流ID
    :param customtimevars_vales: ds调度任务参数(对应DATA_DT分区所用账期)
    :return: True/False(触发结果:成功/失败)
    """
    payload = {
        "id": ds_workflow_id,
        "customtimevars": [customtimevars_vales]
    }
    headers = {'Authorization': 'Bearer {}'.format(ds_token)}
    r = requests.post(ds_url_trigger, data=json.dumps(payload), headers=headers)
    print(json.loads(r.text))
    if json.loads(r.text)['code'] == 200:
        print('trigger %s success!' % ds_workflow_id)
        return True
    else:
        print('trigger %s failed!' % ds_workflow_id)
        return False


if __name__ == '__main__':
    ds_token, ds_userid = ds_get_longin_data(DS_URL_LOGIN, DS_USERNAME, DS_PASSWORD)

    date_str = globalvar.get('ETL_DATE_SHORT')

    # 判断传入日期是否为系统昨日日期
    yesterday = (datetime.datetime.now()-datetime.timedelta(days=1)).strftime('%Y%m%d')
    monthRange = calendar.monthrange(int(date_str[0:4]), int(date_str[4:6]))  # 得到本月的天数
    day_end = date_str[0:6] + str(monthRange[1])
    if yesterday == date_str:
        DS_WORKFLOW_NAME = 'STN_WF_LX_THRESHOLD_SUNDAY_END'
    elif date_str == day_end:
        DS_WORKFLOW_NAME = 'STN_WF_LX_THRESHOLD_SUNDAY_END'
    else:
        DS_WORKFLOW_NAME = 'STN_WF_LX_THRESHOLD_SUNDAY'

    # DS_WORKFLOW_NAME = 'WF_LX_ACC_T98_PASGER_BASIC'
    ds_workflow_id = ds_get_workflowid(DS_URL_WORKFLOW_LIST, ds_token, ds_userid, DS_WORKFLOW_NAME)
    print(ds_workflow_id)
    # trigger_result = ds_trigger_workflow(DS_URL_TRIGGER, ds_token, ds_workflow_id)
    DS_WORKFLOW_PARAMETER_NAME = 'HIVE_CONF_TXDATE'.replace('_', '')  # 通过字符串替换的方式防止DS时间参数替换时,把不需要替换的替换掉
    today = datetime.date.today()  # 当前日期,用来计算传入日期与当前时间的天数差
    parameter_date = 'HIVECONFTXDATE'
    # parameter_date = '2020-09-14'
    parameter_date = datetime.datetime.strptime(parameter_date, '%Y-%m-%d').date()
    datecalc = (parameter_date - today).days
    customtimevars_vales = {
        "name": DS_WORKFLOW_PARAMETER_NAME,
        "value": str(today),
        "type": "yyyy-MM-dd",
        "datecalc": datecalc
    }
    # customtimevars_vales = """[{name: "%s", value: "%s", type: "yyyy-MM-dd", datecalc: %s}]""" % (
    #     DS_WORKFLOW_PARAMETER_NAME, today, datecalc)
    # print(customtimevars_vales)
    # print(type(customtimevars_vales))
    trigger_result = ds_trigger_workflow(DS_URL_TRIGGER, ds_token, ds_workflow_id, customtimevars_vales)


