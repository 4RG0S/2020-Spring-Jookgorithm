N, M = map(int, input().split())

info = []
group_a, group_b = [-1] * N, [-1] * M

for i in range(N):
    list_tmp = list(map(int, input().split()))
    info.append(list_tmp[1:])   #차례대로 입력이 들어오기 때문에 슬라이싱을 해준다.

def dfs(a):
    visit[a] = True
    for b in info[a]:   #우선순위로 배정하는게 아니므로 pop을 하는게 아니라 for문을 돈다.
        b -= 1
        if group_b[b] == -1 or not visit[group_b[b]] and dfs(group_b[b]):   #연결이 되어있지 않거나 group_a에서 group_b로 갈 곳이 남아있는 경우
            group_a[a], group_b[b] = b, a   #축사 배정
            return True
    return False

count = 0
for i in range(N):
    if group_a[i] == -1:
        visit = [False] * N
        if dfs(i):
            count += 1
    
print(count)