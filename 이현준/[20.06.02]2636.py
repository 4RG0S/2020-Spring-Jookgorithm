
from collections import deque

n,m = map(int,input().split())

dx = [0,0,1,-1]
dy = [1,-1,0,0]
def z_bfs2(q):
    global mat
    while len(q)>0:
        x,y = q.popleft()
        mat[x][y] = -1
        for i in range(4):
            x_ = x+dx[i]
            y_ = y+dy[i]
            if 0<=x_<n and 0<=y_<m:
                if mat[x_][y_]==0:
                    mat[x_][y_] = -1
                    q.append((x_,y_))

def z_bfs(x,y):
    q = deque()
    q.append((x,y))
    mat[x][y] = -1

    while len(q)>0:
        x,y = q.popleft()

        for i in range(4):
            x_ = x+dx[i]
            y_ = y+dy[i]
            if 0<=x_<n and 0<=y_<m:
                if mat[x_][y_]==0:
                    mat[x_][y_] = -1
                    q.append((x_,y_))

def bfs():
    global q
    num = 0
    while True:
        next_q = deque()
        z = deque()
        result = len(q)
        num+=1
        while len(q)>0:
            flag = 0
            x,y = q.popleft()
            for i in range(4):
                x_ = x+dx[i]
                y_ = y+dy[i]
                if 0<=x_<n and 0<=y_<m:
                    if mat[x_][y_]==-1:
                        #mat[x][y] = 0
                        z.append((x,y))
                        flag= 1
                        break
            if flag==0:
                next_q.append((x,y))
        
        z_bfs2(z)
        if len(next_q)==0:
            print(num)
            print(result)
            break

        q = next_q


mat = []
q = deque()
for _ in range(n):
    li = list(map(int,input().split()))
    mat.append(li)
    for j in range(m):
        if mat[_][j]==1:
            q.append((_,j))

z_bfs(0,0)

bfs()