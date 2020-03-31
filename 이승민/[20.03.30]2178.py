from collections import deque

def bfs():
    dx = [0,1,0,-1]
    dy = [1,0,-1,0]

    while loc:
        x_y = loc.popleft()
        y, x = x_y[0], x_y[1]

        for i in range(4):
            nX = x + dx[i]
            nY = y + dy[i]

            if nX < 0 or nX >= m or nY < 0 or nY >= n: continue
            if maze[nY][nX] != 1: continue

            loc.append((nY, nX))
            maze[nY][nX] = maze[y][x] + 1

if __name__ == "__main__":

    n, m = map(int, input().split())
    maze = [[int(i) for i in input()] for j in range(n)]

    loc = deque([])
    loc.append((0,0))

    bfs()

    print(maze[n-1][m-1])
