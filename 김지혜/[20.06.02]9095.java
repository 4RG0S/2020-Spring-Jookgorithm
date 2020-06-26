import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] dp = new int[12];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 4;

        for(int i=3;i<12;i++){
            dp[i] = dp[i-3]+dp[i-2]+dp[i-1];
        }
        for(int i=0;i<n;i++){
            int a = scan.nextInt();
            System.out.println(dp[a-1]);
        }
        


    }
}