x, y = input().split()

count = float('inf')

for i in range(len(y) - len(x) + 1):
    tmp = 0
    for j in range(len(x)):
        if x[j] != y[i+j]:
            tmp += 1
    count = min(tmp, count)

print(count)