package May;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class May_18_1038 {
	
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		long result[] = new long[1024];
		result[0] = 0;
		int index = 1;
		Queue<String> q = new LinkedList<>();
		
		for(int i=1;i<10;i++)
		{
			q.add(Integer.toString(arr[i]));
		}
		while(!q.isEmpty())
		{
			String temp = q.poll();
			result[index] = Long.parseLong(temp);
			index++;
			for(int i=0;i < 10;i++)
			{
				if(temp.charAt(temp.length() - 1) - '0' > arr[i])
					q.add(temp + Integer.toString(arr[i]));
			}
		}
		if(N > 1022)
			System.out.println(-1);
		else
			System.out.println(result[N]);
	}
	
}
