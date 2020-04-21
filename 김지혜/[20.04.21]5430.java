import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0;i<n;i++){
            Deque<String> dq = new LinkedList<>();

            String command = br.readLine();
            int listSize = Integer.parseInt(br.readLine());
            String list = br.readLine();
            String[] lists = list.replace("[","").replace("]", "").split(",");
            int error = 0;
            dq.addAll(Arrays.asList(lists));

            int curser = -1; //curser -1 : left, curser 1 : right
            int commandSize = command.length();
            for(int j=0;j<commandSize;j++) {
                char c = command.charAt(j);

                if (c == 'D') {
                    if (dq.isEmpty() || listSize == 0) {
                        error = 1;
                        break;
                    } else if (curser == -1) dq.pollFirst();
                    else dq.pollLast();
                } else curser = curser * -1;

            }
            if(error == 1) bw.write("error\n");
            else {
                if (curser == 1) {
                    Collections.reverse((List<?>) dq);
                }
                bw.write(dq.toString().replace(" ", "") + "\n");
            }
        }
        br.close();
        bw.flush();

    }
}
