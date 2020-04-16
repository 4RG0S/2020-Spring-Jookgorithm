dst, src = input(), input()

index, count = 0, 0

while index < len(dst):
    if dst[index : index + len(src)] == src:
        count += 1
        index += len(src)
    else:
        index += 1

print(count)