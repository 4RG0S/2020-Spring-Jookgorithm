from string import ascii_lowercase

alpha_list = list(ascii_lowercase)
string = input()
for alpha in alpha_list:
    try:
        print(string.index(alpha), end=' ')
    except ValueError:
        print("-1", end=' ')
