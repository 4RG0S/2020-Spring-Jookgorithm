import java.util.Scanner;

public class Main {

    static boolean[][] visited;
    static int[][] input;
    static int[][] output;
    static int n;
    static int m;
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        m = scan.nextInt();

        visited = new boolean[n][m];
        input = new int[n][m];
        output = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                input[i][j] = scan.nextInt();
        }

        System.out.println(numOfRoute(n-1, m-1));

    }
    public static int numOfRoute(int x, int y){
        if(x==0 && y==0)
            return 1;

        if(!visited[x][y]){
            visited[x][y] = true;

            if(x>0 && input[x][y]<input[x-1][y]) output[x][y] += numOfRoute(x-1, y);
            if(y>0 && input[x][y]<input[x][y-1]) output[x][y] += numOfRoute(x, y-1);
            if(x<n-1 && input[x][y]<input[x+1][y]) output[x][y] += numOfRoute(x+1, y);
            if(y<m-1 && input[x][y]<input[x][y+1]) output[x][y] += numOfRoute(x, y+1);
        }
        return output[x][y];
    }
}
