n = int(input())
a = 1
ans = 0
for i in range(2,n + 1,1):
    a = a * i
b = str(a)
for i in range(len(b) - 1, 1, -1):
    if int(b[i]) != 0:
        break
    ans += 1
print(ans)