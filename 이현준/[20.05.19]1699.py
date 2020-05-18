import sys
sys.setrecursionlimit(10**6)
read = lambda : sys.stdin.readline().strip()
import math

n = int(input())

mat = [0 for i in range(100001)]


for i in range(1,n+1):
    mat[i] = i
    for j in range(1, i):
        if (j * j) > i:
            break

        mat[i] = min(mat[i], mat[i - j * j] + 1)

print(mat[n])