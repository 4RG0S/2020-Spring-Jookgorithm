import sys

read = lambda : sys.stdin.readline().strip()

def change2(a,dir):
    if dir == 1:
        last = a.pop(len(a) - 1)
        a.insert(0, last)
    else:
        first = a.pop(0)
        a.append(first)
    return a

def change(a, b, dir):
    x,y = 0,0
    if dir==1:
        x,y = 2,6
    else:
        x,y = 6,2

    if a[x] == b[y]:
        if dir == 1:
            last = a.pop(len(a) - 1)
            a.insert(0, last)
        else:
            first = a.pop(0)
            a.append(first)
    else:
        if dir == 1:
            last = a.pop(len(a) - 1)
            a.insert(0, last)
            first = b.pop(0)
            b.append(first)
        else:
            first = a.pop(0)
            a.append(first)
            last = b.pop(len(b) - 1)
            b.insert(0, last)
    return a,b

first = [int(i) for i in read()]
second = [int(i) for i in read()]
third =[int(i) for i in read()]
four = [int(i) for i in read()]
num = int(read())
k = [0,-1,1]
for i in range(num):
    n,direction = map(int,read().split())
    f1 = first[2]
    s_1 = second[6]
    s_2 = second[2]
    t_1 = third[6]
    t_2 = third[2]
    f  = four[6]
    if n==1:
        first = change2(first, direction)
        if f1!=s_1:
            second = change2(second,k[direction])
            if s_2!=t_1:
                third = change2(third,direction)
                if t_2!=f:
                    four = change2(four,k[direction])
    if n==2:
        second = change2(second,direction)
        if f1!=s_1:
            first = change2(first,k[direction])
        if s_2!=t_1:
            third = change2(third,k[direction])
            if t_2 !=f:
                four = change2(four,direction)
    if n==3:
        third = change2(third, direction)
        if s_2!=t_1:

            second = change2(second,k[direction])
            if f1!=s_1:
                first = change2(first,direction)
        if t_2!=f:
            four = change2(four,k[direction])
    if n==4:
        four = change2(four,direction)
        if t_2!=f:
            third = change2(third,k[direction])
            if s_2!=t_1:
                second = change2(second,direction)
                if s_1!=f1:
                    first = change2(first,k[direction])
print(first[0]*1+second[0]*2+third[0]*4+four[0]*8)




