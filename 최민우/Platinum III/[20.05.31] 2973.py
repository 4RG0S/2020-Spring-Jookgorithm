col, row = map(int, input().split(' '))

field = []

for _ in range(col):
    field.append(list(map(int, input().split(' '))))

# 세로가 홀수
if col % 2 == 1:
    # ━━┓
    # ┏━┛ * ((col - 1) // 2)  +  ━━━
    # ┃
    print(('R' * (row - 1) + 'D' + 'L' * (row - 1) + 'D') * ((col - 1) // 2) + 'R' * (row - 1), end='')

# 가로 홀수, 세로 짝수
elif row % 2 == 1:
    # ┃┏━
    # ┗┛  * ((row - 1) // 2)  +  ┃
    print(('D' * (col - 1) + 'R' + 'U' * (col - 1) + 'R') * ((row - 1) // 2) + 'D' * (col - 1), end='')

# 가로 세로 짝수
else:
    min_value = 1000
    min_pos = [0, 0]
    for i in range(col):
        for j in range(not i % 2, row, 2):
            if field[i][j] < min_value:
                min_value = field[i][j]
                min_pos = [i, j]
    section = min_pos[0] // 2
    last_section = col // 2 - section - 1

    # ━━━━━━━━━┓
    # ┏━━━━━━━━┛  *  section
    # ┃
    print(('R' * (row - 1) + 'D' + 'L' * (row - 1) + 'D') * section, end='')

    # Mine section

    # ┃┏━                         ━┓       ┃          ┏┓
    # ┗┛ * (min_pos[1] // 2)  +    ┃   or  ┗━   +    ━┛┃
    print(('DRUR' * (min_pos[1] // 2)) + ('RD' if min_pos[0] % 2 else 'DR') + ('RURD' * (((row - 2) - (min_pos[1] // 2) * 2) // 2)), end='')

    #          ┃
    # ┏━━━━━━━━┛
    # ┗━━━━━━━━━  *  last_section

    print(('D' + 'L' * (row - 1) + 'D' + 'R' * (row - 1)) * last_section, end='')
