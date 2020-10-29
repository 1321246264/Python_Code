def read_file(dst_file_paths):
    """
    读取本地文件
    :param dst_file_paths:要读取的本地文件路径
    :return message:返回需要的字段集合
    """
    # with open(dst_file_paths, "r", encoding='utf-8') as f:
    #     while True:
    #         # 逐行读取
    #         line = f.readlines()
    #         if len(line) == 4:
    #             if line:
    #                 # 按 \t 切分文件中的内容
    #                 line = "".join(line)
    #                 line = line.split("\t")
    #
    #                 message.append(line[0])  # 数据文件名
    #                 message.append(line[1])  # 数据文件大小，字节
    #                 message.append(line[2])  # 数据文件记录行数
    #                 message.append(line[3].split("\n")[0])  # 数据文件记录行数
    #                 return message
    #         elif len(line) == 3:
    #             if line:
    #                 # 按 \t 切分文件中的内容
    #                 line = "".join(line)
    #                 line = line.split("\t")
    #
    #                 message.append(line[0])  # 数据文件名
    #                 message.append(line[1])  # 数据文件大小，字节
    #                 message.append(line[2])  # 数据文件记录行数
    #                 return message
    #         else:
    #             break

    with open(dst_file_paths, "r", encoding='utf-8') as f:
        while True:
            # 逐行读取
            line = f.readlines()
            print(len(line))
            if line :
                # 按 \t 切分文件中的内容
                line = "".join(line).replace(",", "\t")
                line = line.split("\t")

                print(len(line))

                if len(line) == 3:

                    message.append(line[0])  # 数据文件名
                    message.append(line[1])  # 数据文件大小，字节
                    message.append(line[2])  # 数据文件记录行数
                    # message.append(line[3].split("\n")[0])  # 数据文件记录行数
                    return message
                else:

                    message.append(line[0])  # 数据文件名
                    message.append(line[1])  # 数据文件大小，字节
                    message.append(line[2])  # 数据文件记录行数
                    print(line[2])
                    message.append(line[3].split("\n")[0])  # 数据文件记录行数
                    return message
            else:
                break

def aa(original_timestamp):
    original_timestamp_list = list(original_timestamp)
    original_timestamp_list.insert(4, '-')
    original_timestamp_list.insert(7, '-')
    original_timestamp_list.insert(10, ' ')
    modified_timestamp = ''.join(original_timestamp_list)
    return modified_timestamp

if __name__ == '__main__':
    message = []
    a = read_file("C:/Users/EDZ/Desktop/q_20200806_030003_00_01_00_0.chk")
    # b = read_file("C:/Users/EDZ/Desktop/20200806_070001_01_00_00_0_20200806230503_00.chk")
    print(a)
    print(len(a))
    # print(b)
    # print(len(b))

    # original_timestamp ='2020080707:31:48'
    # oo = aa(original_timestamp)
    # print(oo)