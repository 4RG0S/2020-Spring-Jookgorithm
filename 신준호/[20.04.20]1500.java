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

        input = br.readLine();
        tokens = input.split(" ");

        int s, k;
        s = Integer.parseInt(tokens[0]);
        k = Integer.parseInt(tokens[1]);

        int[] numbers = new int[k];
        int sum = k;
        Arrays.fill(numbers, 1);

        for(int i = 0; sum < s; i++) {
            if(i == k) i = 0;
            numbers[i]++;
            sum++;
        }

        BigInteger mul = new BigInteger("1");
        for(int i = 0; i < k; i++)
            mul = mul.multiply(BigInteger.valueOf(numbers[i]));

        System.out.println(mul);

    }

}
