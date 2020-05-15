# 나무 자르기
import sys

n, m = map(int, sys.stdin.readline().split())
namu_list = list(map(int, sys.stdin.readline().split()))

start, end = 1, max(namu_list)
while start <= end:
    mid = (start + end) // 2
    # is_condition_ok
    result = 0
    for namu in namu_list:
        if namu > mid:
            result += (namu - mid)
    if result >= m:
        start = mid + 1
    else:
        end = mid - 1
print(end)
