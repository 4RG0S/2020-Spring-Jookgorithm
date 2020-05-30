import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String[] tokens;

        input = br.readLine();
        tokens = input.split(" ");

        int n, m;
        n = Integer.parseInt(tokens[0]);
        m = Integer.parseInt(tokens[1]);

        System.out.println(permutation(n, m).divide(factorial(m)));
    }

    public static BigInteger permutation(int n, int m) {
        BigInteger ret = BigInteger.ONE;
        for(int i = n; i > n - m; i--)
            ret = ret.multiply(BigInteger.valueOf(i));
        return ret;
    }

    public static BigInteger factorial(int m) {
        BigInteger ret = BigInteger.ONE;
        for(int i = 1; i <= m; i++)
            ret = ret.multiply(BigInteger.valueOf(i));
        return ret;
    }

}