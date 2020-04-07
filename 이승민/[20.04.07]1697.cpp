#include <iostream>
#include <queue>

using namespace std;

int n = 0, k = 0, visited[100001] = {0};
queue<int> q;

int bfs(){

    while( !q.empty() ){

        int num = q.front();
        q.pop();

        if( num == k ) return visited[num];

        if( 0 <= (num - 1) && !visited[num - 1] ){
            visited[num - 1] = visited[num] + 1;
            q.push(num-1);
        }

        if( num + 1 <= 100000 && !visited[num + 1] ) {
            visited[num + 1] = visited[num] + 1;
            q.push(num+1);
        }

        if( num * 2 <= 100000 && !visited[num * 2] ) {
            visited[num * 2] = visited[num] + 1;
            q.push(num*2);
        }
    }
}

int main(){
    cin >> n >> k;
    q.push(n);
    printf("%d", bfs());

    return 0;
}
