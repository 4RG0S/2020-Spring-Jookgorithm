import sys
sys.setrecursionlimit(10**6)
read = lambda : sys.stdin.readline().strip()
import math
from collections import deque

n = int(input())
mat = list(map(int, input().split()))
def prime(num):
    if num == 1:
        return False
    elif num == 2:
        return True
    for i in range(2, num):
        if num % i == 0:
            return False
    return True
count = 0
for i in mat:
    if prime(i):
        count += 1
print(count)

print(result)