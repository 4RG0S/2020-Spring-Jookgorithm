from collections import deque
import sys

input = sys.stdin.readline

number = deque([ i + 1 for i in range(int(input()))])

while len(number) != 1:
    number.popleft()
    number.append(number.popleft())

print(number[0])