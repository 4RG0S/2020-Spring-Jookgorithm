import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int len = String.valueOf(n).length();
        int tmp =  9;
        int cnt = 0;
        for(int i = 1; i < len; i++){
            cnt += tmp*i;
            tmp *= 10;
        }
        cnt += len*(n-(int)Math.pow(10,len-1)+1);
        System.out.println(cnt);
    }
}