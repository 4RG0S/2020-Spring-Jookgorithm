import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String[] tokens;

        //input = br.readLine();
        //tokens = input.split(" ");

        while(!(input = br.readLine()).equals("R0C0")) {
            int idxC = input.indexOf("C");
            int row = Integer.parseInt(input.substring(1, idxC));
            int col = Integer.parseInt(input.substring(idxC + 1));
            StringBuilder stringBuilder = new StringBuilder();
            while(col != 0) {
                col--;
                stringBuilder.append(String.format("%c", col%26 + 'A'));
                col = col / 26;
            }

            System.out.println(stringBuilder.reverse().toString() + row);

        }
    }

}
