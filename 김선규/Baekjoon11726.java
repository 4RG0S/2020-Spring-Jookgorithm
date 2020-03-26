package Baekjoon.Dynamic;

import java.util.Scanner;

public class Baekjoon11726 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(fibonacci(input.nextInt())%10007);
	}
	
	public static int fibonacci(int n) {
		if(n <= 1)
			return 1;
		
		int a = 1;
		int b = 1;
		int c = 2;
		
		for(int i = 0; i < n-2; i++) {
			a = b;
			b = c;
			c = a + b;
			c = c % 10007;
		}
		return c;
	}
}
