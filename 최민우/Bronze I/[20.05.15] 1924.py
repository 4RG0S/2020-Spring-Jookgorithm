import datetime

yo1 = {0: 'MON', 1: 'TUE', 2: 'WED', 3: 'THU', 4: 'FRI', 5: 'SAT', 6: 'SUN'}
monday = datetime.date(2007, 1, 1)
month, day = map(int, input().split(' '))
today = datetime.date(2007, month, day)
print(yo1[(today - monday).days % 7])
