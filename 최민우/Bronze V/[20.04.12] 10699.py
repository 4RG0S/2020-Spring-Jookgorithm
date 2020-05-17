import datetime

today = datetime.datetime.utcnow() + datetime.timedelta(hours=9)
print(today.strftime("%Y-%m-%d"))
