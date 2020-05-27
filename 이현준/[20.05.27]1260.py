from collections import deque

class node:
    def __init__(self,n):
        self.num = n
        self.vertex =[]
    def add_vertex(self,a):
        self.vertex.append((a.num,a))
        self.vertex.sort()
    def return_vertex(self):
        return self.vertex
def bfs():
    global v,graph
    q =deque()
    q.append(graph[v])
    visit = [1 for i in range(n+1)]
    visit[0] = 0
    visit[v] = 0
    while len(q)>0:
        now_n = q.popleft()
        print(now_n.num,end=" ")
        ver = now_n.return_vertex()
        for node_n,nod in ver:
            if visit[node_n]==1:
                q.append(nod)
                visit[node_n] = 0

def dfs(now):
    global graph,visit
    print(now.num,end=" ")
    visit[now.num] =1
    vertex = now.return_vertex()
    for node_n,nod in vertex:
        if visit[node_n]==0:
            dfs(nod)



n,m,v = map(int,input().split())

graph = [0 for i in range(n+1)]
for i in range(1,n+1):
    n_ = node(i)
    graph[i] = n_

edge = []
for j in range(m):
    st,ds = map(int,input().split())
    if (st,ds) not in edge:
        st_d,ds_n = graph[st],graph[ds]
        st_d.add_vertex(ds_n)
        ds_n.add_vertex(st_d)
        edge.append((st,ds))
        edge.append((ds,st))

visit = [0 for i in range(n+1)]
dfs(graph[v])

print("")
bfs()

