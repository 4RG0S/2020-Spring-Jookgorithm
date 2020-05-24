package May;

import java.util.Scanner;

public class May_25_11403 {
	
	public static int N;
	public static boolean arr[][];
	public static boolean isVisit[];
	
	public static void dfs(int index, int here)
	{
		isVisit[here] = true;
		for(int i=0;i<N;i++)
		{
			if(arr[here][i])
			{
				if(!isVisit[i])
				{
					arr[index][i] = true;
					dfs(index, i);
				}
				else if(index == i)
					arr[i][i] = true;
			}
		}
	}
	
	public static void dfsAll() {
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
				isVisit[j] = false;
			dfs(i, i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		arr = new boolean[N][N];
		isVisit = new boolean[N];
		scan.nextLine();
		
		for(int i=0;i<N;i++)
		{
			String line = scan.nextLine();
			String split[] = line.split(" ");
			
			for(int j=0;j<split.length;j++)
			{
				if(split[j].equals("1"))
					arr[i][j] = true;
			}
		}
		dfsAll();
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				if(arr[i][j])
					System.out.print(1 + " ");
				else
					System.out.print(0 + " ");
			}
			System.out.println();
		}
	}

}
