import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = scan.nextInt();
        int[] dp = new int[n];
        dp[0] = 1; int max = 1;
        for(int i = 1; i < n; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++) {
                if (a[i] > a[j]) dp[i] = Math.max(dp[i],dp[j]+1);
            }
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}