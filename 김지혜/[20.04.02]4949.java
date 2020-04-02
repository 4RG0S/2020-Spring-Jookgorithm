import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        while(!str.equals(".")){
            Stack<Character> stack = new Stack<>();
            boolean checked = false;
            for(int i=0;i<str.length();i++){
                char aChar = str.charAt(i);
                if(aChar=='(' || aChar=='[') stack.push(aChar);
                else if(aChar == ')' || aChar == ']'){
                  if(!stack.empty() && ((aChar == ')' && stack.peek() == '(') || (aChar == ']' && stack.peek() == '[')))
                    stack.pop();
                  else {
                      System.out.println("no");
                      checked = true;
                      break;
                  }
                }
            }
            if(checked) {
                str = br.readLine();
                continue;
            }
            if(stack.empty()) System.out.println("yes");
            else System.out.println("no");
            str = br.readLine();
        }

    }
}
