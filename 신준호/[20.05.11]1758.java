import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.sql.SQLSyntaxErrorException;
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
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++)
            list.add(Integer.parseInt(br.readLine()));
        Collections.sort(list, Comparator.reverseOrder());

        long sumOfTip = 0;
        for(int i = 0; i < list.size(); i++) {
            int tip = list.get(i) - i;
            if(tip <= 0) break;
            sumOfTip += tip;
        }

        System.out.println(sumOfTip);

    }

}