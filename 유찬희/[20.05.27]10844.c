#include<stdio.h>

int main(){
    int n;scanf("%d",&n);
    int dp[101][10] = {0, };
    int i,j;
    for (i = 1; i < 10; i++)
        dp[1][i] = 1;
    for (i = 2; i <= n; i++){
        for (j = 0; j < 10; j++){
            if (j == 0)
                dp[i][j] = dp[i - 1][1] % 1000000000;
            else if (j == 9)
                dp[i][j] = dp[i - 1][8] % 1000000000;
            else
                dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000;
        }
    }
    int sum = 0;
    for (i = 0; i < 10; i++)
        sum = (sum + dp[n][i]) % 1000000000;
    printf("%d\n",sum % 1000000000);
}