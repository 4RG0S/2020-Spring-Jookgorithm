package May;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

class number_board{
	int x, y;
	String value;
	public number_board(int x, int y, String value)
	{
		this.x = x;
		this.y = y;
		this.value = value;
	}
}

public class May_13_2210 {
	
	static int dx[] = {1, -1, 0, 0};
	static int dy[] = {0, 0, 1, -1};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<number_board> q = new LinkedList<>();
		Set<String> set = new HashSet<>();
		Scanner scan = new Scanner(System.in);
		int arr[][] = new int[5][5];
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				arr[i][j] = scan.nextInt();
				q.add(new number_board(j, i, Integer.toString(arr[i][j])));
			}
		}
		while(!q.isEmpty())
		{
			number_board temp = q.poll();
			if(temp.value.length() == 6)
				set.add(temp.value);
			else
			{
				for(int i=0;i<4;i++)
				{
					int x = temp.x + dx[i];
					int y = temp.y + dy[i];
					if(0 <= x && x < 5 && 0 <= y && y < 5)
					{
						q.add(new number_board(x, y, temp.value + Integer.toString(arr[y][x])));
					}
				}
			}
		}
		System.out.println(set.size());
		
	}

}
