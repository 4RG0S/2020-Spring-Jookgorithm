N = int(input())
answer = 0
for i in range(1, N+1):
    # 1~99: 한수
    number = str(i)
    if len(number) == 1 or len(number) == 2:
        answer+=1
    # 99~: 등차수열 검사
    else:
        num_pos = list(map(int, number))
        dif = num_pos[1] - num_pos[0]
        for j in range(1,len(num_pos)):
            if ((num_pos[j] - num_pos[j-1])  != dif):
                answer-=1
                break
        answer+=1
print(answer)