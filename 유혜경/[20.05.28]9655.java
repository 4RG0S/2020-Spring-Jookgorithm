import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n % 2 == 1) System.out.println("SK");
        else System.out.println("CY");
    }
}