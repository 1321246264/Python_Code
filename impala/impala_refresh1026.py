from impala.dbapi import connect

#获取Connect对象
conn = connect(host='cdh05.temp.irc.com',port=21050,database='default',auth_mechanism='GSSAPI')
print(conn)

# INVALIDATE METADATA;                   //重新加载所有库中的所有表
# INVALIDATE METADATA [table]            //重新加载指定的某个表
# REFRESH [table]                             //刷新某个表
# REFRESH [table] PARTITION [partition]       //刷新某个表的某个分区


cursor = conn.cursor()
cursor.execute('show tables')
# prints the result set's schema
# print(cursor.description)
results = cursor.fetchall()
print(results)

