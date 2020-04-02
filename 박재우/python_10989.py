import sys
num = int(input())
st = [0] * 10001
for i in range(0,num):
    a = int(sys.stdin.readline())
    st[a] += 1

for j in range(len(st)):
    if st[j] !=0:
        for k in range(st[j]):
            print(j)
