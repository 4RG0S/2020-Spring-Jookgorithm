if __name__ == "__main__":
    n = int(input())

    dp = [[0 for i in range(n)] for j in range(n)]
    sq = [[0 for i in range(n)] for j in range(n)]

    for i in range(n):
        nums = [int(i) for i in input().split()]
        for j in range(len(nums)):
            sq[i][j] = nums[j]

    dp[0][0] = sq[0][0]
    for i in range(n-1):
        for j in range(i+1):
            dp[i+1][j] = max(dp[i+1][j], sq[i+1][j] + dp[i][j])
            dp[i+1][j+1] = max(dp[i+1][j+1], sq[i+1][j+1] + dp[i][j])

    print(max(dp[n-1]))
