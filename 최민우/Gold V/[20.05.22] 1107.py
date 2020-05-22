target_channel = int(input())
broken_num_length = int(input())

if broken_num_length > 0:
    broken_nums = list(input().split(' '))
else:
    broken_nums = []

channel = []

for k in range(0, 500000 + 1):
    is_legit = True
    for div_k in str(k):
        if div_k in broken_nums:
            is_legit = False
            break
    if is_legit:
        channel.append(k)

answer = 987654321
starting_channel = ''

for i in channel:
    if abs(target_channel - i) < answer:
        answer = abs(target_channel - i)
        starting_channel = str(i)

answer += len(starting_channel)
answer = min(answer, abs(target_channel - 100))

print(answer)
