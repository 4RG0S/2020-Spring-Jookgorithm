#include <stdio.h>

int main() {
    int X, i, j, x = 0;
    scanf("%d", &X);

    for (i = 1; X > 0; i++) {
        X = X - i;
        x++;
    }
    i = 1, j = x;
    if (x % 2 == 0) {
        for (; X > -x + 1; X--)
            i++, j--;
    }
    else {
        for (; X < 0; X++)
            i++, j--;
    }
    printf("%d/%d", i, j);
    return 0;
}