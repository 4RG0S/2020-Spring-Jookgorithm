num = int(input())
ans = 0
for i in range(1,num + 1, 1):
    if i < 100 :
        ans += 1
    else :
        lst = list(map(int,str(i)))
        if lst[0] - lst[1] == lst[1] - lst[2]:
            ans += 1
print(ans)