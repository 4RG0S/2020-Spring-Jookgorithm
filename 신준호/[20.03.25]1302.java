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
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            input = br.readLine();
            if(map.containsKey(input)) {
                map.replace(input, map.get(input) + 1);
            }
            else {
                map.put(input, 1);
            }
        }

        int max = 0;
        String max_key = "";
        for(String key : map.keySet()) {
            if(max < map.get(key)) {
                max = map.get(key);
                max_key = key;
            }
            else if(max == map.get(key)) {
                if(max_key.compareTo(key) > 0) {
                    max = map.get(key);
                    max_key = key;
                }
            }
        }

        System.out.println(max_key);

    }

}
