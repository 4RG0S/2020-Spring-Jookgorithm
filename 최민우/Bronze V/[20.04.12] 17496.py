a = list(input().split(' '))
for i in range(len(a)):
    a[i] = int(a[i])
print((a[0] - 1) // a[1] * a[2] * a[3])
