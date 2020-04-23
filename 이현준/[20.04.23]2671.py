import re

p = re.compile('(100+1+|01)+')

a = input()
m = p.fullmatch(a)
if m == None:
    print('NOISE')
else:
    print('SUBMARINE')