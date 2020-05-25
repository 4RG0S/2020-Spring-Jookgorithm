n = int(input())
lst = []
for i in range(n):
    lst.append(int(input()))
lst.sort(reverse=True)
ans = 0
for i in range(n):
    a = lst[i] - i
    if a > 0:
        ans += a
print(ans)