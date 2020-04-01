import java.util.Arrays;
import java.util.Scanner;

public class Main2217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = input.nextInt();
		}
		
		Arrays.sort(arr);
		
		int max = 0;
		
		for(int i=0;i<n;i++) {
			int sum = arr[i]*(n-i);
			if(sum>max) {
				max = sum;
			}
		}
		
		System.out.println(max);
	}

}
