import sys

read = lambda : sys.stdin.readline().strip()


n = int(read())
mat = list(map(int,read().split()))

sort_mat = sorted(mat)
result = []

for i in range(len(mat)):
    for j in range(len(sort_mat)):
        if mat[i] == sort_mat[j]:
            result.append(str(j))
            sort_mat[j] = -1
            break
print(' '.join(result))
