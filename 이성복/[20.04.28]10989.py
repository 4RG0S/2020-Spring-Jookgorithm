from collections import defaultdict
import sys

input = sys.stdin.readline

temp = defaultdict(int)

for i in range(int(input())):
    temp[int(input())] += 1

for item in sorted(temp.items()):
    for number in range(item[1]):
        print(item[0])