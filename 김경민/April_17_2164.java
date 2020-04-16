package Fourth_week;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class April_17_2164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		Queue<Integer> q = new LinkedList<>();
		for(int i=0;i<N;i++)
		{
			q.add(i + 1);
		}
		while(q.size() != 1)
		{
			q.poll();
			int temp = q.poll();
			q.add(temp);
		}
		System.out.println(q.poll());
	}

}
