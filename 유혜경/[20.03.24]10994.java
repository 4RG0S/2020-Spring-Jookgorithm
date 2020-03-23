import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] arr = new char[(n-1)*4+2][(n-1)*4+2];
        star(arr,n,0);
        for(int i = 1; i <arr.length; i++){
            for(int j = 1; j < arr.length; j++){
                if(arr[i][j]!='*') System.out.print(' ');
                else System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void star(char[][] arr, int n, int cnt){
        if(n<1) return;
        else {
            for (int i = 1; i <= (n - 1) * 4 + 1; i++) {
                arr[1 + cnt][i + cnt] = '*';
                arr[(n - 1) * 4 + 1 + cnt][i + cnt] = '*';
            }//가로
            for (int i = 1; i <= (n - 1) * 4 + 1; i++) {
                arr[i + cnt][1 + cnt] = '*';
                arr[i + cnt][(n - 1) * 4 + 1 + cnt] = '*';
            }//세로
            star(arr, n - 1, cnt+2);
        }
    }
}
