chess = [1, 1, 2, 2, 2, 8]
inputs = input().split(' ')
for i in range(6):
    print(chess[i] - int(inputs[i]), end=' ')
