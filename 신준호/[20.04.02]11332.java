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

        int c = Integer.parseInt(br.readLine());

        for(int i = 0; i < c; i++) {
            input = br.readLine();
            tokens = input.split(" ");

            BigInteger n, t, l;
            n = BigInteger.valueOf(Integer.parseInt(tokens[1]));
            t = BigInteger.valueOf(Integer.parseInt(tokens[2]));
            l = BigInteger.valueOf(Integer.parseInt(tokens[3]));

            BigInteger time;

            if(tokens[0].equals("O(N)")) {
                time = n.multiply(t);
            }
            else if(tokens[0].equals("O(N^2)")) {
                time = n.multiply(n).multiply(t);
            }
            else if(tokens[0].equals("O(N^3)")) {
                time = n.multiply(n).multiply(n).multiply(t);
            }
            else if(tokens[0].equals("O(2^N)")) {
                time = BigInteger.ONE;
                for(int j = 0; j < n.intValue(); j++)
                    time = time.multiply(BigInteger.valueOf(2));
               time = time.multiply(t);
            }
            else {
                time = facto(n).multiply(t);
            }

            if(time.compareTo(l.multiply(BigInteger.valueOf(100000000))) == 1)
                System.out.println("TLE!");
            else
                System.out.println("May Pass.");
        }
    }

    public static BigInteger facto(BigInteger n) {
        BigInteger ret = BigInteger.ONE;
        for(int i = 1; i <= n.intValue(); i++)
            ret = ret.multiply(BigInteger.valueOf(i));
        return ret;
    }

}