import java.util.Scanner;

public class Main_prime {
	public static int isPrimeNumber(int n)
	{
		if ( n == 1 )
			return 0;
		for(int i = 2; i <= Math.sqrt(n); i++)
		{
			if (n % i == 0)
				return 0;
		}
		return 1;
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int min = scan.nextInt();
		int max = scan.nextInt();
		int sum = 0;
		int minimal = max;
		for(int i = min; i<=max; i++)
		{
			if(isPrimeNumber(i) == 1)
			{
				sum += i;
				if(minimal > i)
					minimal = i;
			}
		}
		if(sum == 0)
			System.out.println(-1);
		else
			System.out.println(sum+"\n"+minimal);
	}

}
