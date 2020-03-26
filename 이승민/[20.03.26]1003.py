

if __name__ == "__main__":
    t = int(input())

    p0 = [0 for i in range(41)]
    p1 = [0 for i in range(41)]

    p0[0] = 1
    p0[1] = 0
    p1[0] = 0
    p1[1] = 1

    for i in range(2, 41):
        p0[i] = p0[i - 2] + p0[i - 1]
        p1[i] = p1[i - 2] + p1[i - 1]

    for i in range(t):
        n = int(input())
        print(p0[n],p1[n])
