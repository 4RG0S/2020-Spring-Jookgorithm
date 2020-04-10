import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String[] tokens;

        //input = br.readLine();
        //tokens = input.split(" ");

        int n = Integer.parseInt(br.readLine());

        StringBuffer stringBuffer = new StringBuffer();
        Stack<Integer> stack = new Stack<>();

        int nextSeq = 0;
        stack.push(nextSeq++);

        while(nextSeq != n+1 || stack.peek() != 0) {
            int num = Integer.parseInt(br.readLine());

            if (stack.peek() > num) {
                break;
            }

            else if(stack.peek() == num) {
                stack.pop();
                stringBuffer.append("-\n");
            }

            else if(stack.peek() < num) {
                while (stack.peek() < num) {
                    stack.push(nextSeq++);
                    stringBuffer.append("+\n");
                }
                stack.pop();
                stringBuffer.append("-\n");
            }

        }

        if(stack.peek() == 0)
            System.out.println(stringBuffer.toString());
        else
            System.out.println("NO");

    }

}
