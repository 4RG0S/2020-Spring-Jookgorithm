import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i=0;i<=n;i++)
            arr.add(new ArrayList<>());
        for(int i=1;i<n;i++){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr.get(a).add(b);
            arr.get(b).add(a);
        }
        int[] parent = new int[n+1];

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        parent[1] = 0;
        while(!q.isEmpty()){
            int t = q.poll();

            for(int i : arr.get(t)){
                if(parent[i] == 0){
                    parent[i] = t;
                    q.add(i);
                }
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=2;i<=n;i++){
            bw.write(parent[i]+"\n");
        }
        br.close();
        bw.close();

    }



}
