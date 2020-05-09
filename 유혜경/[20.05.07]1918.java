import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < chars.length; i++){
            char c = chars[i];
            if(op(c)==0) System.out.print(c);
            else{
                if(c == '('||stack.isEmpty()) stack.push(c);
                else if(c == ')'){
                    while(stack.peek()!='(')
                        System.out.print(stack.pop());
                    stack.pop();
                }
                else{
                    while(!stack.isEmpty()&&op(stack.peek()) >= op(c)){
                        System.out.print(stack.pop());
                    }
                    stack.push(c);
                }
            }
        }
        while(!stack.isEmpty())
            System.out.print(stack.pop());
    }
    public static int op(char c){
        switch (c){
            case '+':
            case '-':
                return 2;
            case '*':
            case '/':
                return 3;
            case '(':
            case ')':
                return 1;
            default:
                return 0;
        }
    }
}