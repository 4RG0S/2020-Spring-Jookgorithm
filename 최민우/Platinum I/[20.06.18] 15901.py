import sys
from collections import deque

N, M, K, Q = map(int, sys.stdin.readline().split(' '))
A = deque(list(map(int, sys.stdin.readline().split(' '))))
F = deque([0 for i in range(M)])
for i in range(min(M, N)):
    F[i] = A.popleft()

for i in range(Q):
    inputs = list(map(int, sys.stdin.readline().split(' ')))
    o = inputs[0]
    if o == 1:
        L, R = inputs[1], inputs[2]
        # 소각
        for j in range(L - 1, R):
            F[j] = 0
            if len(A):
                F[j] = A.popleft()
    elif o == 2:
        Index_M = inputs[1]
        print(F[Index_M - 1], end=' ')
    elif o == 3:
        p, q = inputs[1], inputs[2]
        A.extend([p for _ in range(q)])
    else:
        t = inputs[1]
        for _ in range(t):
            A.popleft()
print("\n" + " ".join(map(str, F)))
# 실패 시간초과