'''
n : 리스트에 있는 점수
score : 새로운 점수
p : 랭킹 리스트에 올라 갈 수 있는 점수의 개수
'''

n, score, p = map(int, input().split())
if n == 0:
    print(1)
else:
    a = list(map(int, input().split()))

    count = 1
    if n == p and a[-1] >= score:
        print(-1)
    else:
        for i in a:
            if score < i:
                count += 1
        print(count)