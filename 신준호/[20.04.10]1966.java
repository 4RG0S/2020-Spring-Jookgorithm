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

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            int n, m;
            input = br.readLine();
            tokens = input.split(" ");
            n = Integer.parseInt(tokens[0]);
            m = Integer.parseInt(tokens[1]);

            List<paper> list = new ArrayList<>();
            input = br.readLine();
            tokens = input.split(" ");
            for(int j = 0; j < n; j++)
                list.add(new paper(Integer.parseInt(tokens[j])));
            list.get(m).target = true;

            int count = 0;
            while(!list.isEmpty()) {
                paper p = list.remove(0);
                paper max = list.isEmpty() ? new paper(-1) : Collections.max(list);

                if(p.pri >= max.pri) {
                    count++;
                    if(p.target) {
                        System.out.println(count);
                        break;
                    }
                }
                else list.add(p);
                
            }
        }

    }

    public static class paper implements Comparable<paper> {
        int pri;
        boolean target;

        paper(int pri) {
            this.pri = pri;
            this.target = false;
        }

        @Override
        public int compareTo(paper o) {
            if(this.pri > o.pri)
                return 1;
            else if(this.pri < o.pri)
                return -1;
            else
                return 0;
        }
    }

}
