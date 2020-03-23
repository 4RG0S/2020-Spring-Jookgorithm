import sys
sys.setrecursionlimit(10**6)
read = lambda : sys.stdin.readline().strip()
import copy
import itertools

def change(dirc , snake):
    result = []
    m, n = snake[0][0], snake[0][1]
    if dirc == 0:
        snake.insert(0,(m-1,n))
        snake.remove(snake[len(snake)-1])
    if dirc == 1:
        snake.insert(0, (m, n + 1))
        snake.remove(snake[len(snake) - 1])
    if dirc == 2:
        snake.insert(0, (m+1, n))
        snake.remove(snake[len(snake) - 1])
    if dirc == 3:
        snake.insert(0, (m, n - 1))
        snake.remove(snake[len(snake) - 1])
    return snake
def dr_change(dirc,c):
    if c=='D':
        return (dirc+1)%4
    else:
        q = dirc-1
        if q < 0 :
            return 3
        return q



n = int(read())
mat = [[0 for i in range(n)]for j in range(n)]
apple = int(read())
for i in range(apple):
    m,k = map(int,read().split())
    mat[m-1][k-1] = 1
direction = []
d = int(read())
for i in range(d):
    direction.append(list(read().split()))

snake = [(0,0)]
now_dir = 1
time = 1
while True:

    l_m,l_n = snake[-1]
    snake_body = snake[:]
    snake = change(now_dir,snake)
    h_m,h_n = snake[0][0],snake[0][1]
    if h_m<0 or h_m>=n or h_n<0 or h_n>=n:
        print(time)
        break
    #snake_body = snake[1:]
    if (h_m,h_n) in snake_body:
        print(time)
        break
    if mat[h_m][h_n] == 1:
        snake.append((l_m,l_n))
        mat[h_m][h_n] = 0
    if len(direction)>0:
        is_time = direction[0][0]
        if int(is_time) == time:
            z,x = direction.pop(0)
            now_dir = dr_change(now_dir,x)
    time+=1

