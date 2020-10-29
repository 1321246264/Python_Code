#!/usr/bin/env python
# -*- coding:utf-8 -*-
# @Time    : 2020/7/16 2:18 下午
# @Author  : Ryh
# @Email   : 1327253700@qq.com
# @File    : settings.py
# @Software: PyCharm

"""
功能介绍:脚本修改的唯一入口,脚本中的参数,只需在此文件中配置即可
"""

"""
常量池区
"""


class _const:
    class ConstError(TypeError):
        pass

    class ConstCaseError(ConstError):
        pass

    def __setattr__(self, name, value):
        if name in self.__dict__:  # 判断键是否存在与字典中
            raise self.ConstError("Can't change const.%s" % name)
        if not name.isupper():  # 检测字符串中所有的字母是否都为大写
            raise self.ConstCaseError('Const name "%s" is not all uppercase' % name)
        self.__dict__[name] = value


const = _const()

# mysql 配置信息
const.MYSQL_IP = '10.254.16.55'
const.MYSQL_USERNAME = 'datatom'
const.MYSQL_PASSWORD = '123456'
const.MYSQL_DATABASE = 'bmnc_devops'
const.MYSQL_TRIGGER_RELY_CONF = 'workflow_trigger_rely_conf'  # etl流程触发依赖表
const.MYSQL_JOBS_TO_BE_TRIGGER_LIST = 'workflow_to_be_trigger_list'  # 待触发的作业列表
const.MYSQL_TRIGGER_COMPLETE_LIST = 'workflow_trigger_complete_list'  # 触发完成的作业列表

# Dana Studio调度页面配置信息
const.DS_USERNAME = 'irc'
const.DS_PASSWORD = 'irc'
const.DS_URL_LOGIN = 'http://10.254.16.56/danastudio/login'                    # danastudio api接口：登录
const.DS_URL_WORKFLOW_LIST = 'http://10.254.16.56/danastudio/dodox/job/list'   # danastudio api接口：查询工作流
const.DS_URL_WORKFLOW = 'http://10.254.16.56/danastudio/dodox/job/record/list'   # danastudio api接口：查询工作流
const.DS_URL_TRIGGER = 'http://10.254.16.56/danastudio/dodox/job/runnow'       # danastudio api接口：手动执行
const.DS_WORKFLOW_PARAMETER_NAME = 'HIVECONFTXDATE'           # api传参payload参数
