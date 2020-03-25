
import sys
sys.setrecursionlimit(111111)

def dfs(s):
    visited.append(s)
    bool_visited[s] = True
    node = nums[s]

    if bool_visited[node]:
        if node in visited:
            cnt[0] += len(visited[visited.index(node):])
        return
    else:
        dfs(node)

if __name__ == "__main__":
    for i in range(int(input())):
        n = int(input())
        bool_visited = [True] + [False] * n
        nums = [0] + list(map(int, input().split()))
        cnt = [0]

        for j in range(1, n+1):
            visited = list()
            if not bool_visited[j]:
                dfs(j)

        print(n - cnt[0])


'''
1
7
3 1 3 7 3 4 6
'''
