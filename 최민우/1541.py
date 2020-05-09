input_list = list(map(int, map(eval, input().split('-'))))
result = 0
if len(input_list) > 0:
    result = input_list[0]
for i in range(1, len(input_list)):
    result -= input_list[i]
print(result)
