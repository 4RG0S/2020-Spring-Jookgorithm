package May;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class calculate{
	long value;
	int count;
	public calculate(long value, int count)
	{
		this.value = value;
		this.count = count;
	}
}

public class May_21_16953 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Queue<calculate> q = new LinkedList<>();
		long A = scan.nextInt();
		long B = scan.nextInt();
		int min = Integer.MAX_VALUE;
		q.add(new calculate(A, 0));
		while(!q.isEmpty())
		{
			calculate temp = q.poll();
			if(temp.value == B && temp.count < min)
				min = temp.count;
			if(temp.value <= B)
			{
				q.add(new calculate(temp.value * 2, temp.count + 1));
				q.add(new calculate(temp.value * 10 + 1, temp.count + 1));
			}
		}
		if(min == Integer.MAX_VALUE)
			System.out.println(-1);
		else
			System.out.println(min + 1);
	}

}
