import sys

n, m = map(int, sys.stdin.readline().split())
siteList = {}
for i in range(n):
    key, value = sys.stdin.readline().strip().split()
    siteList[key] = value
findList = [sys.stdin.readline().strip() for i in range(m)]
for k in findList:
    sys.stdout.write('%s\n' % siteList[k])
