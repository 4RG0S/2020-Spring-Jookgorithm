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
        boolean[][] table = new boolean[n][n];

        System.out.println(nQueen(table, 0));
    }

    public static int nQueen(boolean[][] table, int n) {
        int count = 0;

        if(n == table.length)
            return 1;

        for(int i = 0; i < table.length; i++) {
            if(isAble(table, n, i)) {
                table[n][i] = true;
                count += nQueen(table, n+1);
                table[n][i] = false;
            }
        }

        return count;
    }

    public static boolean isAble(boolean[][] table, int row, int col) {
        for(int i = 0; i < table.length; i++) {
            if(table[i][col]) return false;
            if(0 <= col-row+i && col-row+i < table.length)
                if(table[i][col-row+i]) return false;
            if(0 <= row+col-i && row+col-i < table.length)
                if(table[i][row+col-i]) return false;
        }
        return true;
    }

}
