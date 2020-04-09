num = int(input())
sums, i = 0, 1
while i <= num:
    sums += (num-i+1)
    i *= 10
print(sums)
