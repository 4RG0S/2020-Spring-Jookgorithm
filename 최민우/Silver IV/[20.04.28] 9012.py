import sys
for i in range(int(sys.stdin.readline())):
    stats = 0
    varString = sys.stdin.readline()
    result = 'YES'
    for c in varString:
        if c == '(':
            stats += 1
        elif c == ')':
            stats -= 1
        if stats < 0:
            result = 'NO'
            break
    if stats != 0:
        result = 'NO'
    print(result)
