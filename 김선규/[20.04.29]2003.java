package Baekjoon.implementation;

import java.util.Scanner;

public class Baekjoon2003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		int c = 0;
		for(int i = 0; i < n; i++) {
			int a = 0;
			for(int j = i; j < n; j++) {
				a += arr[j];
				if(a == m) {
					c++;
					break;
				}
			}
		}
		System.out.print(c);
	}
}
