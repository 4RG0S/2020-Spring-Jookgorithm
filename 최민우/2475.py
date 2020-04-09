sum = 0
for i in input().split(' '):
    sum += pow(int(i), 2)
print(sum % 10)
