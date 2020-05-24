from itertools import permutations

N = int(input())
perm = permutations(sorted(list(map(int, input().split(' ')))))

result = 0

for array in perm:
    sum = 0
    for i in range(N - 1):
        sum += abs(array[i] - array[i + 1])
    result = max(result, sum)

print(result)