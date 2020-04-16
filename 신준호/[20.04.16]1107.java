import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String[] tokens;

        //input = br.readLine();
        //tokens = input.split(" ");

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        boolean[] button = new boolean[10];
        Arrays.fill(button, true);
        if(m > 0) {
            input = br.readLine();
            tokens = input.split(" ");
            for(int i = 0; i < m; i++)
                button[Integer.parseInt(tokens[i])] = false;
        }

        int min = Math.abs(n - 100);
        for(int i = 0; i < 1000000; i++) {
            if(isAble(button, i))
               min = Math.min(min, numLen(i) + Math.abs(n - i));
        }

        System.out.println(min);

    }

    public static boolean isAble(boolean[] button, int n) {
        if(n == 0) {
            if(button[n]) return true;
            else          return false;
        }

        while(n > 0) {
            if(!button[n%10]) return false;
            n /= 10;
        }
        return true;
    }

    public static int numLen(int n) {
        int len = 0;
        if(n == 0) return 1;

        while(n > 0) {
            len++;
            n /= 10;
        }
        return len;
    }

}
