input_list = list()
for _ in range(3):
    input_list.append(int(input()))
input_list.sort()
if sum(input_list) != 180:
    print('Error')
elif input_list[0] == input_list[2] == 60:
    print('Equilateral')
elif input_list[0] == input_list[1] or input_list[1] == input_list[2]:
    print('Isosceles')
else:
    print('Scalene')
