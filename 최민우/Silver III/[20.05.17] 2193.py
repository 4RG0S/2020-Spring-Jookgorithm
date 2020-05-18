dp = [[-1 for i in range(2)] for j in range(90)]
dp[0][0] = 1
dp[0][1] = 1


def getDP(depth, N):
    if dp[depth][N] != -1:
        return dp[depth][N]
    dp[depth][N] = 0
    if N == 0:
        dp[depth][N] += getDP(depth - 1, 1)
    dp[depth][N] += getDP(depth - 1, 0)
    return dp[depth][N]


depth = int(input())
print(getDP(depth - 1, 1))
