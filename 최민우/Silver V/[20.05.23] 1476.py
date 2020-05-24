E, S, M = map(int, input().split(' '))
year = 0
while True:
    if (year % 15) + 1 == E and (year % 28) + 1 == S and (year % 19) + 1 == M:
        print(year + 1)
        break
    year += 1
    