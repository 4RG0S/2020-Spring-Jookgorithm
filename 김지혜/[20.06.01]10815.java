import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(scan.nextInt(), 1);
        }
        int m = scan.nextInt();
        for(int i=0;i<m;i++){
            if(map.containsKey(scan.nextInt())){
                System.out.print("1 ");
            }
            else{
                System.out.print("0 ");
            }
        }

    }
}
