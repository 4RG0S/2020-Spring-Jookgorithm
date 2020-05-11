package Eighth_week;

import java.util.Scanner;

public class May_10_2343 {

	public static boolean isOkay(int arr[], int M, long length)
	{
		int count = 1;
		long temp = length;
		for(int i=0;i<arr.length;i++)
		{
			if(temp - arr[i] >= 0)
			{
				temp -= arr[i];
			}
			else
			{
				if(arr[i] > length)
					return false;
				temp = length;
				count++;
				i--;
			}
		}
		if(count <= M)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int arr[] = new int[N];
		scan.nextLine();
		String line = scan.nextLine();
		String split[] = line.split(" ");
		for(int i=0;i<split.length;i++)
		{
			arr[i] = Integer.parseInt(split[i]);
		}
		
		long start = 0;
		long end = (long)Math.pow(10, 9) + 1;
		long middle = (start + end) / 2;
		while(true)
		{
			if(isOkay(arr, M, middle) && !isOkay(arr, M, middle - 1))
				break;
			if(isOkay(arr, M, middle))
			{
				end = middle;
				middle = (start + end) / 2;
			}
			else if(!isOkay(arr, M, middle))
			{
				start = middle;
				middle = (start + end) / 2;
			}
		}
		System.out.println(middle);
	}

}
