import sys
x = sys.stdin.readline()
y = list(map(int, sys.stdin.readline().split(' ')))
y += list(map(int, sys.stdin.readline().split(' ')))
y.sort()
print(" ".join(map(str, y)))