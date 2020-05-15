a, b = input().split(' ')
a, b = int(b) - int(a), int(b)

escapable = False
while not escapable:
    for i in range(2, int(b + 1)):
        if not a % i and not b % i:
            a /= i
            b /= i
            break
        if i == b:
            escapable = True
print(int(a), int(b))
