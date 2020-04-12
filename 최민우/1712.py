A, B, C = map(int, input().split(' '))
print('-1' if C - B <= 0 else int(A / (C - B) + 1))
