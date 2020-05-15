data = input()
for i in range(0, len(data), 10):
    if i + 10 >= len(data):
        print(data[i:])
    else:
        print(data[i:i + 10])
