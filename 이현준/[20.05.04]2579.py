import sys

read = lambda :sys.stdin.readline().strip()

n = int(read())
mat = [0 for i in range(301)]
dp = [0 for i in range(301)]
for i in range(n):
    mat[i] = int(read())

dp[0] = mat[0]
dp[1] = mat[0]+mat[1]
dp[2] = max(mat[0]+mat[2],mat[1]+mat[2])

for i in range(3,n):
    dp[i] = max(mat[i]+dp[i-3]+mat[i-1],mat[i]+dp[i-2])
print(dp[n-1])