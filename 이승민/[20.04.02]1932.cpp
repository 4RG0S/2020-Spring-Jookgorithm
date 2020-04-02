#include <iostream>
#include <algorithm>

using namespace std;

int main(){
    int n = 0, num = 0, dp[500][500] = {0}, sq[500][500] = {0};
    scanf("%d", &n);

    for(int i = 0; i < n; i++){
        for(int j = 0; j < i+1; j++){
            scanf("%d", &num);
            sq[i][j] = num;
        }
    }

    dp[0][0] = sq[0][0];

    for(int i = 0; i < n-1; i++){
        for(int j = 0; j < i+1; j++){
            dp[i+1][j] = max(dp[i+1][j], sq[i+1][j] + dp[i][j]);
            dp[i+1][j+1] = max(dp[i+1][j+1], sq[i+1][j+1] + dp[i][j]);
        }
    }

    int rtn = 0;
    for(int i = 0; i < n; i++){
        if( rtn < dp[n-1][i] ) rtn = dp[n-1][i];
    }

    printf("%d", rtn);

    return 0;
}
