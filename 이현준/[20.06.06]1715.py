import heapq,sys

n = int(sys.stdin.readline())
mat = []
for _ in range(n):
    a = int(sys.stdin.readline())
    heapq.heappush(mat,a)
if len(mat)==1:
    print(0)
elif len(mat)==2:
    print(mat[0]+mat[1])
else:
    result = 0
    while len(mat)>0:
        if len(mat)!=2:
            a = heapq.heappop(mat)
            b = heapq.heappop(mat)
            result+=(a+b)
            heapq.heappush(mat,a+b)
        else:
            a = heapq.heappop(mat)
            b = heapq.heappop(mat)
            print(a+b+result)
            break


