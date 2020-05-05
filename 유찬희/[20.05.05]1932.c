#include<stdio.h>

int tri[501][501] = {0, };
int dp[501][501] = {0, };
int n;

int func(int f, int i){
    if (f == n)
        return 0;
    if (dp[f][i] > 0)
        return dp[f][i];
    int a = tri[f][i] + func(f + 1, i);
    int b = tri[f][i + 1] + func(f + 1, i + 1);
    dp[f][i] = a > b ? a : b;
    return dp[f][i];
}

int main(){
    scanf("%d",&n);
    int i = 0;
    int j = 0;
    for (i = 0 ; i < n; i++)
        for (j = 0; j < i + 1; j++)
            scanf("%d",&tri[i][j]);
    printf("%d\n",func(1,0) + tri[0][0]);
}