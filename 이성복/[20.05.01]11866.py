n, k = map(int, input().split())

people = [ i + 1 for i in range(n)]

now = k - 1
result = []
while True:
    result.append(people.pop(now))
    if not people:
        break
    now = (now + (k - 1)) % len(people)

print('<'+', '.join(map(str, result)) + '>')
    