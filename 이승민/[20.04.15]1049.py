N, M = list(map(int, input().split()))

m1 = 100000
m2 = 100000
res = None
for i in range(M):
    res = list(map(int, input().split()))
    m1 = min(m1, res[0])
    m2 = min(m2, res[1])

if N > 6 :
    remain = N % 6 
    quotient = N // 6 
    res = [m1*((quotient)+1), m1*quotient + m2 * remain, m2 * N]
    if remain*m2 > m1 :
        res = min(res[0:2])
    else :
        res = min(res)
else :
    res = min(m1, m2*N)
print(res)
