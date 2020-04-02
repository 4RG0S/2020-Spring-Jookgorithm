from collections import Counter

num = int(input())

target = input()
c_target = Counter(target)

count = 0
for i in range(num - 1):
    tmp = input()
    if abs(len(tmp) - len(target)) < 2:   
        c_tmp = Counter(tmp)
        if len(tmp) <= len(target): 
            result = c_target - c_tmp
        else:
            result = c_tmp - c_target
        
        list_elements = list(result.elements())
        if len(list_elements) < 2:
            count += 1

print(count)