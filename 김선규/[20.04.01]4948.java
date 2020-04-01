package Baekjoon;

import java.util.Scanner;

public class Baekjoon4948 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while (num != 0) {
			System.out.println(func(2 * num) - func(num));
			num = sc.nextInt();
		}
	}

	public static int func(int n) {
		int c = 0;
		int[] arr = new int[n+1];
		for(int i = 2; i <= n; i++) {
			arr[i] = i;
		}
		for(int i = 2; i <= n; i++) {
			if(arr[i] == 0)
				continue;
			for(int j = 2*i;j <=n; j+=i) {
				arr[j] = 0;
			}
		}
		for(int i = 0; i <= n; i++) {
			if(arr[i] != 0) {
				c++;
			}
		}
		return c;
	}
}
