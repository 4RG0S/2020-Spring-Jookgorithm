length = int(input())
for i in range(length, 0, -1):
    for j in range(length - i):
        print('',end=' ')
    for j in range(i):
        print('*', end='')
    print()
