from collections import Counter

def check(string_count_item, string):
    count = 0
    odd_char = str()
    for item in string_count_item:
        if item[1] % 2 != 0:
            odd_char = item[0]
            count += 1
            if count == 2:
                return "I'm Sorry Hansoo"
    if count == 0:
        result = str()
        for item in string_count_item:
            result += item[0] * (item[1]//2)
        plus_result = result[::-1]
        result += plus_result
        return result
    else:
        result = str()
        for item in string_count_item:
            result += item[0] * (item[1]//2)
        plus_result = result[::-1]
        result = result + odd_char + plus_result
        return result

string = list(input())
string.sort()

string_count = Counter(string)

string_count_item = list(string_count.items())

print(check(string_count_item, string))
