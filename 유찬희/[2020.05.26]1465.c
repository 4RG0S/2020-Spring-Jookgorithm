#include<stdio.h>

int main(){
    int T;scanf("%d",&T);
    int i,j;
    for (i = 0; i < T; i++){
        int dp[100001][2] = {0, };
        int arr[100001][2] = {0, };
        int n;scanf("%d",&n);
        for (j = 0; j < n; j++)
            scanf("%d",&arr[j][0]);
        for (j = 0; j < n; j++)
            scanf("%d",&arr[j][1]);
        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[1][0] = dp[0][1] + arr[1][0];
        dp[1][1] = dp[0][0] + arr[1][1];
        for (j = 2; j < n; j++){
            dp[j][0] = arr[j][0];
            dp[j][1] = arr[j][1];

            dp[j][0] += dp[j - 1][1] > dp[j - 2][1] ? dp[j - 1][1] : dp[j - 2][1];
            dp[j][1] += dp[j - 1][0] > dp[j - 2][0] ? dp[j - 1][0] : dp[j -2][0];
        }
        int ans = dp[n - 1][0] > dp[n - 1][1] ? dp[n - 1][0] : dp[n - 1][1];
        printf("%d\n",ans);
    }
}