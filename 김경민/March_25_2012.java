package First_week;

import java.util.Arrays;
import java.util.Scanner;

public class March_25_2012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long result = 0;
		int arr[] = new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		for(int i = 0;i<N;i++)
		{
			result += Math.abs((i+1) - arr[i]);
		}
		System.out.println(result);
	}

}
