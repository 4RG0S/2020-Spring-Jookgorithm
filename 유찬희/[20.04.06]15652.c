#include <stdio.h>
#include <stdlib.h>

int n, m;
int* arr;

void print_arr(int* arr) {
    int i = 0;
    while (i < m) {
        printf("%d", arr[i]);
        if (i == m)
            break;
        printf(" ");
        i++;
    }
    printf("\n");
}

int flag_check(int i, int flag) {
    if (flag == 0 || (flag > 0 && arr[flag - 1] <= i + 1))
        return 0;
    return 1;
}

void roof(int flag) {
    if (flag == m) {
        print_arr(arr);
        return;
    }
    int i = 0;
    for (i = 0; i < n; i++) {
        if (flag_check(i, flag))
            continue;
        arr[flag] = i + 1;
        roof(flag + 1);
    }
}

int main() {
    scanf("%d %d", &n, &m);
    arr = (int*)malloc(sizeof(int) * m);
    roof(0);
}