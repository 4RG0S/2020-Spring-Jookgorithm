import math
def isPrime(a):
  if(a<2):
      return False
  for i in range(2,int(math.sqrt(a)) + 1):
    if(a%i==0):
        return False
  return True

num = int(input())
a=list()
i = 0
while i < num :
    temp = int(input())
    while isPrime(temp) == False :
        temp = temp+1
    a.append(temp)
    i = i+1
i = 0
while i < num :
    print(a[i])
    i = i+ 1
