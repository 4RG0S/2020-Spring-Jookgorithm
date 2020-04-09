import sys

read  = lambda : sys.stdin.readline().strip()

def func(x):
    return (x+1)%4

zero = [[0]]
one = [[1]]
two = [[2]]
three = [[3]]
for i in range(1,11):
    zero.append(zero[i-1]+list(map(func,reversed(zero[i-1]))))
    one.append(one[i-1]+list(map(func, reversed(one[i-1]))))
    two.append(two[i-1]+list(map(func, reversed(two[i-1]))))
    three.append(three[i-1]+list(map(func, reversed(three[i-1]))))

def check(d,g):
    if d==0:
        return zero[g]
    if d==1:
        return one[g]
    if d==2:
        return two[g]
    if d==3:
        return three[g]

dx = [1,0,-1,0]
dy = [0,-1,0,1]

n = int(read())
all_list =[]
for _ in range(n):
    x,y,d,g = map(int,read().split())
    check_list = check(d,g)
    if (x, y) not in all_list:
        all_list.append((x, y))
    for i in check_list:
        x = x +dx[i]
        y = y+dy[i]
        if (x,y) not in all_list:
            all_list.append((x,y))
check_square =[]
result = 0
for x,y in all_list:
    if (x+1,y) in all_list and (x,y+1) in all_list and (x+1,y+1) in all_list:
        result+=1
print(result)