package Second_week;

import java.util.Scanner;

public class April_3_1500 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int S = scan.nextInt();
		int K = scan.nextInt();
		int arr[] = new int[K];
		int mod = S % K;
		long result = 1;
		for(int i=0;i<K;i++)
		{
			arr[i] = S / K;
		}
		for(int i=0;i<mod;i++)
		{
			arr[i]++;
		}
		for(int i=0;i<K;i++)
		{
			result *= arr[i];
		}
		System.out.println(result);
	}

}
