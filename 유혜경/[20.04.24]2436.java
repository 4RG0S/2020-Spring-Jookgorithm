import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int d = m/n;
        int min = d-1, min_n = 1, min_m = d;
        for(int i = 2; i <= d; i++){
            if(min_n==d/i) break;
            if(d%i == 0&&((d/i)-i)<=min&&gcd((d/i),i)==1){
                min = (d/i)-i;
                min_m = (d/i);
                min_n = i;
            }
        }
        System.out.println(n*min_n+" "+n*min_m);
    }
    public static int gcd(int a, int b){
        int temp;
        if(a<b){
            temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
}