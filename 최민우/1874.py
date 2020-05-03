import sys

numList = []
result = []
N = int(input())
targetList = [int(sys.stdin.readline()) for i in range(N)]

cursor = targetList[0]
# 첫 번째 수 POP
for num in range(1, cursor + 1):
    result.append('+')
    numList.append(num)
numList.pop()
result.append('-')

for index in range(1, N):
    if targetList[index] < cursor:
        if numList[-1] == targetList[index]:
            numList.pop()
            result.append('-')
        else:
            print('NO')
            exit(0)
    if targetList[index] >= cursor:
        while cursor < targetList[index]:
            cursor += 1
            numList.append(cursor)
            result.append('+')
        numList.pop()
        result.append('-')
print('\n'.join(result))
