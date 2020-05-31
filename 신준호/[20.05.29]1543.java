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

        String doc = br.readLine();
        String regex = br.readLine();
        int count = 0;

        for(int i = 0; i < doc.length() - regex.length() + 1; ) {
            if(doc.substring(i, i + regex.length()).equals(regex)) {
                count++;
                i += regex.length();
            }
            else i++;
        }

        System.out.println(count);
    }

}
