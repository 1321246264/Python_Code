from impala.dbapi import connect

#获取Connect对象
conn = connect(host='cdh04.irc.com',port=21051,database='default',auth_mechanism='GSSAPI')
print(conn)

# INVALIDATE METADATA;                   //重新加载所有库中的所有表
# INVALIDATE METADATA [table]            //重新加载指定的某个表
# REFRESH [table]                             //刷新某个表
# REFRESH [table] PARTITION [partition]       //刷新某个表的某个分区


cursor = conn.cursor()
cursor.execute('show databases')
print(cursor.description)  # prints the result set's schema
results = cursor.fetchall()

print(results)
