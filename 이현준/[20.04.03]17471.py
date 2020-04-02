import sys
sys.setrecursionlimit(10**6)
read = lambda : sys.stdin.readline().strip()
import copy
import itertools


def combination(arr,r):
    for i in range(len(arr)):
        if r==1:
            yield [arr[i]]
        else:
            for next in combination(arr[i+1:],r-1):
                yield [arr[i]]+next

def bfs(li):
    q = [li[0]]
    visit = [0 for i in range(n)]
    visit[li[0]] = 1
    count = 1
    while len(q)>0:
        a = q.pop(0)
        for i in mat[a]:
            if visit[i]==0 and i in li:
                q.append(i)
                visit[i] = 1
                count+=1
    if count==len(li):
        return True
    else:
        False

def cal(li):
    re = 0
    for i in li:
        re+=people[i]
    return re

n = int(read())
people = list(map(int,read().split()))

mat=[]
for i in range(n):
    l = list(map(int,read().split()))
    for j in range(1,len(l)):
        l[j] = l[j]-1
    mat.append(l[1:])

member = [i for i in range(n)]
result = 1234234234
for num in range(1,n//2+1):
    for first in combination(member,num):
        second = list(set(member)-set(first))

        if bfs(first) and bfs(second):
            result = min(result,abs(cal(first)-cal(second)))
if result==1234234234:
    print(-1)
    exit()
print(result)