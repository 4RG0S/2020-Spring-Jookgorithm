index = 1
while True:
    string = input()
    count = 0

    if not string:
        print("{}. {}".format(index,count))
        index += 1
        continue
    if string[0] == '-':
        break
    
    stack = list()
    for i in string:
        if ((not stack) and i == '}'):
            count += 1
            stack.append('{')
        elif i == '}':
            stack.pop()
        else:
            stack.append(i)
    
    count += len(stack)//2
    print("{}. {}".format(index,count))
    index += 1