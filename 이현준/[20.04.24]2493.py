import sys

read = lambda :sys.stdin.readline().strip()
from collections import deque
n = int(input())
mat = list(map(int,read().split()))
q = deque()
result = []
for i in range(n):

    while len(q)>0:
        if q[-1][1]>=mat[i]:
            result.append(q[-1][0] + 1)
            q.append([i,mat[i]])
            break
        q.pop()
    if len(q)==0:
        result.append(0)
    q.append([i,mat[i]])

for i in range(n):
    print(result[i],end=' ')