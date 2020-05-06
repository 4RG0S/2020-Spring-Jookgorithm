import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = scan.nextInt();
        int[] plus_dp = new int[n];
        int[] minus_dp = new int[n];
        plus_dp[0] = minus_dp[n-1] = 1;
        int max = 1;
        for(int i = 1; i < n; i++){
            plus_dp[i] = 1;
            for(int j = 0; j < i; j++) {
                if (a[i] > a[j]) plus_dp[i] = Math.max(plus_dp[i],plus_dp[j]+1);
            }
        }
        for(int i = n-2; i >= 0; i--){
            minus_dp[i] = 1;
            for(int j = n-1; j > i; j--){
                if(a[i] > a[j]) minus_dp[i] = Math.max(minus_dp[i],minus_dp[j]+1);
            }
        }
        for(int i = 0; i < n; i++)
            max = Math.max(max, plus_dp[i]+minus_dp[i]-1);
        System.out.println(max);
    }
}