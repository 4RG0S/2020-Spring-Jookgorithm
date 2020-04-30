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

        long facto = 1;
        for(int i = 1; i <= n; i++) {
            facto *= i;
            facto = removeZero(facto) % new Long("1000000000000");
        }

        System.out.printf("%05d", facto % 100000);
    }

    public static long removeZero(long num) {
        while(num % 10 == 0)
            num /= 10;
        return num;
    }

}
