import sys

read = lambda : sys.stdin.readline().strip()
from collections import deque
import math

n = int(read())

dx = [-1,0,1]

for _ in range(n):
    s,d = map(int,read().split())
    distance = d-s
    if distance<=3:
        print(distance)
    else:
        n = int(math.sqrt(distance))
        if distance == n**2:
            print(2*n-1)
        elif n**2<distance <= n**2+n:
            print(2*n)
        else:
            print(2*n+1)