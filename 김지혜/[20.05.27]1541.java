import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String num = "";
        int[] numInput = new int[50];
        char[] oper = new char[50];
        int numIndex = 0;
        int operIndex = 0;
        for(int i=0;i<str.length();i++){
            char temp = str.charAt(i);
            if(temp == '+' || temp == '-')
            {
                numInput[numIndex] = Integer.parseInt(num);
                numIndex++;
                num = "";
                oper[operIndex] = temp;
                operIndex++;
            }
            else{
                num = num+temp;
            }
        }
        numInput[numIndex] = Integer.parseInt(num);

        int answer = numInput[0];
        boolean minus = false;
        for(int i=0;i<operIndex;i++){
            if(oper[i] == '+'){
                if(!minus)
                    answer = answer + numInput[i+1];
                else answer = answer - numInput[i+1];
            }
            else{
                minus = true;
                answer = answer - numInput[i+1];
            }
        }
        System.out.println(answer);
    }

}
