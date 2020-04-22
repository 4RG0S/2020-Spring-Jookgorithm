import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] dp = new int[51];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <=n; i++)
            dp[i] = (dp[i-1]+dp[i-2]+1)%1000000007;
        System.out.println(dp[n]);
    }
}