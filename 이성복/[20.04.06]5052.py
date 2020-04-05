import sys

input = sys.stdin.readline

def check(_list):
    _list.sort()
    standard = _list[0]
    for j in _list[1:]:
        if len(standard) < len(j):
            if standard in j[:len(standard)]:
                return print("NO")
            else:
                standard = j
        else:
            standard = j
    return print("YES")

num = int(input())
for i in range(num):
    case = int(input())
    _list = []
    for j in range(case):
        _list.append(input().rstrip())
    check(_list)