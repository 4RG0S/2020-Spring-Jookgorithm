#include <iostream>

using namespace std;

int main(){
    int t = 0, n = 0, p0[41] = {0}, p1[41] = {0};
    
    cin >> t;

    p0[0] = 1;
    p0[1] = 0;
    
    p1[0] = 0;
    p1[1] = 1;

    for(int i = 2; i < 41; i++){
        p0[i] = p0[i - 2] + p0[i - 1];
        p1[i] = p1[i - 2] + p1[i - 1];
    }

    for(int i = 0; i < t; i++){
        cin >> n;
        cout << p0[n] << " " << p1[n] << "\n";
    }

    return 0;
}
