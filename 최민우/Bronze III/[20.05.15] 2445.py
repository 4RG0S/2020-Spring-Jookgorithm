length = int(input())
for line in range(1, length + 1):
    for j in range(line):
        print('*', end='')

    for j in range((length - line) * 2):
        print('', end=' ')

    for j in range(line):
        print('*', end='')
    print()
for line in range(length - 1, 0, -1):
    for j in range(line):
        print('*', end='')

    for j in range((length - line) * 2):
        print('', end=' ')

    for j in range(line):
        print('*', end='')
    print()
