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

        int[] frequent = new int[20000001];

        int n = Integer.parseInt(br.readLine());
        input = br.readLine();
        tokens = input.split(" ");
        for(int i = 0; i < tokens.length; i++) {
            frequent[Integer.parseInt(tokens[i]) + 10000000]++;
        }
        int m = Integer.parseInt(br.readLine());
        input = br.readLine();
        tokens = input.split(" ");
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < tokens.length; i++) {
            list.add(frequent[Integer.parseInt(tokens[i]) + 10000000]);
        }
        String out = list.toString();
        System.out.println(out.substring(1, out.length()-1).replaceAll(",", ""));
    }


}
