package Baekjoon.implementation;

import java.util.Scanner;

public class Baekjoon4539 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			for(int j = 1; j < Math.log10(a); j++) {
				if(a % Math.pow(10, j) > 4 * Math.pow(10, j-1)) {
					a += Math.pow(10, j);
				}
				a -= a % Math.pow(10, j);
			}
			System.out.println(a);
		}
	}
}
