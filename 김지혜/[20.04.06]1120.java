import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        String str1 = scan.next();
        String str2 = scan.next();

        int answer = Integer.MAX_VALUE;
        for(int i=0;i<=str2.length()-str1.length();i++){
            int count = 0;
            for(int j=0;j<str1.length();j++){
                if(str1.charAt(j) != str2.charAt(j+i))
                    count ++;
            }
            answer = Math.min(answer, count);
        }
        System.out.println(answer);

    }
}
