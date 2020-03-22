import sys
sys.setrecursionlimit(10**6)
read = lambda : sys.stdin.readline().strip()
import copy
import itertools


def add_list(p):
    p2 = list(itertools.combinations(p,2))
    result = 0
    for i in p2:
        result += mat[i[0]][i[1]] + mat[i[1]][i[0]]
    return result
n = int(read())
people = []
mat = []
for i in range(n):
    mat.append(list(map(int,read().split())))
    people.append(i)

people_ = list(itertools.combinations(people,n//2))
back  = -1
result = 635123435435432
for j in range(len(people_)//2):
    front = people_[j]
    back_ = people_[back]
    #print(front, back_)
    front_result = add_list(front)
    back_result = add_list(back_)
    result = min(result,(abs(front_result-back_result)))
    back = back-1
print(result)