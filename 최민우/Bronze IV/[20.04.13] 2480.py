a, b, c = map(int, input().split(' '))
if a == b == c:
    print(10000+a*1000)
elif a == b or b == c or c == a:
    k = a if a == b or a == c else b
    print(1000 + k * 100)
else:
    print(max(a, b, c) * 100)
