import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] l = new int[t];
        long[] d = new long[5001];
        for(int i = 0; i < t; i++)
            l[i] = scanner.nextInt();
        d[0] = 1;
        d[2] = 1;
        for(int i = 4; i <= 5000; i = i+2){
            for(int j = 2; j <= i; j = j+2){
                d[i] += d[i-j] * d[j-2];
                d[i] %= 1000000007;
            }
        }
        for(int i = 0; i < t; i++){
            if(l[i]%2==1) System.out.println(0);
            else System.out.println(d[l[i]]);
        }
    }
}