import sys
import math

input = sys.stdin.readline

x, y = map(int, input().split())

def check(num):
    if num == 1:
        return False
    else:
        for j in range(2, int(math.sqrt(num)) + 1):
            if num % j == 0:
                return False
        return True

for target in range(x, y + 1):
    if check(target):
        print(target)