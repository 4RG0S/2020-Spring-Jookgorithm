import sys

n, m = map(int, sys.stdin.readline().split())
dList = [sys.stdin.readline().strip() for i in range(n)]
bList = [sys.stdin.readline().strip() for i in range(m)]

dbList = list(set(dList) & set(bList))

print(len(dbList))
for c in sorted(dbList):
    print(c)
