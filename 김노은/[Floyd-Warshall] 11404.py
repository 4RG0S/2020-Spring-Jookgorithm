import sys

input = sys.stdin.readline
INF = sys.maxsize

N = int(input())
M = int(input())
G = [[INF for _ in range(N)] for _ in range(N)]

for _ in range(M):
    a, b, c = map(int, input().split())

    G[a - 1][b - 1] = min(c, G[a - 1][b - 1])

for i in range(N):
    G[i][i] = 0

for i in range(N):
    for j in range(N):
        for k in range(N):
            G[j][k] = min(G[j][k], G[j][i] + G[i][k])

for i in range(N):
    for j in range(N):
        if G[i][j] == 0 or G[i][j] == INF:
            print(0, end=" ")

        else:
            print(G[i][j], end=" ")
    print()

