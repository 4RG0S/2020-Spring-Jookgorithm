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

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> {
            if(o1 < o2) return 1;
            else if(o1 > o2) return -1;
            else return 0;
        });

        for(int i = 0; i < n; i++) {
            int in = Integer.parseInt(br.readLine());

            if(in == 0) {
                if(priorityQueue.isEmpty()) System.out.println("0");
                else                        System.out.println(priorityQueue.poll());
            }
            else {
                priorityQueue.add(in);
            }
        }
    }
}
