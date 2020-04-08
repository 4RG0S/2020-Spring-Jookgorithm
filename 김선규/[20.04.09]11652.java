package Baekjoon.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon11652 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		Arrays.sort(a);
		int max = 0;
		int sum = 1;
		long num = 0;
		for(int i = 1; i < n; i++) {
			if(a[i-1] != a[i]) {
				if(Math.max(max, sum) > max) {
					num = a[i-1];
				}
				max = Math.max(max, sum);
				sum = 0;
			}
			sum++;
		}
		if(Math.max(max, sum) > max) {
			num = a[n-1];
		}
		System.out.print(num);
	}
}
