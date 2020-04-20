package Fourth_week;

import java.util.Arrays;
import java.util.Scanner;

public class April_19_1654 {
	static int N;
	public static boolean isOkay(long a, int arr[])
	{
		int count = 0;
		for(int i=0;i<arr.length;i++)
		{
			count += arr[i] / a;
		}
		if(count >= N)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int K = scan.nextInt();
		N = scan.nextInt();
		int arr[] = new int[K];
		
		for(int i=0;i<K;i++)
		{
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		long start = 1;
		long end = Long.MAX_VALUE - 1;
		long middle = (start + end) / 2;
		long result = 0;
		while(true)
		{
			if(isOkay(middle, arr) && !isOkay(middle + 1, arr))
			{
				result = middle;
				break;
			}
			else if(!isOkay(middle, arr))
			{
				end = middle;
				middle = (start + end) / 2;
			}
			else if(isOkay(middle, arr) && isOkay(middle + 1, arr))
			{
				start = middle;
				middle = (start + end) / 2;
			}
		}
		System.out.println(result);
	}

}
