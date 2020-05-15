import sys

read = lambda : sys.stdin.readline().strip()


n = int(read())

mat = [0 for i in range(1001)]

mat[1] = 1
mat[2] = 3
mat[3] = 5

for i in range(4,n+1):
    mat[i] = (mat[i-1]%10007+mat[i-2]*2%10007)%10007

print(mat[n])