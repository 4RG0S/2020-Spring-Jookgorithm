import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
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

        dp = new int[1000001];

        while(!(input = br.readLine()).equals("-1")) {
            int n = Integer.parseInt(input);

            System.out.println(getX(n));

        }

    }

    public static int getX(int n) {

        if(n == 0) return 1;
        if(dp[n] != 0) return dp[n];


        int opt = getX((int) Math.floor(n-Math.sqrt(n))) +
                    getX((int) Math.floor(Math.log(n))) +
                    getX((int) Math.floor(n* Math.pow(Math.sin(n), 2)));


        return dp[n] = opt % 1000000;

    }

}