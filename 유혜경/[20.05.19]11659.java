import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n+1];
        int[] sum = new int[n+1];
        sum[0] = arr[0] = 0;
        for(int i = 1; i <= n; i++){
            arr[i] = scan.nextInt();
            sum[i] += sum[i-1]+arr[i];
        }
        for(int i = 0; i < m; i++){
            int j = scan.nextInt();
            int k = scan.nextInt();
            System.out.println(sum[k] - sum[j-1]);
        }
    }
}