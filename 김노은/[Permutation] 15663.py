# *** Time *** Remove duplicated array ***

# Created by 김노은 on 03/04/2020.
# Copyright © 2020 cnu.cse. All rights reserved.

from itertools import permutations as P
n = list(map(int, input().split()))
numbers = list(map(int, input().split()))
numbers.sort()
comb = list(set(P(numbers, n[1])))
comb.sort()
for i in comb:
    answer = ""
    for j in i:
        answer += str(j) + " "
    print(answer)
