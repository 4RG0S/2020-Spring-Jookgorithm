def check(pattern):
    stack = []
    for i in pattern:
        if not stack and i == ')':
            return "NO"

        if i == '(':
            stack.append(i)
        else:
            if stack[-1] == '(':
                stack.pop()
            else:
                return "NO"
    if stack:
        return "NO"
    return "YES"
    
for i in range(int(input())):
    pattern = input()
    print(check(pattern))