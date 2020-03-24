import sys

switch_num = int(input())
switch_status = [0] + list(map(int, sys.stdin.readline().split()))

student_numum = int(input())
student_info = [list(map(int, sys.stdin.readline().split())) for i in range(student_numum)]

for info in student_info:
    if info[0] == 1:
        for i in range(1, switch_num//info[1] + 1):
            switch_status[i * info[1]] = int(not switch_status[i * info[1]])
    else:
        switch_status[info[1]] = int(not switch_status[info[1]])
        move = 1
        while (info[1]-move) > 0 and (info[1]+move) <= switch_num and switch_status[info[1] - move] == switch_status[info[1] + move]:
            switch_status[info[1] - move] = int(not switch_status[info[1] - move])
            switch_status[info[1] + move] = int(not switch_status[info[1] + move])
            move += 1

for i in range(1, len(switch_status)):
    print(switch_status[i], end= ' ')
    if i%20 == 0:
        print()
