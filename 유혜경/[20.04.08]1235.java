import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] str = new String[n];
        Hashtable table = new Hashtable();
        for(int i = 0; i < n; i++){
            str[i] = scanner.nextLine();
        }
        for(int i = str[0].length()-1; i >= 0; i--){
            for(int j = 0; j < n; j++){
                if(table.containsKey(str[j].substring(i,str[j].length())))
                    break;
                if(j == n-1) {
                    System.out.println(str[0].length()-i);
                    i = 0;
                }
                table.put(str[j].substring(i,str[j].length()), str[j]);
            }
        }
    }
}