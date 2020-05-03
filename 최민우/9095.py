dp = [-1 for i in range(11 + 1)]
dp[1] = 1
dp[2] = 2
dp[3] = 4


def getDP(number):
    if dp[number] != -1:
        return dp[number]
    dp[number] = getDP(number - 1) + getDP(number - 2) + getDP(number - 3)
    return dp[number]


for i in range(1, 11):
    getDP(i)
for i in range(int(input())):
    print(dp[int(input())])
