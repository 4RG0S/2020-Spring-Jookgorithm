from collections import Counter
import sys

input = sys.stdin.readline

num_list = []
n = int(input())
for i in range(n):
    num_list.append(int(input()))

print(round(sum(num_list)/n))
num_list.sort()
print(num_list[n//2])
count_num = Counter(num_list)
most_num = count_num.most_common()
if len(most_num) != 1:
    if most_num[0][1] == most_num[1][1]:
        print(most_num[1][0])
    else:
        print(most_num[0][0])
else:
    print(most_num[0][0])
print(num_list[-1] - num_list[0])