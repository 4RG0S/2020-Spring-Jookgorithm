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

        getSeriesCount(0, n, m, 0, "");

    }

    public static void getSeriesCount(int len, int n, int m, int prev, String str) {
        if(len == m)
            System.out.println(str);
        else {
            for(int i = prev + 1; i <= n; i++)
                getSeriesCount(len + 1, n, m, i, str + i + " ");
        }
    }

}