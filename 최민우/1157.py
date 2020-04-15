def charToCountableNum(char):
    if ord('a') <= ord(char) <= ord('z'):
        return ord(char) - ord('a')
    else:
        return ord(char) - ord('A')


listOfNumber = [0] * 26
for alpha in input():
    listOfNumber[charToCountableNum(alpha)] += 1
sortedList = list(reversed(sorted(listOfNumber)))
if sortedList[0] == sortedList[1]:
    print("?")
else:
    print(chr(ord('A') + listOfNumber.index(sortedList[0])))
