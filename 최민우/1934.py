from math import gcd

for _ in range(int(input())):
    a, b = map(int, input().split(' '))
    print(int(a * b / gcd(a, b)))