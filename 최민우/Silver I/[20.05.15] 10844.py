dp = [[-1 for i in range(10)] for j in range(100)]
for i in range(10):
    dp[0][i] = 1


def getDP(depth, N):
    if dp[depth][N] != -1:
        return dp[depth][N]
    if N == 0:
        dp[depth][N] = getDP(depth - 1, N + 1)
    elif N == 9:
        dp[depth][N] = getDP(depth - 1, N - 1)
    else:
        dp[depth][N] = getDP(depth - 1, N - 1) + getDP(depth - 1, N + 1)

    return dp[depth][N]


depth = int(input())
print(sum(getDP(depth - 1, i) for i in range(1, 10)) % 1000000000)
