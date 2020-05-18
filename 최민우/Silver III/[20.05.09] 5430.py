from sys import stdin, stdout

case = int(stdin.readline())
for _ in range(case):
    input_string = stdin.readline()
    length = int(stdin.readline())
    array = stdin.readline().rstrip()[1:-1].split(',')
    if length == 0:
        array = []
    input_string.replace('RR', '')
    l, r, d = 0, 0, True
    for c in input_string:
        if c == 'R':
            d = not d
        elif c == 'D':
            if d:
                l += 1
            else:
                r += 1
    if l + r <= length:
        res = array[l:length - r]
        if d:
            stdout.write('[' + ','.join(res) + ']\n')
        else:
            stdout.write('[' + ','.join(res[::-1]) + ']\n')
        break
    else:
        stdout.write('error\n')
        break
