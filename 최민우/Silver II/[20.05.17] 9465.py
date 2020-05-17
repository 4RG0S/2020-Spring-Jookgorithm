def getDP(row, col):
    if col == 0:
        return dp[row][col]
    if col == 1:
        dp[row][col] += dp[1 - row][col - 1]
        return dp[row][col]
    dp[row][col] += max(dp[1 - row][col - 1], dp[1 - row][col - 2])
    return dp[row][col]


for T in range(int(input())):
    dp = []  # dp[row][col]
    t_col = int(input())
    dp.append(list(map(int, input().split(' '))))
    dp.append(list(map(int, input().split(' '))))

    for i in range(t_col):
        getDP(0, i)
        getDP(1, i)

    print(max(dp[0][-1], dp[1][-1]))
