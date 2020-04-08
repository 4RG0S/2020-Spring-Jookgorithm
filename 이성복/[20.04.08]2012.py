import sys

input = sys.stdin.readline

n = int(input())
rank = list()
for i in range(n):
    rank.append(int(input()))

rank.sort()

angry = 0
for i in range(1, n + 1):
    angry += abs(i - rank[i - 1])

print(angry)