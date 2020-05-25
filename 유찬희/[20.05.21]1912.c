#include <stdio.h>

int arr[100001] = {0, };
int dp[100001] = {0, };

int main(){
    int n;scanf("%d",&n);
    int i = 0;
    for (i = 1; i <= n; i++)
        scanf("%d",&arr[i]);
    for (i = 1; i <= n; i++){
        if (dp[i - 1] + arr[i] > arr[i])
            dp[i] = dp[i - 1] + arr[i];
        else
            dp[i] = arr[i];
    }
    int max = dp[1];
    for (i = 2; i <= n; i++)
        max = max > dp[i] ? max : dp[i];
    printf("%d",max);
}