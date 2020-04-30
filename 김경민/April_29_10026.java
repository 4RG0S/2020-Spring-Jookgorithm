package Sixth_week;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class dot{
	int x, y;
	char value;
	public dot(int x, int y, char value)
	{
		this.x = x;
		this.y = y;
		this.value = value;
	}
}


public class April_29_10026 {
	
	public static int[] empty(char arr[][], int N, char value, dot temp, int isVisit[][])
	{
		int result[] = new int[2];
		result[0] = -1;
		result[1] = -1;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				if(isVisit[i][j] == 0)
				{
					int sum = Math.abs(temp.x - i) + Math.abs(temp.y - j);
					if(sum < min)
					{
						min = sum;
						result[0] = i;
						result[1] = j;
					}
				}
			}
		}
		return result;
	}

	static int dx[] = {1, -1, 0, 0};
	static int dy[] = {0, 0, 1, -1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int result_normal = 1;
		int result_unnormal = 1;
		scan.nextLine();
		char arr[][] = new char[N][N];
		int isVisit[][] = new int[N][N];
		for(int i=0;i<N;i++)
		{
			String line = scan.nextLine();
			for(int j=0;j<N;j++)
			{
				arr[i][j] = line.charAt(j);
			}
		}
		
		Queue<dot> q = new LinkedList<>();
		
		char value = arr[0][0];
		int empty_check[] = {0, 0};
		dot temp = null;
		while(empty_check[0] != -1 && empty_check[1] != -1)
		{
			q.add(new dot(empty_check[0], empty_check[1], arr[empty_check[0]][empty_check[1]]));
			isVisit[empty_check[0]][empty_check[1]] = 1;
			if(value != arr[empty_check[0]][empty_check[1]])
			{
				value = arr[empty_check[0]][empty_check[1]];
			}
			while(!q.isEmpty())
			{
				temp = q.poll();
				for(int i=0;i<4;i++)
				{
					int x = temp.x + dx[i];
					int y = temp.y + dy[i];
					
					if(0 <= x && x < N && 0 <= y && y < N && value == arr[x][y] && isVisit[x][y] == 0)
					{
						q.add(new dot(x, y, value));
						isVisit[x][y] = 1;
					}
				}
			}
			empty_check = empty(arr, N, value, temp, isVisit);
			if(empty_check[0] != -1 && empty_check[1] != -1)
				result_normal++;
		}
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				if(arr[i][j] == 'G')
					arr[i][j] = 'R';
			}
		}
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				isVisit[i][j] = 0;
			}
		}
		value = arr[0][0];
		empty_check[0] = 0;
		empty_check[1] = 0;
		while(empty_check[0] != -1 && empty_check[1] != -1)
		{
			q.add(new dot(empty_check[0], empty_check[1], arr[empty_check[0]][empty_check[1]]));
			isVisit[empty_check[0]][empty_check[1]] = 1;
			if(value != arr[empty_check[0]][empty_check[1]])
			{
				value = arr[empty_check[0]][empty_check[1]];
			}
			while(!q.isEmpty())
			{
				temp = q.poll();
				for(int i=0;i<4;i++)
				{
					int x = temp.x + dx[i];
					int y = temp.y + dy[i];
					
					if(0 <= x && x < N && 0 <= y && y < N && value == arr[x][y] && isVisit[x][y] == 0)
					{
						q.add(new dot(x, y, value));
						isVisit[x][y] = 1;
					}
				}
			}
			empty_check = empty(arr, N, value, temp, isVisit);
			if(empty_check[0] != -1 && empty_check[1] != -1)
				result_unnormal++;
		}
		System.out.println(result_normal + " " + result_unnormal);
		
	}

}
