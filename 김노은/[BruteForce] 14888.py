# SamSung SW 기출(DFS, BF - 크기 작음에 유의; Refactoring)

# Created by 김노은 on 01/04/2020.
# Copyright © 2020 cnu.cse. All rights reserved.

N = int(input())
NUM = list(map(int, input().split()))
CAL = list(map(int, input().split()))


def calculate_dict(CAL):
    tmp_CAL = dict()
    for i, c in enumerate(CAL):
        tmp_CAL[i] = c
    return tmp_CAL

def mid_calc(init_num, num, calc_num):
    if calc_num == 0:
        return init_num + num
    elif calc_num == 1:
        return init_num - num
    elif calc_num == 2:
        return init_num * num
    elif calc_num == 3:
        if init_num < 0:
            return -(-init_num // num)
        else:
            return init_num // num


tmp_CAL = calculate_dict(CAL)
answer = []


def calc(NUM, tmp_CAL):
    if len(NUM) == 1:
        answer.append(NUM[0])
        return 0
    else:
        first = NUM.pop(0)
        cur = NUM[0]

        for key, value in tmp_CAL.items():
            if value == 0:
                continue
            else:
                num = mid_calc(first, cur, key)
                tmp_CAL[key] = tmp_CAL[key] - 1

                if len(NUM) == 0:
                    tmp_answer = [num]
                else:
                    tmp_answer = [num] + NUM[1:]
                calc(tmp_answer, tmp_CAL)
                tmp_CAL[key] = tmp_CAL[key] + 1


calc(NUM, tmp_CAL)

print(max(answer))
print(min(answer))

