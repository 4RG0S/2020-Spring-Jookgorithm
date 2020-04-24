#include <stdio.h>

int dp[10001][3] = {0, };
int arr[10001] = {0, };
int n;

int func(int i ,int flag){
    if (dp[i][flag] > 0)
        return dp[i][flag] ;
    if (i == n)
        return 0;
    int a = 0;
    if (flag < 2)
        a = arr[i] + func(i + 1, flag + 1);
    int b = func(i + 1, 0);
    dp[i][flag] = a > b ? a : b;
    return dp[i][flag];
}

int main(){
    scanf("%d",&n);
    int i = 0;
    for (i = 0; i< n; i++){
        scanf("%d",&arr[i]);
    }
    printf("%d\n",func(0,0));
}