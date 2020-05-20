package May;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class dot{
	int x, y;
	public dot(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}

class cheeze{
	int x, y;
	int day;
	public cheeze(int x, int y, int day)
	{
		this.x = x;
		this.y = y;
		this.day = day;
	}
}

public class May_19_2638 {
	
	static int dx[] = {1, -1, 0, 0};
	static int dy[] = {0, 0, 1, -1};
	
	static int arr[][];
	
	public static void set_map()
	{
		boolean isVisit[][] = new boolean[arr.length][arr[0].length];
		Queue<dot> q = new LinkedList<>();
		q.add(new dot(0, 0));
		while(!q.isEmpty())
		{
			dot temp = q.poll();
			arr[temp.y][temp.x] = -1;
			
			for(int i=0;i<4;i++)
			{
				int x = temp.x + dx[i];
				int y = temp.y + dy[i];
				if(0 <= x && x < arr[0].length && 0 <= y && y < arr.length && (arr[y][x] == -1 || arr[y][x] == 0) && !isVisit[y][x])
				{
					q.add(new dot(x, y));
					isVisit[y][x] = true;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		String num = br.readLine();
		String num_split[] = num.split(" ");
		int N = Integer.parseInt(num_split[0]);
		int M = Integer.parseInt(num_split[1]);
		arr = new int[N][M];
		for(int i=0;i<N;i++)
		{
			String line = br.readLine();
			StringTokenizer split = new StringTokenizer(line, " ");
			for(int j=0;j<M;j++)
			{
				arr[i][j] = Integer.parseInt(split.nextToken());
			}
		}
		int day = 0;
		while(true)
		{
			boolean exit = true;
			
			for(int i=0;i<N;i++)
			{
				for(int j=0;j<M;j++)
				{
					if(arr[i][j] == 1)
						exit = false;
				}
			}
			if(exit)
				break;
			set_map();
			day++;
			for(int i=0;i<N;i++)
			{
				for(int j=0;j<M;j++)
				{
					int count = 0;
					if(arr[i][j] == 1)
					{
						for(int k=0;k<4;k++)
						{
							int x = j + dx[k];
							int y = i + dy[k];
							if(arr[y][x] < 0)
							{
								count++;
							}
						}
						if(count >= 2)
						{
							arr[i][j] = 0;
						}
					}
				}
			}
			
		}
		System.out.println(day);
	}

}
