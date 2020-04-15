package Fourth_week;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class maze{
	int x,y;
	int block;
	public maze(int x, int y, int block)
	{
		this.x = x;
		this.y = y;
		this.block = block;
	}
}

public class April_15_2178 {
	
	static int dx[] = {1, -1, 0, 0};
	static int dy[] = {0, 0, 1, -1};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Queue<maze> q = new LinkedList<>();
		int N = scan.nextInt();
		int M = scan.nextInt();
		int output = 0;
		scan.nextLine();
		int arr[][] = new int[N][M];
		int isVisit[][] = new int[N][M];
		isVisit[0][0] = 1;
		for(int i=0;i<N;i++)
		{
			String line = scan.nextLine();
			for(int j=0;j<M;j++)
			{
				arr[i][j] = line.charAt(j) - '0';
			}
		}
		q.add(new maze(0, 0, 1));
		while(!q.isEmpty())
		{
			maze temp = q.poll();
			if(temp.x == M-1 && temp.y == N-1)
			{
				output = temp.block;
				break;
			}
			for(int i=0;i<4;i++)
			{
				int x = temp.x + dx[i];
				int y = temp.y + dy[i];
				
				if(0 <= x && x < M && 0 <= y && y < N && arr[y][x] == 1 && isVisit[y][x] == 0)
				{
					q.add(new maze(x, y, (temp.block + 1)));
					isVisit[y][x] = 1;
				}
			}
		}
		System.out.println(output);
	}

}
