import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        BigInteger[] input = new BigInteger[101];

        input[0] = BigInteger.ZERO;
        input[1] = BigInteger.valueOf(1);
        input[2] = BigInteger.valueOf(1);

        for(int i=3;i<=100;i++) {
            input[i] = input[i-3].add(input[i-2]);
        }

        for(int i=0;i<n;i++){
            System.out.println(input[scan.nextInt()]);
        }
    }
}
