import java.util.Arrays;
import java.util.Scanner;

public class Main1026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		int S=0;
		for(int i=0;i<N;i++) {
			A[i] = input.nextInt();
		}
		for(int i=0;i<N;i++) {
			B[i] = input.nextInt();
		}
		
		Arrays.sort(A);
		Arrays.sort(B);
		for(int i=0;i<N;i++) {
			S += A[i]*B[N-i-1];
		}
		System.out.println(S);
	}

}
