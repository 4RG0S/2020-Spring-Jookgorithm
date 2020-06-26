import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class Main {

    static ArrayList<Integer>[] arr;
    static int[] hack;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String nm = br.readLine();
        StringTokenizer st = new StringTokenizer(nm);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new ArrayList[n+1];
        for(int i=0;i<=n;i++){
            arr[i] = new ArrayList<>();
        }

        for(int i=0;i<m;i++){
            nm = br.readLine();
            st = new StringTokenizer(nm);
            int start = Integer.parseInt(st.nextToken());
            int dest = Integer.parseInt(st.nextToken());
            arr[start].add(dest);

        }
        hack = new int[n+1];

        for(int i=1;i<=n;i++){
            visited = new boolean[n+1];;
            DFS(i);
        }
        int max = 0;
        for(int i=1;i<=n;i++){
            if(hack[i]>max) max = hack[i];
        }
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=n;i++){
            if(hack[i] == max) bw.write(i+" ");
        }
        br.close();
        bw.close();
    }
    public static void DFS(int dest){
        visited[dest] = true;

        for(int i : arr[dest]){
            if(!visited[i]){
                hack[i]++;
                DFS(i);
            }
        }

    }

}
