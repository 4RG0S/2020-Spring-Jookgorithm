sugar = int(input())
count = 0

isMinusOne = True
while sugar > 0:
    if sugar % 5 == 0:
        count += sugar // 5
        isMinusOne = False
        break
    elif sugar == 3:
        count += 1
        isMinusOne = False
        break
    else:
        sugar -= 3
        count += 1

print("-1" if isMinusOne else count)
