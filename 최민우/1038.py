def decreaseListAdd(number, digit=1):
    # 자기보다 작은수만 뒤에 추가 최대 추가수는 digit 이 10이 넘으면 안댐
    if digit > 10:
        return
    num_list.append(number)
    for i in range(10):
        if number % 10 > i:
            decreaseListAdd((number * 10) + i, digit + 1)
    return


n = int(input())
num_list = []
for i in range(10):
    decreaseListAdd(i)
num_list.sort()

if n >= 1023:
    print(-1)
else:
    print(num_list[n])
