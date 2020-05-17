prices = [350.34, 230.9, 190.55, 125.3, 180.9]
for _ in range(int(input())):
    result = 0
    inputs = input().split(' ')
    for index in range(len(inputs)):
        result += prices[index] * float(inputs[index])
    print("$%.2f" % result)
