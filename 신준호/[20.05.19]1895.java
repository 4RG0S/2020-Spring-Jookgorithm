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

        input = br.readLine();
        tokens = input.split(" ");

        int r, c;
        r = Integer.parseInt(tokens[0]);
        c = Integer.parseInt(tokens[1]);
        int[][] mat = new int[r][c];
        for(int i = 0; i < r; i++) {
            tokens = br.readLine().split(" ");
            for(int j = 0; j < c; j++)
                mat[i][j] = Integer.parseInt(tokens[j]);
        }
        int t = Integer.parseInt(br.readLine());

        int[][] filtered = median33(mat);
        int count = 0;
        for(int i = 0; i < filtered.length; i++) {
            for(int j = 0; j < filtered[0].length; j++)
                if(filtered[i][j] >= t) count++;
        }

        System.out.println(count);

    }

    public static int[][] median33(int[][] mat) {
        int[][] filtered = new int[mat.length-2][mat[0].length-2];
        for(int i = 0; i < mat.length - 2; i++)
            for(int j = 0; j < mat[0].length - 2; j++)
                filtered[i][j] = getMedian(mat, i, j);
        return filtered;
    }

    public static int getMedian(int[][] mat, int r, int c) {
        int[] nums = new int[9];
        int idx = 0;
        for(int i = r; i < r+3; i++)
            for(int j = c; j < c+3; j++)
                nums[idx++] = mat[i][j];
        Arrays.sort(nums);
        return nums[4];
    }

}