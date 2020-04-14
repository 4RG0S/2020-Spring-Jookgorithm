import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        Stack<Integer> stack = new Stack();

        for(int i=0;i<n;i++){
            int t = scan.nextInt();
            if(t==0) stack.pop();
            else stack.add(t);
        }
        int answer = 0;
        while(!stack.empty())
            answer =  answer + stack.pop();
        System.out.println(answer);
    }

}
