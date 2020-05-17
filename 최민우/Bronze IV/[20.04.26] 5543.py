inputList = []
for _ in range(5):
    inputList.append(int(input()))
buger = sorted(inputList[:3])
drink = sorted(inputList[3:])
print(buger[0] + drink[0] - 50)
