import sys
n = int(sys.stdin.readline())
arr = [0] * 10001
for i in range(n):
    k = int(sys.stdin.readline())
    arr[k] += 1
for i in range(1,10001,1):
    for j in range(arr[i]):
        print(i)