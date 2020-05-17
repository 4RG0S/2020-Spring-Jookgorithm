def resortList(raw_list, length, repeat):
    if repeat == 0:
        return list(map(str, raw_list))
    new_list = [-1] * (length - 1)
    for i in range(length - 1):
        new_list[i] = raw_list[i + 1] - raw_list[i]
    return resortList(new_list, length - 1, repeat - 1)


length, repeat = map(int, input().split(' '))
A = list(map(int, input().split(',')))
print(','.join(resortList(A, length, repeat)))
