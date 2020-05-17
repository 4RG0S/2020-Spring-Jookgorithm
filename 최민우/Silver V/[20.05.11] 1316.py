result = int(input())
for _ in range(result):
    dictionary = {}
    input_str = list(input())
    for index in range(len(input_str)):
        if input_str[index] in dictionary:
            if input_str[index] == input_str[index - 1]:
                continue
            result -= 1
            break
        else:
            dictionary[input_str[index]] = True
print(result)
