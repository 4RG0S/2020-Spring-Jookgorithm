num = int(input())

info = []
for i in range(num):
    name, k, e, m = input().split()
    k, e, m = int(k), int(e), int(m)
    info.append([name,k,e,m])

result = sorted(info, key= lambda x : (-x[1],x[2],-x[3],x[0]))

for i in result:
    print(i[0])
