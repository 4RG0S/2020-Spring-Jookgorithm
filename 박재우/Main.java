package น้มุ;

import java.util.Scanner;

public class Main {
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
		int num = 1 + scan.nextInt();
		scan.nextLine();
		int[] x = new int[num];
		int count = 0;
		String root = scan.nextLine();
		int i = 0;
		for(int j = 0;j<root.length();j++)
		{
			if(root.charAt(j) >='0' && root.charAt(j) <='9')
				x[i] = x[i]*10 + (root.charAt(j) - '0');
			else
				i++;
		}
		for(int k = 0;k<num - 1;k++)
		{
			if(isPrimeNumber(x[k]) == 1)
				count++;
		}
		System.out.println(count);
	}

}

