num = int(input())

table = [[0 for i in range(num)]for i in range(num)]

for i in range(num):
    tmp = input()
    for j in range(num):
        if i == j:  #자기 자신
            continue
        else:
            if tmp[j] == 'Y':
                table[i][j] = 1 #서로 친구
            else:
                table[i][j] = float('inf')  #서로 친구가 아님

#플로이드 워셜
for k in range(num):
    for i in range(num):
        for j in range(num):
            if table[i][j] > table[i][k] + table[k][j]:
                table[i][j] = table[i][k] + table[k][j]

result = 0

#2- 친구 계산
for i in range(num):
    count = 0
    for j in range(num):
        if i == j:
            continue
        elif table[i][j] <= 2:
            count += 1
    result = max(result, count)

print(result)