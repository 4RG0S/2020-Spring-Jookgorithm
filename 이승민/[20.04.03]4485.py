from heapq import heappush, heappop
import sys
input = sys.stdin.readline
INF = 987654321

def dijkstra(s):
    dist = [0] + [INF] * (n*n)
    dist[s] = 0
    heap = list()
    heappush(heap, [s, cave[0][0]])

    while heap:
        current, distance = heappop(heap)

        for i in graph[current]:
            next, nextDistance = i[0], i[1]
            nextDistance += distance
            if nextDistance < dist[next]:
                dist[next] = nextDistance
                heappush(heap, [next, nextDistance])

    return dist

if __name__ == "__main__":
    count = 0
    while True:
        n = int(input())
        if n == 0: break
        cave = [[int(i) for i in input().split()] for j in range(n)]
        graph = dict()
        for i in range(1, n*n + 1): graph[i] = list()

        for i in range(n):
            for j in range(n):
                # 오른
                if i*n + j + 2 < n*n + 1 and j + 1 < n:
                        graph[i*n + j + 1].append([i*n + j + 2, cave[i][j + 1]])
                # 아래
                if i*n + j + 1 + n < n*n + 1 and i + 1 < n:
                    graph[i*n + j + 1].append([i*n + j + 1 + n, cave[i + 1][j]])
                # 위
                if i*n + j + 1 - n >= 0 and i - 1 >= 0:
                    graph[i*n + j + 1].append([i*n + j + 1 - n, cave[i - 1][j]])
                # 왼
                if i*n + j >= 0 and j - 1 >= 0:
                    graph[i*n + j + 1].append([i*n + j, cave[i][j - 1]])

        # print(graph)
        dist = dijkstra(1)
        count += 1
        print("Problem %d:" % count, dist[n*n])
