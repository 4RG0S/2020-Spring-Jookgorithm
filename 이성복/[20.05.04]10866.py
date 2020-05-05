import sys

input = sys.stdin.readline

queue = []

for i in range(int(input())):
    command = input().split()
    
    if command[0] == 'push_front':
        queue.insert(0, command[1])
    elif command[0] == 'push_back':
        queue.append(command[1])
    elif command[0] == 'pop_front':
        if queue:
            print(queue.pop(0))
        else:
            print(-1)
    elif command[0] == 'pop_back':
        if queue:
            print(queue.pop())
        else:
            print(-1)
    elif command[0] == 'size':
        print(len(queue))
    elif command[0] == 'empty':
        if queue:
            print(0)
        else:
            print(1)
    elif command[0] == 'front':
        if queue:
            print(queue[0])
        else:
            print(-1)
    elif command[0] == 'back':
        if queue:
            print(queue[-1])
        else:
            print(-1)