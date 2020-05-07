import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String BOMB = scanner.nextLine();
        char[] s = S.toCharArray();
        char[] bomb = BOMB.toCharArray();
        char[] fin = new char[s.length];
        int k = 0;
        for(int i = 0; i < s.length; i++){
            fin[k] = s[i];
            if(fin[k] == bomb[bomb.length-1]&&k-bomb.length >= -1){
                boolean check = true;
                for(int j = 0; j < bomb.length; j++){
                    if(fin[k-j] != bomb[bomb.length-j-1]){
                        check = false;
                        break;
                    }
                }
                if(check)
                    k -= bomb.length;
            }k++;
        }
        if(k==0) System.out.println("FRULA");
        else {
            for(int i = 0; i < k; i++)
                System.out.print(fin[i]);
        }
    }
}