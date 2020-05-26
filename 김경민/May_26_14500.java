package May;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class tetro{
	int x,y;
	public tetro(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}

public class May_26_14500 {
	
	public static int count = 0;
	public static int dx[] = {0, 0, 1, -1};
	public static int dy[] = {1, -1, 0, 0};
	public static int N;
	public static int M;
	public static Queue<Integer> save = new LinkedList<>();
	public static int arr[][];
	public static int max = Integer.MIN_VALUE;
	public static int value = 0;
	
	
	public static void dfs(tetro input, tetro before, int to)
	{
		if(to == 3)
		{
			if(max < value)
			{
				max = value;
			}
			return;
		}
		for(int i=0;i<4;i++)
		{
			int x = input.x + dx[i];
			int y = input.y + dy[i];
			if((x != before.x || y != before.y) && (0 <= x && x < M && 0 <= y && y < N))
			{
				value += arr[y][x];
				dfs(new tetro(x, y), input, to + 1);
				value -= arr[y][x];
			}
				
		}
		
	}
	
	public static void mino(tetro input)
	{
		int count = 1;
		for(int i=0;i<4;i++)
		{
			int x = input.x + dx[i];
			int y = input.y + dy[i];
			if(0 <= x && x < M && 0 <= y && y < N)
			{
				count++;
				value += arr[y][x];
			}
		}
		if(count == 5)
		{
			for(int i=0;i<4;i++)
			{
				int x = input.x + dx[i];
				int y = input.y + dy[i];
				if(0 <= x && x < M && 0 <= y && y < N)
				{
					value -= arr[y][x];
					if(max < value)
						max = value;
				}
				value += arr[y][x];
			}
		}
		else if(count == 4)
		{
			if(max < value)
				max = value;
		}
		for(int i=0;i<4;i++)
		{
			int x = input.x + dx[i];
			int y = input.y + dy[i];
			if(0 <= x && x < M && 0 <= y && y < N)
			{
				count++;
				value -= arr[y][x];
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M = scan.nextInt();
		arr = new int[N][M];
		tetro trash = new tetro(-1, -1);
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<M;j++)
			{
				arr[i][j] = scan.nextInt();
				//System.out.print(arr[i][j] + " ");
			}
			//System.out.println();
		}
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<M;j++)
			{
				value += arr[i][j];
				dfs(new tetro(j, i), trash, 0);
				mino(new tetro(j, i));
				value -= arr[i][j];
			}
		}
		System.out.println(max);
	}

}
