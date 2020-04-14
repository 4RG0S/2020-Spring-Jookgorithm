#include <stdio.h>

int N,M;
int w[101];
int v[101];
int dp[101][100001];

int func(int i, int weight){
   if (dp[i][weight] > 0)
       return dp[i][weight];
    if(i == N)
        return 0;
    int a = 0;
    if (weight +w[i] <= M)
        a = v[i] + func(i + 1, weight + w[i]);
    int b = func(i + 1, weight);
   dp[i][weight] = a >=b ? a : b;
   return dp[i][weight];
return (a >= b ? a : b);
}

int main(){
    scanf("%d %d",&N,&M);
    int i;
    for (i = 0; i < N; i++)
        scanf("%d %d",&w[i],&v[i]);
    printf("%d\n",func(0,0));
}