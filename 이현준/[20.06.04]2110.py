from collections import deque
import sys
def check(num):
    global q
    start = q[0]
    result = 1
    for i in range(1,len(q)):
        if start+num<=q[i]:
            start = q[i]
            result+=1
    return result


house, wifi = map(int,input().split())
q = []
for i in range(house):
    q.append(int(sys.stdin.readline()))
q.sort()
left = 1
right = q[-1]-q[0]
answer = 0
while left<=right:
    mid = (left+right)//2

    c = check(mid)

    if c>=wifi:
        answer = mid
        left = mid+1
    else:
        right = mid-1

print(answer)
