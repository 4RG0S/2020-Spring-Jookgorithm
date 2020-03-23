
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int answer = 0;
        Stack<Character> stack;
        for(int i=0;i<n;i++){
            stack = new Stack<Character>();

            String str = scan.next();
            for(int j=0;j<str.length();j++){
                if(stack.size()==0 || stack.peek()!=str.charAt(j)) stack.push(str.charAt(j));
                else stack.pop();
            }
            if(stack.size()==0)
                answer ++;
        }
        System.out.println(answer);
    }
}
