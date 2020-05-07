import sys
from collections import deque

input = sys.stdin.readline

for i in range(int(input())):
    command = input()
    n = int(input())
    number_list = deque(eval(input()))
    R_flag = 0
    for p in command:
        if p == 'R':
            if R_flag == 0:
                R_flag = 1
            elif R_flag == 1:
                R_flag = 0
        elif p == 'D':
            if number_list:
                if R_flag == 0:
                    number_list.popleft()
                else:
                    number_list.pop()
            else:
                print('error')
                R_flag = 2
                break
    if R_flag == 0:
        print(str(list(number_list)).replace(' ',''))
    elif R_flag == 1:
        print(str(list(number_list)[::-1]).replace(' ',''))
    