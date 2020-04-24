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

        BigInteger[] nums = new BigInteger[36];
        nums[0] = BigInteger.ONE;

        for(int i = 1; i < nums.length; i++) {
            nums[i] = BigInteger.ZERO;
            for(int j = 0; j < i; j++)
                nums[i] = nums[i].add( nums[j].multiply(nums[i-1-j]) );
        }

        System.out.println(nums[n]);

    }

}
