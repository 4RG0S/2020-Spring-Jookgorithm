import sys

read = lambda :sys.stdin.readline().strip()
import itertools
from collections import deque

dx = [0,0,1,-1]
dy = [1,-1,0,0]

def bfs(mat_,li):
    q = deque()
    for (x,y) in li:
        q.append((x,y))
        mat_[x][y] = 0
    longest = 0
    while len(q)>0:
        x,y = q.popleft()
        for i in range(4):
            x_ = x+dx[i]
            y_ = y+dy[i]
            if 0<=x_<n and 0<=y_<n:
                if mat_[x_][y_]==-1 or mat_[x_][y_]>=0:
                    continue
                elif mat_[x_][y_]==-3 or mat_[x_][y_]==-2:
                    if mat_[x_][y_]==-2:
                        mat_[x_][y_]= mat_[x][y]+1
                    else:
                        mat_[x_][y_] = mat_[x][y] + 1
                        longest = max(longest,mat_[x_][y_])
                    q.append((x_,y_))
    for i in range(n):
        #print(mat_[i])
        for j in range(n):
            if mat_[i][j] == -3:
                return -1
    #print("___________")
    return longest




n,m = map(int,read().split())
mat = []
virus = []
for i in range(n):
    mat.append(list(map(int,read().split())))
    for j in range(n):
        if mat[i][j]==1:
            mat[i][j] = -1
        elif mat[i][j]==2:
            virus.append((i,j))
            mat[i][j] = -2
        elif mat[i][j]==0:
            mat[i][j]=-3

result = 1000000000000
for li in list(itertools.combinations(virus,m)):
    mat_ = [[mat[i][j] for j in range(n)]for i in range(n)]

    time = bfs(mat_,li)
    #print(time, li)
    if time!=-1:
        result = min(time,result)
if result==1000000000000:
    print(-1)
else:
    print(result)