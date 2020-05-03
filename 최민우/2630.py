result = {0: 0, 1: 0}
field = []


def cutDownPaper(x1, y1, x2, y2):
    identity = field[x1][y1]
    if x1 == x2 and y1 == y2:
        result[identity] += 1
        return
    for x_gap in range(x2 - x1 + 1):
        for y_gap in range(y2 - y1 + 1):
            if field[x1 + x_gap][y1 + y_gap] != identity:
                cut_length = (x2 - x1 + 1) // 2
                cutDownPaper(x1, y1, x1 + cut_length - 1, y1 + cut_length - 1)
                cutDownPaper(x1 + cut_length, y1, x2, y1 + cut_length - 1)
                cutDownPaper(x1, y1 + cut_length, x1 + cut_length - 1, y2)
                cutDownPaper(x1 + cut_length, y1 + cut_length, x2, y2)
                return
    result[identity] += 1
    return


N = int(input())
for i in range(N):
    field.append(list(map(int, input().split())))
cutDownPaper(0, 0, N - 1, N - 1)
print(result[0])
print(result[1])

