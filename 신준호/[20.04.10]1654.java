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

        input = br.readLine();
        tokens = input.split(" ");

        int k, n;
        k = Integer.parseInt(tokens[0]);
        n = Integer.parseInt(tokens[1]);

        int[] cables = new int[k];
        int min = 0;
        int max = Integer.MAX_VALUE;
        for(int i = 0; i < k; i++) {
            int num = Integer.parseInt(br.readLine());
            cables[i] = num;
            if(min > num) min = num;
            if(max < num) max = num;
        }

        while(max - min > 1) {
            int mid = (int) (((long) max+min)/2);

            long possible = 0;
            for(int i = 0; i < k; i++) {
                possible += cables[i] / mid;
            }

            if(possible < n) {
                max = mid;
            }
            else {
                min = mid;
            }
        }

        int check = 0;
        for(int i = 0; i < k; i++)
            check += cables[i] / max;

        if(check != n)
            System.out.println(min);
        else
            System.out.println(max);

    }

}
