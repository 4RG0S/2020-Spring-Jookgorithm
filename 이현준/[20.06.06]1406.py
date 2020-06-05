from collections import deque
import sys
read = lambda : sys.stdin.readline().strip()
q = list(read())
q2 = []
n = int(read())
now = len(q)

for _ in range(n):
    k = read().split()
    if len(k)==2:
        order,data = k[0],k[1]
    else:
        order = k[0]
    if order=='L':
        if len(q)>0:
            q2.append(q.pop())
    elif order == 'D':
        if len(q2)>0:
            q.append(q2.pop())
    elif order == 'B':
        if len(q):
            q.pop()
    elif order == 'P':
        q.append(data)
print(''.join(q+q2[::-1]))
