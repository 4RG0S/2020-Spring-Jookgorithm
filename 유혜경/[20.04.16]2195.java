import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String p = scanner.nextLine();
        int[] dp = new int[p.length()+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= p.length(); i++){
            dp[i] = dp[i-1]+1;
            for(int j = 1; j < i; j++){
                String tmp = p.substring(j-1,i);
                if(s.contains(tmp)){
                    dp[i] = Math.min(dp[j-1]+1, dp[i]);
                }
            }
        }
        System.out.println(dp[p.length()]);
    }
}