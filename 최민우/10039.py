input_list = [int(input()) for _ in range(5)]
for i in range(len(input_list)):
    if input_list[i] <= 40:
        input_list[i] = 40
print(sum(input_list) // 5)
