#include <stdio.h>

int main() {
    int M, N, i, j, min = 10001, num = 0, sum = 0;

    scanf("%d", &M);
    scanf("%d", &N);

    for (i = M; i <= N; i++) {
        num = 0;
        if (i == 1)
            num = 1;
        for (j = 2; j < i - 1; j++) {
            if (i % j == 0) {
                num = 1;
                break;
            }
        }
        if (num == 0) {
            sum += i;
            if (i < min)
                min = i;
        }
    }
    if (min == 10001)
        printf("-1");
    else
        printf("%d\n%d", sum, min);
    return 0;
}
