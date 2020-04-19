import sys

S = set()
ALL = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}
for _ in range(int(sys.stdin.readline())):
    k = sys.stdin.readline().split()
    if len(k) == 1:
        k.append("0")
    command, x = k
    x = int(x)
    if command == "add":
        S.add(x)
    elif command == "remove":
        if x in S:
            S.remove(x)
    elif command == "check":
        print(1 if x in S else 0)
    elif command == "toggle":
        if x in S:
            S.remove(x)
        else:
            S.add(x)
    elif command == "all":
        S = ALL
    elif command == "empty":
        S.clear()
