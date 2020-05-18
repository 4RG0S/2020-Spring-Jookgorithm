def listNumToInt(listNum):
    result = 0
    for i in range(len(listNum)):
        result *= 10
        result += int(listNum[i])
    return result


a, b = map(list, map(reversed, map(list, input().split(' '))))
print(max(listNumToInt(a), listNumToInt(b)))
