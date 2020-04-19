from math import gcd
import itertools

def solution(arr):
    def lcm(x,y):
        return x * y // gcd(x, y)

    while True:
        arr.append(lcm(arr.pop(), arr.pop()))
        if len(arr) == 1:
            return arr[0]

result = float('inf')
for c in itertools.combinations(map(int, input().split()), 3):
    result = min(result, solution(list(c)))

print(result)