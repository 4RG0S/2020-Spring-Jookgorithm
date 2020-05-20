package May;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

class path{
	String value;
	int count;
	public path(String value, int count)
	{
		this.value = value;
		this.count = count;
	}
}

public class May_20_1963 {
	
	public static boolean isPrime(int n)
	{
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Set<String> set = new HashSet<>();
		for(int i=1000;i<10000;i++)
		{
			if(isPrime(i))
				set.add(Integer.toString(i));
		}
		int T = scan.nextInt();
		for(int i=0;i<T;i++)
		{
			boolean isVisit[] = new boolean[10000];
			Queue<path> q = new LinkedList<>();
			int now = scan.nextInt();
			int to = scan.nextInt();
			int count = -1;
			q.add(new path(Integer.toString(now), 0));
			isVisit[now] = true;
			
			while(!q.isEmpty())
			{
				path temp = q.poll();
				count = temp.count;
				if(Integer.parseInt(temp.value) == to)
					break;
				for(int j=0;j<4;j++)
				{
					for(int k=0;k<10;k++)
					{
						String find = temp.value;
						find = find.substring(0, j) + k + find.substring(j + 1, 4);
						if(set.contains(find) && !isVisit[Integer.parseInt(find)])
						{
							//System.out.println(find + " " + temp.count);
							isVisit[Integer.parseInt(find)] = true;
							q.add(new path(find, temp.count + 1));
						}
					}
				}
			}
			if(count == -1)
				System.out.println(0);
			else
				System.out.println(count);
		}
	}

}
