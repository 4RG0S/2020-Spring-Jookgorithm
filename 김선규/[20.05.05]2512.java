package Baekjoon.Bruteforce;

import java.util.Scanner;

public class Baekjoon2512 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int m = sc.nextInt();
		
		int i;
		for(i = 1; i < 100000; i++) {
			int num = 0;
			int c = 0;
			for(int j = 0; j < n; j++) {
				if(arr[j] > i) {
					num += i;
				}else {
					num += arr[j];
					c++;
				}
			}
			if(num >= m || c == n) {
				if(num > m) {
					i--;
				}
				break;
			}
		}
		System.out.print(i);
	}
}
