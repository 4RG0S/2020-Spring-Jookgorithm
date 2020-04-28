#include <stdio.h>

int n;
int card[1001] = {0, };
int dp[1001][1001] = {0, };

int func(int i ,int count){
    if (dp[i][count] > 0)
        return dp[i][count];
    if (count >= n || i == n + 1)
        return 0;
    int a = 0;
    if (count + i <= n)
        a = card[i] + func(i, count + i);
    int b = func(i + 1, count);
    dp[i][count] = a > b ? a : b;
    return dp[i][count];
}

int main(){
    scanf("%d",&n);
    int i = 0;
    for (i = 1; i <= n; i++)scanf("%d",&card[i]);
    
    printf("%d\n",func(1,0));
}