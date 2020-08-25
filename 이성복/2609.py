from math import gcd


def lcm(x, y):
    return x * y // gcd(x, y)


a, b = map(int, input().split())

print(gcd(a, b))
print(lcm(a, b))