import sys


def isCorrectString(string):
    recentOpen = []
    for c in string:
        if c == '(' or c == '[':
            recentOpen.append(c)
        if c == ')' or c == ']':
            expectResult = '(' if c == ')' else '['
            try:
                if recentOpen.pop() != expectResult:
                    return False
            except IndexError:
                return False
    return False if len(recentOpen) else True


while True:
    varString = sys.stdin.readline()
    if varString == ".\n":
        break
    print('yes' if isCorrectString(varString) else 'no')
