from itertools import combinations
import sys
input = sys.stdin.readline

if __name__ == "__main__":

    k = 1

    while k:
        line = list(map(int, input().split()))

        if line[0] == 0:
            k = 0
            break

        for i in combinations(line[1:], 6):
            print(' '.join(map(str, i)))
        print()

