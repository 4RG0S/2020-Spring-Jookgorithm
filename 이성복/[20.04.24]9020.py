import math

limit = 10004
prime_list = [True] * limit
prime_list[0], prime_list[1] = False, False
for i in range(2, 10002):
    if prime_list[i]:
        for j in range(2*i, 10002, i):
            prime_list[j] = False

for i in range(int(input())):
    n = int(input())
    left = n // 2
    right = left
    while left > 0:
        if prime_list[left] and prime_list[right]:
            print(left, right)
            break
        else:
            left -= 1
            right += 1