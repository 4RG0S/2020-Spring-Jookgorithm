x, y = int(input()), int(input())

def check(num):
    if num == 1:
        return False
    else:
        for j in range(2, num//2 + 1):
            if num % j == 0:
                return False
        return True

prime = []
for target in range(x, y + 1):
    if check(target):
        prime.append(target)

if prime:
    prime.sort()
    print(sum(prime))
    print(prime[0])
else:
    print(-1)