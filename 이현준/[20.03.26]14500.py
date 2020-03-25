import sys
sys.setrecursionlimit(10**6)
read = lambda : sys.stdin.readline().strip()
import copy
import itertools

position = [
    [(0,1),(0,2),(0,3)],
    [(1,0),(2,0),(3,0)],
    [(1,0),(0,1),(1,1)],
[(1,0),(2,0),(2,1)],
[(1,0),(0,1),(0,2)],
[(0,1),(1,1),(2,1)],
[(0,1),(0,2),(-1,2)],
[(1,0),(2,0),(2,-1)],
[(1,0),(1,1),(1,2)],
[(0,1),(1,0),(2,0)],
[(0,1),(0,2),(1,2)],
[(1,0),(1,1),(2,1)],
[(0,1),(-1,1),(-1,2)],
[(1,0),(1,-1),(2,-1)],
[(0,1),(1,1),(1,2)],
[(0,1),(1,1),(0,2)],
[(0,1),(-1,1),(1,1)],
[(0,1),(-1,1),(0,2)],
[(1,0),(1,1),(2,0)],
]

n,m = map(int,read().split())
mat = []
for i in range(n):
    mat.append(list(map(int,read().split())))
flag = 0
result = 0
for i in range(n):
    for j in range(m):
        for k in range(19):
            flag = 0
            res = mat[i][j]
            for q in range(3):
                try:
                    x = i+position[k][q][0]
                    y = j+position[k][q][1]
                    res += mat[x][y]
                except IndexError:
                    flag = 1
                    break
            if flag != 1:
                result = max(result,res)
print(result)