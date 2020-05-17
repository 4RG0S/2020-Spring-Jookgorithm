import sys

c = list()
for i in range(int(input())):
    inputs = sys.stdin.readline().split()
    try:
        command = inputs[0]
        if command == 'push':
            c.append(inputs[1])
        if command == 'pop':
            print(c.pop())
        if command == 'size':
            print(len(c))
        if command == 'empty':
            print(1 if len(c) == 0 else 0)
        if command == 'top':
            print(c[-1])
    except:
        print('-1')
