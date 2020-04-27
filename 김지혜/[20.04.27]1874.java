import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Queue<Integer> input = new LinkedList<>();
        for(int i=0;i<n;i++){
            input.add(scan.nextInt());
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int cur = input.poll();

        for(int i=1;i<=n;i++){
            stack.push(i);
            sb.append("+\n");

            while(!stack.empty() && cur == stack.peek()){
                stack.pop();
                sb.append("-\n");
                if(!input.isEmpty())
                    cur = input.poll();
            }
        }
        if(!stack.empty()){
            sb = new StringBuilder();
            sb.append("NO");
        }

        System.out.println(sb);
    }

}
