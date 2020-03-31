package Baekjoon.Bruteforce;

import java.util.Scanner;

public class Baekjoon1051 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		String[] s = new String[a];
		for(int i = 0; i < a; i++)
			s[i] = sc.next();
		
		int max = 1;
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				for(int k = j; k < b; k++) {
					if(s[i].charAt(j) == s[i].charAt(k) & i + k - j < s.length) {
						if(s[i].charAt(j) == s[i + k - j].charAt(j) & s[i].charAt(k) == s[i + k - j].charAt(k)) {
							max = Math.max(max, (k-j+1)*(k-j+1));
						}
					}
				}
			}
		}
		System.out.print(max);
	}
}
