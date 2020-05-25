import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] dp = new int[n+1];
        int[] trace = new int[n+1];
        dp[1] = 0;
        trace[1] = 0;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1]+1;
            trace[i] = i-1;
            if(i%3 == 0&&dp[i] > dp[i/3]+1) {
                dp[i] = dp[i / 3] + 1;
                trace[i] = i/3;
            }
            if(i%2 == 0&&dp[i] > dp[i/2]+1) {
                dp[i] = dp[i / 2] + 1;
                trace[i] = i/2;
            }
        }
        System.out.println(dp[n]);
        int i = n;
        while(i >= 1){
            System.out.print(i + " ");
            i = trace[i];
        }
    }
}