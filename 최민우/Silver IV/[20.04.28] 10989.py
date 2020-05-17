import sys

n = int(input())
numList = [0] * 10001

for i in range(n):
    numList[int(sys.stdin.readline().rstrip())] += 1

for i in range(1, 10001):
    if numList[i] != 0:
        for j in range(numList[i]):
            sys.stdout.write('%d\n' % i)
