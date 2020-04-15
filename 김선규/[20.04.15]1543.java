package Baekjoon.search;

import java.util.Scanner;

public class Baekjoon1543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String w = sc.nextLine();
		int c = 0;
		for(int i = 0; i < s.length() - w.length() + 1; i++) {
			boolean ok = true;
			for(int j = 0; j < w.length(); j++) {
				if(s.charAt(i+j) != w.charAt(j)) {
					ok = false;
					break;
				}
			}
			if(ok) {
				i += w.length()-1;
				c++;
			}
		}
		System.out.print(c);
	}
}
