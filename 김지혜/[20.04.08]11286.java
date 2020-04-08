import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static class aComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer p1, Integer p2) {
            if (Math.abs(p1) < Math.abs(p2)) return -1;
            else if (Math.abs(p1) > Math.abs(p2)) return 1;
            else{
                if(p1 > p2) return 1;
                else if(p1 < p2) return -1;
                else return 0;
            }
        }
    }
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        aComparator acop =  new aComparator();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(acop);

        for(int i=0;i<n;i++){
            int temp = scan.nextInt();

            if(temp!=0) pq.add(temp);
            else{
                if(!pq.isEmpty()) System.out.println(pq.poll());
                else System.out.println("0");
            }
        }

    }
}
