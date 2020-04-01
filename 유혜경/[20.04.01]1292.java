import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int[] arr = new int[1001];
        int sum = 0;
        int cnt = 0;
        int num = 1;
        for(int i = 1; i <= 1000; i++){
            arr[i] = num;
            cnt++;
            if(cnt == num) {
                num++;
                cnt = 0;
            }
        }
        for(int i = start; i <= end; i++)
            sum += arr[i];
        System.out.println(sum);
    }
}