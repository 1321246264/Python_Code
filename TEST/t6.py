a = '2020-04-11'
QUARTER_YEAR = int()

aa = a.split('-')[1]

print(aa)

if(int(aa)>=1 and int(aa)<=3):
    QUARTER_YEAR = 1
elif(int(aa)>=4 and int(aa)<=6):
    QUARTER_YEAR = 2
elif(int(aa)>=7 and int(aa)<=9):
    QUARTER_YEAR =  3
elif(int(aa)>=10 and int(aa)<=12):
    QUARTER_YEAR = 4

print(QUARTER_YEAR)