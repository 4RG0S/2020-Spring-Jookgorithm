length = int(input())
for i in range(1, length + 1):
    for j in range(length - i):
        print('', end=' ')
    for j in range(i * 2 - 1):
        print('*', end='')
    print()
