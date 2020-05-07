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

        int a, b;
        a = Integer.parseInt(tokens[0]);
        b = Integer.parseInt(tokens[1]);

        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();

        input = br.readLine();
        tokens = input.split(" ");
        for(int i = 0; i < tokens.length; i++)
            A.add(Integer.parseInt(tokens[i]));
        input = br.readLine();
        tokens = input.split(" ");
        for(int i = 0; i < tokens.length; i++)
            B.add(Integer.parseInt(tokens[i]));

        B.stream().filter(A::contains).forEach(A::remove);
        List<Integer> AList = new ArrayList<>(A);
        Collections.sort(AList);
        System.out.println(AList.size());
        AList.forEach(i -> System.out.print(i + " "));
    }
}
