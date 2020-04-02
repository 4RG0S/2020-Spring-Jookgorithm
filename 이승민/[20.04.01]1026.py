
if __name__ == "__main__":

    n = int(input())

    A = list(map(int, input().split()))
    B = list(map(int, input().split()))
    C = [0] * n

    A.sort()
    B.sort(reverse=True)

    for i in range(n):
        C[i] = A[i] * B[i]

    print(sum(C))
