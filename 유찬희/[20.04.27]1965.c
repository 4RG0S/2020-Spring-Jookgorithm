#include <stdio.h>

int n;
int box[1001] = {0, };
int dp[1001][1001] = {0, };

int func(int i, int v){
    if (i == n)
        return 0;
    if (dp[i][v] > 0)
        return dp[i][v];
    int a,b;
    a = 0;
    b = 0;
    if (v < box[i])
        a = 1 + func(i + 1, box[i]);
    b = func(i + 1, v);
    dp[i][v] = a > b ? a : b;
    return dp[i][v];
}

int main(){
    scanf("%d",&n);
    int i = 0;
    for (i = 0; i < n; i++) scanf("%d",&box[i]);
    printf("%d\n",func(0,0));
}