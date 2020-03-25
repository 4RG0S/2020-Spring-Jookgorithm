import sys
sys.setrecursionlimit(10**6)
read = lambda : sys.stdin.readline().strip()
import copy
import itertools

class dice:

    def __init__(self):
        self.one = 0
        self.two = 0
        self.three =0
        self.four = 0
        self.five = 0
        self.six = 0

    def right(self):
        self.six,self.three,self.four,self.one = self.three,self.one,self.six,self.four
    def left(self):
        self.four,self.one,self.six,self.three = self.one,self.three,self.four,self.six
    def go(self):
        self.one,self.five,self.six,self.two = self.five,self.six,self.two,self.one
    def back(self):
        self.one,self.five,self.six,self.two  = self.two,self.one,self.five,self.six



n,m,x,y,num = map(int,read().split())
mat = []
for i in range(n):
    mat.append(list(map(int,read().split())))
order = list(map(int,read().split()))
d = dice()

dx = [-1,0,0,-1,1]
dy = [-1,1,-1,0,0]

for i in order:

    x_ = x+dx[i]
    y_ = y+dy[i]
    if x_<0 or y_<0 or x_>=n or y_>=m:
        continue
    if i == 1:
        d.right()
    if i == 2:
        d.left()
    if i== 3:
        d.go()
    if i== 4:
        d.back()
    print(d.one)
    if mat[x_][y_] == 0:
        mat[x_][y_] = d.six
        #d.six = 0
    else :
        d.six = mat[x_][y_]
        mat[x_][y_] = 0
    x,y = x_,y_