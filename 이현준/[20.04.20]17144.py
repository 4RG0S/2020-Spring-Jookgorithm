import sys
import re
read = lambda :sys.stdin.readline().strip()
import itertools


r,c,t = map(int,read().split())
mat = [[[0,0] for i in range(c)]for j in range(r)]
dust = []
robot = []
for i in range(r):
    li = list(map(int,read().split()))
    for j in range(c):
        mat[i][j][0] = li[j]
        if mat[i][j][0]==-1:
            robot.append((i,j))

dx = [0,0,1,-1]
dy = [1,-1,0,0]

for _ in range(t):

    #new_dust = []
    for x in range(r):
        for y in range(c):
            given = mat[x][y][0] // 5
            if mat[x][y][0] == 0 or given == 0 or mat[x][y][0]==-1:
                continue
            check = []
            for i in range(4):
                x_ = x+dx[i]
                y_ = y+dy[i]
                if 0<=x_<r and 0<=y_<c :
                    if mat[x_][y_][0]!=-1:

                        check.append((x_,y_))
                    #new_dust.append((x_,y_))

            mat[x][y][1] = mat[x][y][1] -(given*len(check))
            for x_,y_ in check:
                mat[x_][y_][1] = mat[x_][y_][1]+given

    for x in range(r):
        for y in range(c):
            mat[x][y][0] += mat[x][y][1]
            mat[x][y][1] = 0


    x,y = robot[0]
    for i in range(x-2,-1,-1):
        mat[i+1][y] = mat[i][y]
    for i in range(1,c):
        mat[0][i-1] = mat[0][i]
    for i in range(1,x+1):
        mat[i-1][c-1] =mat[i][c-1]
    for i in range(c-2,0,-1):
        mat[x][i+1] = mat[x][i]
    mat[x][y+1] = [0,0]

    x,y = robot[1]
    for i in range(x+2,r):
        mat[i-1][0] = mat[i][0]
    for i in range(1,c):
        mat[r-1][i-1] = mat[r-1][i]
    for i in range(r-2,x-1,-1):
        mat[i+1][c-1] = mat[i][c-1]
    for i in range(c-2,0,-1):
        mat[x][i+1] = mat[x][i]
    mat[x][y+1] = [0,0]


result= 0
for i in range(r):
    for j in range(c):
        result = result + mat[i][j][0]

print(result+2)


