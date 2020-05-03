package Seventh_week;

import java.util.Arrays;
import java.util.Scanner;

class vertical implements Comparable<vertical>{
	int x, index;
	public vertical(int x, int index)
	{
		this.x = x;
		this.index = index;
	}
	@Override
	public int compareTo(vertical comp) {
		if(this.x < comp.x)
			return 1;
		else if(this.x > comp.x)
			return -1;
		else if(this.index > comp.index)
			return 1;
		else if(this.index < comp.index)
			return -1;
		else	
			return 0;
	}
	
}

public class May_04_18870 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.nextLine();
		vertical arr[] = new vertical[N];
		String line = scan.nextLine();
		String split[] = line.split(" ");
		int result[] = new int[N];
		int count = 0;
		for(int i=0;i<N;i++)
		{
			arr[i] = new vertical(Integer.parseInt(split[i]), i);
		}
		Arrays.sort(arr);
		int temp = arr[N - 1].x;
		for(int i = N - 1;i >= 0;i--)
		{
			if(arr[i].x != temp)
			{
				count++;
				temp = arr[i].x;
			}
			result[arr[i].index] = count;
		}
		for(int i=0;i<N;i++)
		{
			System.out.print(result[i] + " ");
		}
	}

}
