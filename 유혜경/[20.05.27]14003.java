import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] c;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] trace = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = scan.nextInt();
        c = new int[n+1];
        c[0] = a[0];
        int count = 0;
        for(int i = 1; i < n; i++){
            if(c[count] < a[i]) {
                c[++count] = a[i];
                trace[i] = count;
            }
            else {
                int j = search(0, count, a[i]);
                c[j] = a[i];
                trace[i] = j;
            }
        }
        String s = "";
        System.out.println(count+1);
        for(int i = n-1; i >= 0; i--){
            if(count < 0) break;
            else{
                if(trace[i] == count) {
                    s = a[i] + " " + s;
                    count--;
                }
            }
        }
        System.out.println(s);

    }
    public static int search(int s, int e, int n){
        while(e > s){
            int mid = (s + e) / 2;
            if(c[mid] >= n){
                e = mid;
            }
            else s = mid + 1;
        }
        return e;
    }
}