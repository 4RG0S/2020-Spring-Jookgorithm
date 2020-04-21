# 세로 길이 H와 가로 길이 W
H, W = map(int,input().split())
# 0이상 H이하의 정수, 맨 왼쪽 위치부터 차례대로 W개 
h_value = list(map(int,input().split()))
building = [0]*W
tmp_H = H

for i in range(W):
    tmp_H = min(tmp_H, H - h_value[i])
    building[i] = tmp_H
tmp_H = H

for i in range(W-1, -1, -1):
    tmp_H = min(tmp_H, H - h_value[i])
    building[i] = max(building[i], tmp_H)

print(H*W - sum(h_value) - sum(building))