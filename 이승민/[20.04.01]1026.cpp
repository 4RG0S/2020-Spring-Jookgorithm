#include <iostream>
#include <algorithm>

using namespace std;

bool desc(int a, int b){ return a > b; }

int main(){
    int n = 0, num = 0, rtn = 0;

    cin >> n;

    int A[51] = {0}, B[51] = {0};
    for(int i = 0; i < 2; i++){
        for(int j = 0; j < n; j++){
            cin >> num;
            if(i == 0) A[j] = num;
            if(i == 1) B[j] = num;
        }    
    }

    // 오름차순
    sort(A, A+n);
    // 내림차순
    sort(B, B+n, desc);

    for(int i = 0; i < n; i++){
        rtn += A[i] * B[i];
    }

    cout << rtn << "\n";

    return 0;
}
