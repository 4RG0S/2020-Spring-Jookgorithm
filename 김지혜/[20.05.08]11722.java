import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] input = new int[n];
        for(int i=0;i<n;i++)
            input[i] = scan.nextInt();

        int[] dp = new int[n];
        dp[0] = 1;

        for(int i=1;i<n;i++){
            dp[i]  = 1;
            for(int j=0;j<i;j++){
                if(input[i] < input[j] && dp[i]<=dp[j]){
                    dp[i] = dp[j] + 1;
                }
            }
        }
        int answer = 0;
        for(int i=0;i<n;i++){
            if(answer < dp[i]) answer = dp[i];
        }
        System.out.println(answer);

    }
}
