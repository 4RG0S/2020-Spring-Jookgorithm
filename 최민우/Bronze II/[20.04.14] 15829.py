from string import ascii_lowercase


def Hash(x):
    alpha_list = list(ascii_lowercase)
    sum = 0
    cnt = 0
    for i in x:
        sum += (alpha_list.index(i) + 1) * pow(31, cnt)
        cnt += 1
    return sum % 1234567891


input()
print(Hash(input()))
