import sys

read = lambda : sys.stdin.readline().strip()

dx =[0,0,1,-1]
dy =[1,-1,0,0]

def check(x,y):

    for i in range(4):
        a = x+dx[i]
        b = y+dy[i]
        if a<0 or b<0 or a>=n or b>=n:
            continue
        chai = abs(mat[a][b] - mat[x][y])
        if l <= chai and chai <= r and (visit[a][b]==0):
            return True
    return False

def divide(uni,value):
    avg = sum(value)//len(value)
    for x,y in uni:
        mat[x][y] = avg

def dfs(x,y):

    for i in range(4):
        a = x+dx[i]
        b = y+dy[i]

        if a<0 or b<0 or a>=n or b>=n:
            continue
        chai =abs(mat[a][b] - mat[x][y])
        if l<=chai and chai<=r and (visit[a][b]==0):
            visit[a][b] = 1
            united.append((a,b))
            united_value.append(mat[a][b])
            dfs(a,b)

n,l,r = map(int,read().split())

mat = []
for _ in range(n):
    mat.append(list(map(int,read().split())))
result = 0
while True:

    visit = [[0 for i in range(n)] for j in range(n)]
    flag = 0
    for i in range(n):
        for j in range(n):
            if visit[i][j] == 1:
                continue
            united = []
            united_value = []
            if check(i,j):
                visit[i][j] = 1
                united.append((i, j))
                united_value.append(mat[i][j])
                dfs(i,j)
                divide(united,united_value)
                flag = 1

    if flag==0:
        break
    result += 1
print(result)


