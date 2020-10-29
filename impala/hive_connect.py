from impala.dbapi import connect
#获取Connect对象
conn = connect(host='cdh04.irc.com',port=10000,database='default',auth_mechanism='GSSAPI',kerberos_service_name='hive')
print(conn)

cursor = conn.cursor()
cursor.execute('show databases')
print (cursor.description)  # prints the result set's schema
results = cursor.fetchall()
print(results)

