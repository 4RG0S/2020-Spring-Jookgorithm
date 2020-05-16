import heapq, sys

input = sys.stdin.readline

h = []
for i in range(int(input())):
    num = int(input())
    if num == 0:
        if h:
            print(heapq.heappop(h)[1])
        else:
            print(0)
    else:
        heapq.heappush(h, (abs(num), num))