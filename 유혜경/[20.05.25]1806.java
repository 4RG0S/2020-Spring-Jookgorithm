import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int s = scan.nextInt();
        int[] arr = new int[n+1];
        for(int i = 1; i <= n; i++)
            arr[i] = scan.nextInt();
        int start = 1;
        int end = 1;
        int sum = arr[1];
        int min = n+1;
        while(true){
            if(sum >= s){
                 min = Math.min(min, end-start+1);
                 sum -= arr[start];
                 start++;
            }
            else if(end == n) break;
            else{
                end++;
                sum += arr[end];
            }
        }
        if(min == n+1) System.out.println(0);
        else
            System.out.println(min);
    }
}