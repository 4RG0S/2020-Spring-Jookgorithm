a, b = map(int, input().split())

see = set()
listen = set()

for i in range(a):
    see.add(input())
for i in range(b):
    listen.add(input())

result = sorted(list(see&listen))
print(len(result))
for i in result:
    print(i)
