num = int(input())
a = list(map(int, input().split()))

def check(num):
    if num == 1:
        return False
    else:
        for j in range(2, num//2 + 1):
            if num % j == 0:
                return False
        return True

count = 0
for num in a:
    if check(num):
        count += 1

print(count)