package Baekjoon.search;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1337 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		int count = 4;
		if(n > 4 ) {
			for(int i = 0; i < n - 4; i++) {
				int c = 4;
				for(int j = 1; j < 5; j++) {
					if(num[i+j] > num[i] + 4) {
						break;
					}
					c--;
				}
				count = Math.min(count, c);
			}
			for(int i = n - 4; i < n; i++) {
				int c = 4;
				for(int j = i + 1; j < n; j++) {
					if(num[j] > num[i] + 4) {
						break;
					}
					c--;
				}
				count = Math.min(count, c);
			}
		}else {
			for(int i = 0; i < n; i++) {
				int c = 4;
				for(int j = i + 1; j < n; j++) {
					if(num[j] > num[i] + 4) {
						break;
					}
					c--;
				}
				count = Math.min(count, c);
			}
		}
		System.out.print(count);
	}
}
