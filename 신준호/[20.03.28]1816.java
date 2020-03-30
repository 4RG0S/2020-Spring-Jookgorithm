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

        boolean[] primes = new boolean[1000001];
        Arrays.fill(primes, true);
        primes[0] = false; primes[1] = false;
        for(int i = 2; i < 1000001; i++) {
            if(primes[i]) {
                for(int j = i*2; j < 1000001; j += i) primes[j] = false;
            }
        }

        List<Integer> primeList = new ArrayList<>();
        for(int i = 2; i < 1000001; i++) {
            if(primes[i])
                primeList.add(i);
        }

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            long num = Long.parseLong(br.readLine());
            int j = 0;
            for( ; j < primeList.size(); j++) {
                if(num % primeList.get(j) == 0) {
                    System.out.println("NO");
                    break;
                }
            }

            if(j == primeList.size()) System.out.println("YES");
        }
    }



}
