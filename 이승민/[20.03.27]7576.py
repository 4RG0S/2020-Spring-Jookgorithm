import sys
from collections import deque

input = sys.stdin.readline

def bfs(unriped):
    days = 1
    while tomato:
        # 방향 설정.
        dx = [0, 1, 0, -1]
        dy = [1, 0, -1, 0]

        t = tomato.popleft()
        x = t[0]; y = t[1]

        # 다음위치가 n과 m의 범위안에 있고, 0이 아니면
        # 다음 위치의 값을 지금위치의 값 + 1로 바꾸고, tomato에 다음 위치 넣고,
        # 덜익은 - 1
        for i in range(4):
            nx = x + dx[i]; ny = y + dy[i]

            if nx >= n or nx < 0 or ny >= m or ny < 0:
                continue
            if container[nx][ny] != 0:
                continue

            container[nx][ny] = container[x][y] + 1
            tomato.append((nx, ny))
            days = max(container[nx][ny], days)
            unriped -= 1

    if unriped == 0:
        print(days - 1)
    else:
        print(-1)

if __name__ == "__main__":
    # 가로, 세로.
    m, n = map(int, input().split())
    container = [[int(i) for i in input().split()] for j in range(n)]
    unriped = 0 # 덜익은.
    tomato = deque([])

    # 세로 가로만큼 돌고.
    for i in range(n):
        for j in range(m):
            if container[i][j] == 1:
                tomato.append((i,j))
            elif container[i][j] == 0:
                unriped += 1

    bfs(unriped)

