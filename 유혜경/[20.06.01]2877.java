import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int k = scan.nextInt();
        k++;
        while(k/2 > 1){
            if(k%2==0)sb.append(4);
            else sb.append(7);
            k /= 2;
        }
        if(k%2==0)sb.append(4);
        else sb.append(7);
        System.out.println(sb.reverse().toString());
    }
}