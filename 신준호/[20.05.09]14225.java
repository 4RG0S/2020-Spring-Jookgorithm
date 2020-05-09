import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static boolean[] S;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String[] tokens;

        //input = br.readLine();
        //tokens = input.split(" ");

        S = new boolean[2000001];

        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];

        input = br.readLine();
        tokens = input.split(" ");
        for(int i = 0; i < n; i++)
            nums[i] = Integer.parseInt(tokens[i]);

        chkPossible(nums, 0, 0);

        for(int i = 0; i < S.length; i++) {
            if(!S[i]) {
                System.out.println(i);
                break;
            }
        }

    }

    public static void chkPossible(int[] nums, int idx, int sum) {
        S[sum] = true;
        if(idx == nums.length) return ;

        chkPossible(nums, idx+1, sum + nums[idx]);
        chkPossible(nums, idx+1, sum);
    }
}