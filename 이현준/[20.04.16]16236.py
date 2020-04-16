import sys
from _collections import deque

read = lambda : sys.stdin.readline().strip()

n = int(read())

mat = [[[0,-1] for i in range(n)]for j in range(n)]
for i in range(n):
    li = list(map(int,read().split()))
    for j in range(n):
        mat[i][j][0] = li[j]
        if li[j] == 9:
            x,y = i,j

dx = [0,0,-1,1]
dy = [1,-1,0,0]
def bfs(x,y,a,b,level):
    global mat
    q = deque()
    q.append((x,y))
    visit = [(x,y)]
    mat[x][y][1] = 0
    while len(q):
        x,y = q.popleft()
        for i in range(4):
            x_ = x+dx[i]
            y_ = y+dy[i]
            if (x_,y_)==(a,b):
                tmp  = mat[x][y][1]+1
                for (q,w) in visit:
                    mat[q][w][1] = -1
                return tmp

            if 0<=x_<n and 0<=y_<n and mat[x_][y_][0]<=level and mat[x_][y_][1]==-1:
                q.append((x_,y_))
                mat[x_][y_][1] = mat[x][y][1]+1
                visit.append((x_,y_))
    for (q, w) in visit:
        mat[q][w][1] = -1
    return 12313123
shark = 2
cnt = 0
time = 0
next_x,next_y = -1,-1
while True:
    close = 12313123
    close_list = deque()
    for i in range(n):
        for j in range(n):
            if mat[i][j][0]<shark and mat[i][j][0]!=0:
                close_list.append((i,j))
    if len(close_list)==0:
        break
    close_list = sorted(close_list)
    for d_x,d_y in close_list:
        dis = bfs(x,y,d_x,d_y,shark)
        if dis< close:
            next_x,next_y = d_x,d_y
            close = dis
    if close==12313123:
        break
    mat[x][y][0] = 0
    #print(x,y,next_x,next_y,shark,cnt,close_list)
    x,y = next_x,next_y
    mat[x][y][0] = 1000000
    cnt+=1
    if cnt==shark:
        shark+=1
        cnt = 0
    time+=close
print(time)



