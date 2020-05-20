import sys

read = lambda :sys.stdin.readline().strip()
import itertools

n,m = map(int,read().split())

li = [i for i in range(1,n+1)]
for i in list(itertools.combinations(li,m)):
    st = ' '.join(map(str,i))
    print(st)
