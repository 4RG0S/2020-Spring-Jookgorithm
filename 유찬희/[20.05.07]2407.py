import math
n,m = map(int,input().split(' '))
print(math.factorial(n)//(math.factorial(n - m) * math.factorial(m)))