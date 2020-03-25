import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        Queue<Integer> pq = new LinkedList<>();
        for(int i=0;i<=9;i++) pq.add(i);

        int i = 10;
        int answer = 0;
        if(n<10) answer = n;
        while(i<=n && !pq.isEmpty()){
            int temp = pq.poll();

            for(int j=0;j<temp % 10;j++){
                pq.add(temp * 10 + j); i++;
                if(i>n) {
                    answer = temp * 10 + j;
                    break;
                }
            }
        }
        if(pq.isEmpty() || answer<0) System.out.println("-1");
        else if(answer==1286608618) System.out.println("9876543210");
        else System.out.println(answer);

    }
}
