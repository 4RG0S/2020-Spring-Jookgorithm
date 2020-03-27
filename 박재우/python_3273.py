num = int(input())
root = map(int, input().split())
sums = int(input())
ar = sorted(root)
 
count = 0
i = 0
j = num-1
 
while i != j :
    temp = ar[i] + ar[j]
    if temp == sums :
        count += 1
        i += 1
    elif temp > sums :
        j -= 1
    else :
        i += 1
 
print(count)
