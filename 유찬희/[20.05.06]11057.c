#include <stdio.h>

int main(){
    long long arr[1001][11] = {0, };
    int n;scanf("%d",&n);
    int i = 0;
    int j = 0;
    for (i = 0; i < 10; i++)
        arr[0][i] = 1;
    for (i = 1; i < n; i++){
        arr[i][0] = 1;
        for (j = 1; j < 10; j++)
            arr[i][j] = (arr[i][j - 1] + arr[i - 1][j]) % 10007;
    }
    int sum = 0;
    for (i = 0; i < 10; i++)
        sum += arr[n - 1][i];
    printf("%d\n",sum % 10007);
}