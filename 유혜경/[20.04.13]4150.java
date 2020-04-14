import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<BigInteger> f = new ArrayList<BigInteger>();
        BigInteger bi = BigInteger.ONE;
        f.add(0, bi);
        f.add(1, bi);
        for(int i = 2; i < n; i++){
            f.add(i, f.get(i-1).add(f.get(i-2)));
        }
        System.out.println(f.get(n-1));
    }
}