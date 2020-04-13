import sys
import itertools
read = lambda : sys.stdin.readline().strip()

n,m = map(int,read().split())

def cal(x,y,x_,y_):
    return abs(x-x_)+abs(y-y_)



mat = []
chicken = []
house = []
for i in range(n):
    li = list(map(int,read().split()))
    mat.append(li)
    for j in range(n):
        if mat[i][j] == 1:
            house.append((i,j))
        elif mat[i][j] == 2:
            chicken.append((i,j))

result = 39428029480932
for li in list(itertools.combinations(chicken,i)):
    results = [1000 for q in range(len(house))]

    for x,y in li:
        for q in range(len(house)):
            x_,y_ = house[q]
            results[q] = min(results[q],cal(x,y,x_,y_))
    result = min(result,sum(results))
print(result)


