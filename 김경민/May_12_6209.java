package Eighth_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class May_12_6209 {
	
	public static int isOkay(int arr[], int middle, int m) {
		int count = 0;
		int before = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] - before < middle)
			{
				count++;
			}
			else
			{
				before = arr[i];
			}
		}
		if(count == m)
			return 0;
		else if(count > m)
			return -1;
		else
			return 1;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		String split[] = num.split(" ");
		int d = Integer.parseInt(split[0]);
		int n = Integer.parseInt(split[1]);
		int m = Integer.parseInt(split[2]);
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		int start = 0;
		int end = (int)Math.pow(10, 9) + 1;
		int middle = (start + end) / 2;
		if(n == m)
		{
			System.out.println(d);
		}
		else
		{
			while(true)
			{
				if((isOkay(arr, middle, m) == 0 && isOkay(arr, middle + 1, m) == -1) || (isOkay(arr, middle, m) == 1 && isOkay(arr, middle + 1, m) == -1))
					break;
				if(isOkay(arr, middle, m) == -1 && isOkay(arr, middle - 1, m) == 0)
				{
					middle--;
					break;
				}
				if((isOkay(arr, middle, m) == 1) || ((isOkay(arr, middle, m) == 0) && (isOkay(arr, middle + 1, m) == 0)))
				{
					start = middle;
					middle = (start + end) / 2;
				}
				else if(isOkay(arr, middle, m) == -1)
				{
					end = middle;
					middle = (start + end) / 2;
				}
			}
			System.out.println(middle);
		}
		
	}

}
