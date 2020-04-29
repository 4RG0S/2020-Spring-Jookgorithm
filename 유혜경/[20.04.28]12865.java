import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = Integer.parseInt(str.split(" ")[0]);
        int k = Integer.parseInt(str.split(" ")[1]);
        knapsack[] knapsacks = new knapsack[n+1];
        for(int i = 1; i <= n; i++){
            str = scanner.nextLine();
            int w = Integer.parseInt(str.split(" ")[0]);
            int v = Integer.parseInt(str.split(" ")[1]);
            knapsacks[i] = new knapsack(w,v);
        }
        int[][] dp = new int[n+1][k+1];
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= k; j++){
                if(i==0) dp[i][j] = 0;
                else if(knapsacks[i].w>j) dp[i][j] = dp[i-1][j];
                else{
                    dp[i][j] = Math.max(dp[i-1][j], knapsacks[i].v+dp[i-1][j-knapsacks[i].w]);
                }
            }
        }
        System.out.println(dp[n][k]);
    }
}
class knapsack{
    int w,v;
    public knapsack(int w, int v){
        this.w = w;
        this.v = v;
    }
}