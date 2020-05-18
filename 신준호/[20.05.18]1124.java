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

        int a, b;
        a = Integer.parseInt(tokens[0]);
        b = Integer.parseInt(tokens[1]);

        boolean[] eratos = eratos(b);
        List<Integer> primes = new ArrayList<>();
        for(int i = 0; i < eratos.length; i++) {
            if(eratos[i]) primes.add(i);
        }

        int count = 0;
        for(int i = a; i <= b; i++) {
            if(isUnderPrime(i, primes)) count++;
        }
        System.out.println(count);

    }

    public static boolean isUnderPrime(int n, List<Integer> primes) {
        int count = 0;
        for(int i = 0; i < primes.size(); i++) {
            int prime = primes.get(i);
            while(n % prime == 0) {
                n /= prime;
                count++;
            }
            if(n == 1) break;
        }

        if(primes.contains(count)) return true;
        else                       return false;
    }

    public static boolean[] eratos(int n) {
        boolean[] eratos = new boolean[n+1];
        Arrays.fill(eratos, true);
        eratos[0] = false; eratos[1] = false;
        for(int i = 2; i < eratos.length; i++) {
            if(eratos[i]) {
                for(int j = i*2; j < eratos.length; j += i) eratos[j] = false;
            }
        }
        return eratos;
    }


}