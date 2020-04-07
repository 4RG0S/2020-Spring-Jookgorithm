from collections import deque

def bfs():
    while q:
        num = q.popleft()
        if num == k: return visited[num]

        if 0 <= (num - 1) and not visited[num - 1]:
            visited[num - 1] = visited[num] + 1
            q.append(num-1)

        if num + 1 <= 100000 and not visited[num + 1]:
            visited[num + 1] = visited[num] + 1
            q.append(num+1)

        if num * 2 <= 100000 and not visited[num * 2]:
            visited[num * 2] = visited[num] + 1
            q.append(num*2)

if __name__ == "__main__":
    n, k = map(int, input().split())
    visited = [0 for i in range(100001)]
    q = deque()
    q.append(n)
    visited[n] = 0
    print(bfs())
