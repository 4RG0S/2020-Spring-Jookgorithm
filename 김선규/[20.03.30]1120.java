package Baekjoon.Char;

import java.util.Scanner;

public class Baekjoon1120 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int min = 50;
		for(int i = 0; i <= b.length() - a.length(); i++) {
			int num = 0;
			for(int j = 0; j < a.length(); j++) {
				if(a.charAt(j) != b.charAt(i + j)) {
					num++;
				}
			}
			min = Math.min(min, num);
		}
		System.out.print(min);
	}
}
