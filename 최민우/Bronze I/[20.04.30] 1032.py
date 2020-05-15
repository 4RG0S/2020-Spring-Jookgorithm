N = int(input())

result = list(input())
length = len(result)

for times in range(N - 1):
    compStr = list(input())
    for index in range(length):
        if compStr[index] != result[index]:
            result[index] = '?'
print(''.join(i for i in result))
