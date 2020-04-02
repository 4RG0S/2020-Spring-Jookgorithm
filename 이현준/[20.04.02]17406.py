import sys
sys.setrecursionlimit(10**6)
read = lambda : sys.stdin.readline().strip()
import copy
import itertools

m,n,num  = map(int,read().split())
mat_ =[]
for i in range(m):
    mat_.append(list(map(int,read().split())))

num_list =[]
for i in range(num):
    num_list.append(list(map(int,read().split())))
result = 38450938059
for i in list(itertools.permutations(num_list,len(num_list))):
    mat = mat_.copy()
    for q in range(m):
        mat[q] = mat_[q].copy()
    for r,c,s in i:
        r,c = r-1,c-1
        for a in range(1,s+1):
            temp = mat[r-a][c-a]
            for i in range(-a,a):
                mat[r+i][c-a] = mat[r+i+1][c-a]
            for i in range(-a,a):
                mat[r+a][c+i] = mat[r+a][c+i+1]
            for i in range(-a,a):
                mat[r-i][c+a] = mat[r-i-1][c+a]
            for i in range(-a,a):
                mat[r-a][c-i] = mat[r-a][c-i-1]
            mat[r-a][c-a+1] = temp

    for i in range(m):
        result = min(result,sum(mat[i]))
print(result)





