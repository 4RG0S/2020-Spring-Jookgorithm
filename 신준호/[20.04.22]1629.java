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

        long a, b, c;
        a = Long.parseLong(tokens[0]);
        b = Long.parseLong(tokens[1]);
        c = Long.parseLong(tokens[2]);

        System.out.println(pow(a, b, c));
    }

    public static long pow(long a, long b, long c) {
        if(b == 1) return a%c;

        long half = pow(a, b/2, c);
        if(b%2 == 0) return (half * half) % c;
        else         return (((half * half) % c) * a) % c;
    }
}
