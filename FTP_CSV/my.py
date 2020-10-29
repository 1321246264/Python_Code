import pymysql

dst_file_paths = 'D:\\ftpd\\20191222_110011_00_00_00_0_20191222170434_00.chk'
message = []


class Mysql(object):
    def __init__(self):
        try:
            # 打开数据库连接
            # 连接数据库所需的值，可以在__init__()中传入
            self.conn = pymysql.connect(
                host='localhost',
                port=3306,
                user="root",
                passwd='root',
                db="test",
                charset='utf8'
            )
        except Exception as e:
            print(e)
        else:
            print("connect successfully")
            # 使用 cursor() 方法创建一个游标对象 cursor
            self.cur = self.conn.cursor()

    def create_table(self, drop_sql, create_sql):
        try:
            # 使用 execute() 方法执行 SQL，如果表存在则删除
            # drop_sql="DROP TABLE IF EXISTS wwz1"
            self.cur.execute(drop_sql)
            # 执行sql语句
            self.cur.execute(create_sql)
            print("create table success")
        except Exception as e:
            print("create table error\n" + e)

    def insert(self, insert_sql):
        # 数据库插入语句
        try:
            self.cur.execute(insert_sql)
            # 提交到数据库执行
            self.conn.commit()
            message.clear()
        except Exception as e:
            print(e)
            # 发生错误时回滚
            self.conn.rollback()
            print("fail to insert new data")
        else:
            print("insert data seccess！")

    # Python查询Mysql使用
    # fetchone()方法获取单条数据, 使用fetchall()方法获取多条数据。
    # fetchone(): 该方法获取下一个查询结果集。结果集是一个对象
    # fetchall(): 接收全部的返回结果行.
    # rowcount: 这是一个只读属性，并返回执行execute()
    # 方法后影响的行数。
    def show(self, select_sql):
        try:
            self.cur.execute(select_sql)
            # fetchall()返回的结果是list，list里面再嵌套list
            res = self.cur.fetchall()
            for row in res:
                fname = row[0]
                lname = row[1]
                age = row[2]
                sex = row[3]
                income = row[4]

                # 打印结果
                print("\n fname =%s,lname =%s,age = %s, sex=%s,income=%s \n " % (fname, lname, age, sex, income))
        except  Exception as e:
            print(e + "select data fail")
        else:
            print("select data success")

    # 更新数据库
    def update(self, update_sql):
        try:
            self.cur.execute(update_sql)
            self.conn.commit()
        except Exception as e:
            print(e)
        else:
            print("update data success")

    # 删除数据库中数据
    def delete(self, delete_self):
        try:
            self.cur.execute(delete_self)
            self.conn.commit()
        except Exception as e:
            print(e)
        else:
            print("delete data success")

    # 关闭数据库连接
    def close(self):
        self.cur.close()
        self.conn.close()
        print("close database success")


def read_file(dst_file_paths):
    f = open(dst_file_paths, "r", encoding='utf-8')
    while True:
        # 逐行读取
        line = f.readlines()
        if line:
            # 处理每行\n
            line = "".join(line)
            line = line.split("\t")
            content0 = line[0]
            content1 = line[1]
            content2 = line[2]
            content3 = line[3]
            content_s = content0.split("_")
            content4 = content_s[0]
            content5 = content_s[1]
            content6 = content_s[2]
            content7 = content_s[3]
            content8 = content_s[4]
            content9 = content_s[5]
            content10 = content_s[6]
            content_ss = content10.split(".")
            content11 = content_ss[0]

            message.append(content0)
            message.append(content1)
            message.append(content2)
            message.append(content3)
            message.append(content4)
            message.append(content5)
            message.append(content6)
            message.append(content7)
            message.append(content8)
            message.append(content9)
            message.append(content10)
            message.append(content11)
        else:
            break

    f.close()

    return message


if __name__ == "__main__":
    mysql = Mysql()

    # 建表
    # drop_sql = "DROP TABLE IF EXISTS wwz1"
    # create_sql = """CREATE TABLE wwz1 (
    #        a  CHAR(30),
    #        b  CHAR(30),
    #        c CHAR(30),
    #        d CHAR(30),
    #        e CHAR(30) )"""
    # mysql.create_table(drop_sql, create_sql)

    # 添加数据
    read_file(dst_file_paths)
    insert_sql = "insert into wwz(a,b,c,d,e,f,g,h,i,j,k,l) values('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s'," \
                 "'%s','%s')" % (
                     message[0], message[1], message[2], message[3], message[4], message[5], message[6], message[7],
                     message[8], message[9], message[10], message[11])

    mysql.insert(insert_sql)

    # 查询表数据
    # select_sql = "select * from wwz1"
    # mysql.show(select_sql)

    # 更新表数据
    # update_sql = "update wwz1 set c = c + 1 where d ='%c'" % ("F")
    # mysql.update(update_sql)

    # 删除表数据
    # delete_self = 'delete from wwz1 where d = "F"'
    # mysql.delete(delete_self)

    # 关闭数据库连接
    mysql.close()
