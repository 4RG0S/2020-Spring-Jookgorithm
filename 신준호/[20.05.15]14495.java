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

        //input = br.readLine();
        //tokens = input.split(" ");

        int n = Integer.parseInt(br.readLine());
        BigInteger[] somethingLikeFibo = new BigInteger[n];
        if(n == 1 || n == 2 || n == 3) {
            System.out.println("1");
            return ;
        }
        somethingLikeFibo[0] = BigInteger.ONE;
        somethingLikeFibo[1] = BigInteger.ONE;
        somethingLikeFibo[2] = BigInteger.ONE;
        for(int i = 3; i < n; i++)
            somethingLikeFibo[i] = somethingLikeFibo[i-1].add(somethingLikeFibo[i-3]);

        System.out.println(somethingLikeFibo[n-1]);
    }

}