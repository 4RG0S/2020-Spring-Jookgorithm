rope = [ int(input()) for _ in range(int(input()))]

rope.sort(reverse=True)
for i in range(len(rope)):
    rope[i] = rope[i] * (i + 1)

print(max(rope))