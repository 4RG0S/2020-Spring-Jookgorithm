#include <iostream>
#include <cstdio>
#include <vector>
#include <cstring>

using namespace std;

int cnt[1];
vector<int> visited;
bool bool_v[100001];
int nums[100001];

int dfs(int s);

int dfs(int s){
    visited.push_back(s);
    bool_v[s] = true;
    int node = nums[s];

    if ( bool_v[node] ) {
        for(int i = 0; i < visited.size(); i++){
            if(visited.at(i) == node){
                cnt[0] += visited.size() - i;
            }
            
        }
        return 0;
    }
    else {
        dfs(node);
    }

    return 0;

}

int main(){
    int t = 0, n = 0, num = 0;
    
    scanf("%d", &t);

    for(int i = 0; i < t; i++){
        scanf("%d", &n); // 입력
        cnt[0] = 0;
        memset(bool_v, false, sizeof(bool_v)); // bool_visited 초기화
        memset(nums, 0, sizeof(nums)); // nums 초기화
        for(int j = 1; j < n+1; j++){ // 번호 입력
            scanf("%d", &num);
            nums[j] = num;
        }

        for(int j = 1; j < n+1; j++){
            visited.clear(); // 벡터 클리어
            if( !bool_v[j] )
                int a = dfs(j);
        }

        printf("%d\n", n-cnt[0]);
        
    }
    return 0;
}
