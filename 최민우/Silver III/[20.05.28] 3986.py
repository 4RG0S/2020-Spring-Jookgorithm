n = int(input())
result = 0

for _ in range(n):
    array = []
    for i in input():
        if len(array):
            if array[-1] == i:
                array.pop(-1)
                continue
        array.append(i)
    result += 1 if len(array) == 0 else 0

print(result)
