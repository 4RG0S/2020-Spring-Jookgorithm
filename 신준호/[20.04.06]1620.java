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

        int n, m;

        n = Integer.parseInt(tokens[0]);
        m = Integer.parseInt(tokens[1]);

        Map<String, Integer> nameToId = new HashMap<>();
        Map<Integer, String> idToName = new HashMap<>();
        int id = 1;
        for(int i = 0; i < n; i++) {
            input = br.readLine();
            nameToId.put(input, id);
            idToName.put(id, input);
            id++;
        }

        for(int i = 0; i < m; i++) {
            input = br.readLine();
            if(nameToId.containsKey(input))
                System.out.println(nameToId.get(input));
            else
                System.out.println(idToName.get(Integer.parseInt(input)));
        }
    }
}
