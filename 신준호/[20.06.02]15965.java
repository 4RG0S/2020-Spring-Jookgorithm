import org.omg.SendingContext.RunTime;

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

//        long start = System.currentTimeMillis();

        boolean[] eratos = eratos(10000000);
        List<Integer> primes = new ArrayList<>();
        for(int i = 2; i < eratos.length; i++) {
            if(eratos[i]) primes.add(i);
        }


        System.out.println(primes.get(Integer.parseInt(br.readLine()) - 1));
//        long end = System.currentTimeMillis();
//        System.out.println((end - start) / 1000.0);

    }

    public static boolean[] eratos(int n) {
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);
        primes[0] = false; primes[1] = false;
        for(int i = 2; i < primes.length; i++) {
            if(primes[i]) {
                for(int j = i*2; j < primes.length; j += i) primes[j] = false;
            }
        }
        return primes;
    }

}
