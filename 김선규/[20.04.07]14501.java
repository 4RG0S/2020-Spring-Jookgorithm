package Baekjoon.Bruteforce;

import java.util.Scanner;

public class Baekjoon14501 {
	static int S = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] t = new int[n];
		int[] p = new int[n];
		for(int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
			p[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			if(i+t[i] > n) {
				p[i] = 0;
			}
		}
		func(t, p, 0, 0);
		System.out.print(S);
	}
	
	public static void func(int[] t, int[] p, int index, int sum) {
		if(index >= t.length) {
			S = Math.max(S, sum);
			return;
		}
		func(t, p, index + 1, sum);
		func(t, p, index + t[index], sum + p[index]);
	}
}
