div = 1000000009
D = [[0, 0, 0, 0] for _ in range(1000001)]

D[1] = [0, 1, 0, 0]
D[2] = [0, 1, 1, 0]
D[3] = [0, 2, 1, 1]
for iter in range(4, 1000001):
    D[iter][1] = sum(D[iter - 1]) % div
    D[iter][2] = sum(D[iter - 2]) % div
    D[iter][3] = sum(D[iter - 3]) % div
test_case = int(input())
for _ in range(test_case):
    print(sum(D[int(input())]) % div)
