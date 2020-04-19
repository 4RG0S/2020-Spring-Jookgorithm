package Fourth_week;

import java.util.Scanner;

public class April_19_2805 {
	
	static int M;
	
	public static boolean isOkay(long a, int arr[])
	{
		long length = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > a)
				length += arr[i] - a;
		}
		if(length >= M)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		M = scan.nextInt();
		int arr[] = new int[N];
		
		for(int i=0;i<N;i++)
		{
			arr[i] = scan.nextInt();
		}
		
		long start = 0;
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
