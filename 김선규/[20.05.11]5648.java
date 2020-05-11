package Baekjoon.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon5648 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] s = new String[n];
		long[] l = new long[n];
		for(int i = 0; i < n; i++)
			s[i] = sc.next();
		
		for(int i = 0; i < n ; i++) {
			String num = "";
			boolean first = true;
			for(int j = s[i].length()-1; j >= 0; j--) {
				if(s[i].charAt(j) == '0' && first) {
					continue;
				}
				num += s[i].charAt(j);
				first = false;
			}
			l[i] = Long.parseLong(num);
		}
		Arrays.sort(l);
		for(int i = 0; i < n; i++)
			System.out.println(l[i]);
	}
}
