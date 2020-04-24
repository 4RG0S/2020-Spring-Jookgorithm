def sliceBoard(x, y, board):
    slicedBoard = [['A'] * 8 for i in range(8)]
    for i in range(8):
        for j in range(8):
            slicedBoard[i][j] = board[i + y][j + x]
    return slicedBoard


def boardCount(doubleList):
    point = [0, 0]
    for i in range(8):
        for j in range(8):
            var_point = ([1, 0] if (
                    doubleList[i][j] == 'W' and (i + j) % 2 or doubleList[i][j] == 'B' and (i + j + 1) % 2) else [0,
                                                                                                                  1])
            point[0] += var_point[0]
            point[1] += var_point[1]
    return min(point)


board = [[] * 50 for i in range(50)]
height, width = map(int, input().split())

for i in range(height):
    board[i] = list(input())

result = boardCount(board)
for i in range(height - 8 + 1):
    for j in range(width - 8 + 1):
        result = min(result, boardCount(sliceBoard(j, i, board)))

print(result)
