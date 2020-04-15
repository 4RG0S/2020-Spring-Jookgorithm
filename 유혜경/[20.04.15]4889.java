import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i = 1, cnt = 0;
        Stack<Character> stack = new Stack<Character>();
        while(!s.contains("-")){
            char[] chars = s.toCharArray();
            for(int j = 0; j < chars.length; j++){
                if(stack.isEmpty())
                    stack.push(chars[j]);
                else if(stack.peek() == '{'&&chars[j] == '}')
                    stack.pop();
                else
                    stack.push(chars[j]);
            }
            while(!stack.isEmpty()){
                char tmp = stack.pop();
                if(tmp == stack.peek())
                    cnt++;
                else
                    cnt += 2;
                stack.pop();
            }
            System.out.println(i+". "+cnt);
            i++; cnt = 0;
            s = scanner.nextLine();
        }
    }
}