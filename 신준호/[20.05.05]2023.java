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

        int n  = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        specialPrime("", n, list);
        list.forEach(System.out::println);
    }

    public static void specialPrime(String specialNum, int n, List<Integer> list) {
        if(specialNum.length() == n)
            list.add(Integer.parseInt(specialNum));
        else {
            for(int i = 1; i < 10; i++) {
                String newNum = specialNum + i;
                if(isPrime(Integer.parseInt(newNum)))
                    specialPrime(newNum, n, list);
            }
        }

    }

    public static boolean isPrime(int n) {
        if(n == 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) return false;
        }
        return true;
    }

}
