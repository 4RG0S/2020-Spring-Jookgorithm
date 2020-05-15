import sys

for _ in range(int(sys.stdin.readline())):
    sum = 0
    sys.stdin.readline()
    num = int(sys.stdin.readline())
    for __ in range(num):
        sum += int(sys.stdin.readline())
    if not sum % num:
        print('YES')
    else:
        print('NO')