from collections import Counter

int_data = list()
for i in range(int(input())):
    int_data.append(int(input()))

int_count = Counter(int_data)

int_count_item = list(int_count.items())

int_count_item.sort(key=lambda x : (-x[1], x[0]))

print(int_count_item[0][0])