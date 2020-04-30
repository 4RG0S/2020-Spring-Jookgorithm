package Baekjoon.Math;

import java.util.Scanner;

public class Baekjoon2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		boolean[] arr = new boolean[n + 1];
		for (int i = 2; i <= n; i += 1) {
			arr[i] = true;
		}

		for (int i = 2; i * i <= n; i += 1) {
			for (int j = i * i; j <= n; j += i) {
				arr[j] = false;
			}
		}
		
		int sum = 0;
		int small = 10000;
		for (int i = m; i <= n; i += 1) {
			if (true == arr[i]) {
				sum += i;
				small = Math.min(small, i);
			}
		}
		if(sum == 0) {
			System.out.print(-1);
		}else {
			System.out.print(sum + "\n" + small);
		}
	}
}
