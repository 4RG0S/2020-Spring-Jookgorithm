import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();
        Arrays.sort(arr);
        int m = scanner.nextInt();
        int[] find = new int[m];
        for(int i = 0; i < m; i++) {
            find[i] = scanner.nextInt();
            find(find[i], arr, 0, arr.length);
        }
    }
    public static void find(int tmp, int[] arr, int start, int end){
        int mid = (start+end)/2;
        if(end-start<1)
            System.out.println(0);
        else{
            if(arr[mid] > tmp)
                find(tmp, arr, start, mid);
            else if(tmp == arr[mid])
                System.out.println(1);
            else
                find(tmp, arr, mid+1, end);
        }
    }
}