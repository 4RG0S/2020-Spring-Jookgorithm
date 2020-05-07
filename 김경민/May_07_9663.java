package Seventh_week;

import java.util.Scanner;

public class May_07_9663 {
	
	static int count = 0;
	
	static int dx[] = {-1, -1, -1};
	static int dy[] = {0, 1, -1};
	
	public static boolean isOkay(int arr[][], int x, int y)
	{
		if(arr[x][y] == 1)
			return false;
		for(int i=0;i<3;i++)
		{
			int temp_x = x;
			int temp_y = y;
			for(int j = 0;j<arr.length;j++)
			{
				temp_x += dx[i];
				temp_y += dy[i];
				if(0 <= temp_x && temp_x < arr.length && 0 <= temp_y && temp_y < arr.length)
				{
					if(arr[temp_x][temp_y] == 1)
						return false;
				}
				else
					break;
					
			}
		}
		return true;
	}
	
	public static void Nqueen(int arr[][], int n)
	{
		if(n == arr.length)
		{
			count++;
			return;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(isOkay(arr, n, i))
			{
				arr[n][i] = 1;
				Nqueen(arr, n + 1);
				arr[n][i] = 0;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int arr[][] = new int[N][N];
		Nqueen(arr, 0);
		System.out.println(count);
	}

}
