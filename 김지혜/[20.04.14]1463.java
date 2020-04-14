import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] dp = new int[1000001];

        dp[1] = 0; dp[2] = 1; dp[3] = 1;
        for(int i=4;i<dp.length;i++){
            dp[i] = dp[i-1]+1;
            if(i%2==0 && dp[i]>dp[i/2]+1)
                dp[i] = dp[i/2]+1;
            if(i%3==0 && dp[i]>dp[i/3]+1)
                dp[i] = dp[i/3]+1;
        }
        System.out.println(dp[n]);
    }

}
