n = int(input())
lst = [1,1,2]
for i in range(3,n,1):
    lst.append(lst[i - 1] + lst[i - 2])
print(lst[n - 1])
