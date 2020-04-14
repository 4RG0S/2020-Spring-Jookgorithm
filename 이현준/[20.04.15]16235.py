import sys
read = lambda : sys.stdin.readline().strip()

n,m,k = map(int,read().split())

dx = [-1,-1,-1,0,0,1,1,1]
dy = [-1,0,1,-1,1,-1,0,1]


def spring():
    for i in range(n):
        for j in range(n):
            if len(mat[i][j][1])==0:
                continue
            flag = -1
            for q in range(len(mat[i][j][1])):
                if mat[i][j][1][q] <=mat[i][j][0]:
                    mat[i][j][0] -= mat[i][j][1][q]
                    mat[i][j][1][q] += 1
                else :
                    flag = q
                    break
            if flag!= -1:
                for q in range(flag,len(mat[i][j][1])):
                    out_num = mat[i][j][1][q]
                    mat[i][j][0] += out_num//2
                mat[i][j][1] = mat[i][j][1][:flag]

def fall():
    for i in range(n):
        for j in range(n):
            mat[i][j][0]+= enery[i][j]
            if len(mat[i][j][1])==0:
                continue
            for q in range(len(mat[i][j][1])):
                if mat[i][j][1][q]%5==0:
                    for k in range(8):
                        x = i+dx[k]
                        y = j+dy[k]
                        if x<0 or y<0 or x>=n or y>=n:
                            continue
                        mat[x][y][1].insert(0,1)



mat = [[[5,[]] for i in range(n)] for j in range(n)]
enery = []
for i in range(n):
    li = list(map(int,read().split()))
    enery.append(li)

for _ in range(m):
    x,y,age = map(int,read().split())
    mat[x-1][y-1][1].append(age)

for _ in range(k):
    spring()
    fall()

result = 0
for i in range(n):
    for j in range(n):
        result+=len(mat[i][j][1])
print(result)