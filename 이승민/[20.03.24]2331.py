
if __name__ == "__main__":
    a, p = map(int, input().split())
    seq = list()
    seq.append(a)

    count = 0
    while True:
        a = str(seq[-1])
        sum_value = 0
        l = len(str(a))
        for i in range(l): sum_value += int(a[i]) ** p
        if sum_value in seq:
            print(seq.index(sum_value))
            break

        seq.append(sum_value)
