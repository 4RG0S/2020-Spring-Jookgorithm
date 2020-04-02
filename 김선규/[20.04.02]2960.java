package Baekjoon.implementation;

import java.util.Scanner;

public class Baekjoon2960 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = 0;
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n+1];
		for(int i = 2; i <= n; i++) {
			a[i] = 1;
		}
		for(int i = 2; i <= n; i++) {
			if(a[i] == 0) {
				continue;
			}
			for(int j = i; j <= n; j+=i) {
				if(a[j] == 0) {
					continue;
				}
				a[j] = 0;
				c++;
				if(c == k) {
					System.out.print(j);
				}
			}
		}
	}
}
