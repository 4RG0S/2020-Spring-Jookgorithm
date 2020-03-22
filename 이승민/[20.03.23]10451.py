

def dfs(v):
    visited[v] = True

    for i in graph[v]:
        if not (visited[i]):
            dfs(i)


if __name__ == "__main__":
    t = int(input())

    for i in range(t):
        n = int(input())
        s = list(map(int, input().split()))
        s = [0] + s
        cnt = 0
        visited = [False] * (n+1)

        graph = dict()
        for i in range(1, n+1):
            graph[i] = list()

        for i in range(1, n+1):
            graph[i].append(s[i])
            graph[s[i]].append(i)

        for i in range(1, n+1):
            if not visited[i]:
                cnt += 1
                dfs(i)

        print(cnt)



'''
1
8
3 2 7 8 1 4 5 6
'''
