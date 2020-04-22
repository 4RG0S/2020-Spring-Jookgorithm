#include <stdio.h>

int main(){
    int n;
    long long dp[90];
    scanf("%d",&n);
    dp[0] = 1;
    dp[1] = 1;
    dp[2] = 2;
    int i = 3;
    for (i  = 3; i < n; i++){
        dp[i] = dp[i - 1] + dp[i - 2];
    }
    printf("%lld\n", dp[n - 1]);
 }