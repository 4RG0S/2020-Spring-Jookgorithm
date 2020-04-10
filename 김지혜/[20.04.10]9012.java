import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int check = 0;
        for(int i=0;i<n;i++){
            String str = scan.next();
            Stack<Character> stack = new Stack<>();
            for(int j=0;j<str.length();j++){
                char c = str.charAt(j);

                if(c=='(') stack.add(c);
                else if(c==')'){
                    if(stack.empty()){
                        System.out.println("NO");
                        check = 1;
                        break;
                    }
                    else if(stack.peek()=='(') stack.pop();
                }
            }
            if(check==1){
                check = 0;
                continue;
            }
            if(stack.empty() && check==0) System.out.println("YES");
            else System.out.println("NO");
        }

    }

}
