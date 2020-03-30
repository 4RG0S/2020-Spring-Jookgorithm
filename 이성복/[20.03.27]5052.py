import sys

input = sys.stdin.readline


def check(book):
    book.sort()
    for i in range(len(book) - 1):
        if book[i] in book[i + 1]:
            return "NO"
    return "YES"

t = int(input())
for i in range(t):
    n = int(input())
    phone_book = []
    for j in range(n):
        phone_book.append(input().rstrip())
    print(check(phone_book))