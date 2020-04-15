import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] a = new String[n];
        int[] dp = new int[s.length()+1];
        Arrays.fill(dp, 0);
        dp[s.length()] = 1;
        for(int i = 0; i < n; i++)
            a[i] = scanner.nextLine();
        for(int i = s.length()-1; i >= 0; i--){
            for(int j = 0; j < n; j++){
                if(i+a[j].length() <= s.length()) {
                    if (s.substring(i, i + a[j].length()).equals(a[j]) && dp[i + a[j].length()] == 1) {
                        dp[i] = 1;
                    }
                }
            }
        }
        System.out.println(dp[0]);
    }
}