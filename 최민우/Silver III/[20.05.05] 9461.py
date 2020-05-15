dp = [-1 for i in range(100 + 1)]


def getDP(number):
    if dp[number] != -1:
        return dp[number]
    if number <= 3:
        dp[number] = 1
        return dp[number]
    dp[number] = getDP(number - 3) + getDP(number - 2)
    return dp[number]


for num in range(1, 100 + 1):
    getDP(num)

for test_case in range(int(input())):
    print(dp[int(input())])
