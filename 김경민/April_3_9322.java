package Second_week;

import java.util.Arrays;
import java.util.Scanner;

public class April_3_9322 {
	
	public static int findArr(String[] arr, String key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(key))
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for(int i=0;i<test;i++)
		{
			int n=scan.nextInt();
			String arr[] = new String[n];
			int order[] = new int[n];
			for(int j=0;j<n;j++)
			{
				arr[j]=scan.next();
			}
			for(int j=0;j<n;j++)
			{
				String input = scan.next();
				order[j] = findArr(arr, input);
			}
			for(int j=0;j<n;j++)
			{
				arr[order[j]] = scan.next();
			}
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[j]);
				if(j != n - 1)
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
