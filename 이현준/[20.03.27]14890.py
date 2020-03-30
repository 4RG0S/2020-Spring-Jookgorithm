import sys
sys.setrecursionlimit(10**6)
read = lambda : sys.stdin.readline().strip()
import copy
import itertools

n,l = map(int,read().split())
mat = []
pos = []
for i in range(n):
    mat.append(list(map(int,read().split())))
    pos.append((0,i))
    if (i,0) not in pos:
        pos.append((i,0))
result = 0
for (x,y) in pos:
    a,b =x,y
    l_list =[]
    flag =0
    if x ==0 or (x==0 and y==0):
        while True:
            if a >= n-1:
                result+=1
                break
            now = mat[a][b]
            next = mat[a+1][b]
            if next == now:
                a = a+1
                continue
            else :
                if abs(next-now)==1:
                    if next<now:
                        for i in range(0,l):
                            try:
                                if mat[a+1+i][b] == next and (a+1+i,b) not in l_list and a>=0 and b>=0:
                                    l_list.append((a+1+i,b))
                                else :
                                    flag = 1
                                    break
                            except IndexError:
                                flag =1
                                break
                        if flag == 1:
                            break
                        a = a+l
                    else:
                        for i in range(0,l):
                            try:
                                if mat[a-i][b] == now and (a-i,b) not in l_list and a-i>=0 and b>=0:
                                    l_list.append((a-i,b))
                                else :
                                    flag = 1
                                    break
                            except IndexError:
                                flag = 1
                                break
                        if flag == 1:
                            break
                        a = a+1

                else:
                    break
    a, b = x, y
    l_list = []
    flag = 0
    if y==0 or (x==0 and y==0):
        while True:
            if b >= n-1:
                result += 1
                break
            now = mat[a][b]
            next = mat[a][b+1]
            if next == now:
                b = b + 1
                continue
            else:
                if abs(next - now) == 1:
                    if next<now:
                        for i in range(0, l):
                            try:
                                if mat[a][b+1+i] == next and (a,b+1+i)not in l_list and a>=0 and b>=0:
                                    l_list.append((a, b+1+i))
                                else:
                                    flag = 1
                                    break
                            except IndexError:
                                flag = 1
                                break
                        if flag == 1:
                            break
                        b = b+l
                    else:
                        for i in range(0, l):
                            try:
                                if mat[a][b-i] == now and (a,b-i)not in l_list and a>=0 and b-i>=0:
                                    l_list.append((a, b-i))
                                else:
                                    flag = 1
                                    break
                            except IndexError:
                                flag = 1
                                break;
                        if flag == 1:
                            break
                        b = b+1
                else:
                    break
print(result)