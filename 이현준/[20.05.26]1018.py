


n,m = map(int,input().split())

mat = list(map(int,input().split()))

before = 0
now = 0
value = 0
result = 13215433443
for i in range(len(mat)):

    value += mat[i]
    if value>=m:
        for j in range(before,i):
            check = value-mat[before]
            if check>=m:
                before+=1
                value = check
            else:
                break

        result = min(result,i-before+1)

if result==13215433443:
    print(0)
else:
    print(result)