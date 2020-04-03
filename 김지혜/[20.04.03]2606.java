import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] pairs = new int[n+1][n+1];

        for(int i=0;i<m;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();

            pairs[a][b] = 1;
            pairs[b][a] = 1;
        }
        boolean[] visited = new boolean[n+1];
        int answer = -1;
        Queue<Integer> q = new LinkedList();
        q.add(1);
        visited[1] = true;
        while(!q.isEmpty()){
            int temp = q.poll();
            answer++;
            for(int j=1;j<=n;j++){

                if(pairs[temp][j] == 1 && !visited[j]) {
                    visited[j] = true;
                    q.add(j);
                }
            }
        }
        System.out.println(answer);
    }
}
