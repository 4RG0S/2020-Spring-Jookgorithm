input()
num_list = list(map(int, input().split()))
num_list.sort()
for i in range(1, len(num_list)):
    num_list[i] += num_list[i - 1]
print(sum(num_list))
