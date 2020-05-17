import sys

c = list()
for i in range(int(input())):
    inputs = sys.stdin.readline().split()
    try:
        command = inputs[0]
        if command == 'push_front':
            c.insert(0, inputs[1])
        if command == 'push_back':
            c.append(inputs[1])
        if command == 'pop_front':
            print(c.pop(0))
        if command == 'pop_back':
            print(c.pop())
        if command == 'size':
            print(len(c))
        if command == 'empty':
            print(1 if len(c) == 0 else 0)
        if command == 'front':
            print(c[0])
        if command == 'back':
            print(c[-1])
    except:
        print('-1')
