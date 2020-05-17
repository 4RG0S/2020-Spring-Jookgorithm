dp = [-1 for i in range(1000 + 1)]

dp[1] = 1
dp[2] = 2


def getDP(number):
    if dp[number] != -1:
        return dp[number]
    dp[number] = getDP(number - 1) + getDP(number - 2)
    return dp[number]


for i in range(1, 1000 + 1):
    getDP(i)

print(dp[int(input())] % 10007)

for i in range(1, 1000 + 1):
    print(dp[i])