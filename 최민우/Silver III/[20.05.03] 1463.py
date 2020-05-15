dp = [-1 for i in range(1000000 + 1)]


def getDP(number):
    if dp[number] != -1:
        return dp[number]
    if number <= 3:
        result = 0 if number == 1 else 1
        dp[number] = result
        return result
    min_number = getDP(number - 1)
    if number % 3 == 0:
        min_number = min(min_number, getDP(number // 3))
    if number % 2 == 0:
        min_number = min(min_number, getDP(number // 2))
    dp[number] = min_number + 1
    return min_number + 1


for i in range(1, 1000000 + 1):
    getDP(i)

print(dp[int(input())])
