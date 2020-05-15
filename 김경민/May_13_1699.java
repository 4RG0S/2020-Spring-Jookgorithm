package May;

import java.util.Scanner;

public class May_13_1699 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int arr[] = new int[N + 1];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = i;
		}
		for(int i=2;i<=N;i++)
		{
			for(int j=2;j * j<=i;j++)
			{
				arr[i] = Math.min(arr[i], arr[i - j * j] + 1);
			}
		}
		System.out.println(arr[N]);
	}

}
