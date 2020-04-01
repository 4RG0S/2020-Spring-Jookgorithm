from heapq import heappush, heappop
import sys
input = sys.stdin.readline
INF = 987654321

def dijkstra(s):
    dist = [0] + [INF] * (n)
    dist[s] = 0
    heap = []
    heappush(heap, [s, 0])

    while heap:
        current, distance = heappop(heap)

        for next, nextDistance in barn[current]:
            nextDistance += distance
            if nextDistance < dist[next]:
                dist[next] = nextDistance
                heappush(heap, [next, nextDistance])
    return dist

if __name__ == "__main__":
    n, m = map(int, input().split())

    barn = [[] for i in range(n + 1)]

    for i in range(m):
        a, b = map(int, input().split())
        barn[a].append([b,1])
        barn[b].append([a,1])

    dist = dijkstra(1)
    max_dist = max(dist)

    print(dist.index(max_dist), max_dist, dist.count(max_dist))
