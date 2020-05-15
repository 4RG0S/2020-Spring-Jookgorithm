package Baekjoon.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon11399 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		
		Arrays.sort(a);
		int x = 0;
		int y = 0;
		for(int i = 0; i < n; i++) {
			y += a[i];
			x += y;
		}
		System.out.print(x);
	}
}
