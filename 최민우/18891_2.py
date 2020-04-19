class party:
    def __init__(self, number, name, people, vote):
        self.name = name
        self.people = people
        self.vote = vote
        self.number = number
        self.si = 0
        self.pi = 0
        self.nameoji = 0
        self.final = 0
        self.worth = False

    def showYourSelf(self):
        print("%30s %4d %4d %4d %4d %.2f" % (self.name, self.people, self.si, self.pi, self.final, self.nameoji))


partyNum, voter = map(int, input().split(' '))
total_list = []
validVote = 0
partyNullSum = 0
partyOwner = 0
worthyVoteTotal = 0

for i in range(partyNum):
    name, people, vote = input().split(' ')
    getParty = party(i + 1, name, int(people), int(vote))
    total_list.append(getParty)
    validVote += int(vote)
    partyOwner += int(people)
partyNullSum = 253 - partyOwner

# 비례대표국회의원선거 유효투표총수의 3% 이상을 득표했거나
# 지역구국회의원선거에서 5석 이상의 의석을 차지한 정당에만 배분된다(봉쇄조항)
for i in range(partyNum):
    varParty = total_list[i]
    if varParty.vote / validVote >= 0.03 or varParty.people >= 5:
        varParty.worth = True
        worthyVoteTotal += varParty.vote

# (1단계) 30석에 대해 전국단위 준연동(연동비율 50%) 방식으로 각 정당별 연동배분의석수 산정
total_numberSeats = 0
for i in range(partyNum):
    varParty = total_list[i]
    if varParty.worth:
        varParty.pi = varParty.vote / worthyVoteTotal
        numberSeats = ((300 - partyNullSum) * varParty.pi - varParty.people)
        if numberSeats < 1:
            numberSeats = 0
        else:
            numberSeats = round(numberSeats)
        varParty.si = numberSeats
        total_numberSeats += varParty.si

# 2 - 1 각 정당별 연동배분의석수의 합계 < 30석일 경우 ☞ 잔여의석에 대해 기존 의석배분방식(병립형) 적용 배분
if total_numberSeats < 30:
    for i in range(partyNum):
        varParty = total_list[i]
        if varParty.worth:
            additionalSeatRatio = (30 - total_numberSeats) * varParty.pi
            varParty.si += int(additionalSeatRatio)
            total_numberSeats += int(additionalSeatRatio)
            varParty.nameoji = additionalSeatRatio - int(additionalSeatRatio)

# 2 - 2 각 정당별 연동배분의석수의 합계 > 30석 ☞ 각 정당별 연동배분의석수비율대로 배분
if total_numberSeats > 30:
    new_numberSeats = 0
    for i in range(partyNum):
        varParty = total_list[i]
        if varParty.worth:
            changedSi = 30 * varParty.si / total_numberSeats
            varParty.si = int(changedSi)
            new_numberSeats += int(changedSi)
            varParty.nameoji = changedSi - int(changedSi)
    total_numberSeats = new_numberSeats

# 2 - 나머지는 총 연동배분의석수가 30석이 될 때까지 소수점 이하의 수가 큰 순서대로 배분
total_list = sorted(total_list, key=lambda x: (-x.nameoji, x.number))
while total_numberSeats != 30:
    for i in range(partyNum):
        varParty = total_list[i]
        if total_numberSeats == 30:
            break
        if varParty.worth:
            varParty.si += 1
            total_numberSeats += 1

# 나머지 초기화
for resetParty in total_list:
    resetParty.nameoji = 0

# 3 - 17석에 대해 기존 의석배분방식(병립형) 적용 배분 - 정수 부분
toSeventeen = 0
for i in range(partyNum):
    varParty = total_list[i]
    if varParty.worth:
        varPi = varParty.pi * 17
        varParty.pi = (int(varPi))
        varParty.nameoji = varPi - int(varPi)
        toSeventeen += int(varPi)

# 3 - 나머지는 총 연동배분의석수가 17석이 될 때까지 소수점 이하의 수가 큰 순서대로 배분
total_list = sorted(total_list, key=lambda x: (-x.nameoji, x.number))
while toSeventeen != 17:
    for i in range(partyNum):
        varParty = total_list[i]
        if toSeventeen == 17:
            break
        if varParty.worth:
            varParty.pi += 1
            toSeventeen += 1

# 정당별로 21대 국회에서 얻은 의석 수를 의석 수를 기준으로 내림차순으로 정렬
for i in range(partyNum):
    varParty = total_list[i]
    if varParty.worth:
        varParty.final = varParty.people + varParty.pi + varParty.si
    else:
        varParty.final = varParty.people

total_list.sort(key=lambda x: (-x.final, x.name))

for i in range(partyNum):
    # total_list[i].showYourSelf()
    print(total_list[i].name, total_list[i].final)