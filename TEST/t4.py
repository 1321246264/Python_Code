cmd  = "hdfs dfs -rm -r -f {}; ".format('src_path')   # remove src_path
cmd += "hdfs dfs -mkdir -p {}; ".format('src_path')   # mkdir src_path
cmd += "hdfs dfs -cp {}/*.orc {}".format('dst_path', 'src_path')    # copy dst_path to src_path
print(cmd)