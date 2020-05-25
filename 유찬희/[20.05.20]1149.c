#include <stdio.h>

int min(int a, int b){
    return a < b ? a : b;
}

int main(){
    int n;scanf("%d",&n);
    int i = 0;
    int dp[1001][3] = {0, };
    for (i = 0; i < n; i++){
        int r,g,b;
        scanf("%d %d %d",&r,&g,&b);
        dp[i + 1][0] = min(dp[i][1],dp[i][2]) + r;
        dp[i + 1][1] = min(dp[i][0],dp[i][2]) + g;
        dp[i + 1][2] = min(dp[i][0],dp[i][1]) + b;
    }
    printf("%d\n",min(min(dp[n][0],dp[n][1]),dp[n][2]));
}