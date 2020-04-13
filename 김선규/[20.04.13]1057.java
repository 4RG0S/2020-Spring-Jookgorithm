package Baekjoon.Math;

import java.util.Scanner;

public class Baekjoon1057 {
	static int i;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(i = 0; i < 100; i++) {
			if(n <= Math.pow(2, i)) {
				break;
			}
		}
		func(n, a, b, 0);
		System.out.print(i);
	}
	
	public static void func(int n, int a, int b, int num) {
		if(i < 0) {
			return ;
		}
		if(num + Math.pow(2, i-1) >= a & num + Math.pow(2, i-1) < b) {
			return ;
		}else if(num + Math.pow(2, i-1) < a & num + Math.pow(2, i-1) >= b) {
			return ;
		}
		if(num + Math.pow(2, i-1) < a & num + Math.pow(2, i-1) < b) {
			i--;
			func(n, a, b, num + (int)Math.pow(2, i));
		}else if(num + Math.pow(2, i-1) >= a & num + Math.pow(2, i-1) >= b) {
			i--;
			func(n, a, b, num);
		}
	}
}
