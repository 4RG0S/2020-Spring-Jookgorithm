#include <iostream>
#include <vector>
#include <queue>
#include <cmath>

using namespace std;
int n = 0, m = 0, a = 0, b = 0, INF = 987654321, max_num = 0;
vector<pair<int, int>> barn[20001];
int dist[20001];

void dijkstra(int s){
    dist[s] = 0;
    priority_queue<pair<int, int>> pq; // 힙구조
    pq.push(make_pair(s, 0));

    // 가까운 순서대로 처리 하므로 큐 사용
    while( !pq.empty() ){
        int current = pq.top().first;
        // 짧은 것이 먼저 오도록 음수화
        int distance = -pq.top().second;
        pq.pop();
        // 최단거리가 아닌경우 스킵
        if(dist[current] < distance) continue;
        for(int i = 0; i < barn[current].size(); i++){
            int next = barn[current][i].first;
            int nextDistance = barn[current][i].second + distance;

            if( nextDistance < dist[next] ){
                dist[next] = nextDistance;
                pq.push(make_pair(next, -nextDistance));
            }
        }
    }
}

int main(){
    scanf("%d %d", &n, &m);

    for(int i = 0; i < m; i++){
        scanf("%d %d", &a, &b);
        barn[a].push_back(make_pair(b, 1));
        barn[b].push_back(make_pair(a, 1));
    }

    for(int i = 0; i < n; i++){
        dist[i + 1] = INF;
    }

    dijkstra(1);

    vector<int> answer;

    for(int i = 1; i < n+1; i++){
        max_num = max(max_num, dist[i]);
    }

    for(int i = 1; i < n+1; i++){
        if( dist[i] == max_num ){
            answer.push_back(i);
        }
    }
    cout << answer.front() << " " << max_num << " " << answer.size() << "\n";
    return 0;
}
