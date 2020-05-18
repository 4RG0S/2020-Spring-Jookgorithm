import sys

read = lambda : sys.stdin.readline().strip()

n,m = map(int,read().split())

mat = list(map(int,read().split()))

top = max(mat)
down = 0
while down<=top:
    mid = (top+down)//2
    result = 0
    for i in mat:
        if i>mid:
            result+=i-mid

    if result<m:
        top = mid-1
    else:
        down = mid+1

print(top)