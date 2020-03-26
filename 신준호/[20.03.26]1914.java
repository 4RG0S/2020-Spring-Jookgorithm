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

        StringBuffer stringBuffer = new StringBuffer();
        BigInteger count = BigInteger.valueOf(2);
        count = count.pow(n).subtract(BigInteger.ONE);

        if(n <= 20){
            hanoi(1, 2, 3, n, stringBuffer);
            System.out.println(count);
            System.out.println(stringBuffer.toString());
        }
        else
            System.out.println(count);
    }

    public static void hanoi(int from, int tmp, int to, int n, StringBuffer stringBuffer) {
        if(n == 1) {
            stringBuffer.append(from + " " + to + "\n");
        }
        else {
            hanoi(from, to, tmp, n - 1, stringBuffer);
            stringBuffer.append(from + " " + to + "\n");
            hanoi(tmp, from, to, n - 1, stringBuffer);
        }
    }


}
