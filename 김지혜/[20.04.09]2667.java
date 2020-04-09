import java.io.IOException;
import java.util.*;

public class Main {

    static int[][] visited;
    public static class Pair{
        int i;
        int j;
        public Pair(int i, int j){
            this.i = i;
            this.j = j;
        }
    }
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] aj = new int[n+1][n+1];
        visited = new int[n+1][n+1];

        for(int i=1;i<n+1;i++){
            String houses = scan.next();
            for(int j=0;j<n;j++){
                aj[i][j+1] = Integer.parseInt(houses.charAt(j)+"");
            }
        }
        search(aj);
    }
    public static Pair searchStartPoint(int[][] aj){
        int n = aj.length;
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                if(aj[i][j]==1 && visited[i][j]==0)
                    return new Pair(i, j);
            }
        }
        return new Pair(-1, -1);
    }
    public static void search(int[][] aj){

        int n = aj.length;
        Queue<Pair> q = new LinkedList();

        Pair startP = searchStartPoint(aj);
        int b = 0;

        PriorityQueue<Integer> answers = new PriorityQueue<>();
        int answer = 0;

        q.add(startP);
        while(startP.i!=-1){
            while(!q.isEmpty()){
                Pair temp = q.poll();
                if(visited[temp.i][temp.j]==1) continue;
                visited[temp.i][temp.j] = 1;
                answer ++;

                int nexti = temp.i;
                int nextj = temp.j;

                if(aj[nexti-1][nextj]==1 && visited[nexti-1][nextj]!=1) q.add(new Pair(nexti-1, nextj));
                if(nexti+1<n && aj[nexti+1][nextj]==1 && visited[nexti+1][nextj]!=1) q.add(new Pair(nexti+1, nextj));
                if(aj[nexti][nextj-1]==1 && visited[nexti][nextj-1]!=1) q.add(new Pair(nexti, nextj-1));
                if(nextj+1<n && aj[nexti][nextj+1]==1 && visited[nexti][nextj+1]!=1) q.add(new Pair(nexti, nextj+1));
            }
            if(answer!=0) {answers.add(answer); answer = 0;}
            b++;
            q = new LinkedList();
            startP = searchStartPoint(aj);
            q.add(startP);
        }
        System.out.println(b);

        for(int i=0;i<b;i++){
            System.out.println(answers.poll());
        }

    }
}
