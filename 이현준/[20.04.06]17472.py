import sys
sys.setrecursionlimit(10**6)
read = lambda : sys.stdin.readline().strip()
import copy
import itertools
from heapq import *
import heapq
dx = [0,0,1,-1]
dy = [1,-1,0,0]

def dfs(x,y,num):
    global mat
    global check
    global li
    check.append((x,y))
    mat[x][y] = num
    li.append((x,y))
    for i in range(4):
        x_  = dx[i]+x
        y_ = dy[i]+y
        if x_<0 or y_<0 or x_>=m or y_>=n:
            continue
        if (x_,y_) not in check and mat[x_][y_]==1:
            mat[x_][y_] = num
            dfs(x_,y_,num)

def bfs():
    global island_distance
    que = [0]
    visit = [0 for i in range(7)]
    visit[0] = 1
    while len(que)>0:
        now = que.pop()
        for (t,d) in island_distance[now]:
            if visit[t]==0:
                que.append(t)
    if sum(visit)== len(island_distance):
        return True
    else:
        return False

def prim(fin):
    global v_dict
    global di
    global island
    mst = []

    connected_nodes = [2]
    candidate_edge_list = di[2]
    heapify(candidate_edge_list)

    while candidate_edge_list:
        weight, n1,n2 = heappop(candidate_edge_list)
        if n2 not in connected_nodes:
            connected_nodes.append(n2)
            mst.append((weight,n1,n2))

            for edge in di[n2]:
                if edge[2] not in connected_nodes:
                    heappush(candidate_edge_list,edge)
    if len(connected_nodes)!=len(island):
        return -1
    else:
        result = 0
        for a,b,c in mst:
            result+=a
        return result


m,n = map(int,read().split())
mat = []
q =[]
check = []
for i in range(m):
    mat.append(list(map(int,read().split())))
    for j in range(n):
        if mat[i][j] == 1:
            q.append((i,j))

island = []
num = 2
for (x,y) in q:
    if (x,y) in check:
        continue
    else:
        li = []
        dfs(x,y,num,)
        island.append(li)
        num+=1
di = dict()
v_dict = dict()
edge = []
island_distance = [[] for i in range(10)]
for i in range(len(island)):
    each = island[i]
    a,b = each[0]
    now = mat[a][b]
    for (x,y) in each:
        for i in range(4):
            distance = 0
            x_, y_ = (x, y)
            while(True):
                x_ = dx[i]+x_
                y_ = dy[i]+y_
                if x_ < 0 or y_ < 0 or x_ >= m or y_ >= n:
                    break
                if mat[x_][y_] == now:
                    break
                if mat[x_][y_] ==0:
                    distance+=1
                    continue
                if mat[x_][y_] != now:
                    if distance>=2:
                        flag =0
                        for j in range(len(island_distance[now])):
                            d,p,t = island_distance[now][j]
                            if t==mat[x_][y_] and distance<=d:
                                island_distance[now][j] = (distance,now,t)
                                flag = 1
                                break
                        if flag==0:
                            island_distance[now].append((distance,now,mat[x_][y_]))
                        break
                    else:
                        break
    if len(island_distance[now])==0:
        print(-1)
        exit()
    di[now] = island_distance[now]
    v_dict[now] = 0


print(prim(len(v_dict)))