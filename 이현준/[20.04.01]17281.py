import sys
sys.setrecursionlimit(10**6)
read = lambda : sys.stdin.readline().strip()
import copy
import itertools


n = int(read())
result_ =0
mat_ = []
for i in range(n):
    mat_.append(list(map(int, read().split())))



for order in itertools.permutations([1,2,3,4,5,6,7,8],8):
    team = list(order[:3])+[0]+list(order[3:])
    j = 0
    result = 0
    for mat in mat_:
        b1,b2,b3 = 0,0,0
        count = 0
        while count<=2:
            if mat[team[j]] == 0:
                count+=1

            elif mat[team[j]] == 1:
                result += b3
                #zone[1],zone[2],zone[3] = 1,zone[1],zone[2]
                b1,b2,b3 = 1,b1,b2

            elif mat[team[j]] == 2:
                result += (b2+b3)
                #zone[2],zone[3] = 1,zone[1]
                #zone[1] = 0
                b1,b2,b3 = 0,1,b1
            elif mat[team[j]] == 3:
                result+= (b1+b2+b3)
                b1,b2,b3 = 0,0,1
                #zone[1],zone[2] = 0,0
            elif mat[team[j]] == 4:
                result+= (b1+b2+b3+1)
                b1,b2,b3 = 0,0,0
            j = (j+1)%9

    result_ = max(result,result_)
print(result_)


