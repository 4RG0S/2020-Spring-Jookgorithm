package Fourth_week;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class April_14_10845 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Deque<Integer> q = new LinkedList<>();
		
		int N = scan.nextInt();
		scan.nextLine();
		for(int i=0;i<N;i++)
		{
			String line = scan.nextLine();
			String split[] = line.split(" ");
			if(split[0].equals("push"))
			{
				q.add(Integer.parseInt(split[1]));
			}
			else if(split[0].equals("pop"))
			{
				if(!q.isEmpty())
					System.out.println(q.poll());
				else
					System.out.println(-1);
			}
			else if(split[0].equals("size"))
			{
				System.out.println(q.size());
			}
			else if(split[0].equals("empty"))
			{
				if(q.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
			} else if(split[0].equals("front"))
			{
				if(!q.isEmpty())
					System.out.println(q.peekFirst());
				else
					System.out.println(-1);
			} else if(split[0].equals("back"))
			{
				if(!q.isEmpty())
					System.out.println(q.peekLast());
				else
					System.out.println(-1);
			}
		}
	}

}
