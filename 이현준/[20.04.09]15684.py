import sys
read = lambda :sys.stdin.readline().strip()

import itertools
def search():
    global mat
    global h,n
    for i in range(n):
        x, y = 0, i

        while True:
            if x == h:
                if y != i:
                    return False
                else:
                    break
            if mat[x][y] == 0:
                x = x + 1
                continue
            if mat[x][y] == 1:
                y = y + 1
                x = x+1
                continue
            if mat[x][y] == -1:
                y = y - 1
                x = x+1
                continue
    return True
def possible(li):
    global mat
    for x,y in li:
        if mat[x][y] != 0 or mat[x][y + 1] != 0:
            return False
        for z,c in li:
            if (x,y)==(z,c):
                continue
            if x==z and abs(y-c)==1:
                return False

    return True

n,m,h= map(int,read().split())

mat = [[0 for i in range(n)]for i in range(h)]

for _ in range(m):
    a,b = map(int,read().split())
    mat[a-1][b-1] = 1
    mat[a-1][b] = -1


if h==0 or n==1:
    print(0)
    exit()

li = []
for i in range(h):
    for j in range(n-1):
        if (mat[i][j]== 0 and mat[i][j+1]==0) or (mat[i][j]==0 and mat[i][j-1]==0):
            li.append((i,j))
answer = -1

if search():
    print(0)
    exit()


for i in range(1,4):
    zero_list = list(itertools.combinations(li,i))


    for zero in zero_list:

        if possible(zero)==False:
            continue

        for x,y in zero:
            mat[x][y] = 1
            mat[x][y+1] = -1

        if search():
            answer = i
            print(i)
            exit()

        for x,y in zero:
            mat[x][y] = 0
            mat[x][y+1] = 0

print(answer)