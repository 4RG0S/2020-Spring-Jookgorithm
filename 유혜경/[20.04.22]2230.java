import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE, start = 0, end = 1;
        while(end<n){
            if(arr[end]-arr[start] < m) end++;
            else if(arr[end]-arr[start] == m){
                min = m;
                break;
            }
            else {
                min = Math.min(min, arr[end] - arr[start]);
                start++;
            }
        }
        System.out.println(min);
    }
}