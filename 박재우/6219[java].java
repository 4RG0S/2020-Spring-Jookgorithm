package น้มุ;
import java.util.Scanner;
public class prime {
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
	private static int check_num(int n, int x)
	{
		int i = 0,j = 0;
		String temp = Integer.toString(n), D = Integer.toString(x);
		while(i<temp.length())
		{
			if(temp.charAt(i) == D.charAt(j)){j++;}
			else {j = 0;}
			i++;
			if(j==D.length())
				return (1);
		}
		return (0);
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String root = scan.nextLine();
		int[] x = new int[3];
		int i = 0;
		int min;
		int count = 0;

		for(int j = 0;j<root.length();j++)
		{
			if(root.charAt(j) >='0' && root.charAt(j) <='9') 
				x[i] = x[i]*10 + (root.charAt(j) - '0');
			else
				i++;
		}
		min = x[0];
		while(min < x[1])
		{
			if(isPrimeNumber(min) == 1 && check_num(min,x[2]) == 1)
				count++;
			min++;
		}
		System.out.println(count);
		
	}
}
