a = list(input().split(' '))
c = list(input().split(' '))

for i in range(3):
    a[i] = int(a[i])
    c[i] = int(c[i])

b = [0] * 3
b[0] = c[0] - a[2]
b[1] = int(c[1] / a[1])
b[2] = c[2] - a[0]

for i in b:
    print(i, end=' ')
