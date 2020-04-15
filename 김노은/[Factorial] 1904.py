#Factorial ***
N = int(input())
dp = [0] * (N+1)

dp[0] = 1
dp[1] = 2
for i in range(2, N):
    dp[i] = ((dp[i-1]%15746) + (dp[i-2]%15746)) % 15746
    # int 범위 초과 막기 위함
print(dp[N-1])
