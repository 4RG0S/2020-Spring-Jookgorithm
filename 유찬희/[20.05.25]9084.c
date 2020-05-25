#include<stdio.h>

int ans[21] = {0, };

int main(){
    int i,j,l,r,count;
    scanf("%d",&r);
    for (i = 0; i < r; i++){
        int k;scanf("%d",&k);
        int dp[100001] = {0, };
        dp[0] = 1;
        int coins[21] = {0, };
        for (j = 0; j < k; j++)
            scanf("%d",&coins[j]);
        int sum;scanf("%d",&sum);
        for (j = 0; j < k; j++){
            for (l = coins[j]; l <= sum; l++){
                dp[l] += dp[l - coins[j]];
            }
        }
        ans[i] = dp[sum];
    }
    for (i = 0; i< r; i++)
        printf("%d\n",ans[i]);
}