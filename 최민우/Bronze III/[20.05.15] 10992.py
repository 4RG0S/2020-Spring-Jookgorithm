lines = int(input())
for line in range(1, lines):
    print(' ' * (lines - line) + '*' + ' ' * ((line - 1) * 2 - 1) + ('*' if line - 1 else ''))
print('*' * (lines * 2 - 1))