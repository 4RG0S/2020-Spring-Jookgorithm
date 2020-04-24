import sys
import math

    
input = sys.stdin.readline

limit = 123456*2 + 1
prime_list = [True] * limit
for i in range(2, int(math.sqrt(limit)) + 1):
    if prime_list[i]:
        for j in range(2*i, limit, i):
            prime_list[j] = False

while True:
    x = int(input())

    if x == 0:
        break
    tmp = prime_list[x + 1 : 2*x + 1]
    print(len([i for i in tmp if i == True]))
