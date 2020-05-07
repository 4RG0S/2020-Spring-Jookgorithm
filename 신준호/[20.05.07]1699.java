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

        //input = br.readLine();
        //tokens = input.split(" ");

        int n = Integer.parseInt(br.readLine());
        dp = new int[n+1];
        System.out.println(sumOfSqr(n));
    }

    public static int sumOfSqr(int n) {

        if(n == 0)     return dp[0];
        if(dp[n] != 0) return dp[n];

        int min = Integer.MAX_VALUE;
        for(int i = 1; i*i <= n; i++)
            min = Math.min(min, sumOfSqr(n - i*i) + 1);

        return dp[n] = min;
    }


}
