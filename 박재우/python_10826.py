num = int(input())
storage = [0, 1, 1]
for i in range(3, num + 1):
    storage.append(storage[i - 1] + storage[i - 2])
print(storage[num])
