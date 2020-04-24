package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon3273 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		int x = sc.nextInt();
		
		Arrays.sort(a);
		
		int c = 0;
		for(int i = 0; i < n; i++) {
			int s = 0, e = n-1;
			while(s <= e) {
				int m = (s+e)/2;
				if(a[i] + a[m] == x){
					c++;
					break;
				}else if(a[i] + a[m] > x) {
					e = m - 1;
				}else {
					s = m + 1;
				}
			}
		}
		
		System.out.print(c/2);
	}
}
