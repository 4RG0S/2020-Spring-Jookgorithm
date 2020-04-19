package Fourth_week;

import java.util.Scanner;

public class April_19_1929 {
	
	public static boolean isPrime(int a)
	{
		if(a == 1)
			return false;
		int to = (int)Math.sqrt(a);
		for(int i=2;i <= to;i++)
		{
			if(a % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		int N = scan.nextInt();
		for(int i=M;i<=N;i++)
		{
			if(isPrime(i))
				System.out.println(i);
		}
	}

}
