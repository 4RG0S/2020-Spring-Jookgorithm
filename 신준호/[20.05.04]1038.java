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

        List<Long> list = new ArrayList<>();
        decreasingNum(10, "", list);
        Collections.sort(list);
        if(n >= list.size())
            System.out.println("-1");
        else
            System.out.println(list.get(n));
    }

    public static void decreasingNum(int prev, String num, List<Long> list) {
        for(int i = prev - 1; i >= 0; i--) {
            String currentNum = num + i;
            list.add(Long.parseLong(currentNum));
            decreasingNum(i, currentNum, list);
        }

    }

}
