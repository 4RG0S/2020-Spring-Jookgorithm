dp = [[-1 for i in range(10)] for j in range(1000)]
for i in range(10):
    dp[0][i] = 1


def getDP(depth, N):
    if dp[depth][N] != -1:
        return dp[depth][N]
    dp[depth][N] = 0
    for i in range(N, 10):
        dp[depth][N] += getDP(depth - 1, i)

    return dp[depth][N]


depth = int(input())
print(sum(getDP(depth - 1, i) for i in range(10)) % 10007)
