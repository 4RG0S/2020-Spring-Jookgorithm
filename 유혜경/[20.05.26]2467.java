import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] sol = new int[n];
        for(int i = 0; i < n; i++)
            sol[i] = scan.nextInt();
        int start = 0;
        int end = n-1;
        int min = Integer.MAX_VALUE;
        int left = start;
        int right = end;
        while(true){
            int sum = sol[start]+sol[end];
            if(min > Math.abs(sum)){
                left = start;
                right = end;
                min = Math.abs(sum);
            }
            if(sum < 0) start++;
            else if(sum > 0) end--;
            else{
                min = 0;
                left = start;
                right = end;
                break;
            }
            if(start == end) break;
        }
        System.out.println(sol[left] + " " + sol[right]);
    }
}