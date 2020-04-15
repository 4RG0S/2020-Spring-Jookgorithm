member = []
for i in range(int(input())):
    member.append(list(input().split(' ')))

member.sort(key=lambda x: int(x[0]))
for _ in member:
    print(_[0], _[1])
