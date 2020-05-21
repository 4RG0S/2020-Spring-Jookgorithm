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

        input = br.readLine();
        tokens = input.split(" ");

        int a, b;
        a = Integer.parseInt(tokens[0]);
        b = Integer.parseInt(tokens[1]);

        int[] arr = new int[1001];
        int counter = 0;
        int val = 1;
        for(int i = 1; i < arr.length; i++) {
            arr[i] = val;
            counter++;
            if(val == counter) {
                val++;
                counter = 0;
            }
        }

        int sum = 0;
        for(int i = a; i <= b; i++)
            sum += arr[i];

        System.out.println(sum);

    }
}
