import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static int[][][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String[] tokens;

        //input = br.readLine();
        //tokens = input.split(" ");

        dp = new int[21][21][21];

        while(!(input = br.readLine()).equals("-1 -1 -1")) {
            tokens = input.split(" ");

            int a, b, c;
            a = Integer.parseInt(tokens[0]);
            b = Integer.parseInt(tokens[1]);
            c = Integer.parseInt(tokens[2]);
            System.out.println("w(" + tokens[0] + ", " + tokens[1] + ", " + tokens[2] + ") = " + w(a, b, c));
        }

    }

    public static int w(int a, int b, int c) {

        if(a <= 0 || b <= 0 || c <= 0) return 1;
        if(a > 20 | b > 20 | c > 20) return w(20, 20, 20);

        if(dp[a][b][c] != 0) return dp[a][b][c];
        if(a < b && b < c) return dp[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
        return dp[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
    }


}