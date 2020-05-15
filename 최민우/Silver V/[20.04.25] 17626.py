def optimalSquare(num, index=0, minimum=4):
    if dp[num] != -1:
        return dp[num]
    if num in sq:
        return 1
    while sq[index] <= num:
        minimum = min(minimum, optimalSquare(num - sq[index]) + 1)
        if minimum == 2:
            break
        index += 1
    return minimum


dp = [-1] * 50001
sq = []

for i in range(1, 225):
    sq.append(i * i)

for i in range(1, 50000):
    dp[i] = optimalSquare(i)

print(dp[int(input())])
