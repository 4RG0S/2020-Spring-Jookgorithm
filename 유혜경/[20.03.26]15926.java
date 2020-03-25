import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       String string = scanner.next();
       char[] chars = string.toCharArray();
        Stack<Integer> stack = new Stack<Integer>();
        int max = 0;
        for(int i = 0; i < chars.length; i++){
            if(stack.isEmpty()) stack.push(i);
            else {
                if (chars[stack.peek()] == '(' && chars[i] == ')') {
                    stack.pop();
                    if (stack.isEmpty()) max = i+1;
                    else
                        max = Math.max(max, i - stack.peek());
                } else
                    stack.push(i);
            }
        }
        System.out.println(max);
    }
}