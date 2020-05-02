import sys

for testCase in range(int(input())):
    queue = []
    n, target_index = map(int, sys.stdin.readline().split())
    input_list = list(map(int, sys.stdin.readline().split()))
    num_list = list()
    for i in range(len(input_list)):
        num_list.append([input_list[i], i])
    count = 0
    while True:
        if num_list[0][0] == max(num_list, key=lambda x: x[0])[0]:
            count += 1
            if num_list[0][1] == target_index:
                print(count)
                break
            del num_list[0]
        else:
            num_list.append(num_list[0])
            del num_list[0]
