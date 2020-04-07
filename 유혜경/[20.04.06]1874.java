import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] seq = new int[n];
        for (int i = 0; i < n; i++)
            seq[i] = scanner.nextInt();
        System.out.println(find(seq));
    }
    public static String find(int[] seq){
        StringBuilder s = new StringBuilder();
        Stack stack = new Stack();
        int j = 0;
        for(int i = 1; i <= seq.length; i++){
            stack.push(i);
            s.append("+\n");
            while(!stack.isEmpty()&&(int)stack.peek() == seq[j]){
                stack.pop();
                s.append("-\n");
                j++;
            }
        }
        if(j!=seq.length)
            return "NO";
        else
            return s.toString();
    }
}