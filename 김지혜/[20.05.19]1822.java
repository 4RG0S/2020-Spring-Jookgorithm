import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       String nm = br.readLine();
       StringTokenizer st = new StringTokenizer(nm);
       int n = Integer.parseInt(st.nextToken());
       int m = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        String nInput = br.readLine();
        st = new StringTokenizer(nInput);
        for(int i=0;i<n;i++){
            pq.add(Integer.parseInt(st.nextToken()));
        }
        String mInput = br.readLine();
        st = new StringTokenizer(mInput);
        Map<Integer, Integer> map = new HashMap();
        for(int i=0;i<m;i++) {
            map.put(Integer.parseInt(st.nextToken()), 1);
        }
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while(!pq.isEmpty()){
            int pop = pq.poll();
            if(!map.containsKey(pop)){
                sb.append(pop+" "); i++;
            }
        }
        bw.write(i+"\n");
        if(i!=0) {
            sb.replace(sb.length()-1, sb.length(), "");
            bw.write(sb.toString());
        }

        br.close();
        bw.close();
    }




}
