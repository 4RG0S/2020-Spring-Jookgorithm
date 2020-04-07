import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        if(n == 0) {
            System.out.println("0");
            return ;
        }

        BigInteger[] fibo = new BigInteger[n+1];
        fibo[0] = BigInteger.ZERO; fibo[1] = BigInteger.ONE;
        for(int i = 2; i <= n; i++) {
            fibo[i] = fibo[i-1].add(fibo[i-2]);
        }
        System.out.println(fibo[n]);
    }
}
