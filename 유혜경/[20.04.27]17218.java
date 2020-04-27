import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int[][] dp = new int[a.length()+1][b.length()+1];
        int max=0,max_i=0,max_j=0;
        for(int i = 0; i <= a.length(); i++){
            for (int j = 0; j <= b.length(); j++){
                if(i==0||j==0) dp[i][j] = 0;
                else if(a.charAt(i-1) == b.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if(max < dp[i][j]) {
                        max = dp[i][j];
                        max_i = i;
                        max_j = j;
                    }
                }
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        String str = String.valueOf(a.charAt(max_i-1));
        int i = max_i-1, j = max_j-1, val = dp[max_i-1][max_j-1];
        while(i>0||j>0){
            if(val == 0) break;
            else if(dp[i-1][j] == val) i--;
            else if(dp[i][j-1] == val) j--;
            else{
                str = String.valueOf(a.charAt(i-1)) + str;
                val = dp[i-1][j-1];
                i--;
                j--;
            }
        }
        System.out.println(str);
    }
}