import sys
read = lambda : sys.stdin.readline().strip()

n,m = map(int,read().split())

def checkmat():
    global mat
    result = 0
    for i in range(n):
        #print(mat[i])
        for j in range(m):
            if mat[i][j]==0:
                result+=1
    #("-----------------------------------",result)
    return result

dx_1 = [0,1,0,-1]
dy_1 = [1,0,-1,0]

dx_2 = [(0,1),(1,2),(2,3),(0,3)]
dx_4 = [(2,3,0),(3,0,1),(0,1,2),(1,2,3)]
def dfs(num):
    global mat
    global cctv
    global result

    if num==len(cctv):
        result = min(result,checkmat())
        return
    x,y = cctv[num]
    type = mat[x][y]
    if type == 1:
        for i in range(4):
            x_, y_ = x, y
            shap = []
            while True:
                x_ = dx_1[i]+x_
                y_ = dy_1[i]+y_
                if x_<0 or y_<0 or x_>=n or y_>=m:

                    break
                if mat[x_][y_]==6:

                    break
                if mat[x_][y_]==0:
                    mat[x_][y_] = '#'
                    shap.append((x_,y_))
            dfs(num + 1)
            for x_s,y_s in shap:
                mat[x_s][y_s] = 0
    if type == 2:
        for i in range(2):
            x_1,y_1 = x,y
            x_2,y_2 = x,y
            shap = []
            flag1 = 0
            flag2 = 0
            while flag1==0 or flag2==0:
                if flag1==0:
                    x_1 = dx_1[i]+x_1
                    y_1 = dy_1[i]+y_1
                    if x_1<0 or y_1<0 or x_1>=n or y_1>=m:
                        flag1 = 1
                    elif mat[x_1][y_1]==6:
                        flag1 = 1
                    elif mat[x_1][y_1] == 0:
                        mat[x_1][y_1] ='#'
                        shap.append((x_1,y_1))
                if flag2==0:
                    x_2 = dx_1[i+2] + x_2
                    y_2 = dy_1[i+2] + y_2
                    if x_2 < 0 or y_2 < 0 or x_2 >= n or y_2 >= m:
                        flag2 = 1
                    elif mat[x_2][y_2]==6:
                        flag2 = 1
                    elif mat[x_2][y_2]==0:
                        mat[x_2][y_2] = '#'
                        shap.append((x_2, y_2))
            dfs(num+1)
            for x_s,y_s in shap:
                mat[x_s][y_s] = 0
    if type == 3:
        for i,j in dx_2:
            x_1,y_1 = x,y
            x_2,y_2 = x,y
            shap = []
            flag1 = 0
            flag2 = 0
            while flag1==0 or flag2==0:
                if flag1==0:
                    x_1 = dx_1[i]+x_1
                    y_1 = dy_1[i]+y_1
                    if x_1<0 or y_1<0 or x_1>=n or y_1>=m:
                        flag1 = 1
                    elif mat[x_1][y_1]==6:
                        flag1 = 1
                    elif mat[x_1][y_1] == 0:
                        mat[x_1][y_1] ='#'
                        shap.append((x_1,y_1))
                if flag2==0:
                    x_2 = dx_1[j] + x_2
                    y_2 = dy_1[j] + y_2
                    if x_2 < 0 or y_2 < 0 or x_2 >= n or y_2 >= m:
                        flag2 = 1
                    elif mat[x_2][y_2] ==6:
                        flag2 = 1
                    elif mat[x_2][y_2] == 0:
                        mat[x_2][y_2] = '#'
                        shap.append((x_2, y_2))
            dfs(num+1)
            for x_s,y_s in shap:
                mat[x_s][y_s] = 0
    if type == 4:
        for i,j,k in dx_4:
            x_1,y_1 = x,y
            x_2,y_2 = x,y
            x_3,y_3 = x,y
            shap = []
            flag1 = 0
            flag2 = 0
            flag3 = 0
            while flag1 == 0 or flag2 == 0 or flag3==0:
                if flag1 == 0:
                    x_1 = dx_1[i] + x_1
                    y_1 = dy_1[i] + y_1
                    if x_1 < 0 or y_1 < 0 or x_1 >= n or y_1 >= m:
                        flag1 = 1
                    elif mat[x_1][y_1]==6:
                        flag1 = 1
                    elif mat[x_1][y_1] == 0:
                        mat[x_1][y_1] = '#'
                        shap.append((x_1, y_1))
                if flag2 == 0:
                    x_2 = dx_1[j] + x_2
                    y_2 = dy_1[j] + y_2
                    if x_2 < 0 or y_2 < 0 or x_2 >= n or y_2 >= m:
                        flag2 = 1
                    elif mat[x_2][y_2]==6:
                        flag2 = 1
                    elif mat[x_2][y_2] == 0:
                        mat[x_2][y_2] = '#'
                        shap.append((x_2, y_2))

                if flag3 == 0:
                    x_3 = dx_1[k] + x_3
                    y_3 = dy_1[k] + y_3
                    if x_3 < 0 or y_3 < 0 or x_3 >= n or y_3 >= m:
                        flag3 = 1
                    elif mat[x_3][y_3] ==6:
                        flag3 = 1
                    elif mat[x_3][y_3] == 0:
                        mat[x_3][y_3] = '#'
                        shap.append((x_3, y_3))
            dfs(num + 1)
            for x_s, y_s in shap:
                mat[x_s][y_s] = 0
    if type == 5:

        x_1, y_1 = x, y
        x_2, y_2 = x, y
        x_3, y_3 = x, y
        x_4,y_4 = x,y
        shap = []
        flag1 = 0
        flag2 = 0
        flag3 = 0
        flag4 = 0
        while flag1 == 0 or flag2 == 0 or flag3 == 0 or flag4==0:
            if flag1 == 0:
                x_1 = dx_1[0] + x_1
                y_1 = dy_1[0] + y_1
                if x_1 < 0 or y_1 < 0 or x_1 >= n or y_1 >= m:
                    flag1 = 1
                elif mat[x_1][y_1] ==6:
                    flag1 = 1
                elif mat[x_1][y_1] == 0:
                    mat[x_1][y_1] = '#'
                    shap.append((x_1, y_1))
            if flag2 == 0:
                x_2 = dx_1[1] + x_2
                y_2 = dy_1[1] + y_2
                if x_2 < 0 or y_2 < 0 or x_2 >= n or y_2 >= m:
                    flag2 = 1
                elif mat[x_2][y_2] ==6 :
                    flag2 = 1
                elif mat[x_2][y_2] == 0:
                    mat[x_2][y_2] = '#'
                    shap.append((x_2, y_2))

            if flag3 == 0:
                x_3 = dx_1[2] + x_3
                y_3 = dy_1[2] + y_3
                if x_3 < 0 or y_3 < 0 or x_3 >= n or y_3 >= m:
                    flag3 = 1
                elif mat[x_3][y_3] ==6 :
                    flag3 = 1
                elif mat[x_3][y_3] == 0:
                    mat[x_3][y_3] = '#'
                    shap.append((x_3, y_3))
            if flag4 == 0:
                x_4 = dx_1[3] + x_4
                y_4 = dy_1[3] + y_4
                if x_4 < 0 or y_4 < 0 or x_4 >= n or y_4 >= m:
                    flag4 = 1
                elif mat[x_4][y_4] ==6 :
                    flag4 = 1
                elif mat[x_4][y_4] == 0:
                    mat[x_4][y_4] = '#'
                    shap.append((x_4, y_4))
        dfs(num + 1)
        for x_s, y_s in shap:
            mat[x_s][y_s] = 0



mat = []
cctv = []
result = 28034820948
for i in range(n):
    li = list(map(int,read().split()))
    mat.append(li)
    for j in range(m):
        if mat[i][j]!=0 and mat[i][j]!=6:
            cctv.append((i,j))
#print(cctv)
dfs(0)
print(result)