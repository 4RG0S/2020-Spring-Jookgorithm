import sys
num = int(input())
ar = []
for i in range(num) :
    rd = int(sys.stdin.readline())
    ar.append((rd, i))
s_ar = sorted(ar)
a = 0
for i in range(num) :
    a = max(s_ar[i][1] - i + 1, a)
print(a)
