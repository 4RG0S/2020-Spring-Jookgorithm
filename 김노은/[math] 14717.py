# Solve using Combination
# (Similar with BlackJack)
# Generate deck
card=[int(i)%10+1 for i in range(20)]

# Hand
first, second = map(int,input().split());

# Draw card
card.remove(first);
card.remove(second);

# Counting
score=0
if fisrt==second:
    for i in range(17):
        for j in range(i+1,  18):
            if card[i]==card[j] > first:
                score += 1
else:
    for i in range(17):
        for j in range(i+1,18):
            if d[i]==d[j] or (first + second)%10 <= (card[i] + card[j])%10:
                score += 1

print(format(round(1-score/153, 3),".3f"))
