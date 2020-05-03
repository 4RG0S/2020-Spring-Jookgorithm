from math import factorial

count = 0
n = factorial(int(input()))
while n % 10 == 0:
    n = n // 10
    count += 1
print(count)
