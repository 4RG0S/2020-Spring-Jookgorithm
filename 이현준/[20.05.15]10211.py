import sys

read = lambda :sys.stdin.readline().strip()


t = int(read())

for _ in range(t):
    n = int(read())
    mat = list(map(int,read().split()))
    dp = [0 for i in range(n)]

    dp[0] = mat[0]

    for i in range(1,n):
        dp[i] = max(0,dp[i-1])+mat[i]
    print(dp)
    print(max(dp))