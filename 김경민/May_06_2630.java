package Seventh_week;

import java.util.Scanner;

public class May_06_2630 {
	
	static int w_count = 0;
	static int b_count = 0;

	public static void count(int arr[][], int length, int x_index, int y_index)
	{
		boolean is_w = true;
		boolean is_b = true;
		for(int i = y_index; i < y_index + length;i++)
		{
			for(int j = x_index;j < x_index + length;j++)
			{
				if(arr[j][i] == 1)
					is_w = false;
				else if(arr[j][i] == 0)
					is_b = false;
			}
		}
		if(is_w)
			w_count++;
		else if(is_b)
			b_count++;
		else
		{
			for(int i=0;i<4;i++)
			{
				count(arr, length / 2, x_index + (length / 2) * (i % 2), y_index + (length / 2) * (i / 2));
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int arr[][] = new int[N][N];
		
		scan.nextLine();
		for(int i = 0;i < N;i++)
		{
			String line = scan.nextLine();
			String split[] = line.split(" ");
			for(int j=0;j<split.length;j++)
			{
				arr[i][j] = Integer.parseInt(split[j]);
			}
		}
		for(int i=0;i<4;i++)
		{
			count(arr, N / 2, (N / 2) * (i % 2), (N / 2) * (i / 2));
		}
		System.out.println(w_count);
		System.out.println(b_count);
	}

}
