package Seventh_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class May_06_3079 {
	
	public static boolean isOkay(int arr[], long time, int M)
	{
		long sum = (long) 0;
		for(int i=0;i<arr.length;i++)
		{
			sum += time / arr[i];
		}
		if(sum >= M)
			return true;
		else
			return false;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = Integer.MIN_VALUE;
		String line = br.readLine();
		String split[] = line.split(" ");
		int N = Integer.parseInt(split[0]);
		int M = Integer.parseInt(split[1]);
		int arr[] = new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i] > max)
				max = arr[i];
		}
		long start = 0;
		long end = ((long)max * M + 1);
		long middle = (start + end) / 2;
		while(true)
		{
			if(isOkay(arr, middle, M) && !isOkay(arr, middle - 1, M))
				break;
			if(isOkay(arr, middle, M))
			{
				end = middle;
				middle = (start + end) / 2;
			}
			else if(!isOkay(arr, middle, M))
			{
				start = middle;
				middle = (start + end) / 2;
			}
		}
		System.out.println(middle);
	}

}
