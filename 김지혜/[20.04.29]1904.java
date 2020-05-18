import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] dp = new int[n];
        dp[0] = 1; if(n>1) dp[1] = 2;
        for(int i=2;i<n;i++){
            dp[i] = dp[i-2]%15746+dp[i-1]%15746;
        }
        System.out.println(dp[n-1]%15746);

    }

}
