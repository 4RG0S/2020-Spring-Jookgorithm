package Baekjoon.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1822 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		
		Arrays.sort(a);
		int[] b = a.clone();
		
		int c = n;
		for(int i = 0; i < m; i++) {
			int num = sc.nextInt();
			int mid, left = 0, right = n-1;
			while(right >= left) {
				mid = (left + right) / 2;
				if(num == a[mid]) {
					b[mid] = 0;
					c--;
					break;
				}else if(num < a[mid] ) {
					right = mid - 1;
				}else {
					left = mid + 1;
				}
			}
		}
		
		if(c == 0) {
			System.out.print(0);
		}else {
			System.out.println(c);
			for(int i = 0; i < n; i++)
				if(b[i] != 0)
					System.out.print(b[i] + " ");
		}
	}
}
