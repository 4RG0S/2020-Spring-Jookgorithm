import sys
input = sys.stdin.readline

T = int(input())
N = []
P = [0, 1, 1, 1, 2, 2]

for _ in range(T):
    N.append(int(input()))

for i in range(6, max(N)+1):
    P.append(P[i-1] + P[i-5])
    
for n in N:
    print(P[n])