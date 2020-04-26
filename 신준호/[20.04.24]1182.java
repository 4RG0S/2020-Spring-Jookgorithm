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

        int n, s;
        n = Integer.parseInt(tokens[0]);
        s = Integer.parseInt(tokens[1]);

        input = br.readLine();
        tokens = input.split(" ");
        int[] series = new int[n];
        for(int i = 0; i < n; i++)
            series[i] = Integer.parseInt(tokens[i]);

        int ans = findSCase(series, 0, 0, s);
        if(s == 0) ans--;

        System.out.println(ans);
    }

    public static int findSCase(int[] series, int idx, int sum, int S) {
        int count = 0;

        if(idx == series.length) {
            if(sum == S) return 1;
            else         return 0;
        }

        count += findSCase(series, idx + 1, sum, S);
        count += findSCase(series, idx + 1, sum + series[idx], S);

        return count;
    }

}
