length, w, h = map(int, input().split(' '))
k = pow(pow(w, 2) + pow(h, 2), 0.5)
print(int(length / k * w), int(length / k * h))
