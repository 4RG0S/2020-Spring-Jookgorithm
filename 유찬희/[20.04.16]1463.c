#include <stdio.h>

int dp[1000001] = {0, };

int main(){
    int x;
    scanf("%d",&x);
    int i = 0;
    dp[1] = 0;
    dp[2] = 1;
    dp[3] = 1;
    for (i = 4; i <=x; i++){
        dp[i] = dp[i - 1] + 1;
        dp[i] = i % 2 == 0 && dp[i] > dp[i / 2] + 1 ? dp[i / 2] + 1 : dp[i];
        dp[i] = i % 3 == 0 && dp[i] > dp[i / 3] + 1 ? dp[i / 3] + 1 : dp[i];
    }
    printf("%d\n",dp[x]);
}