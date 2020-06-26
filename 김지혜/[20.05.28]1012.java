import java.io.IOException;
import java.util.Scanner;

public class Main {

    static Scanner scan;
    public static void main(String[] args) throws IOException {

        scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0;i<t;i++) {
            int m = scan.nextInt();
            int n = scan.nextInt();
            int k = scan.nextInt();

            BST(m, n, k);
        }

    }
    public static void BST(int m, int n, int k){

        int[][] bae = new int[m+1][n+1];
        boolean[][] visited = new boolean[m+1][n+1];
        for(int i=0;i<k;i++){
            bae[scan.nextInt()][scan.nextInt()] = 1;
        }

        int answer = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                if(bae[i][j]==1 && !visited[i][j]){
                    answer++;
                    visited[i][j] = true;
                    RecvBST(n, m, i, j, bae, visited);
                }
            }
        }
        System.out.println(answer);
    }
    public static void RecvBST(int n, int m, int i, int j, int[][] bae, boolean[][] visited){

        int[] x = {1, -1, 0, 0};
        int[] y = {0, 0, 1, -1};

        for(int h=0;h<4;h++){
            int nextI = i+y[h];
            int nextJ = j+x[h];

            if(nextI < 0 || nextJ < 0 || nextI >= m || nextJ >= n)
                continue;

            if(bae[nextI][nextJ] == 1 && !visited[nextI][nextJ]){
                visited[nextI][nextJ] = true;
                RecvBST(n, m, nextI, nextJ, bae, visited);
            }
        }

    }

}
