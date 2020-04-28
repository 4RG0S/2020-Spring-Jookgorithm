import sys
from collections import Counter


def mode(array):
    modeList = Counter(array).most_common()
    if len(modeList) > 1:
        if modeList[0][1] == modeList[1][1]:
            return modeList[1][0]
        else:
            return modeList[0][0]
    else:
        return modeList[0][0]


numArray = []
length = int(sys.stdin.readline())
for _ in range(length):
    numArray.append(int(sys.stdin.readline()))
numArray.sort()
print(round(sum(numArray) / length))
print(numArray[length // 2])
print(mode(numArray))
print(numArray[-1] - numArray[0])
