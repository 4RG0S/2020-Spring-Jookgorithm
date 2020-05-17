import math

n = int(input())
scale = math.ceil(math.log2(n))

dp = [0 for i in range(n + 1)]
coins = [int(2 ** x) for x in range(0, scale)]

dp[0] = 1

if n == 1:
    print(1)
else:
    for coin in coins:
        for i in range(coin, n + 1):
            dp[i] += dp[i - coin]

    print(dp[n] % 1000000000)
