package _11399;

import java.util.Scanner;
import java.util.Arrays;

public class _11399 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int p[] = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = input.nextInt();
		}
		Arrays.sort(p);
		int ans = 0;
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < j + 1; i++) {
				ans += p[i];
			}
		}
		System.out.println(ans);
	}
}