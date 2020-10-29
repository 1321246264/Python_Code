#!/usr/bin/env python
# -*- coding:utf-8 -*-
# @Time    : 2020/6/2 9:40 上午
# @Author  : Ryh
# @File    : constant.py
# @Software: PyCharm

'''
功能介绍:脚本修改的唯一入口,脚本中的参数,只需在此文件中配置即可
'''

import os, sys, logging

'''
常量池区
'''


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

cwd = os.getcwd()
# 获取脚本运行时所在目录,而非脚本所在目录
path = cwd
name = '/downftp.log'


def log():
    logger = logging.getLogger()  # 初始化
    logger.setLevel(logging.INFO)  # 日志等级为INFO
    if not os.path.exists(path):
        os.system("mkdir -p %s" % path)
    log_file = path + name
    fh = logging.FileHandler(log_file, mode='a')  # 将日志输出到磁盘文件上
    fh.setLevel(logging.DEBUG)  # 日志等级为DEBUG
    formatter = logging.Formatter(
        "%(asctime)s - %(filename)s[line:%(lineno)d] - %(levelname)s: %(message)s"
    )  # 格式化日期
    fh.setFormatter(formatter)
    logger.addHandler(fh)
    return logger


log = log()

# hive 配置信息
const.HIVEIP = '10.254.52.68'
const.HIVEPORT = '10000'
const.HIVEUSERNAME = 'hive'
const.HIVEDATABASE = 'BMNC_SDATA_CSV'

# hdfs 文件存放位置配置信息
const.HDFS_PATH = '/user/hive/warehouse/bmnc_sdata_csv.db'

# mysql 配置信息
const.MYSQLIP = '10.254.52.68'
const.MYSQLUSERNAME = 'hive'
const.MYSQLPASSWORD = 'hive'
const.MYSQLDATABASE = 'hive'

# ftp 配置信息
const.FTPIP = '10.254.61.15'
const.FTPUSERNAME = 'ftpuser'
const.FTPPASSWORD = 'ftpuser'
const.FTPPORT = 21
# const.FTP_DIR = '/ftptest/interfaceFile/ACC/dwetl/etl/DATA/complete/ACC/20190814/bak/'
const.FTP_DIR = '/'
const.FTP_LOCAL_DIR = path
const.local_dir = "/wwz/"

# execl 配置信息(execl第一行的列名信息,用于作为字典的key存储列数据)
const.DATABASENAME = 'DatabaseName'
const.TABLENAME = 'TableName'
const.COLUMNINFO = 'columnInfo'
const.CONFIGURE_PATH = path + '/table_information.xlsx'

