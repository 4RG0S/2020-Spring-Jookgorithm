import itertools

n, m = map(int, input().split())

number_list = [str(i) for i in range(1, n + 1)]

result = list(map(' '.join, itertools.combinations(number_list, m)))
for i in result:
    print(i)