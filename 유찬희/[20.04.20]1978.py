import math

n = input()
lst = list(map(int,input().split(' ')))

def prime(i):
    flag = 1
    for j in range(2,int(math.sqrt(i)) + 1, 1):
        if i % j == 0:
            flag = 0
            break;
    if flag == 1 and i != 1:
        return 1
    else:
        return 0
ans = 0
for i in lst:
    ans += prime(i)
print(ans)
