import java.util.Scanner;

public class Main {
    static int[][] table;
    static int x1,x2,y1,y2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        table = new int[n+1][n+1];
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                table[i][j] = scanner.nextInt();
                table[i][j] += table[i-1][j]+table[i][j-1]-table[i-1][j-1];
            }
        }
        for(int i = 0; i < m; i++){
            x1 = scanner.nextInt();
            y1 = scanner.nextInt();
            x2 = scanner.nextInt();
            y2 = scanner.nextInt();
            System.out.println(table[x2][y2] - table[x1-1][y2] - table[x2][y1-1] + table[x1-1][y1-1]);
        }
    }
}