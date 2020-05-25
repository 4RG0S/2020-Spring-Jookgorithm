n = int(input())
s = [0, 1]
for i in range(2, abs(n) + 1):
    s.append((s[i - 1] + s[i - 2]) % 1000000000)
if n > 0 or n % 2 == 1 :
    print(1)
elif n == 0:
    print(0)
else:
    print(-1)
print(s[abs(n)])