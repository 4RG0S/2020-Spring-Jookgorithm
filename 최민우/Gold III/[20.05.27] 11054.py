N = int(input())
array = list(map(int, input().split(' ')))

dp_u = [0 for _ in range(N)]
dp_d = [0 for __ in range(N)]

for i in range(0, N):
    var = 0
    for j in range(i):
        if array[i] > array[j]:
            var = max(var, dp_u[j])
    dp_u[i] = var + 1

for i in range(N - 1, -1, -1):
    var = 0
    for j in range(N - 1, i, -1):
        if array[i] > array[j]:
            var = max(var, dp_d[j])
    dp_d[i] = var + 1

result = []
for i in range(N):
    result.append(dp_d[i] + dp_u[i] - 1)

print(max(result))
