#include <iostream>
#include <queue>

using namespace std;
typedef pair<int, int> p;
queue<p> loc;

int n = 0, m = 0, x = 0, y = 0, nX = 0, nY = 0;
int maze[101][101], dx[4] = {0, 1, 0, -1}, dy[4] = {1, 0, -1, 0};

void bfs(){
    while( !loc.empty() ){
        p x_y = loc.front();
        loc.pop();
        
        y = x_y.first;
        x = x_y.second;

        for(int i = 0; i < 4; i++){
            nX = x + dx[i];
            nY = y + dy[i];

            if( nX < 0 || nX >= m || nY < 0 || nY >= n) continue;
            if( maze[nY][nX] != 1) continue;

            loc.push({nY, nX});
            maze[nY][nX] = maze[y][x] + 1;
        }
    }
}

int main(){
    
    // 세로 가로
    scanf("%d %d", &n, &m);
    
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            scanf("%1d", &maze[i][j]);
        }
    }
    
    loc.push({0,0});
    bfs();

    printf("%d", maze[n-1][m-1]);

    return 0;
}
