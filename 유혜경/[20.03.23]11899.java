import java.util.Scanner;
import java.util.Stack;

public class insert_parentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int output = 0;
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i)=='(') stack.push('(');
            else{
                if(stack.empty()) output++;
                else stack.pop();
            }
        }
        System.out.println(output+stack.size());
    }
}