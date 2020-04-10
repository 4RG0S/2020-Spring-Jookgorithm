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

        int two = 0;
        int five = 0;
        for(int i = 1; i <= n; i++) {
            int num = i;
            while(num % 2 == 0) {
                two++;
                num /= 2;
            }

            while(num % 5 == 0) {
                five++;
                num /= 5;
            }
        }

        System.out.println(Math.min(two, five));

    }

}
