count = int(input())
for i in range(count):
    c = int(input())
    lst1 = list(map(str,input().split(' ')))
    lst2 = list(map(str,input().split(' ')))
    s = list(map(str, input().split(' ')))
    pw = [0 for k in range(c)]
    for j in range(c):
        pw[j] = lst2.index(lst1[j])
    for j in range(c):
        print(s[pw[j]],end=' ')