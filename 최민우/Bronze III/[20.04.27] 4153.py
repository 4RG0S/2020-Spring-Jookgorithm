while True:
    number = list(map(int, input().split()))
    number.sort()
    if number[2] == 0:
        break
    print('right' if number[2] * number[2] == number[0] * number[0] + number[1] * number[1] else 'wrong')
