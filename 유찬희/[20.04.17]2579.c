#include<stdio.h>

int dp[3][301] = {0, };
int stairs[301];

int max(int a,int b){
    return a > b ? a: b;
}

int func(int n,int flag){
    int a = 0;
    int b = 0;
    if (n < 0)
        return 0;
    if (dp[flag][n] > 0)
        return dp[flag][n];
    if (flag < 2){
        a = stairs[n] + func(n - 1,flag + 1);
    }
    if (flag != 0){
        b = func(n - 1, 0);
    }
    dp[flag][n] = max(a,b);
    return dp[flag][n];
}

int main(){
    int n;
    scanf("%d",&n);
    int i = 0;
    for (i = 0; i<n; i++)
        scanf("%d",&stairs[i]);
    printf("%d\n",func(n - 2, 1) + stairs[n - 1]);
}