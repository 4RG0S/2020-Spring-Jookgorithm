import java.util.Scanner;

public class Main {
    static long[][] matrix, tmp;
    static int n;
    static long b;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        b = scanner.nextLong();
        matrix = new long[n+1][n+1];
        tmp = new long[n+1][n+1];
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                tmp[i][j] = scanner.nextLong();
            }
            matrix[i][i] = 1;
        }
        while(b > 0){
            if(b % 2 == 1) matrix = mul(matrix, tmp);
            tmp = mul(tmp, tmp);
            b /= 2;
        }
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static long[][] mul(long[][] a, long[][] b){
        long[][] fin = new long[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                fin[i][j] = 0;
                for (int k = 1; k <= n; k++) {
                    fin[i][j] += a[i][k] * b[k][j];
                }
                fin[i][j] %= 1000;
            }
        }
        return fin;
    }
}