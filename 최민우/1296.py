def calcLove(man, lady):
    L, O, V, E = 0, 0, 0, 0
    nameList = [man, lady]
    for name in nameList:
        for i in name:
            L += 1 if i == 'L' else 0
            O += 1 if i == 'O' else 0
            V += 1 if i == 'V' else 0
            E += 1 if i == 'E' else 0
    return ((L + O) * (L + V) * (L + E) * (O + V) * (O + E) * (V + E)) % 100


girlList = []
manName = input()
for i in range(int(input())):
    girlName = input()
    girlList.append([girlName, calcLove(manName, girlName)])
girlList.sort(key=lambda x: (-x[1], x[0]))
print(girlList[0][0])
