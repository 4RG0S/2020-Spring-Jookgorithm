import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] pack = new int[m];
        int[] piece = new int[m];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < m; i++){
            pack[i] = scanner.nextInt();
            piece[i] = scanner.nextInt();
        }
        Arrays.sort(pack);
        Arrays.sort(piece);
        int cnt = n%6 == 0 ? n/6 : n/6+1;
        for(int i = 0; i <= cnt; i++){
            if(n >= i*6)
                min = Math.min(min, pack[0]*i+piece[0]*(n-i*6));
            else
                min = Math.min(min, pack[0]*i);
        }
        System.out.println(min);
    }
}