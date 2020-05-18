lines = int(input())
for line in range(1, lines + 1):
    print(' ' * (line - 1) + '*' * ((lines - line) * 2 + 1))

for line in range(lines - 1, 0, -1):
    print(' ' * (line - 1) + '*' * ((lines - line) * 2 + 1))
