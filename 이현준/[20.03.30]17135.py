import sys
sys.setrecursionlimit(10**6)
read = lambda : sys.stdin.readline().strip()
import copy
import itertools

n,m,d = map(int,read().split())
mat_ = []
g = []
empty = []
for i in range(m):
    g.append(i)
    empty.append(0)
gungsu = list(itertools.combinations(g,3))
for i in range(n):
    mat_.append(list(map(int,read().split())))

result_ = []
dx = [0,-1,0]
dy = [-1,0,1]
for a,b,c in gungsu:
    mat = copy.deepcopy(mat_)
    result = 0

    for i in range(n):
        a_flag = 0
        b_flag = 0
        c_flag = 0
        flag = 0
        killed = []
        for k in [a,b,c]:
            q =[(n-1,k)]
            mat2 = copy.deepcopy(mat)
            while len(q)>0:
                x,y = q.pop(0)
                if mat2[x][y] == 1 and (abs(n-x)+abs(y-k))<=d:
                    if (x,y) not in killed:
                        killed.append((x,y))
                    break
                mat2[x][y] = k-9000
                for p in range(3):
                    x_ = x+dx[p]
                    y_ = y+dy[p]
                    if x_<0 or y_<0 or x_>=n or y_>=m:
                        continue
                    if (abs(n-x_)+abs(y_-k))<=d and (mat2[x_][y_]!=k-9000 ):
                        q.append((x_,y_))
        result+= len(killed)
        for (k_x,k_y) in killed:
            mat[k_x][k_y] = 0
        mat.pop(-1)
        mat.insert(0,empty)
    result_.append(result)
#print(result_)
print(max(result_))




