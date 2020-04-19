party, voter = map(int, input().split(' '))
total_list = []
validVote = 0
partyOwner = 0
partyAssignedSeats = []
SeatVoteSum = 0

for i in range(party):
    # redshift 105 7960272
    party_name, member_number, vote_earn = map(str, input().split(' '))
    partyOwner += int(member_number)
    validVote += int(vote_earn)
    total_list.append([i + 1, party_name, int(member_number), int(vote_earn)])
partyNullSum = 253 - partyOwner

for i in range(party):
    # 비례대표국회의원선거 유효투표총수의 3% 이상을 득표했거나
    # 지역구국회의원선거에서 5석 이상의 의석을 차지한 정당에만 배분된다(봉쇄조항)
    voteRatio = total_list[i][3] / validVote * 100
    if voteRatio >= 3 or total_list[i][2] >= 5:
        partyAssignedSeats.append(total_list[i][1])
        SeatVoteSum += total_list[i][3]

# (1단계) 30석에 대해 전국단위 준연동(연동비율 50%) 방식으로 각 정당별 연동배분의석수 산정
total_numberSeats = 0
for i in range(party):
    if total_list[i][1] in partyAssignedSeats:
        numberSeats = ((300 - partyNullSum) * (total_list[i][3] / SeatVoteSum) - total_list[i][2]) / 2
        if numberSeats < 1:
            numberSeats = 0
        else:
            numberSeats = round(numberSeats)
        total_list[i].append(numberSeats)
        total_numberSeats += numberSeats
    else:
        total_list[i].append(0)

# 2 - 1 각 정당별 연동배분의석수의 합계 < 30석일 경우 ☞ 잔여의석에 대해 기존 의석배분방식(병립형) 적용 배분
if total_numberSeats < 30:
    total_additional_seat = 0
    for i in range(party):
        # 계산된 값의 정수 부분을 먼저 배분
        if total_list[i][1] in partyAssignedSeats:
            additional_seat_ratio = (30 - total_numberSeats) * (total_list[i][3] / SeatVoteSum)
            total_list[i][4] += int(additional_seat_ratio)
            total_additional_seat += int(additional_seat_ratio)
            total_list[i].append(additional_seat_ratio - int(additional_seat_ratio))
        else:
            total_list[i].append(0)
    total_numberSeats += total_additional_seat


# 2 - 2 각 정당별 연동배분의석수의 합계 > 30석 ☞ 각 정당별 연동배분의석수비율대로 배분
elif total_numberSeats > 30:
    d_total_numberSeats = 0
    for i in range(party):
        # 계산된 값의 정수 부분으로 정정
        if total_list[i][1] in partyAssignedSeats:
            additional_seat = int((30 * total_list[i][4]) / total_numberSeats)
            d_total_numberSeats += additional_seat - total_list[i][4]
            total_list[i].append(((30 * total_list[i][4]) / total_numberSeats) - additional_seat)
            total_list[i][4] = additional_seat
        else:
            total_list[i].append(0)
    total_numberSeats += d_total_numberSeats

for i in total_list:
    print("%25s %5d %5d %5.2f" % (i[1], i[4], i[0], i[5]))

# 2 - 나머지는 총 연동배분의석수가 30석이 될 때까지 소수점 이하의 수가 큰 순서대로 배분
if total_numberSeats != 30:
    rank_dot = sorted(total_list, key=lambda x: (-x[5], x[0]))
    # print(rank_dot)
    cnt = 0
    del_num = 0
    for _ in rank_dot:
        if rank_dot[cnt][4] == 1:
            del rank_dot[cnt]
            del_num += 1
        else:
            cnt += 1

    # print(rank_dot)

    for i in range(30 - total_numberSeats):
        for _ in total_list:
            if rank_dot[i % (party - del_num)][1] == _[1]:
                _[4] += 1

for i in total_list:
    print("%25s %5d %5d %5.2f" % (i[1], i[4], i[0], i[5]))

# 3 - 17석에 대해 기존 의석배분방식(병립형) 적용 배분 - 정수 부분
total_to_seventeen = 0
for i in range(party):
    if total_list[i][1] in partyAssignedSeats:
        additional_seat = (total_list[i][3] / SeatVoteSum) * 17
        total_list[i][4] += int(additional_seat)
        total_to_seventeen += int(additional_seat)
        total_list[i].append(additional_seat - int(additional_seat))
    else:
        total_list[i].append(0)

# 3 - 나머지는 총 연동배분의석수가 17석이 될 때까지 소수점 이하의 수가 큰 순서대로 배분
if total_to_seventeen != 17:
    rank_seventeen = sorted(total_list, key=lambda x: (-x[5], x[0]))
    del_num = 0
    cnt = 0
    for _ in rank_seventeen:
        if rank_seventeen[cnt][4] == 1:
            del rank_seventeen[cnt]
            del_num += 1
        else:
            cnt += 1

    for i in range(17 - total_to_seventeen):
        for _ in total_list:
            if rank_seventeen[i % (party - del_num)][1] == _[1]:
                _[4] += 1

# 정당별로 21대 국회에서 얻은 의석 수를 의석 수를 기준으로 내림차순으로 정렬
for i in range(party):
    total_list[i][2] += total_list[i][4]
total_list.sort(key=lambda x: (-x[2], x[1]))

for i in total_list:
    print(i[1], i[2])

# print()
# for i in total_list:
#     print("%25s %5d %10d %8d" % (i[1], i[2], i[3], i[4]))
