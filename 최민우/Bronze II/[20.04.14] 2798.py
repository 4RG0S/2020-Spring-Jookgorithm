list_length, black_number = map(int, input().split(' '))
card_numbers = list(map(int, input().split(' ')))
max_card_number = 0

for i in range(list_length - 2):
    for j in range(i + 1, list_length):
        for k in range(j + 1, list_length):
            sum = card_numbers[i] + card_numbers[j] + card_numbers[k]
            max_card_number = (sum if max_card_number < sum <= black_number else max_card_number)
print(max_card_number)
