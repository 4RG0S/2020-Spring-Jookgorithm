def countDifferentElement(line1, line2):
    cnt = 0
    for i in range(min(len(line1), len(line2))):
        cnt += 1 if line1[i] != line2[i] else 0
    return cnt


a, b = input().split(' ')
min_different = countDifferentElement(a, b)
for i in range(len(b)-len(a) + 1):
    df = countDifferentElement(a, b[i:])
    min_different = df if df < min_different else min_different
print(min_different)
