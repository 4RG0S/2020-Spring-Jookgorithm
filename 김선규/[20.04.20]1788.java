package Baekjoon.implementation;

import java.util.Scanner;

public class Baekjoon1788 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if(n != 0)
			n = fibonacci(n);
		if(n > 0) {
			System.out.println(1);
		}else if(n < 0){
			System.out.println(-1);
		}else {
			System.out.println(0);
		}
		n = Math.abs(n);
		System.out.print(n);
	}
	
	public static int fibonacci(int n) {
		int a = 0;
		int b = 1;
		int c = 1;
		
		for(int i = 0; i < Math.abs(n)-2; i++) {
			a = b;
			b = c;
			c = (a + b) % 1000000000;
		}
		if(n % 2 == 0 & n < 0) {
			return -c;
		}else {
			return c;
		}
	}
}
