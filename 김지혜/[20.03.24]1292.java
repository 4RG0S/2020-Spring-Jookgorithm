
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int aanswer = 0;
        int banswer = 0;

        int p = 1;
        int q = 1;
        for(int i=1;i<=b;i++){
            if(i==a) aanswer = banswer;
            banswer = banswer + p;

            if(p==q){ p ++; q = 1;}
            else q++;
        }
        System.out.println(banswer-aanswer);
    }
}
