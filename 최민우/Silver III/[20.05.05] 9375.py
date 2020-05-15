for test_case in range(int(input())):
    dictionary = {}
    for cloth_count in range(int(input())):
        value, key = input().split()
        if key in dictionary:
            dictionary[key].append(value)
        else:
            dictionary[key] = [value]
    sum = 1
    for i in dictionary:
        sum *= (len(dictionary[i]) + 1)
    print(sum - 1)
