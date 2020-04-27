import sys

read = lambda : sys.stdin.readline().strip()

r,c,k = map(int,read().split())

mat = []
for i in range(3):
    mat.append(list(map(int,read().split())))

def r_(mat):
    result = []
    longest = 0
    for i in mat:
        check = dict()
        for j in i:
            if j==0:
                continue
            if j not in check:
                check[j] = 1
            else:
                check[j] = check[j]+1
        li = list(zip(check.keys(),check.values()))
        li = sorted(li,key=lambda x:(x[1],x[0]))
        li = [item for t in li for item in t]
        longest = max(longest,len(li))
        result.append(li)

    for i in range(len(result)):
        if len(result[i])!=longest:
            for j in range(longest-len(result[i])):
               result[i].append(0)
        if len(result[i])>100:
            result[i] = result[i][:100]
    return result

def c_(mat):
    result = []
    longest = 0
    for i in range(len(mat[0])):
        li = list(zip(*mat))[i]
        check = dict()
        for j in li:
            if j==0:
                continue
            if j not in check:
                check[j] = 1
            else:
                check[j] = check[j]+1
        li = list(zip(check.keys(), check.values()))
        li = sorted(li, key=lambda x: (x[1], x[0]))
        li = [item for t in li for item in t]
        if len(li)>100:
            li = li[:100]
        longest = max(longest, len(li))
        result.append(li)
    result2 = [[0 for i in range(len(mat[0]))]for j in range(longest)]
    col = 0
    for j in range(len(mat[0])):

        for i in range(len(result[j])):
            result2[i][col] = result[j][i]
        col+=1
    return result2
time = 0
while True:
    m,n = len(mat),len(mat[0])
    if m>r-1 and n>c-1:
        if mat[r-1][c-1] == k:
            print(time)
            break
    if m>=n:# r
        mat = r_(mat)

    else:# c
        mat = c_(mat)
    # for i in range(len(mat)):
    #     print(mat[i])
    #
    # print("-----------------------")
    time+=1
    if time>100:
        print(-1)
        break


