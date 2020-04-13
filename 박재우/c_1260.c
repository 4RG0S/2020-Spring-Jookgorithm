#include <cstdio>
#include <queue>

using namespace std;

int arr[1001][1001] = { 0, };
bool vi[1001] = { false, };
int N, M, V;

void init() { 
  for (int i = 0; i <= 1000; i++) vi[i] = false; 
}

void dfs(int s) {
  int i = 0;

  printf("%d ", s);
  vi[s] = true;

  for(i = 1; i <= N; i++) if (arr[s][i] && !vi[i]) dfs(i);
  if (i == N) return;
}

void bfs(int s) {
  queue <int> q;
  int i = 0;
  
  q.push(s);
  vi[s] = true;
  
  while(!q.empty()) {
    int news = q.front();
    vi[news] = true;
    printf("%d ", news);
    q.pop();
    
    for (i = 1; i <= N; i++) {
      if(arr[news][i] && !vi[i]) {
        vi[i] = true;
        q.push(i);
      }
    }
  }
}

int main() {
  int i, j, src, dest;

  scanf("%d %d %d", &N, &M, &V);

  for (i = 1; i <= M; i++) {
    scanf("%d %d", &src, &dest);
    arr[src][dest] = 1;
    arr[dest][src] = 1;
  }

  dfs(V);
  printf("\n");

  init();
  bfs(V);
  printf("\n");


  return 0;
}