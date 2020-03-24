#include <iostream>
#include <vector>
#include <cmath>
#include <algorithm>

using namespace std;

int main(){
    int a = 0, p = 0;
    cin >> a >> p;
    vector<int> seq;
    seq.push_back(a);

    int count = 0;
    while(true){
        int sum_value = 0;
        string last = to_string(seq.back());
        for (int i = 0; i < last.size(); i++)
        {
            int num = stoi(last.substr(i, 1));
            sum_value += pow(num, p);
        }
        
        for(int i = 0; i < seq.size(); i++){
            if( seq.at(i) == sum_value){
                cout << i << "\n";
                return 0;
            }
        }

        seq.push_back(sum_value);
    }
    
    return 0;
}
