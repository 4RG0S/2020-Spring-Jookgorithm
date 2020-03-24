import sys

horizon_n, vertical_n = map(int, sys.stdin.readline().split())
cut_N = int(input())

horizon_cut = [0, vertical_n]
vertical_cut = [0, horizon_n]

for i in range(cut_N):
    tmp = list(map(int, sys.stdin.readline().split()))
    if tmp[0]:
        vertical_cut.append(tmp[1])
    else:
        horizon_cut.append(tmp[1])

vertical_cut = sorted(vertical_cut)
horizon_cut = sorted(horizon_cut)

result = 0
for i in range(1, len(vertical_cut)):
    for j in range(1, len(horizon_cut)):
        width = vertical_cut[i] - vertical_cut[i-1]
        height = horizon_cut[j] - horizon_cut[j-1]
        result = max(result, width * height)
        
print(result)