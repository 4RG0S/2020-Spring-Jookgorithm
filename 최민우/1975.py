import sys

for _ in range(int(sys.stdin.readline())):
    n = int(sys.stdin.readline())
    result = 0
    for i in range(2, n + 2):
        integer, rest = divmod(n, i)
        if rest != 0:
            continue
        while True:
            result += 1
            integer, rest = divmod(integer, i)
            if rest != 0:
                break
    print(result)
