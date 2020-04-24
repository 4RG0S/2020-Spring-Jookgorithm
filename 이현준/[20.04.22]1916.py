import sys

read = lambda :sys.stdin.readline().strip()

n = int(read())
num = int(read())

mat = [[-1 for i in range(n)]for i in range(n)]

for i in range(num):
    x,y,spend = map(int,read().split())
    if mat[x-1][y-1] != -1:
        mat[x-1][y-1] = min(mat[x-1][y-1],spend)
    else:
        mat[x-1][y-1] = spend
start,dest = map(int,read().split())
start,dest = start-1,dest-1
record = [9999999999999 for i in range(n)]
#visit = [0 for i in range(n)]
record[start] = 0
#visit[start] = -1
q = [start]

while len(q)>0:
    now = q.pop(0)
    for i in range(n):
        if mat[now][i]!= -1 and i!=start:
            if record[i] > record[now]+mat[now][i]:
                record[i] = record[now]+mat[now][i]
                q.append(i)
print(record[dest])


