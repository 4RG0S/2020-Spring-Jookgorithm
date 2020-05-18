import sys
from collections import Counter

sys.stdin.readline()
number = list(sys.stdin.readline().split())
sys.stdin.readline()
dictionary = Counter(number)
for i in sys.stdin.readline().split():
    print(dictionary[i], end=' ')
