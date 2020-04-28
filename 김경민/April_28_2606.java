package Sixth_week;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class April_28_2606 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int arr[][] = new int[N][N];
		int virus[] = new int[N];
		int count = 0;
		for(int i=0;i<M;i++)
		{
			int first = scan.nextInt();
			int second = scan.nextInt();
			arr[first - 1][second - 1] = 1;
			arr[second - 1][first - 1] = 1;
		}
		Queue<Integer> q = new LinkedList<>();
		for(int i=0;i<N;i++)
		{
			if(arr[0][i] == 1 && virus[i] != 1)
			{
				q.add(i);
				virus[i] = 1;
			}
		}
		while(!q.isEmpty())
		{
			int temp = q.poll();
			for(int i=0;i<N;i++)
			{
				if(arr[temp][i] == 1 && virus[i] != 1)
				{
					q.add(i);
					virus[i] = 1;
				}
			}
		}
		for(int i=0;i<N;i++)
		{
			if(virus[i] == 1)
				count++;
		}
		System.out.println(count - 1);
		
	}

}
