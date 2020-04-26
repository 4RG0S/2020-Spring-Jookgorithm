from math import ceil

inputList = []
for _ in range(5):
    inputList.append(int(input()))
print(inputList[0] - max(ceil(inputList[1] / inputList[3]), ceil(inputList[2] / inputList[4])))
