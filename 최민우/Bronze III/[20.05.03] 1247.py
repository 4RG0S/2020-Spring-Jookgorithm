import sys

for i in range(3):
    sum = 0
    for j in range(int(sys.stdin.readline())):
        sum += int(sys.stdin.readline())
    print('-' if sum < 0 else '+' if sum > 0 else '0')
