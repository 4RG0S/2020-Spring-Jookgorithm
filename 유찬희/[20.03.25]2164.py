import collections
i = int(input())
q = collections.deque()

for a in range(1,i + 1):
    q.append(a)
for a in range(1, i):
    q.popleft()
    q.append(q.popleft())
print(q.pop())
