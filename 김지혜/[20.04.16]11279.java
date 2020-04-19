import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i=0;i<n;i++){
            int input = scan.nextInt();
            if(input==0){
                if(pq.isEmpty()) System.out.println("0");
                else System.out.println(pq.poll());
            }
            else pq.add(input);
        }
    }

}
