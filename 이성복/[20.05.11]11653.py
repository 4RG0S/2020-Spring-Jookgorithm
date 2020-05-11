import math

N = int(input())

result = []

for i in range(2, int(math.sqrt(N)) + 1):
    while N % i == 0:
        print(i)
        N = N // i

if N != 1:
    print(N)