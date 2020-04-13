package Fourth_week;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class tomatos{
	int x;
	int y;
	int z;
	int day;
	public tomatos(int x, int y, int z, int day)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this.day = day;
	}
}

public class April_13_7569 {
	
	static int dx[] = {1, -1, 0, 0, 0, 0};
	static int dy[] = {0, 0, 1, -1, 0, 0};
	static int dz[] = {0, 0, 0, 0, 1, -1};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		int N = scan.nextInt();
		int H = scan.nextInt();
		int day = 0;
		Queue<tomatos> queue = new LinkedList<>();
		scan.nextLine();
		int arr[][][] = new int[H][N][M];
		for(int k=0;k<H;k++)
		{
			for(int i=0;i<N;i++)
			{
				String line = scan.nextLine();
				String split[] = line.split(" ");
				for(int j=0;j<split.length;j++)
				{
					arr[k][i][j] = Integer.parseInt(split[j]);
					if(arr[k][i][j] == 1)
					{
						queue.add(new tomatos(j, i, k, 0));
					}
				}
			}
		}
		while(!queue.isEmpty())
		{
			tomatos temp = queue.poll();
			for(int i=0;i<6;i++)
			{
				int x = temp.x + dx[i];
				int y = temp.y + dy[i];
				int z = temp.z + dz[i];
				if(0 <= x && x < M && 0 <= y && y < N && 0 <= z && z < H && arr[z][y][x] == 0)
				{
					arr[z][y][x] = 1;
					day = temp.day + 1;
					queue.add(new tomatos(x, y, z, day));
				}
			}
		}
		
		boolean isOkay = true;
		for(int i=0;i<M;i++)
		{
			for(int j=0;j<N;j++)
			{
				for(int k=0;k<H;k++)
				{
					if(arr[k][j][i] == 0)
						isOkay = false;
				}
			}
		}
		if(isOkay)
			System.out.println(day);
		else
			System.out.println(-1);
	}

}
