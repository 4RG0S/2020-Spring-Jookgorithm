# Permutation *** 

import sys
import itertools
read = sys.stdin.readline

cache = {}

def factorial_recursive(n):
    global cache

    if n in cache:
        return cache[n]
    elif n <= 1:
        return 1
    else:
        cache[n] = n * factorial_recursive(n-1)
        return cache[n]

    return n * factorial_recursive(n-1) if n > 1 else 1

N = int(read())
inputList = list(map(int, read().split()))

if inputList[0] == 1:
    K = inputList[1]
    ans = []
    nums = list(range(1, N+1))
    key = K

    for i in range(N):
        X = factorial_recursive(N-1-i)
        step = (key-1) // X
        ans.append(nums[step])
        nums.remove(nums[step])
        key -= X * (step)
    for i in ans:
        print(i, end=' ')

else:
    inputPermutation = inputList[1:]
    sortedPermutation = list(sorted(inputPermutation))
    ans = 1
    for i in range(N):
        step = sortedPermutation.index(inputPermutation[i])
        sortedPermutation.remove(inputPermutation[i])
        X = factorial_recursive(N-1-i)
        ans += X*step
        
    print(ans)
