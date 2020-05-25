import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        System.out.println(pow(A,B,C));
    }
    public static long pow(int a, int b, int c){
        if(b == 0) return 1;
        long n = pow(a,b/2, c);
        if(b % 2 == 0) return (n*n) % c;
        else return (((n*n) % c) *a) % c;
    }
}