# =======================================表信息======================================#
# 自动售检票清算系统
const.INTERFACE = {
    '010001': 'CUT_PI_EXIT'
    , '010002': 'CUT_PI_ENTRY'
    , '010003': 'CUT_PI_FINANCIAL'
    , '010004': 'CUT_CI_FINANCIAL'
    , '010005': 'CUT_CARDHOLDER_FEE'
    , '010006': 'CUT_EVENT_STOCK_MANAGEMENT'
    , '010007': 'CUT_EVENT_MODE_CHANGES'
    , '010008': 'FIN_YKT_ADDVALUE_SETTLE'
    , '010009': 'FIN_YKT_REFUND_SETTLE'
    , '010010': 'FIN_YKT_SALE_SETTLE'
    , '010011': 'CUT_PI_EXIT_CMS'
    , '010012': 'CUT_CI_MAINTENANCE'
    , '010013': 'CUT_CI_BLOCKING'
    , '010014': 'CUT_PI_BLOCK'
    , '010015': 'CUT_PI_MAINTENANCE'
    , '019811': 'CUT_PI_EXIT_CMS_O'
    , '019911': 'CUT_PI_EXIT_CMS_E'
    , '020001': 'TRN_EXEC_SCH1'
    , '020002': 'PASSENGERQUANTITY'
    , '020003': 'DAILYPLAN'
    , '020004': 'ADJUST'
    , '020005': 'KILOMETER'
    , '020006': 'SERVICEKILOMETER'
    , '020007': 'DELAY'
    , '020008': 'LATER'
    , '020009': 'HALT'
    , '020010': 'PASS'
    , '020011': 'CLEAR'
    , '020012': 'DOWN'
    , '020013': 'ELECTRIC'
    , '020014': 'POWERSUPPLY'
    , '020015': 'TRAINSTAT'
    , '020016': 'DEVICEERROR'
    , '020017': 'TRAINERROR'
    , '020018': 'NOTE'
    , '020019': 'SECURITYCHECK'
    , '020020': 'TCC_NOTECLASS'
    , '020021': 'TCC_POWER'
    , '020022': 'TCC_ERROR'
    , '020023': 'TCC_IES_A'
    , '020024': 'TCC_IES_B'
    , '020025': 'TCC_NOTE'
    , '020026': 'TCC_SUGESSTION'
    , '020027': 'TCC_SERVICE'
    , '020028': 'TCC_INTERCHG_STN'
    , '020029': 'TCC_LINE'
    , '020030': 'TCC_LINE_OPR'
    , '020031': 'TCC_PLATFORM'
    , '020032': 'TCC_STATION'
    , '020033': 'TRN_ACTUAL_SCH'
    , '020034': 'TRN_EXEC_SCH'
    , '020035': 'TRN_PLAN_SCH'
    , '020036': 'EFF_TRN_ERROR_IMPORT'
    , '020037': 'EFF_TRN_SPECIALITY'
    , '020038': 'EFF_TRN_CATEGORY'
    , '020039': 'INCIDENT_IMPORT'
    , '020040': 'INCIDENT_CLASS'
    , '020041': 'INCIDENT_CATEGORY'
    , '020042': 'INCIDENT_SPECIALITY'
    , '020043': 'TCC_STAFF_LIST'
    , '020044': 'STATION_MODE_LOG'
    , '020045': 'DWM_DATE_CAPACITY_ADJUST'
    , '020046': 'DWM_DATE_CAPACITY_ADJUST_TYPE'
    , '020047': 'DWM_DATE_MODIFY_HISTORY_TYPE'
    , '020048': 'DWM_DATE_MODIFY_HISTORY'
    , '020049': 'DWM_DATE_DRILL'
    , '020050': 'DWM_DATE_FLOW_RESTRICTION'
    , '020051': 'DWM_DATE_FOREWARN'
    , '020052': 'DWM_DATE_FOREWARN_TYPE'
    , '020053': 'DWM_DATE_MEMORABILIA'
    , '020054': 'DWM_DATE_MEMORABILIA_TYPE'
    , '020055': 'DWM_DATE_PASSENGERFLOW_COMPARE'
    , '020056': 'DWM_DATE_SEALSTATION'
    , '020057': 'OIS_IMP_DAILYPLAN'
    , '020058': 'OIS_IMP_ADJUST'
    , '020059': 'OIS_IMP_NOTE'
    , '020060': 'OIS_IMP_NOTE_CATEGORY'
    , '020061': 'RBS_LARGE_EVENT'
    , '020062': 'OIS_INCIDENT_ERRORDATA'
    , '020063': 'OIS_INCIDENT_CATEGORY'
    , '020064': 'OIS_INCIDENT_CLASS'
    , '020065': 'OIS_INCIDENT_SPECIALITY'
    , '020066': 'OIS_IMP_DELAY'
    , '020067': 'OIS_IMP_LATER'
    , '020068': 'OIS_IMP_HALT'
    , '020069': 'OIS_IMP_PASS'
    , '020070': 'OIS_IMP_CLEAR'
    , '020071': 'OIS_IMP_DOWN'
    , '020072': 'OIS_IMP_TRAINSTAT'
    , '020073': 'OIS_IMP_KILOMETER'
    , '020074': 'OIS_IMP_SERVICEKILOMETER'
    , '020075': 'OIS_IMP_DEVICEERROR'
    , '020076': 'OIS_IMP_DEVICEERROR_CATEGORY'
    , '020077': 'OIS_IMP_TRAINERROR'
    , '020078': 'OIS_IMP_TRAINERROR_CATEGORY'
    , '020079': 'OIS_EFF_TRN_ERRORDATA'
    , '020080': 'OIS_EFF_TRN_CATEGORY'
    , '020081': 'OIS_EFF_TRN_SPECIALITY'
    , '020082': 'OIS_IMP_ELECTRIC'
    , '020083': 'EE_EALARM'
    , '020084': 'EE_ALARMSCENES'
    , '020085': 'EE_EALARMSTEPS'
    , '020086': 'EE_EALARMSCENEPROPERTYVALUE'
    , '020087': 'EE_EALARMPOINTS'
    , '020088': 'EE_NONSTRUCTURALDATAINFO'
    , '020089': 'EE_EALARMINDICATION'
    , '020090': 'EE_STEPPOINTS'
    , '020091': 'EE_SCENESTEPS'
    , '020092': 'EE_SCENE'
    , '020093': 'EE_SCENEPROPERTYTYPE'
    , '020094': 'DWM_DATE_SPEC_OPER_DATE_TYPE'
    , '020095': 'DWM_DATE_SPEC_OPER_DATE'
    , '020096': 'OIS_IMP_POWERSUPPLY'
    , '020097': 'OIS_IMP_SECURITYCHECK'
    , '020098': 'OIS_IMP_TCCLINE'
    , '020099': 'EE_EALARMCALLDETAIL'
    , '020100': 'EE_EALARMMEASURES'
    , '020101': 'EE_EALARMCHANGEDETAIL'
    , '020102': 'EE_SCENEPROPERTYS'
    , '020103': 'AMS_ALARM'
    , '020104': 'AMS_ALARM_DP_HISTORY'
    , '020105': 'AMS_ALARM_HISTORY'
    , '020106': 'ENTITY'
    , '020107': 'ENTITYPARAMETER'
    , '020108': 'ENTITYPARAMETERDATATYPE'
    , '020109': 'ENTITYPARAMETERVALUE'
    , '020110': 'ENTITYTYPE'
    , '020111': 'ENTITYTYPEPARENT'
    , '020112': 'LOCATION'
    , '020113': 'SE_REGION'
    , '020114': 'SUBSYSTEM'
    , '020115': 'DC_AI_ALA_CFG'
    , '020116': 'DC_DI_ALA_CFG'
    , '020117': 'DC_DIMENSION'
    , '020118': 'DC_EI_ALA_CFG'
    , '020119': 'DC_IND_CALC'
    , '020120': 'DC_LINE'
    , '020121': 'DC_OBJ'
    , '020122': 'DC_OBJ_ALA'
    , '020123': 'DC_OBJ_CFG'
    , '020124': 'DC_OBJ_MAP'
    , '020125': 'DC_STATION'
    , '020126': 'DC_SUBSYSTEM'
    , '020127': 'DC_OBJ_EVENT_HIS'
    , '020128': 'DWM_DATE_CAPACITY_ADJUST'
    , '020129': 'DWM_DATE_CAPACITY_ADJUST_TYPE'
    , '020130': 'DWM_DATE_DRILL'
    , '020131': 'DWM_DATE_FOREWARN'
    , '020132': 'DWM_DATE_FOREWARN_TYPE'
    , '020133': 'DWM_DATE_MEMORABILIA'
    , '020134': 'DWM_DATE_MEMORABILIA_TYPE'
    , '020135': 'DWM_DATE_SEALSTATION'
    , '020136': 'DWM_DATE_SPEC_OPER_DATE'
    , '020137': 'DWM_DATE_SPEC_OPER_DATE_TYPE'
    , '020138': 'DWM_DATE_TEMPFLOWRESTRICTION'
    , '020139': 'DWM_LARGE_EVENT'
    , '020140': 'DWM_SUGGESTION'
    , '020141': 'DWM_SUGGESTION_OVERVIEW'
    , '020142': 'DWM_SUGGESTION_SERVICE'
    , '020143': 'OIS_IMP_NOTE'
    , '020144': 'OIS_IMP_NOTE_CATEGORY'
    , '020145': 'OIS_IMP_POWERSUPPLY'
    , '020146': 'OIS_IMP_SECURITYCHECK'
    , '020147': 'OIS_IMP_TCCLINE'
    , '020148': 'OIS_IMP_TCCOPR'
    , '020149': 'SC_OCC_HISTORY'
    , '020150': 'SC_TCC_DP_HISTORY'
    , '020151': 'SC_TCC_HISTORY'
    , '020152': 'PIS_PREDEFINED_MSG'
    , '020153': 'PIS_SEND_MSG'
    , '020154': 'PIS_ZONE'
    , '020155': 'EQU_FAULT_TYPE'
    , '020156': 'FAULT_CLASSIFY'
    , '020157': 'FAULT_CLASSIFY_B'
    , '020158': 'FAULT_DETAILS'
    , '020159': 'FAULT_STAGE_STAT'
    , '020160': 'FAULT_STATISTICS'
    , '020161': 'FAULT_TYPE'
    , '020162': 'HISTORY_ISSUE'
    , '020163': 'HISTORY_ISSUE_STAT'
    , '020164': 'ISSUE_COLLECT'
    , '020165': 'ISSUE_STATISTICS'
    , '020166': 'OPEN_PROB_SCHEDULE'
    , '020167': 'OPER_STAGE_STAT'
    , '020168': 'OPERATING_ORG'
    , '020169': 'OPERATING_SUMMARIZE'
    , '020170': 'STAGE_TARGET'
    , '020171': 'TCC_LINE_OPER'
    , '020172': 'TRN_ADVERSARIA'
    , '020173': 'TRN_DAILY_STATISTICS'
    , '020174': 'TRN_DELAY_REASON'
    , '020175': 'TRN_FAULT_TYPE'
    , '020176': 'TRN_RUN_FAULT'
    , '020177': 'WORK_PLANNING'
    , '020178': 'EE_SCENE_PLAN'
    , '020179': 'EE_STEPS'
    , '030001': 'SYSTEM_MAINTAIN_ITEM'
    , '030002': 'SYSTEM_ALERT_INFO'
    , '030003': 'SYSTEM_ALTERATION_INFO'
    , '030004': 'DEVICE_INFORMATION'
    , '030005': 'SYSTEM_ERROR_INFO'
    , '030006': 'SYSTEM_ACCIDENT_INFO'
    , '030007': 'SERVICE_INFORMATION'
    , '071001': 'AREA_LINE_STA'
    , '071002': 'IMPORTANT_DAY_TBL'
    , '071003': 'SPCIL_TIME_TBL'
    , '071004': 'SPECIL_AREA'
    , '071005': 'TICKET_CLASS'
    , '071006': 'WORK_CAL'
    , '071007': 'WEATHER_MEASURES'
    , '071008': 'SPECIAL_DAY'
    , '071009': 'EVENT'
    , '071010': 'PUB_EVENT'
    , '071011': 'STN_SEAL'
    , '071012': 'FLOW_LIMIT'
    , '071013': 'NEW_OPEN'
    , '071014': 'OFF_LINE'
    , '071015': 'OPR_COM_ADJ'
    , '071016': 'MAP_ADJUST'
    , '071017': 'OPR_COM_ADJ_O'
    , '071018': 'EVEN_ODD'
    , '071019': 'KTK_ISSUE'
    , '071020': 'PASGR_NEW_PEAK'
    , '071021': 'INFLPOLICYEXE_O'
    , '110001': 'PI_EXIT'
    , '110002': 'PI_ENTRY'
    , '110003': 'PI_FINANCIAL'
    , '110011': 'PI_EXIT_CMS'
    , '120034': 'TRN_EXEC_SCH'
    , '120035': 'TRN_PLAN_SCH'
    , '120036': 'TRN_ACTUAL_SCH'
    , '160001': 'JX_AUT_DEVI_INFO'
    , 'A01001': 'TKT_STOCK'
    , 'A01002': 'DEVICE_RUNNING_STATUS'
    , 'A01003': 'DEVICE_ERROR'
    , 'B01001': 'BUS_ONOFF'
    , 'B01002': 'BUS_CONNECT'
    , 'B01003': 'RAILWAY_PASGR_FLOW_DATE'
    , 'B01004': 'CAPITAL_AIPORT_PAGSR_FLOW_HOUR'
    , 'B01005': 'TRAVEL_LINK_WEIGHT'
    , 'B01006': 't73_travel_link_route'
    , 'B01007': 'SUBURB_RAILWAY_PASGR'
    , 'E01001': 'ITEM_ENGCSPT_DAY_STATS'
    , 'E01002': 'ITEM_ENGCSPT_MTH_STATS'
    , 'E02001': 'PT_QUAR_STATS'
    , 'AZ2001': 'REALTM_PASGR_FLOW_Z'
    , '120034': 'TRN_EXEC_SCH'
    , '120035': 'TRN_PLAN_SCH'
    , '120036': 'TRN_EXEC_SCH'
}
