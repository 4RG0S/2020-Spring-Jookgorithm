import sys
sys.setrecursionlimit(10**6)
read = lambda : sys.stdin.readline().strip()
import copy
import itertools

def dfs(x,y):
    global paper
    global result
    if y==10:
        dfs(x+1,0)
        return
    if x==10 :
        #print('h')
        result = min(result,25-sum(paper))
        return

    if mat[x][y] == 0:
        dfs(x,y+1)
        return

    else:

        for num in range(5,0,-1):
            if paper[num]<=0 or x+num>10 or y+num>10:
                continue
            else:
                flag = 0
                for i in range(num):
                    dx = x + i
                    for j in range(num):
                        dy = y + j
                        if dx<0 or dy<0 or dx>=10 or dy>=10:
                            flag = 1
                            break
                        if mat[dx][dy] == 0:
                            flag = 1
                            break
                    if flag==1:
                        break
                if flag==0:
                    for i in range(num):
                        dx = x + i
                        for j in range(num):
                            dy = y + j
                            mat[dx][dy] = 0

                    paper[num] = paper[num]-1
                    dfs(x,y+num)
                    for i in range(num):
                        dx = x + i
                        for j in range(num):
                            dy = y + j
                            mat[dx][dy] = 1
                    paper[num] = paper[num]+1

mat = []
point = []
for i in range(10):
    a = list(map(int,read().split()))
    mat.append(a)


paper = [0,5,5,5,5,5]
result = 3490280492830942


dfs(0,0)
if result == 3490280492830942:
    print(-1)
else:
    print(result)


