array = [0]
count = 0
number = 0
while count <= 1000:
    number += 1
    for _ in range(number):
        array.append(number)
    count += number
start, end = map(int, input().split(' '))
result = 0
for _ in range(start, end + 1):
    result += array[_]
print(result)
