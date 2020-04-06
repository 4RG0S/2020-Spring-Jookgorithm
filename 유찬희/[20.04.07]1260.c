#include <stdio.h>

int graph[1001][1001] = {0, };
int dfs_visit[1001] = {0, };
int bfs_visit[1001] = {0, };
int queue[1001] = {0, };

void dfs(int v, int n){
    int i = 1;
    dfs_visit[v] = 1;
    printf("%d ",v);
    while (i <= n){
        if (graph[v][i] == 1 && dfs_visit[i] != 1)
            dfs(i, n);
        i++;
    }
}

void bfs(int v,int n){
    int i, front, back;
    front = 0;
    back = 0;
    queue[back++] = v;
    bfs_visit[v] = 1;
    while (front < back){
        i = 1;
        v = queue[front];
        while (i <= n){
            if (graph[v][i] == 1 && bfs_visit[i] != 1){
                queue[back++] = i;
                bfs_visit[i] = 1;
            }
            i++;
        }
        printf("%d ",queue[front++]);
    }
}

int main(){
    int n,m,v,x,y;
    scanf("%d %d %d",&n,&m,&v);
    int i = 0;
    for (i = 0; i < m; i++){
        scanf("%d %d",&x, &y);
        graph[x][y] = 1;
        graph[y][x] = 1;
    }
    dfs(v, n);
    printf("\n");
    bfs(v, n);
}