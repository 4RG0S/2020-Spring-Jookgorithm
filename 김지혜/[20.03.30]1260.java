import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int v = scan.nextInt();

        int[][] graph = new int[n+1][n+1];

        for(int i=0;i<m;i++){
            int x = scan.nextInt();
            int y = scan.nextInt();

            graph[x][y] = 1;
            graph[y][x] = 1;
        }
        boolean[] isChecked = new boolean[n+1];

        DFS(graph, isChecked, v);
        System.out.println();
        isChecked = new boolean[n+1];
        BFS(graph, isChecked, v);

    }
    public static void DFS(int[][] graph, boolean[] isChecked, int src){
        System.out.print(src);
        isChecked[src] = true;
        for(int i=0;i<isChecked.length;i++){
            if(graph[src][i] == 1 && !isChecked[i]){
                System.out.print(" ");
                DFS(graph, isChecked, i);
            }
        }
    }
    public static void BFS(int[][] graph, boolean[] isChecked, int src){
        isChecked[src] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        String answer = "";

        while(!q.isEmpty()){
            int v = q.poll();
            answer = answer + v +" ";

            for(int i=0;i<isChecked.length;i++){
                if(graph[v][i] == 1 && !isChecked[i]){
                    isChecked[i] = true;
                    q.add(i);
                }
            }
        }
        System.out.println(answer.substring(0, answer.length()-1));

    }
}
