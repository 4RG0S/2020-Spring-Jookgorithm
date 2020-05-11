import sys

read = lambda : sys.stdin.readline().strip()
from collections import deque

n = int(read())

for _ in range(n):
    li = list(read())
    q = deque()
    flag = 0
    for i in li:
        if i=='(':
            q.append(i)
        elif i==')':
            if len(q)==0:
                print("NO")
                flag = 1
                break
            elif q[len(q)-1]=='(':
                q.pop()
            else:
                print("NO")
                flag = 1
                break
    if flag==0 and len(q)>0:
        print("NO")
    elif flag==0 and len(q)==0:
        print("YES")
