k = int(input())
lst = [0,1,1]
max = 2
for i in range(k):
    n, m = map(int, input().split(' '))
    if max < n:
        for j in range(max + 1, n + 1, 1):
            lst.append(lst[j - 1] + lst[j - 2])
        max = n
    print("Case #"+str(i+1) + ":" , lst[n] % m)
