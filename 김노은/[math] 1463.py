import sys

size = int(sys.stdin.readline())
information = []

for _ in range(size):
    weight, height = map(int, sys.stdin.readline().split()) 
    information.append((weight, height))
for element1 in information:
    rank = 1
    for element2 in information:
        if element1[0] != element2 and element1[1] != element2[1]:      # 자기자신과의 비교는 X.
            if element1[0] < element2[0] and element1[1] < element2[1]:
                rank += 1
    print(rank, end = ' ')
