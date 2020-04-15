import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[][] dp = new int[n+2][n+2];
        int[][] input = new int[n+2][n+2];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                input[i][j] = scan.nextInt();
            }
        }
        dp[1][1] = input[1][1];
        dp[2][1] = dp[1][1] + input[2][1];
        dp[2][2] = dp[1][1] + input[2][2];

        for(int i=3;i<=n;i++){
            for(int j=1;j<=i;j++){
                dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j])+input[i][j];
            }
        }
        int answer = 0;
        for(int i=1;i<=n;i++){
            if(answer < dp[n][i]) answer = dp[n][i];
        }
        System.out.println(answer);
    }

}
