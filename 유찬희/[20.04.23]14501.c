#include <stdio.h>

int arr[16][3] = {0, };
int dp[16] = {0, };
int n;

int func(int day)
{
    int a = 0;
    if (dp[day] > 0)
        return dp[day];
    if (day >= n)
        return 0;
    if (day + arr[day][0] <= n){
        a = arr[day][1] + func(day + arr[day][0]);
    }
    int b = func(day + 1);
    dp[day] = a > b ? a : b;
    return (dp[day]);
}
int main(){
    scanf("%d",&n);
    int i= 0;
    for (i = 0; i< n; i++){
        scanf("%d %d",&arr[i][0], &arr[i][1]);
    }
    printf("%d\n",func(0));
}
