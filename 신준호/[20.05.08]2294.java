import com.sun.javafx.image.IntPixelGetter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String[] tokens;

        input = br.readLine();
        tokens = input.split(" ");

        int n, k;
        n = Integer.parseInt(tokens[0]);
        k = Integer.parseInt(tokens[1]);
        dp = new int[k+1];

        int[] coins = new int[n];
        for(int i = 0; i < n; i++)
            coins[i] = Integer.parseInt(br.readLine());

        int min = minCoins(k, coins);
        if(min == 0x0FFFFFFF)
            System.out.println("-1");
        else
            System.out.println(min);
    }

    public static int minCoins(int n, int[] coins) {

        if(n == 0)     return 0;
        if(dp[n] != 0) return dp[n];

        int sum = 0x0FFFFFFF;
        for(int i = 0; i < coins.length; i++) {
            if(n >= coins[i])
                sum = Math.min(sum, minCoins(n-coins[i], coins) + 1);
        }

        return dp[n] = sum;
    }


}
