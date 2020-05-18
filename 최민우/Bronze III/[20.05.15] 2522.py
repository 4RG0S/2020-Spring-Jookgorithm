lines = int(input())
for line in range(lines):
    print(' ' * (lines - line - 1) + '*' * (line + 1))
for line in range(lines - 1, 0, -1):
    print(' ' * (lines - line) + '*' * line)
