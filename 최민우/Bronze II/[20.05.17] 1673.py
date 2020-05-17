try:
    while True:
        n, k = map(int, input().split(' '))
        result = 0
        while n >= k:
            temp = n // k
            result += k * temp
            n = n % k + temp
        result += n
        print(result)
except:
    exit(0)
