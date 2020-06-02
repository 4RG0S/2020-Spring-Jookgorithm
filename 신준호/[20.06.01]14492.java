import org.omg.SendingContext.RunTime;

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

        int t = Integer.parseInt(br.readLine());
        boolean[][] mat1 = new boolean[t][t];
        boolean[][] mat2 = new boolean[t][t];

        for(int i = 0; i < t; i++) {
            tokens = br.readLine().split(" ");
            for(int j = 0; j < t; j++)
                mat1[i][j] = tokens[j].equals("1");
        }
        for(int i = 0; i < t; i++) {
            tokens = br.readLine().split(" ");
            for(int j = 0; j < t; j++)
                mat2[i][j] = tokens[j].equals("1");
        }

        boolean[][] mat3 = new boolean[t][t];
        for(int i = 0; i < t; i++) {
            for(int j = 0; j < t; j++) {

                for(int k = 0; k < t; k++) mat3[i][j] |= mat1[i][k] & mat2[k][j];

            }
        }

        int count = 0;
        for(int i = 0; i < t; i++) {
            for(int j = 0; j < t; j++) {
                if(mat3[i][j]) count++;
            }
        }

        System.out.println(count);

    }

}
