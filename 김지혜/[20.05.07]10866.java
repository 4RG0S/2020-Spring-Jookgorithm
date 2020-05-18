import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        Deque<String> q = new LinkedList<String>();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            String str = br.readLine();
            if(str.equals("front")){
                if(q.isEmpty()) bw.write("-1\n");
                else bw.write(q.getFirst()+"\n");
            }
            else if(str.equals("back")){
                if(q.isEmpty()) bw.write("-1\n");
                else bw.write(q.getLast()+"\n");
            }
            else if(str.equals("empty")){
                if(q.isEmpty()) bw.write("1\n");
                else bw.write("0\n");
            }
            else if(str.equals("size"))
                bw.write(q.size()+"\n");
            else if(str.equals("pop_front")) {
                if(q.isEmpty()) bw.write("-1\n");
                else bw.write(q.pollFirst()+"\n");
            }
            else if(str.equals("pop_back")) {
                if(q.isEmpty()) bw.write("-1\n");
                else bw.write(q.pollLast()+"\n");
            }
            else{
                StringTokenizer st = new StringTokenizer(str);
                String com = st.nextToken();
                if(com.equals("push_front")) q.addFirst(st.nextToken());
                else q.addLast(st.nextToken());
            }

        }
        bw.flush();
        bw.close();

        br.close();

    }
}
