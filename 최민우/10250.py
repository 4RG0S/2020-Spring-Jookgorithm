from math import ceil

for i in range(int(input())):
    H, W, N = map(int, input().split())
    print('%d%02d' % (N % H if N % H else H, ceil(N / H)))
