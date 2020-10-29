# -*- coding: utf-8 -*-
"""
    @Author  : Wangwenzhe
    @Time    : 2020/07/02
    @Comment :
"""
import os
from xml.dom.minidom import parse
import csv


def readXML():
    # 读取xml文件
    domTree = parse(".\\1.xml")
    # 文档根元素
    rootNode = domTree.documentElement
    # SUMMARY
    # print(rootNode.nodeName)

    # 读取 SUMM_RECS 信息
    SUMM_RECS_ITEM_List = rootNode.getElementsByTagName("SUMM_RECS_ITEM")

    os.remove("./1.txt")

    mylog = open('1.txt', mode='a', encoding='utf-8')



    # 读取 ENTRY 中公共字段信息
    for SUMM_RECS_ITEM in SUMM_RECS_ITEM_List:

        ENTRY_List = rootNode.getElementsByTagName("ENTRY")
        for ENTRY in ENTRY_List:
            # IDENTIFIER 元素
            IDENTIFIER = ENTRY.getElementsByTagName("IDENTIFIER")[0]
            print(IDENTIFIER.nodeName + ":" + IDENTIFIER.childNodes[0].data + '\t', end='', file=mylog)

            # CCH_SETTLEMENT_DATE 元素
            CCH_SETTLEMENT_DATE = ENTRY.getElementsByTagName("CCH_SETTLEMENT_DATE")[0]
            print(CCH_SETTLEMENT_DATE.nodeName + ":" + CCH_SETTLEMENT_DATE.childNodes[0].data + '\t', end='', file=mylog)

            # SOURCE_PART_ID 元素
            SOURCE_PART_ID = ENTRY.getElementsByTagName("SOURCE_PART_ID")[0]
            print(SOURCE_PART_ID.nodeName + ":" + SOURCE_PART_ID.childNodes[0].data + '\t', end='', file=mylog)

            # SOURCE_PART_NAME 元素
            SOURCE_PART_NAME = ENTRY.getElementsByTagName("SOURCE_PART_NAME")[0]
            print(SOURCE_PART_NAME.nodeName + ":" + SOURCE_PART_NAME.childNodes[0].data + '\t', end='', file=mylog)

            # TARGET_PART_ID 元素
            TARGET_PART_ID = ENTRY.getElementsByTagName("TARGET_PART_ID")[0]
            print(TARGET_PART_ID.nodeName + ":" + TARGET_PART_ID.childNodes[0].data + '\t', end='', file=mylog)

            # TARGET_PART_NAME 元素
            TARGET_PART_NAME = ENTRY.getElementsByTagName("TARGET_PART_NAME")[0]
            print(TARGET_PART_NAME.nodeName + ":" + TARGET_PART_NAME.childNodes[0].data + '\t', end='', file=mylog)

        # SUMM_ID 元素
        SUMM_ID = SUMM_RECS_ITEM.getElementsByTagName("SUMM_ID")[0]
        print(SUMM_ID.nodeName + ":" + SUMM_ID.childNodes[0].data + '\t', end='', file=mylog)

        # DESTINATION_ID 元素
        DESTINATION_ID = SUMM_RECS_ITEM.getElementsByTagName("DESTINATION_ID")[0]
        print(DESTINATION_ID.nodeName + ":" + DESTINATION_ID.childNodes[0].data + '\t', end='', file=mylog)

        # SOURCE_ID 元素
        phone = SUMM_RECS_ITEM.getElementsByTagName("SOURCE_ID")[0]
        print(phone.nodeName + ":" + phone.childNodes[0].data + '\t', end='', file=mylog)

        # SERVICE_ID 元素
        comments = SUMM_RECS_ITEM.getElementsByTagName("SERVICE_ID")[0]
        print(comments.nodeName + ":" + comments.childNodes[0].data + '\t', end='', file=mylog)

        # ISSUER_ID 元素
        ISSUER_ID = SUMM_RECS_ITEM.getElementsByTagName("ISSUER_ID")[0]
        print(ISSUER_ID.nodeName + ":" + ISSUER_ID.childNodes[0].data + '\t', end='', file=mylog)

        # PRODUCT_TYPE 元素
        PRODUCT_TYPE = SUMM_RECS_ITEM.getElementsByTagName("PRODUCT_TYPE")[0]
        print(PRODUCT_TYPE.nodeName + ":" + PRODUCT_TYPE.childNodes[0].data + '\t', end='', file=mylog)

        # DEVICE_ID 元素
        DEVICE_ID = SUMM_RECS_ITEM.getElementsByTagName("DEVICE_ID")[0]
        print(DEVICE_ID.nodeName + ":" + DEVICE_ID.childNodes[0].data + '\t', end='', file=mylog)

        # HARDWARE_TYPE 元素
        HARDWARE_TYPE = SUMM_RECS_ITEM.getElementsByTagName("HARDWARE_TYPE")[0]
        print(HARDWARE_TYPE.nodeName + ":" + HARDWARE_TYPE.childNodes[0].data + '\t', end='', file=mylog)

        # TXN_TYPE 元素
        TXN_TYPE = SUMM_RECS_ITEM.getElementsByTagName("TXN_TYPE")[0]
        print(TXN_TYPE.nodeName + ":" + TXN_TYPE.childNodes[0].data + '\t', end='', file=mylog)

        # TXN_SUB_TYPE 元素
        TXN_SUB_TYPE = SUMM_RECS_ITEM.getElementsByTagName("TXN_SUB_TYPE")[0]
        print(TXN_SUB_TYPE.nodeName + ":" + TXN_SUB_TYPE.childNodes[0].data + '\t', end='', file=mylog)

        # PAYMENT_METHOD 元素
        PAYMENT_METHOD = SUMM_RECS_ITEM.getElementsByTagName("PAYMENT_METHOD")[0]
        print(PAYMENT_METHOD.nodeName + ":" + PAYMENT_METHOD.childNodes[0].data + '\t', end='', file=mylog)

        # FIN_TYPE 元素
        FIN_TYPE = SUMM_RECS_ITEM.getElementsByTagName("FIN_TYPE")[0]
        print(FIN_TYPE.nodeName + ":" + FIN_TYPE.childNodes[0].data + '\t', end='', file=mylog)

        # GFS_VALUE 元素
        GFS_VALUE = SUMM_RECS_ITEM.getElementsByTagName("GFS_VALUE")[0]
        print(GFS_VALUE.nodeName + ":" + GFS_VALUE.childNodes[0].data + '\t', end='', file=mylog)

        # GFS_VOLUME 元素
        GFS_VOLUME = SUMM_RECS_ITEM.getElementsByTagName("GFS_VOLUME")[0]
        print(GFS_VOLUME.nodeName + ":" + GFS_VOLUME.childNodes[0].data + '\t', end='', file=mylog)

        # NGFS_VALUE 元素
        NGFS_VALUE = SUMM_RECS_ITEM.getElementsByTagName("NGFS_VALUE")[0]
        print(NGFS_VALUE.nodeName + ":" + NGFS_VALUE.childNodes[0].data + '\t', end='', file=mylog)

        # NGFS_VOLUME 元素
        NGFS_VOLUME = SUMM_RECS_ITEM.getElementsByTagName("NGFS_VOLUME")[0]
        print(NGFS_VOLUME.nodeName + ":" + NGFS_VOLUME.childNodes[0].data + '\t', end='', file=mylog)

        # RECON_DATE 元素
        RECON_DATE = SUMM_RECS_ITEM.getElementsByTagName("RECON_DATE")[0]
        print(RECON_DATE.nodeName + ":" + RECON_DATE.childNodes[0].data + '\t', file=mylog)

    mylog.close()
    return mylog


def txt_to_csv():
    os.remove("./11.csv")

    csvFile = open("./11.csv", 'w', newline='', encoding='utf-8')
    writer = csv.writer(csvFile)
    csvRow = []

    f = open("1.txt", 'r', encoding='utf-8')
    writer.writerow(csvRow)

    f.close()
    csvFile.close()

    os.system("mkdir -p ss")

    os.remove("./11.csv")
    csvFile = open("./11.csv", 'w' , newline='', encoding='utf-8')
    writer = csv.writer(csvFile)
    csvRow=[]
    f=open("1.txt" ,'r' , encoding='utf-8')
    writer.writer(csvRow)
    f.close()
    csvFile.close()
    os.system("mkdir -p ss")
    os.remove("./11.csv")





if __name__ == '__main__':
    readXML()
    txt_to_csv()
