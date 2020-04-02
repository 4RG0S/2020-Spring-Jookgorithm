import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] input = new int[n];

        for(int i=0;i<n;i++){
            input[i] = scan.nextInt();
        }
        int answer = 0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(input[i]+input[j]==m) answer++;
            }
        }
        System.out.println(answer);
    }
}
