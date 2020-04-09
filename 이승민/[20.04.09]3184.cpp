#include <iostream>
#include <queue>

using namespace std;

// 세로, 가로
int r = 0, c = 0;
char field[250][250] = {0};
typedef pair<int, int> p;

p bfs(int i, int j){
    queue<p> way;
    int sheep = 0, wolf = 0;
    char start = field[i][j];

    if(field[i][j] == 'o') sheep = 1;
    else if (field[i][j] == 'v') wolf = 1;

    int dx[4] = {0, 1, 0, -1 }, dy[4] = { 1, 0, -1, 0 };

    way.push({i,j});
    field[i][j] = '#';

    while( !way.empty() ) {
        p y_x = way.front();
        way.pop();
        int y = y_x.first, x = y_x.second;
        
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i]; // 다음 가로
            int ny = y + dy[i]; // 다음 세로

            // 범위 안에
            // 0이 아니면
            // 익힐수있으므로 다음으로 넘어간다.
            if (nx < 0 || nx >= c || ny < 0 || ny >= r) continue;

            if(field[ny][nx] == 'o'){
                sheep += 1;
                way.push({ny,nx});
                field[ny][nx] = '#';
            }
            else if( field[ny][nx] == 'v'){
                wolf += 1;
                way.push({ny, nx});
                field[ny][nx] = '#';
            }
            else if ( field[ny][nx] == '.' ){
                way.push({ny, nx});
                field[ny][nx] = '#';
            }

        }
    }

    p rtn = {0, 0};
    if( sheep > wolf ){
        rtn = {1, sheep};
        return rtn;
    }
    else{
        rtn = {0, wolf};
        return rtn;
    }
}

int main(){
    cin >> r >> c;
    
    for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            cin >> field[i][j];
        }
    }

    int sheep_num = 0, wolf_num = 0, num = 0, sheep_or_wolf = 0;

    for(int i = 0; i < r; i++){
        for(int j = 0; j< c; j++){
            num = 0;
            if (field[i][j] == 'o' or field[i][j] == 'v'){
                p rtn = bfs(i, j);
                sheep_or_wolf = rtn.first;
                num = rtn.second;
                if (sheep_or_wolf == 1) sheep_num += num;
                else if( sheep_or_wolf == 0) wolf_num += num;
            }
        }
    }

    printf("%d %d", sheep_num, wolf_num);

    return 0;
}
