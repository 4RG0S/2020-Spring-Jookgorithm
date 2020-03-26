import sys

def bell_for_cost(target, start, n, m):
    result = [1000] * (n)
    result[start] = 0
    status = True
    for it in range(n):
        for v in range(1, n):
            for nv, cost in target[v]:
                if result[nv] > result[v] + cost:
                    result[nv] = result[v] + cost
                    if it == n-2:
                        status = False
                        return status
    return status

test = int(input())
for i in range(test):
    n, m, w = map(int, sys.stdin.readline().split())
    target= [[] for _ in range(n+1)]
    for j in range(m):
        s, e, t = map(int, sys.stdin.readline().split())
        target[s].append([e, t])
        target[e].append([s, t])
    for k in range(w):
        s, e, t = map(int, sys.stdin.readline().split())
        target[s].append([e, -t])
    if bell_for_cost(target, 1, n+1, m):
        print("NO")
    else:
        print("YES")
    