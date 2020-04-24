import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Stack<Character> st = new Stack<Character>();
        int sum = 0, mul = 1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='('){
                st.push('(');
                mul *= 2;
            }
            else if(s.charAt(i) == '['){
                st.push('[');
                mul *= 3;
            }
            else if(s.charAt(i) == ')'){
                if(st.empty()) {sum = 0; break;}
                else if(st.peek() != '('){sum = 0; break;}
                else if(s.charAt(i-1) == '('){sum += mul;}
                st.pop();
                mul/=2;
            }
            else{
                if(st.empty()) {sum = 0; break;}
                else if(st.peek() != '['){sum = 0; break;}
                else if(s.charAt(i-1) == '['){sum += mul;}
                st.pop();
                mul/=3;
            }
        }
        if(!st.empty()) System.out.println(0);
        else System.out.println(sum);

    }
}