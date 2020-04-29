n = int(input())
lst = [1,1,2,4]
ans= []
for i in range(n):
    k = int(input())
    if (len(lst) <= k):
        for j in range(len(lst), k + 1, 1):
            lst.append(lst[j - 1] + lst[j - 2]+ lst[j - 3] + lst[j - 4])
    ans.append(lst[k])
for i in ans:
    print(i)