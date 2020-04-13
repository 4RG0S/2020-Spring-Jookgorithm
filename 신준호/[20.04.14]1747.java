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
        boolean[] primes = eratos();

        for(int i = n; i < primes.length; i++) {
            if(primes[i]) {
                String str = Integer.toString(i);
                if((new StringBuffer(str)).reverse().toString().equals(str)) {
                    System.out.println(str);
                    break;
                }
            }
        }

    }

    public static boolean[] eratos() {
        boolean[] primes = new boolean[1500000];

        Arrays.fill(primes, true);
        primes[0] = false; primes[1] = false;
        for(int i = 2; i < primes.length; i++) {
            if(primes[i]) {
                for(int j = i *2; j < primes.length; j += i) primes[j] = false;
            }
        }

        return primes;
    }

}
