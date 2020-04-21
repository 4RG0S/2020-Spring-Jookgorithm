package Fifth_week;

import java.util.Scanner;

public class April_21_9095 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int arr[] = new int[12];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		for(int i=4;i<12;i++)
		{
			arr[i] = arr[i - 3] + arr[i - 2] + arr[i - 1];
		}
		for(int i=0;i<T;i++)
		{
			int n = scan.nextInt();
			System.out.println(arr[n]);
		}
	}

}
