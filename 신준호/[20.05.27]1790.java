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

        input = br.readLine();
        tokens = input.split(" ");

        int n = Integer.parseInt(tokens[0]);
        int k = Integer.parseInt(tokens[1]);

        int numLen = 1;
        int counter = 0;
        int kNum = 0;
        for(int i = 1; i <= n; i++) {
            if(Math.log10(i) >= numLen) numLen++;
            counter += numLen;
            if(counter >= k) {
                kNum = i;
                break;
            }
        }

        if(counter < k)
            System.out.println("-1");
        else {
            String target = Integer.toString(kNum);
            System.out.println(target.charAt(target.length() - 1 - (counter - k)));
        }

    }

}
