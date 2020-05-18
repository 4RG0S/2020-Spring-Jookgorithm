import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[10001];

        for(int i=0;i<n;i++){
            int idx = Integer.parseInt(br.readLine());
            arr[idx] = arr[idx] + 1;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0;i<10001;i++){
            if(arr[i] == 0) continue;

            for(int j=0;j<arr[i];j++){
                bw.write(i+"\n");
            }
        }
        br.close();
        bw.close();
    }
}
