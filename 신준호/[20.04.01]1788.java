import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String[] tokens;

        //input = br.readLine();
        //tokens = input.split(" ");

        int n = Integer.parseInt(br.readLine());
        int[] fibo = new int[2000001];
        fibo[1000001] = 1; fibo[999999] = 1;

        for(int i = 1000002; i < 2000001; i++) {
            fibo[i] = (fibo[i - 1] + fibo[i - 2]) % 1000000000;
            fibo[2000000 - i] = (fibo[2000002 - i] - fibo[2000001 - i]) % 1000000000;
        }
        fibo[0] = (fibo[2] - fibo[1]) % 1000000000;

        int idx = n + 1000000;
        System.out.println(Integer.compare(fibo[idx], 0));
        System.out.println(fibo[idx] > 0 ? fibo[idx] : -1 * fibo[idx]);
    }

}