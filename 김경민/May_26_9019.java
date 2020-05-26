package May;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class DSLR{
	int value;
	String result = "";
	public DSLR(int value, String result)
	{
		this.value = value;
		this.result = result;
	}
}

public class May_26_9019 {
	
	public static int D(int input)
	{
		int result = input * 2;
		return result % 10000;
	}
	
	public static int S(int input)
	{
		int result = input - 1;
		if(result == -1)
			return 9999;
		else
			return result;
	}
	
	public static int L(int input)
	{
		int first, second, third, fourth;
		first = input / 1000;
		second = input % 1000 / 100;
		third = input % 100 / 10;
		fourth = input % 10;
		int result = second * 1000 + third * 100 + fourth * 10 + first;
		return result;
	}
	
	public static int R(int input)
	{
		int first, second, third, fourth;
		first = input / 1000;
		second = input % 1000 / 100;
		third = input % 100 / 10;
		fourth = input % 10;
		int result = fourth * 1000 + first * 100 + second * 10 + third;
		return result;
	}
	
	public static void bfs(int from, int to)
	{
		Queue<DSLR> q = new LinkedList<>();
		boolean isVisit[] = new boolean[10000];
		String result = null;
		
		q.add(new DSLR(from, ""));
		isVisit[from] = true;
		
		while(!q.isEmpty())
		{
			DSLR temp = q.poll();
			if(temp.value == to)
			{
				result = temp.result;
				break;
			}
			if(!isVisit[D(temp.value)])
			{
				isVisit[D(temp.value)] = true;
				q.add(new DSLR(D(temp.value), temp.result + "D"));
			}
			if(!isVisit[S(temp.value)])
			{
				isVisit[S(temp.value)] = true;
				q.add(new DSLR(S(temp.value), temp.result + "S"));
			}
			if(!isVisit[L(temp.value)])
			{
				isVisit[L(temp.value)] = true;
				q.add(new DSLR(L(temp.value), temp.result + "L"));
			}
			if(!isVisit[R(temp.value)])
			{
				isVisit[R(temp.value)] = true;
				q.add(new DSLR(R(temp.value), temp.result + "R"));
			}
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i=0;i<T;i++)
		{
			int from = scan.nextInt();
			int to = scan.nextInt();
			
			bfs(from, to);
		}
	}

}
