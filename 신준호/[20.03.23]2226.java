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

        BigInteger[] arr = new BigInteger[1001];
        arr[1] = BigInteger.ZERO;
        arr[2] = BigInteger.ONE;
        for(int i = 3; i <= n; i++) {
            if(i%2 == 1)
                arr[i] = arr[i-1].multiply(BigInteger.valueOf(2)).subtract(BigInteger.valueOf(1));
            else
                arr[i] = arr[i-1].multiply(BigInteger.valueOf(2)).add(BigInteger.valueOf(1));
        }

        System.out.println(arr[n]);

    }
}
