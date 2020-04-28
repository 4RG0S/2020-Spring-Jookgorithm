import sys
read = lambda : sys.stdin.readline().strip()

n,num = map(int,read().split())

mat = list(map(int,read().split()))

dp = [0 for i in range(len(mat))]
dp[0] = mat[0]

for i in range(1,len(mat)):
    dp[i] = mat[i]+dp[i-1]
#print(dp)
for i in range(num):
    i,j = map(int,read().split())
    i,j = i-1,j-1
    if i==0:
        print(dp[j])
    else:
        print(dp[j]-dp[i-1])