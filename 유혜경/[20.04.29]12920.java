import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<bag> bags = new ArrayList<bag>();
        bags.add(0, new bag(0,0));
        int cnt = 1, ad = 0;
        for(int i = 1; i <= n; i++){
            int v = scanner.nextInt();
            int c = scanner.nextInt();
            int k = scanner.nextInt();
            while(k > cnt){
                bags.add(i+ad, new bag(v*cnt,c*cnt));
                k -= cnt;
                cnt*=2;
                ad++;
            }
            bags.add(i+ad, new bag(v*k, c*k));
            cnt = 1;
        }
        int[][] dp = new int[bags.size()][m+1];
        for(int i = 0; i < bags.size(); i++){
            for(int j = 0; j <= m; j++){
                if(i==0) dp[i][j] = 0;
                else if(bags.get(i).v>j) dp[i][j] = dp[i-1][j];
                else{
                    dp[i][j] = Math.max(dp[i-1][j], bags.get(i).c+dp[i-1][j-bags.get(i).v]);
                }
            }
        }
        System.out.println(dp[bags.size()-1][m]);
    }
}
class bag {
    int v,c;
    public bag(int v, int c){
        this.v = v;
        this.c = c;
    }
}