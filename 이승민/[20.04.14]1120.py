X, Y = list(input().split())
Min = 50
for i in range(len(Y) - len(X)+1):
    count = 0
    for j in range(len(X)):
        if X[j] != Y[i+j]:
            count += 1

    if count<Min:
        Min = count
print(Min)
