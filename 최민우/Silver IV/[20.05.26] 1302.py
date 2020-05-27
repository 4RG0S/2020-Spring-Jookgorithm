from collections import Counter

N = int(input())

array = []

for i in range(N):
    array.append(input())

array = Counter(array)
max_value = max(array.values())
array = array.most_common()

result = []

for i in array:
    if i[1] == max_value:
        result.append(i[0])

print(sorted(result)[0])
