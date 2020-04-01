import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int a;
    static int b;
    static int[][] answer;

    public static class Pair{
        int x;
        int y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();

        int[][] map = new int[a+1][b+1];
        answer = new int[a+1][b+1];

        for(int i=1;i<=a;i++){
            String str = scan.next();
            for(int j=1;j<=b;j++){
                map[i][j] = Integer.parseInt(str.charAt(j-1)+"");
            }
        }
        BFS(map);
        System.out.println(answer[a][b]);

    }
    public static void BFS(int[][] map){

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(1, 1));
        answer = new int[a+1][b+1];

        int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

        while(!q.isEmpty()){

            Pair pair = q.poll();
            int cury = pair.x;
            int curx = pair.y;
            answer[1][1] = 1;

            for(int i=0;i<4;i++){
                int nexty = cury+dir[i][0];
                int nextx = curx+dir[i][1];

                if(nexty>=1 && nexty<=a && nextx>=1 && nextx<=b && map[nexty][nextx]==1 && answer[nexty][nextx]==0){
                    answer[nexty][nextx] = answer[cury][curx] + 1;
                    q.add(new Pair(nexty, nextx));
                }
            }
        }
    }
}
