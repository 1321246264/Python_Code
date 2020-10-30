import datetime

parameter_date = '2020-10-12'
date_format = datetime.date(*map(int, parameter_date.split('-')))
one_day = datetime.timedelta(days=1)
print(date_format)
print(type(date_format))
date_format += one_day
print(date_format)
if date_format > datetime.date(*map(int, '2020-11-1'.split('-'))):
    print('1')
else:
    print('2')

print('--------------------')

ss = ['T98_OWNLINE_ENEX_PQ_DATE_ST',
      'T98_OWNEN_OTHEX_PQ_DATE_ST',
      'T98_PASS_OWNLINE_PQ_DATE_ST',
      'T98_PASGR_QTTY_DATE_ST',
      'T98_TRAN_QTTY_DATE_ST',
      'T98_TRAN_QTTY_PERIOD_ST',
      'T98_DEC_SECT_FCRATE_PERIOD_ST',
      'T98_LINE_AVERAGE_D_ST',
      'T98_NET_AVERAGE_D_ST',
      'T98_SECT_FCRATE_PERIOD_ST',
      'CUT_PI_EXIT_CMS',
      'CUT_PI_EXIT_CMS_E',
      'CUT_PI_EXIT_CMS_O',
      'T98_PASGR_DATE_ST',
      'T98_PASGR_PERIOD_ST']

if 'T98_PASGR_DATE_ST' in ss:
    print('1')
else:
    print('2')
