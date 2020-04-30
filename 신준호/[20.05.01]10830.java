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

        int n;
        long b;
        n = Integer.parseInt(tokens[0]);
        b = new Long(tokens[1]);
        int[][] mat = new int[n][n];
        for(int i = 0; i < n; i++) {
            input = br.readLine();
            tokens = input.split(" ");
            for(int j = 0; j < n; j++)
                mat[i][j] = Integer.parseInt(tokens[j]);
        }

        mat = matPow(mat, b);
        mod(mat);
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }

    public static int[][] matPow(int[][] mat, long exp) {
        if(exp == 1) return mat;

        int[][] half = matPow(mat, exp/2);
        if(exp%2 == 1)
            return matMul(matMul(half, half), mat);
        else
            return matMul(half, half);
    }

    public static int[][] matMul(int[][] mat1, int[][] mat2) {
        int[][] ret = new int[mat1.length][mat2[0].length];

        for(int i = 0; i < ret.length; i++) {
            for(int j = 0; j < ret[0].length; j++) {
                for(int k = 0; k < mat1[0].length; k++) {
                    ret[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return mod(ret);
    }

    public static int[][] mod(int[][] mat) {
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++)
                mat[i][j] %= 1000;
        }
        return mat;
    }

}
