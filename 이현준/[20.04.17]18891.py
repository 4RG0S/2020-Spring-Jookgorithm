import sys

read = lambda :sys.stdin.readline().strip()

def get_1(r_0,p_i,r_i):

    return (((300-r_0)*p_i)-r_i)/2


class jeongdang:
    def __init__(self,name,num,vote,giho):
        self.name = name
        self.num = num
        self.vote = vote
        self.giho = giho

    def percent(self,percent):
        self.percent = percent

    def get_s_i(self, s_i):
        self.s_i = s_i

    def get_p_i(self,p_i):
        self.p_i = p_i


n,all = map(int,read().split())
jeongdang_list = []
none_vote = 0
none_people = 0
for i in range(n):
    name,num,vote = read().split()
    a = jeongdang(name,int(num),int(vote),i+1)
    jeongdang_list.append([a,0])
    none_vote+=int(vote)
    none_people +=int(num)
none_vote = all-none_vote
none_people = 253-none_people

all_1 = 0
for i in range(n):
    a = jeongdang_list[i][0]
    a.percent(a.vote/(all-none_vote))
    if a.percent>=0.03 or a.num>=5:
        all_1 += a.vote

sum_2 = 0
for i in range(n):
    a = jeongdang_list[i][0]

    if a.percent>=0.03 or a.num>=5:
        p_i = a.vote / all_1
        a.get_p_i(p_i)
        value = round(get_1(none_people,p_i,a.num))
        if value<1:
            value = 0
        else:
            value = round(value)
        a.get_s_i(value)
        sum_2 += value


next_2 = 0
if sum_2>30:
    for i in range(n):
        a = jeongdang_list[i][0]
        if a.percent >= 0.03 or a.num >= 5:
            new_value = 30*a.s_i/sum_2
            a.get_s_i(int(new_value))
            next_2 += int(new_value)
            jeongdang_list[i][1] = new_value-int(new_value)
    jeongdang_list = sorted(jeongdang_list,key = lambda x : (-x[1], x[0].giho) )
    while next_2!=30:
        for i in range(n):

            a = jeongdang_list[i][0]
            if next_2==30:
                continue
            if a.percent>=0.03 or a.num>=5:
                a.get_s_i(a.s_i + 1)
                next_2 += 1
                continue

elif sum_2<30:
    for i in range(n):
        a = jeongdang_list[i][0]
        if a.percent >= 0.03 or a.num >= 5:

            new_value = a.s_i+(30-sum_2)*a.p_i
            a.get_s_i(int(new_value))
            next_2 += int(new_value)
            jeongdang_list[i][1] = new_value - int(new_value)
    jeongdang_list = sorted(jeongdang_list, key=lambda x: (-x[1], x[0].giho))
    while next_2 != 30:
        for i in range(n):

            a = jeongdang_list[i][0]
            if next_2 == 30:
                continue
            if a.percent >= 0.03 or a.num >= 5:

                a.get_s_i(a.s_i + 1)
                next_2 += 1
final = 0
for i in range(n):
    a = jeongdang_list[i][0]
    if a.percent >= 0.03 or a.num >= 5:

        new_p_i = a.p_i*17
        a.get_p_i(int(new_p_i))
        jeongdang_list[i][1] = new_p_i-int(new_p_i)
        final+=int(new_p_i)

jeongdang_list = sorted(jeongdang_list, key=lambda x: (-x[1], x[0].giho))

while final != 17:
    for i in range(n):

        a = jeongdang_list[i][0]
        if final == 17:
            continue
        if a.percent >= 0.03 or a.num >= 5:

            a.get_p_i(a.p_i + 1)
            final += 1

for i in range(n):
    a = jeongdang_list[i][0]
    if a.percent >= 0.03 or a.num >= 5:
        jeongdang_list[i][1] = a.num + a.p_i + a.s_i

    else:
        jeongdang_list[i][1] = a.num


jeongdang_list = sorted(jeongdang_list, key=lambda x: (-x[1],x[0].name))
for i in range(n):
    print('{} {}'.format(jeongdang_list[i][0].name,jeongdang_list[i][1]))

