from math import gcd

a, b = map(int, input().split())
print('1' * gcd(a, b))
