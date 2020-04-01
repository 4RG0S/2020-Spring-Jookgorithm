num = int(input())
sets = list(map(int, input().split(' ')))
count = []
for i in range(num):
  count.append(0)

for i in range(num):
    std = -2147483648
    for j in range(i+1, num):
        d = (sets[j] - sets[i]) / (j - i)
        if d > std:
            std = d
            count[i] += 1
            count[j] += 1
res = 0
for i in range(num-1):
    if count[i] < count[i+1] :
        res = count[i+1]
print(res)
