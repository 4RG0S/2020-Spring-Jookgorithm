import java.io.IOException;
import java.util.Scanner;

public class Main {

    static int answer;
    static int n;
    static int sum;
    public static void main(String[] args) throws IOException {

       Scanner scan = new Scanner(System.in);
       n = scan.nextInt();
       sum = scan.nextInt();

       int[] input = new int[n];
       for(int i=0;i<n;i++){
           input[i] = scan.nextInt();
       }

       answer = 0;
       solveAnswer(0,0, input);
       System.out.println(answer);
    }
    public static void solveAnswer(int index,int thisSum, int[] arr){
        if(index == n) return;

        if(thisSum+arr[index] == sum) answer++;

        solveAnswer(index+1, thisSum+arr[index], arr);
        solveAnswer(index+1, thisSum, arr);
    }
}
