
def check(m):
    global mat
    if m==0:
        return 0
    result = 0
    for i in mat:
        result+=i//m
    return result

k,n = map(int,input().split())

mat = []
m = 0
for i in range(k):
    a = int(input())
    mat.append(a)
    m = max(m,a)

mi = 1
answer = 0
if n==1:
    print(k)
    quit()
while mi<=m:
    mid = (m+mi)//2

    c = check(mid)
    if c>=n:

        answer = max(answer,mid)
        mi = mid+1
    else:
        m = mid - 1

print(answer)