import sys

input = sys.stdin.readline

N, M, B = map(int, input().split())
result, field = [sys.maxsize, 0], []
min_height = 256

for i in range(N):
    field.append(list(map(int, input().split())))
    min_height = min(min_height, min(field[i]))

for h in range(min_height, 257):
    time, blocks = 0, B

    for i in range(N):
        for j in range(M):
            if field[i][j] > h:
                time += 2 * (field[i][j] - h)
                blocks += field[i][j] - h

            else:
                time += h - field[i][j]
                blocks -= h - field[i][j]

    if blocks >= 0:
        if time < result[0]:
            result = [time, h]

        elif time == result[0]:
            result[1] = h

    else:
        break

print(f"{result[0]} {result[1]}")
