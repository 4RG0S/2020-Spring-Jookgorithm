N = int(input())
target = [[0 for x in range(10)] for x in range(n + 1)] 
for i in range(0, 10):
    target[1][i] = 1
   
if N >= 2:
    for i in range(2, N+1):
        for j in range(0, 10):
            dp[i][j] = sum(target[i-1][0:j+1])

print(sum(target[N])%10007)
