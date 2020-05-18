def factorial(x):
    if x <= 1:
        return 1
    return x * factorial(x - 1)


a, b = map(int, input().split(' '))
print(int(factorial(a) / (factorial(b) * factorial(a - b))))
