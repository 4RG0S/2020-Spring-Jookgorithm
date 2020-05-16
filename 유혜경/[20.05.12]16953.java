import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int fin = cal(a,b,1);
        if(fin == Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(fin);
    }
    public static int cal(long a,int b, int cnt){
        if(a == b) return cnt;
        else if(a > b) return Integer.MAX_VALUE;
        else{
            return Math.min(cal(a*2,b,cnt+1),cal(a*10+1,b,cnt+1));
        }
    }
}