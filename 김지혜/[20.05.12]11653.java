import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[10001];
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = 2;
        while(n!=1){
            if(n%i==0){
                bw.write(i+"\n");
                n = n/i;
                i = 2;
            }
            else i ++;
        }

        br.close();
        bw.close();
    }
}
