n = int(input())
while 1:
    for i in range(2, n+1):
        if n % i == 0:
            n = n//i
            print(i)
            break
    if n == 1:
        break
