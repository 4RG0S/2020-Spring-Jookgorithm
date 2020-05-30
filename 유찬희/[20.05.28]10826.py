n = int(input())
lst = [0,1]
for i in range(2,n + 1,1):
    lst.append(lst[i - 1] + lst[i - 2])
print(lst[n])