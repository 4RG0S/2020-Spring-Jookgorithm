
def dfs(n):
    global mat
    if n==len(zero):
        for i in range(9):
            for j in range(9):
                print(mat[i][j],end=" ")
            print("")
        exit()
    x = zero[n][0]
    y = zero[n][1]

    num = [1 for i in range(10)]

    for i in range(9):
        num[mat[x][i]] = 0
        num[mat[i][y]] = 0
    start_x = (x//3)*3
    start_y = (y//3)*3

    for i in range(start_x,start_x+3):
        for j in range(start_y,start_y+3):
            num[mat[i][j]] = 0

    for i in range(1,10):
        if num[i]==1:
            #print(x,y,i)
            mat[x][y] = i
            dfs(n+1)
            mat[x][y] = 0




mat = []

zero = []
for i in range(9):
    li = list(map(int,input().split()))
    mat.append(li)
    for j in range(9):
        if li[j]==0:
            zero.append((i,j))

dfs(0)
