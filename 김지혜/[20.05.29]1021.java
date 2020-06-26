import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        LinkedList<Integer> arr = new LinkedList<>();

        int n = scan.nextInt();
        int m = scan.nextInt();

        for(int i=1;i<=n;i++){
            arr.add(i);
        }
        int answer = 0;

        for(int i=0;i<m;i++){
            int temp = scan.nextInt();
            if(arr.getFirst() == temp){
                arr.removeFirst();
            }
            else{
                int tempIndex = arr.indexOf(temp);

                int length = arr.size();
                if(tempIndex < length-tempIndex){
                    while(arr.getFirst() != temp){
                        arr.addLast(arr.removeFirst()); answer++;
                    }
                    arr.removeFirst();
                }
                else{
                    while(arr.getFirst() != temp){
                        arr.addFirst(arr.removeLast()); answer++;
                    }
                    arr.removeFirst();
                }
            }
        }
        System.out.println(answer);

    }
}
