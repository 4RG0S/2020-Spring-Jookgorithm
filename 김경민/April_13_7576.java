package Fourth_week;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class tomato{
	int x;
	int y;
	int day;
	public tomato(int x, int y, int day)
	{
		this.x = x;
		this.y = y;
		this.day = day;
	}
}

public class April_13_7576 {
	
	static int dx[] = {1, 0, -1, 0};
	static int dy[] = {0, 1, 0, -1};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		int N = scan.nextInt();
		int day = 0;
		Queue<tomato> queue = new LinkedList<>();
		scan.nextLine();
		int arr[][] = new int[N][M];
		for(int i=0;i<N;i++)
		{
			String line = scan.nextLine();
			String split[] = line.split(" ");
			for(int j=0;j<split.length;j++)
			{
				arr[i][j] = Integer.parseInt(split[j]);
				if(arr[i][j] == 1)
					queue.add(new tomato(i, j, 0));
			}
		}
		while(!queue.isEmpty())
		{
			tomato temp = queue.poll();
			for(int i=0;i<4;i++)
			{
				int x = temp.x + dx[i];
				int y = temp.y + dy[i];
				if(0 <= x && x < N && 0 <= y && y < M && arr[x][y] == 0)
				{
					arr[x][y] = 1;
					day = temp.day + 1;
					queue.add(new tomato(x, y, day));
				}
			}
		}
		
		boolean isOkay = true;
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<M;j++)
			{
				if(arr[i][j] == 0)
					isOkay = false;
			}
		}
		if(isOkay)
			System.out.println(day);
		else
			System.out.println(-1);
	}

}
