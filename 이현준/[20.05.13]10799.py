import sys
sys.setrecursionlimit(10**6)
read = lambda : sys.stdin.readline().strip()

from collections import deque

mat = list(read())
q = deque()
b = 0
result = 0
for i in mat:
    if i=='(':
        q.append(i)
        b = i
    else:
        if b=='(':
            q.pop()
            result+=len(q)
            b = i
        else:

            q.pop()
            result +=1
            b = i
print(result)
