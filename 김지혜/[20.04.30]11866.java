import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        Queue<Integer> q = new LinkedList();

        for(int i=0;i<n;i++){
            q.add(i+1);
        }
        StringBuffer sb = new StringBuffer();
        sb.append("<");
        while(!q.isEmpty()){
            for(int j=0;j<m-1;j++){
                q.add(q.poll());
            }
            sb.append(q.poll()+", ");
        }
        sb.replace(sb.length()-2, sb.length(), "");
        sb.append(">");
        System.out.println(sb);
    }

}
