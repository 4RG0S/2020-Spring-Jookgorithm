package Baekjoon.implementation;

import java.util.Scanner;

public class Baekjoon1929 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int f = sc.nextInt();
		int l = sc.nextInt();
		int[] a = new int[l+1];
		for(int i = 2; i <= l; i++) {
			a[i] = 1;
		}
		for(int i = 2; i <= l; i++) {
			if(a[i] == 0) {
				continue;
			}
			if(i >= f)
				System.out.println(i);
			for(int j = i; j <= l; j+=i) {
				if(a[j] == 0) {
					continue;
				}
				a[j] = 0;
				
			}
		}
	}
}
