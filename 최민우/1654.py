import sys


def isCondition(targetArray, divNum, target):
    result = 0
    for targetNum in targetArray:
        result += targetNum // divNum
    return result >= target


# lanArray = []
K, N = map(int, sys.stdin.readline().rstrip().split())
lanArray = [int(sys.stdin.readline()) for _ in range(K)]
start, end = 1, max(lanArray)

while start <= end:
    mid = (start + end) // 2
    if isCondition(lanArray, mid, N):
        start = mid + 1
    else:
        end = mid - 1

print(end)
