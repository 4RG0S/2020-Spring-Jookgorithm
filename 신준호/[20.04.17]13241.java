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

        input = br.readLine();
        tokens = input.split(" ");

        long a, b;
        a = Long.parseLong(tokens[0]);
        b = Long.parseLong(tokens[1]);

        System.out.println((a*b) / gcd(a, b));
    }

    public static long gcd(long a, long b) {
        long r;
        while(a%b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return b;
    }



}
