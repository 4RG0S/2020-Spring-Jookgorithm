import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] seq = new int[n+1];
        for(int i = 0; i < n; i++){
            seq[i] = scanner.nextInt();
        }
        seq[n] = Integer.MAX_VALUE;
        Arrays.sort(seq);
        int max = 0, i;
        for(i = 0; i < n; i++){
            if(seq[i]<0&&seq[i+1]<0) {
                max += seq[i]*seq[i+1];
                i++;
            }
            else if(seq[i]<0 && seq[i+1]==0){
                max +=seq[i]*seq[i+1];
                i++;
            }
            else break;
        }
        for(int j = n-1; j >= i; j--){
            if(j-1 < i) max += seq[j];
            else {
                max = Math.max(max+seq[j]*seq[j-1],max+seq[j]+seq[j-1]);
                j--;
            }
        }
        System.out.println(max);
    }
}