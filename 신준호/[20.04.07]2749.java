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
        //tokens = input.split(" ");

        BigInteger n = new BigInteger(input);
        System.out.println(fibo(n)[0][1]);
    }

    public static long[][] fibo(BigInteger n) {
        long[][] fiboMat = new long[2][2];
        fiboMat[0][0] = 1; fiboMat[0][1] = 1; fiboMat[1][0] = 1; fiboMat[1][1] = 0;

        if(n.equals(BigInteger.ONE)) return fiboMat;

        long[][] half = fibo(n.divide(BigInteger.valueOf(2)));

        if(n.mod(BigInteger.valueOf(2)).equals(BigInteger.ONE))
            return matMul(matMul(half, half), fiboMat);
        else
            return matMul(half, half);
    }

    public static long[][] matMul(long[][] mat1, long[][] mat2) {
        long[][] ret = new long[2][2];
        ret[0][0] = ((mat1[0][0] * mat2[0][0]) + (mat1[0][1] * mat2[1][0])) % 1000000;
        ret[0][1] = ((mat1[0][0] * mat2[0][1]) + (mat1[0][1] * mat2[1][1])) % 1000000;
        ret[1][0] = ((mat1[1][0] * mat2[0][0]) + (mat1[1][1] * mat2[1][0])) % 1000000;
        ret[1][1] = ((mat1[1][0] * mat2[0][1]) + (mat1[1][1] * mat2[1][1])) % 1000000;

        return ret;
    }
}
