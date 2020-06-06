import collections

d = collections.defaultdict(int)

n= int(input())

li = list(map(int,input().split()))
for _ in li:
    d[_] = 1

m = int(input())

for _ in list(map(int,input().split())):
    if d[_]==0:
        print(0)
    else:
        print(1)