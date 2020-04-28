import sys

N, M = map(int, sys.stdin.readline().split())
dogam = {}
dogam_list = []
for i in range(N):
    var = input().rstrip()
    dogam[var] = i + 1
    dogam_list.append(var)

for i in range(M):
    var = input().rstrip()
    if not var.isdigit():
        print(dogam[var])
    else:
        print(dogam_list[int(var) - 1])
