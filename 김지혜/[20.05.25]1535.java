import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] str = new int[n];
        int[] good = new int[n];

        for(int i=0;i<n;i++){
            str[i] = scan.nextInt();
        }
        for(int i=0;i<n;i++){
            good[i] = scan.nextInt();
        }
        int[][] dp = new int[n+1][101];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=100;j++){
                if(str[i-1] > j) dp[i][j] = dp[i-1][j];
                else{
                    dp[i][j] = Math.max(dp[i-1][j-str[i-1]]+good[i-1], dp[i-1][j]);
                }
            }
        }
        System.out.println(dp[n][99]);


    }

}
