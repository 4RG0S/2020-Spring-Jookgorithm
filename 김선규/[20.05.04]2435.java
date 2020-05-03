package Baekjoon.Bruteforce;

import java.util.Scanner;

public class Baekjoon2435 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		int max = -100;
		for(int i = 0; i <= n-k; i++) {
			int sum = arr[i];
			for(int j = 1; j < k; j++) {
				sum += arr[i+j];
			}
			max = Math.max(max, sum);
		}
		System.out.print(max);
	}
}
