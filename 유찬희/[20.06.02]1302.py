T = int(input())
d = {}
for i in range(T):
    name = str(input())
    if not name in d:
        d[name] = 1
    else:
        d[name] += 1
max = 0
key = d.keys()
for i in d.keys():
    if max < d[i]:
        max = d[i]
        key = i
    if max == d[i] and key > i:
        key = i
print(key)