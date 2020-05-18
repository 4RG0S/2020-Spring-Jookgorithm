import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        Map<String, Integer> m = new HashMap<>();

        for(int i=0;i<n;i++){
            String str = scan.next();
            if(m.containsKey(str)){
                int value = m.get(str);
                m.replace(str, value, value+1);
            }
            else{
                m.put(str, 1);
            }
        }
        PriorityQueue<String> p = new PriorityQueue<>();

        Set<String> set = m.keySet();
        Iterator<String> iter = set.iterator();

        int max = 0;
        while(iter.hasNext()){
            String key = iter.next();
            int value = m.get(key);

            if(max < value){
                p = new PriorityQueue<>();
                p.add(key);
                max = value;
            }
            else if(max == value){
                p.add(key);
            }
        }
        if(!p.isEmpty()) System.out.println(p.poll());
        
    }
}
