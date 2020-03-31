#include <stdio.h>
#include <stdlib.h>

int n,m;
int *arr;
int *visit;

void print_arr(int *arr){
    int i = 0;
    while (i < m){
        printf("%d",arr[i]);
        if (i == m)
            break;
        printf(" ");
        i++;
    }
    printf("\n");
}

void roof(int flag){
    if (flag == m){
        print_arr(arr);
        return ;
    }
    int i = 0;
    for (i = 0; i < n; i++){
        if (visit[i] == 1)
            continue;
        visit[i] = 1;
        arr[flag] = i + 1;
        roof(flag + 1);
        visit[i] = 0;
    }
}

int main(){
    scanf("%d %d",&n, &m);
    arr = (int*)malloc(sizeof(int) * m);
    visit = (int *)calloc(n, sizeof(int));
    roof(0);
}