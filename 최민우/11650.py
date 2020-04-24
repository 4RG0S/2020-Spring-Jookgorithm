number_list = []
for _ in range(int(input())):
    number_list.append(list(map(int, input().split(' '))))
number_list.sort(key=lambda x: (x[0], x[1]))
for i in number_list:
    print(i[0], i[1])
