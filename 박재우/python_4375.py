while True:
    try:
        x = int(input())
    if x == 1:
        print('1')
        continue
    num = 1
    cnt = 1
    while True:
        num = num * 10 + 1
        cnt += 1
        if (num % x) == 0:
            print(cnt)
            break
