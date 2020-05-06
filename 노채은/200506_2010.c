#include <stdio.h>

int main(void) {
    int N;
    int result = 0;
    scanf("%d", &N);
    for (int i = 0; i < N; i++)
    {
        int temp;
        scanf("%d", &temp);
        result += temp;
    }
    printf("%d\n", result - N + 1);

}