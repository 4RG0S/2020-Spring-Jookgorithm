from math import ceil

A, B, V = map(int, input().split(' '))
print(int(ceil((V-B)/(A-B))))
