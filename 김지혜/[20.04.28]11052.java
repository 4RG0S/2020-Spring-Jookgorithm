import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] input = new int[n+1];
        int[] dp = new int[n+1];

        for(int i = 1;i<=n;i++) input[i] = scan.nextInt();
        dp[1] = input[1];

        for(int i = 2;i<=n;i++){
            dp[i] = input[i];
            for(int j=1;j<i;j++){
                int temp = dp[j]+dp[i-j];
                if(dp[i] < temp) dp[i] = temp;
            }
        }
        System.out.println(dp[n]);

    }

}
