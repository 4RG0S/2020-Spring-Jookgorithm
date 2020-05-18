import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] t = new int[1001];
        int[] p = new int[1001];
        for(int i=1;i<=n;i++){
            t[i] = scan.nextInt();
            p[i] = scan.nextInt();
        }

        int[] dp = new int[1001];
        for(int i=n;i>0;i--){
            if(t[i]+i>n+1){
                dp[i] = dp[i+1];
            }
            else{
                dp[i] = Math.max(dp[i+1], dp[t[i]+i]+p[i]);
            }
        }
        System.out.println(dp[1]);
    }

}
