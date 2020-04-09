import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        String l = Integer.toString(L);
        String r = Integer.toString(R);
        int min = 0;
        if(l.length()==r.length()){
            for(int i = 0; i < l.length(); i++){
                if(l.charAt(i)==r.charAt(i)) {
                    if (l.charAt(i) == '8' && r.charAt(i) == '8')
                        min++;
                }
                else
                    break;
            }
            System.out.println(min);
        }
        else{
            System.out.println(0);
        }
    }
}