import sys
input = sys.stdin.readline
from collections import deque

def bfs(i, j):
    sheep = 0
    wolf = 0
    start = field[i][j]

    if field[i][j] == 'k': sheep = 1
    elif field[i][j] == 'v': wolf = 1

    dx = [0, 1, 0, -1]
    dy = [1, 0, -1, 0]

    way = deque()
    way.append([i,j])
    field[i][j] = '#'

    while way:
        y_x = way.popleft()
        y = y_x[0]
        x = y_x[1]

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if ny < 0 or ny >= r or nx < 0 or nx >= c: continue

            if field[ny][nx] == 'k':
                sheep += 1
                way.append([ny, nx])
                field[ny][nx] = '#'
            elif field[ny][nx] == 'v':
                wolf += 1
                way.append([ny, nx])
                field[ny][nx] = '#'
            elif field[ny][nx] == '.':
                way.append([ny, nx])
                field[ny][nx] = '#'

    if sheep > wolf: return 1, sheep
    else: return 0, wolf

if __name__ == "__main__":
    # 세로, 가로
    r,c = map(int, input().split())
    field = [[0 for i in range(c)] for j in range(r)]
    for i in range(r):
        s = input()
        for j in range(len(s)-1):
            field[i][j] = s[j]

    sheep_num = 0
    wolf_num = 0

    for i in range(r):
        for j in range(c):
            num = 0
            if field[i][j] == 'k' or field[i][j] == 'v':
                (sheep_or_wolf, num) = bfs(i,j)
                if sheep_or_wolf == 1: sheep_num += num
                elif sheep_or_wolf == 0: wolf_num += num

    print(sheep_num, wolf_num)
