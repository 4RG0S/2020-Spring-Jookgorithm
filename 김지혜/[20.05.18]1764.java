import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        Map<String, Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            String key = scan.nextLine();
            if(!map.containsKey(key))
                map.put(scan.next(), 0);
        }
        for(int i=0;i<m;i++){
            String key = scan.nextLine();
            if(map.containsKey(key))
                map.put(key, 1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>();
        Set<String> set = map.keySet();
        Iterator<String> iter = set.iterator();
        while(iter.hasNext()){
            String key = iter.next();
            if(map.get(key) == 1)
                pq.add(key);
        }
        System.out.println(pq.size());
        while(!pq.isEmpty())
            System.out.println(pq.poll());
    }




}
