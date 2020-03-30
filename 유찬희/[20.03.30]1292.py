a,b = map(int,input().split(' '))
ans = 0
lst = [1]
for i in range(0, 46) :
    for j in range(0, i) :
        lst.append(i)
for i in range(a , b + 1) :
    ans += lst[i]
print(ans)