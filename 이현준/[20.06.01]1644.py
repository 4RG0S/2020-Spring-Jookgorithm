from collections import deque

n = int(input())

a = deque()

mat = [0 for i in range(n+1)]
mat[0] = 1
mat[1] = 1
for i in range(2,n+1):
    if mat[i]==0:
        for j in range(i,n+1,i):
            mat[j] = 1
        a.append(i)

j = 0
result = 0
count = 0
for i in range(len(a)):
    result+=a[i]

    if result==n:
        count+=1
    q = j
    if result>=n:
        for k in range(q,i+1):
            result-=a[j]
            j+=1
            if result<n:
                break
            if result==n:
                count+=1
print(count)