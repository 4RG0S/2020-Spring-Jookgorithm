package Baekjoon.implementation;

import java.util.Scanner;

public class Baekjoon1748 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int c = 0;
		for(int i = 0; i < s.length(); i++) {
			int l = s.length()-i;
			if(i == 0) {
				c += (Integer.parseInt(s)-Math.pow(10, l+i-1)+1) * (l);
			}else {
				c += 9 * Math.pow(10, l-1) *(l);
			}
		}
		System.out.print(c);
	}
}
