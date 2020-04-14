min_num = int(input())
max_num = int(input())
decimal_list = []

for i in range(min_num, max_num + 1):
    count = 0
    for j in range(1, i + 1):
        if i % j == 0:
            count += 1
            if count > 2:
                break
    if count == 2:
        decimal_list.append(i)
if len(decimal_list) != 0:
    print(sum(decimal_list))
    print(decimal_list[0])
else:
    print('-1')
