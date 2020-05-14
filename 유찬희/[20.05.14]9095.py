n = int(input())
dp = [1,2,4]
ans = []
for i in range(3,11,1):
    dp.append(dp[i - 1] + dp[i - 2] + dp[i - 3])
for i in range(n):
    a = int(input())
    ans.append(dp[a - 1])
for i in ans:
    print(i)