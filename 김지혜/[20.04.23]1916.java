import java.io.*;
import java.util.*;

//1753
public class Main {

    public static class Graph implements Comparable<Graph>{

        int v; int w;
        public Graph(int v, int w) {
            this.v = v;
            this.w = w;
        }

        @Override
        public int compareTo(Graph o) {
            return this.w - o.w;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        List<List<Graph>> graphs = new ArrayList<>();
        int[] dist = new int[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        for(int i=0;i<n+1;i++){
            graphs.add(new ArrayList<>());
        }
        StringTokenizer st;
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graphs.get(u).add(new Graph(v, w));
        }
        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int dest = Integer.parseInt(st.nextToken());

        dist[start] = 0;

        PriorityQueue<Graph> q = new PriorityQueue<>();
        q.add(new Graph(start, 0));

        int[] visited = new int[n+1];
        while(!q.isEmpty())
        {
            int cur = q.poll().v;
            if(visited[cur] == 1) continue;
            visited[cur] = 1;

            List<Graph> searchList = graphs.get(cur);

            for(int i=0;i<searchList.size();i++) {
                Graph curGraph = searchList.get(i);
                if (dist[cur] + curGraph.w < dist[curGraph.v]) {
                    dist[curGraph.v] = dist[cur] + curGraph.w;
                    q.add(new Graph(curGraph.v, dist[curGraph.v]));
                }
            }
        }
        bw.write(dist[dest]+"\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
