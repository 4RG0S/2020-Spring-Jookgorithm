package May;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class map{
	int x, y;
	int distance;
	public map(int x, int y, int distance)
	{
		this.x = x;
		this.y = y;
		this.distance = distance;
	}
}

public class May_21_2589 {
	
	static int max = Integer.MIN_VALUE;
	static int dx[] = {1, -1, 0, 0};
	static int dy[] = {0, 0, 1, -1};
	
	public static void bfs(char arr[][], int y, int x) {
		boolean isVisit[][] = new boolean[arr.length][arr[0].length];
		Queue<map> q = new LinkedList<>();
		q.add(new map(x, y, 0));
		isVisit[y][x] = true;
		
		while(!q.isEmpty())
		{
			map temp = q.poll();
			for(int i=0;i<4;i++)
			{
				int t_x = temp.x + dx[i];
				int t_y = temp.y + dy[i];
				if(0 <= t_x && t_x < arr[0].length && 0 <= t_y && t_y < arr.length && arr[t_y][t_x] == 'L' && !isVisit[t_y][t_x])
				{
					isVisit[t_y][t_x] = true;
					q.add(new map(t_x, t_y, temp.distance + 1));
				}
			}
			if(max < temp.distance)
				max = temp.distance;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int L = scan.nextInt();
		int M = scan.nextInt();
		scan.nextLine();
		
		char arr[][] = new char[L][M];
		for(int i=0;i<L;i++)
		{
			String line = scan.nextLine();
			for(int j=0;j<M;j++)
			{
				arr[i][j] = line.charAt(j);
			}
		}
		
		for(int i=0;i<L;i++)
		{
			for(int j=0;j<M;j++)
			{
				if(arr[i][j] == 'L')
					bfs(arr, i, j);
			}
		}
		System.out.println(max);
	}

}
