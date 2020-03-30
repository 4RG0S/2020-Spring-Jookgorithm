import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String[] tokens;

        input = br.readLine();
        tokens = input.split(" ");

        int n, m;
        n = Integer.parseInt(tokens[0]);
        m = Integer.parseInt(tokens[1]);

        Map<String, Integer> noListen = new HashMap<>();
        for(int i = 0; i < n; i++) {
            input = br.readLine();
            noListen.put(input, 1);
        }

        List<String> jobs = new ArrayList<>();
        for(int i = 0; i < m; i++){
            input = br.readLine();
            if(noListen.containsKey(input)) {
                jobs.add(input);
            }
        }

        System.out.println(jobs.size());
        Collections.sort(jobs);
        for(int i = 0; i < jobs.size(); i++)
            System.out.println(jobs.get(i));
    }

}