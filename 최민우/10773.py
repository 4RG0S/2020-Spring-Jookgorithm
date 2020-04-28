array = []
for i in range(int(input())):
    inputs = int(input())
    if not inputs:
        array.pop()
    else:
        array.append(inputs)
print(sum(array))
