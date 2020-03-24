package _1003;

import java.util.Scanner;

public class _1003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int count = input.nextInt();
		int result[][] = new int[count][2];
		
		int n = 0;
		
		for (int i = 0; i < count; i++) {
			n = input.nextInt();
			int a = fib(n);
			int b = fib(n + 1);
			result[i][0] = a;
			result[i][1] = b;
		}
		for (int i = 0; i< count ; i++)
			System.out.printf("%d %d\n",result[i][0],result[i][1]);
	}

	
	public static int fib(int n) {
		int a = 0;
		int b = 0;
		int c = 1;
		if (n == 0)
			return 1;
		if (n == 1)
			return 0;
		for (int i = 0; i< n; i++) {
			a = b;
			b = c;
			c = a + b;
		}
		return a;
	}
}
