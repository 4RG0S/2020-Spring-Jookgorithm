#include <iostream>
#include <queue>
#include <vector>
#include <algorithm>

using namespace std;

int m = 0, n = 0, k = 0, x1 = 0, y1 = 0, x2 = 0, y2 = 0;
int dx[4] = {0, 1, 0, -1}, dy[4] = {1, 0, -1, 0}, paper[101][101] = {0};
int x = 0, y = 0, nx = 0, ny = 0;

typedef pair<int, int> p;
vector<int> width;
queue<p> q;

int bfs(int i, int j){
    int rtn = 0;
    
    q.push({i,j});
    paper[i][j] = 1;
    rtn++;

    while( !q.empty() ){
        p x_y = q.front();
        q.pop();
        
        y = x_y.first;
        x = x_y.second;

        for(int i = 0; i < 4; i++){
            nx = x + dx[i];
            ny = y + dy[i];

            if( 0 > ny || ny >= m || 0 > nx || nx >= n) continue;
            if( paper[ny][nx] != 0) continue;

            q.push({ny, nx});
            paper[ny][nx] = 1;
            rtn++;
        }
    }
    return rtn;
}

int main(){
    cin >> m >> n >> k;

    for(int i = 0; i < k; i++){
        cin >> x1 >> y1 >> x2 >> y2;

        for(int j = y1; j < y2; j++){
            for(int k = x1; k < x2; k++){
                paper[j][k] = 1;
            }
        }
    }

    int cnt = 0;
    for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            if(paper[i][j] == 0){
                width.push_back(bfs(i,j));
                cnt++;
            }
        }
    }

    sort(width.begin(), width.end());
    cout << cnt << "\n";
    for(int i = 0; i < width.size(); i++){
        cout << width[i] << " ";
    }

    return 0;   
}
