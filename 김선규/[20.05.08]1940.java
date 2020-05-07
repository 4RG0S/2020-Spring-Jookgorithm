package Baekjoon.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1940 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		Arrays.sort(arr);
		int c = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(arr[i] + arr[j] == m) {
					c++;
					break;
				}
			}
		}
		System.out.print(c);
	}
}
