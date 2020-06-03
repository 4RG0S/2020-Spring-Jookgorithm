
from collections import deque
import itertools
def check(a,b,c):
    if b=='<':
        if a<c:
            return True
        else:
            return False
    else:
        if a>c:
            return True
        else:
            return False

def dfs(num,index,visit):
    global mat
    global m_num,min_num
    mat[index] = num
    visit[num] = 1
    if index==len(mat)-1:
        st =''
        for i in range(0,len(mat),2):
            st = st+str(mat[i])

        if int(m_num)<int(st):
            m_num = st
        if int(min_num)>int(st):
            min_num = st
        return
    for i in range(10):
        if visit[i]==0 and check(num,mat[index+1],i):
            dfs(i,index+2,visit)
            visit[i] = 0


n = int(input())
mat = [0 for i in range(n+n+1)]
li = input().split(' ')
t = 0
m_num = '-1'
min_num = '3284029803492804'
for i in range(1,len(mat),2):
    mat[i] = li[t]
    t+=1

for i in range(10):
    visit = [ 0 for i in range(10)]
    dfs(i,0,visit)

print(m_num)
print(min_num)