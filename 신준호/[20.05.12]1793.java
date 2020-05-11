import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.sql.SQLSyntaxErrorException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static BigInteger[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String[] tokens;

        //input = br.readLine();
        //tokens = input.split(" ");

        dp = new BigInteger[251];
        Arrays.fill(dp, BigInteger.ZERO);
        dp[0] = BigInteger.ONE;
        while((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            System.out.println(tile(n));
        }
    }

    public static BigInteger tile(int n) {

        if(n == 0 || !(dp[n].compareTo(BigInteger.ZERO) == 0)) return dp[n];

        BigInteger count = BigInteger.ZERO;
        if(n >= 2) {
            count = count.add(tile(n - 2));
            count = count.add(tile(n - 2));
        }
        count = count.add(tile(n - 1));

        return dp[n] = count;
    }

}