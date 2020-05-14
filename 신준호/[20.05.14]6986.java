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

        int n, k;
        n = Integer.parseInt(tokens[0]);
        k = Integer.parseInt(tokens[1]);

        BigDecimal[] nums = new BigDecimal[n];
        for(int i = 0; i < n; i++)
            nums[i] = new BigDecimal(br.readLine());
        Arrays.sort(nums);
        System.out.println(trimmedMean(nums, k));
        System.out.println(adjustedMean(nums, k));

    }

    public static BigDecimal trimmedMean(BigDecimal[] nums, int k) {
        BigDecimal mean = BigDecimal.ZERO;
        for(int i = k; i < nums.length-k; i++)
            mean = mean.add(nums[i]);
        return mean.divide(BigDecimal.valueOf(nums.length - k*2), 2, BigDecimal.ROUND_HALF_UP);
    }

    public static BigDecimal adjustedMean(BigDecimal[] nums, int k) {
        BigDecimal mean = BigDecimal.ZERO;
        mean = mean.add(nums[k].multiply(BigDecimal.valueOf(k)));
        mean = mean.add(nums[nums.length-k-1].multiply(BigDecimal.valueOf(k)));
        for(int i = k; i < nums.length-k; i++)
            mean = mean.add(nums[i]);
        return mean.divide(BigDecimal.valueOf(nums.length), 2, BigDecimal.ROUND_HALF_UP);
    }

}