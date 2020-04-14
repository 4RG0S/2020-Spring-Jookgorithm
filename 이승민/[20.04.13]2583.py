from collections import deque

def bfs(i,j):
    rtn = 0

    q = deque()
    q.append([i,j])
    rtn += 1
    paper[i][j] = 1

    dx = [0,1,0,-1]
    dy = [1,0,-1,0]

    while q:
        y_x = q.popleft()
        y = y_x[0]
        x = y_x[1]

        for i in range(4):
            nx = dx[i] + x
            ny = dy[i] + y

            # 0 <= ny < m or 0 <= nx < n
            if 0 > ny or ny >= m or 0 > nx or nx >= n: continue
            if paper[ny][nx] != 0: continue

            paper[ny][nx] = 1
            rtn += 1
            q.append([ny, nx])

    return rtn

if __name__ == "__main__":
    m,n,k = map(int, input().split())
    width = list()

    paper = [[0 for i in range(n)] for j in range(m)]

    for _ in range(k):
        x1, y1, x2, y2 = map(int, input().split())

        for i in range(y1, y2):
            for j in range(x1, x2):
                paper[i][j] = 1

    cnt = 0
    for i in range(m):
        for j in range(n):
            if paper[i][j] == 0:
                width.append(bfs(i,j))
                cnt += 1

    width.sort()
    print(cnt)
    for i in width:
        print(i, end=" ")
