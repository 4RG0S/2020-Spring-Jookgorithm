import java.io.*;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       int n = Integer.parseInt(br.readLine());
       Map<BigInteger, Integer> arr = new HashMap<>();
       String str = br.readLine();
       StringTokenizer st = new StringTokenizer(str);
       for(int i=0;i<n;i++){
           arr.put(BigInteger.valueOf(Integer.parseInt(st.nextToken())), 1);
       }
       int m = Integer.parseInt(br.readLine());
       str = br.readLine();
       st = new StringTokenizer(str);
       for(int i=0;i<m;i++){
           BigInteger b = BigInteger.valueOf(Integer.parseInt(st.nextToken()));

           if(arr.containsKey(b))
               bw.write("1\n");
           else bw.write("0\n");
       }

       br.close();
       bw.close();
    }
}
