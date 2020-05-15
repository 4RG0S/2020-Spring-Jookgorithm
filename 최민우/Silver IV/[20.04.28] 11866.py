import sys

N, K = map(int, sys.stdin.readline().split())
array = [str(i + 1) for i in range(N)]
cur = 0
resultArray = []
for _ in range(N):
    cur += K - 1
    cur %= len(array)
    resultArray.append(array.pop(cur))
print('<' + ", ".join(resultArray) + ">")
