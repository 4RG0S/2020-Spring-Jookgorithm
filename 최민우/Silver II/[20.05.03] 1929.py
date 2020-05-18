field = [False, False] + [True for i in range(1000000)]
prime_number = []
for i in range(2, 1000000 + 1):
    if field[i]:
        prime_number.append(i)
        for j in range(i * 2, 1000000 + 1, i):
            field[j] = False

a, b = map(int, input().split())
start_index = 0
for i in prime_number:
    if a <= i:
        break
    start_index += 1
for i in prime_number[start_index:]:
    if i > b:
        break
    print(i)
