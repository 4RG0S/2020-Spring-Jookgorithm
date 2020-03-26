N = int(input())
M = int(input())
target = sorted(map(int, input().rstrip().split()))
answer = 0 # 갑옷 개수
n, m = 0, N-1

while n < m:
    nr = target[m]
    while n < m and target[n] + nr > M:
        m -= 1
        nr = target[m]
    if n < m and target[n] + nr == M:
        answer += 1
        m -= 1
    n += 1 
print(answer)