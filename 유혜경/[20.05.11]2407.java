import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        BigInteger[][] dp = new BigInteger[n+1][n+1];
        dp[1][0] = dp[1][1] = BigInteger.ONE;
        for(int i = 2; i <= n; i++){
            for(int j = 0; j <= i; j++){
                if(i == j || j == 0) dp[i][j] = BigInteger.ONE;
                else{
                    dp[i][j] = dp[i-1][j-1].add(dp[i-1][j]);
                }
            }
        }
        System.out.println(dp[n][m]);
    }
}