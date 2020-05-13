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

        while(true) {
            input = br.readLine();
            tokens = input.split(" ");

            int n, m;
            n = Integer.parseInt(tokens[0]);
            m = (int) Math.round(Double.parseDouble(tokens[1]) * 100);

            if(n == 0 && m == 0.00) break;

            dp = new int[10001];

            Candy[] candies = new Candy[n];
            for(int i = 0; i < n; i++) {
                input = br.readLine();
                tokens = input.split(" ");

                int cal = Integer.parseInt(tokens[0]);
                int price = (int) Math.round(Double.parseDouble(tokens[1]) * 100);

                candies[i] = new Candy(cal, price);
            }

            System.out.println(maximumCal(candies, m));

        }


    }

    public static int maximumCal(Candy[] candies, int price) {

        if(dp[price] != 0) return dp[price];

        int opt = 0;
        for(int i = 0; i < candies.length; i++) {
            int diff = price - candies[i].price;
            if(diff < 0) continue;

            int maxOfDiff = maximumCal(candies, diff);
            if(maxOfDiff == -1) maxOfDiff++;

            opt = Math.max(opt, maxOfDiff + candies[i].cal);
        }

        if(opt == 0) opt = -1;
        return dp[price] = opt;

    }

    public static class Candy {
        int cal;
        int price;

        Candy(int cal, int price) {
            this.cal = cal;
            this.price = price;
        }
    }


}
