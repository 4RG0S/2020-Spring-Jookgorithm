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

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            tokens = br.readLine().split(" ");
            System.out.println((new BigInteger(tokens[0], 2)).add(new BigInteger(tokens[1], 2)).toString(2));
        }
    }
}
