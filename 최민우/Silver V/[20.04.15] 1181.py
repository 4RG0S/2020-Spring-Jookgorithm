arr = []
for i in range(int(input())):
    arr.append(input())
arr.sort()
arr.sort(key=len)

preIndex = ''

for index in arr:
    if not preIndex == index:
        print(index)
    preIndex = index
