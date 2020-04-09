#include <stdio.h>

int graph[101][101] = {0, };
int dfs_visit[101] = {0, };
int ans = 0;

void dfs(int v, int n){
    int i = 1;
    dfs_visit[v] = 1;
    ans++;
    while (i <= n){
        if (graph[v][i] == 1 && dfs_visit[i] != 1)
            dfs(i, n);
        i++;
    }
}

int main(){
    int N,M;
    scanf("%d",&N);
    scanf("%d",&M);
    int i = 0;
    int x,y;
    for (i = 0; i < M; i++){
        scanf("%d %d",&x, &y);
        graph[x][y] = 1;
        graph[y][x] = 1;
    }
    dfs(1, N);
    printf("%d\n",ans - 1);
}