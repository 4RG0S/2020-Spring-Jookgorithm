while True:
    string = input()
    if string == '0':
        break
    isPalindrome = True
    for i in range(len(string) // 2):
        isPalindrome = True if string[i] == string[-(i + 1)] else False
        if not isPalindrome:
            break
    print("yes" if isPalindrome else "no")
